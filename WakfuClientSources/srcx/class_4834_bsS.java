import java.util.BitSet;

public final class bsS
{
  private long gav;
  private dpI cwt;
  private int dCi;
  private short cZu = 0;
  private short gaw = 0;
  private short gax = 0;
  private short gay = 0;
  private boolean gaz = false;
  private BitSet gaA = null;

  public bsS ga(long paramLong)
  {
    this.gav = paramLong;
    return this;
  }

  public bsS qK(int paramInt) {
    this.dCi = paramInt;
    return this;
  }

  public bsS e(dpI paramdpI) {
    this.cwt = paramdpI;
    return this;
  }

  public bsS bV(short paramShort) {
    this.gaw = paramShort;
    return this;
  }

  public bsS bW(short paramShort) {
    this.gax = paramShort;
    return this;
  }

  public bsS c(BitSet paramBitSet) {
    this.gaA = paramBitSet;
    return this;
  }

  public bsS bX(short paramShort) {
    this.gay = paramShort;
    return this;
  }

  public bsS fe(boolean paramBoolean) {
    this.gaz = paramBoolean;
    return this;
  }

  public bsS bY(short paramShort) {
    this.cZu = paramShort;
    return this;
  }

  public bqk bAZ()
  {
    bEZ localbEZ = new bEZ(this, this.gav, this.dCi, this.cwt, null);
    bEZ.a(localbEZ, this.cZu);
    bEZ.b(localbEZ, this.gaw);
    bEZ.c(localbEZ, this.gax);
    bEZ.d(localbEZ, this.gay);
    bEZ.a(localbEZ, this.gaA == null ? null : (BitSet)this.gaA.clone());
    bEZ.a(localbEZ, this.gaz);
    return localbEZ;
  }
}