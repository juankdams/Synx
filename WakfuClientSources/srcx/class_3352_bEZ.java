import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class bEZ
  implements bqk
{
  private final long gav;
  private final dpI cwt;
  private final int dCi;
  private short cZu = 0;
  private short gaw = 0;
  private short gax = 0;
  private short gay = 0;
  private boolean gaz = false;
  private BitSet gaA = null;

  private bEZ(bsS parambsS, long paramLong, int paramInt, dpI paramdpI) {
    this.gav = paramLong;
    this.dCi = paramInt;
    this.cwt = paramdpI;
  }

  public short nU() {
    return this.cZu;
  }

  public short nY() {
    return this.gaw;
  }

  public short nZ() {
    return this.gax;
  }

  public short oa() {
    return this.gay;
  }

  public boolean aI(int paramInt) {
    return this.gaz;
  }

  public BitSet ob() {
    return this.gaA;
  }

  public int nS() {
    return this.dCi;
  }

  public long nT() {
    return this.gav;
  }

  public Iterator iterator() {
    return Collections.singleton(this.cwt).iterator();
  }
}