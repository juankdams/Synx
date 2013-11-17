import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class cHN
  implements bqk
{
  private final int aw;
  private final bZA aB;
  private final bMn iCU;
  private final ArrayList cub = new ArrayList();

  protected cHN(int paramInt, bZA parambZA, byte paramByte, ArrayList paramArrayList) {
    this.aw = paramInt;
    this.aB = parambZA;
    this.iCU = bMn.dt(paramByte);
    this.cub.addAll(paramArrayList);
  }

  public int getId() {
    return this.aw;
  }

  public bZA F() {
    return this.aB;
  }

  public Iterator iterator() {
    return this.cub.iterator();
  }

  public int nS() {
    return 19;
  }

  public long nT() {
    return this.aw;
  }

  public bMn cBZ() {
    return this.iCU;
  }

  public short nU() {
    return 0;
  }

  public short nY() {
    return 0;
  }

  public short nZ() {
    return 0;
  }

  public short oa() {
    return 0;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }
}