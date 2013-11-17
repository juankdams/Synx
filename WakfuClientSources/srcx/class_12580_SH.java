import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class SH
  implements bqk
{
  protected static final Logger K = Logger.getLogger(SH.class);
  private int aw;
  private long ctZ;
  private bZA cua;
  private final ArrayList cub = new ArrayList();

  public SH(int paramInt, long paramLong, bZA parambZA) {
    this.aw = paramInt;
    this.ctZ = paramLong;
    this.cua = parambZA;
  }

  public final int nS() {
    return 18;
  }

  public final long nT() {
    return this.aw;
  }

  public final int getId() {
    return this.aw;
  }

  public final long getDuration() {
    return this.ctZ;
  }

  public final boolean isInfinite() {
    return this.ctZ <= 0L;
  }

  public final bZA afP() {
    return this.cua;
  }

  public final void a(dpI paramdpI) {
    this.cub.add(paramdpI);
  }

  public final Iterator iterator() {
    return this.cub.iterator();
  }

  public final short nU() {
    return 0;
  }

  public final short nY() {
    return 0;
  }

  public final short nZ() {
    return 0;
  }

  public final short oa() {
    return 0;
  }

  public final boolean aI(int paramInt) {
    return false;
  }

  public final BitSet ob() {
    return null;
  }
}