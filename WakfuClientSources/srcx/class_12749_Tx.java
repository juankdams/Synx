import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

final class Tx
  implements bqk
{
  dpI cwt;
  long cwu;

  Tx(long paramLong, dpI paramdpI)
  {
    this.cwt = paramdpI;
    this.cwu = paramLong;
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

  public int nS() {
    return 21;
  }

  public long nT() {
    return this.cwu;
  }

  public Iterator iterator() {
    return Collections.singleton(this.cwt).iterator();
  }

  public dpI agC() {
    return this.cwt;
  }
}