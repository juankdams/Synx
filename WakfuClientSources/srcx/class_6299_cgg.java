import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;

public class cgg
  implements aYx
{
  protected static final Logger K = Logger.getLogger(cgg.class);

  private static int hDx = 10000;
  private static int PI = (int)(3.141592653589793D * hDx);
  private static int hDy = (int)(0.7853981633974483D * hDx);
  private static int hDz = (int)(2.356194490192345D * hDx);
  private static int hDA = (int)(3.926990816987241D * hDx);
  private static int hDB = (int)(5.497787143782138D * hDx);
  private int gwQ;
  private int gwR;
  private short gwS;
  private CG ax;
  private static final cSR gwT = new cSR();

  public bXJ vh(int paramInt)
  {
    return (bXJ)gwT.get(paramInt);
  }

  public void a(int paramInt1, int paramInt2, short paramShort, CG paramCG)
  {
    this.gwQ = paramInt1;
    this.gwR = paramInt2;
    this.gwS = paramShort;
    this.ax = paramCG;
  }

  public List D(int paramInt1, int paramInt2, short paramShort) {
    Vector localVector = new Vector();
    localVector.add(O(paramInt1, paramInt2, paramShort));
    return localVector;
  }

  public bXJ O(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.ax == null) {
      K.error("direction ou position null : update partLocalisator first");
      return null;
    }

    if ((this.gwQ == paramInt1) && (this.gwR == paramInt2) && (this.gwS == paramShort)) {
      return (bXJ)gwT.get(0);
    }
    cEi localcEi1 = new cEi(this.ax.hY, this.ax.hZ, 0.0F);
    localcEi1 = localcEi1.czS();

    cEi localcEi2 = new cEi(this.gwQ - paramInt1, this.gwR - paramInt2, 0.0F);

    localcEi2 = localcEi2.czS();

    double d1 = localcEi2.q(localcEi1);
    int i = (int)(Math.acos(d1) * hDx);

    double d2 = localcEi2.r(localcEi1);
    if (d2 < 0.0D) {
      i = 2 * PI - i;
    }

    if ((i >= 0) && (i <= hDy))
      return (bXJ)gwT.get(2);
    if ((i > hDy) && (i < hDz))
      return (bXJ)gwT.get(3);
    if ((i >= hDz) && (i <= hDA))
      return (bXJ)gwT.get(0);
    if ((i > hDA) && (i < hDB))
      return (bXJ)gwT.get(1);
    if (i >= hDB) {
      return (bXJ)gwT.get(2);
    }

    K.warn("angle non traité " + i);
    return (bXJ)gwT.get(0);
  }

  public bXJ j(cEi paramcEi)
  {
    if (this.ax == null) {
      K.error("direction null : update partLocalisator first");
      return null;
    }

    if ((paramcEi.getX() == 0.0F) && (paramcEi.getY() == 0.0F)) {
      return (bXJ)gwT.get(0);
    }
    cEi localcEi = new cEi(this.ax.hY, this.ax.hZ, 0.0F);

    paramcEi = paramcEi.czS();

    double d1 = paramcEi.q(localcEi);

    if (d1 >= 0.31D) {
      return (bXJ)gwT.get(2);
    }
    if (d1 >= -0.31D)
    {
      double d2 = paramcEi.r(localcEi);
      if (d2 < 0.0D) {
        return (bXJ)gwT.get(3);
      }
      return (bXJ)gwT.get(1);
    }

    return (bXJ)gwT.get(0);
  }

  public static bXJ a(bXJ parambXJ)
  {
    switch (parambXJ.aps()) {
    case 2:
      return (bXJ)gwT.get(0);
    case 0:
      return (bXJ)gwT.get(2);
    case 3:
      return (bXJ)gwT.get(1);
    case 1:
      return (bXJ)gwT.get(3);
    }
    return null;
  }

  public void reset() {
    this.gwQ = 0;
    this.gwR = 0;
    this.gwS = 0;
    this.ax = null;
  }

  static
  {
    gwT.put(0, new bXJ(0));
    gwT.put(1, new bXJ(1));
    gwT.put(2, new bXJ(2));
    gwT.put(3, new bXJ(3));
  }
}