import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class bog
  implements bqk
{
  public static short aET = 0;
  public static short aEU = 0;
  public static short aEV = 0;

  private final ArrayList cub = new ArrayList();
  private short aDx;
  private short fHt;

  public bog(short paramShort1, short paramShort2)
  {
    this.fHt = paramShort1;
    this.aDx = paramShort2;
  }

  public short bxO() {
    return this.fHt;
  }

  public short nU() {
    return 0;
  }

  public int nS() {
    return 14;
  }

  public long nT() {
    return this.aDx;
  }

  public Iterator iterator() {
    return this.cub.iterator();
  }

  public void a(dpI paramdpI) {
    this.cub.add(paramdpI);
  }

  public int bxP() {
    return this.cub.size();
  }

  public short nY() {
    return aET;
  }

  public short nZ() {
    return aEU;
  }

  public short oa() {
    return aEV;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }
}