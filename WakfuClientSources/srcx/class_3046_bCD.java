import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;

public class bCD
  implements aYx
{
  protected static final Logger K = Logger.getLogger(bCD.class);
  private int gwQ;
  private int gwR;
  private short gwS;
  private CG ax;
  private static final cSR gwT = new cSR();

  public cJn se(int paramInt)
  {
    return (cJn)gwT.get(paramInt);
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
    localVector.add(K(paramInt1, paramInt2, paramShort));
    return localVector;
  }

  public cJn K(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.ax == null) {
      K.error("direction ou position null : update partLocalisator first");
      return null;
    }

    if ((this.gwQ == paramInt1) && (this.gwR == paramInt2) && (this.gwS == paramShort)) {
      return (cJn)gwT.get(0);
    }
    cEi localcEi1 = new cEi(this.ax.hY, this.ax.hZ, 0.0F);

    cEi localcEi2 = new cEi(this.gwQ - paramInt1, this.gwR - paramInt2, 0.0F);

    localcEi2 = localcEi2.czS();

    double d = localcEi2.q(localcEi1);

    if (d >= 0.5D) {
      return (cJn)gwT.get(2);
    }
    if (d >= -0.5D) {
      return (cJn)gwT.get(3);
    }

    return (cJn)gwT.get(0);
  }

  public cJn h(cEi paramcEi)
  {
    if (this.ax == null) {
      K.error("direction null : update partLocalisator first");
      return null;
    }

    if ((paramcEi.getX() == 0.0F) && (paramcEi.getY() == 0.0F))
      return (cJn)gwT.get(0);
    cEi localcEi = new cEi(this.ax.hY, this.ax.hZ, 0.0F);

    paramcEi = paramcEi.czS();

    double d = paramcEi.q(localcEi);

    if (d >= 0.5D) {
      return (cJn)gwT.get(2);
    }
    if (d >= -0.5D) {
      return (cJn)gwT.get(3);
    }

    return (cJn)gwT.get(0);
  }

  public void reset()
  {
    this.gwQ = 0;
    this.gwR = 0;
    this.gwS = 0;
    this.ax = null;
  }

  static
  {
    gwT.put(0, new cJn(0));
    gwT.put(1, new cJn(1));
    gwT.put(2, new cJn(2));
    gwT.put(3, new cJn(3));
  }
}