public class aKI
  implements aVB
{
  private long cLq;
  private long Rc;
  private float cLN;
  private int cLZ;
  private long cLX;
  private long cLY;
  private int bdj = -1;
  private cbI eoo;
  private int eop;
  private boolean eoq;

  public aKI(long paramLong1, long paramLong2, float paramFloat, int paramInt1, long paramLong3, long paramLong4, int paramInt2)
  {
    this.cLq = paramLong1;
    this.Rc = paramLong2;
    this.cLN = paramFloat;
    this.cLZ = paramInt1;
    this.cLX = paramLong3;
    this.cLY = paramLong4;
    this.bdj = paramInt2;

    this.eoo = null;
    this.eop = -1;
    this.eoq = true;
  }

  public aKI(long paramLong1, long paramLong2, float paramFloat, int paramInt1, long paramLong3, long paramLong4, int paramInt2, cbI paramcbI, int paramInt3, boolean paramBoolean) {
    this.cLq = paramLong1;
    this.Rc = paramLong2;
    this.cLN = paramFloat;
    this.cLZ = paramInt1;
    this.cLX = paramLong3;
    this.cLY = paramLong4;
    this.bdj = paramInt2;
    this.eoo = paramcbI;
    this.eop = paramInt3;
    this.eoq = paramBoolean;
  }

  public long alu() {
    return this.Rc;
  }

  public float alh() {
    return this.cLN;
  }

  public int bcm() {
    return this.cLZ;
  }

  public long bcn() {
    return this.cLX;
  }

  public long bco() {
    return this.cLY;
  }

  public int a() {
    return this.bdj;
  }

  public cbI bcp() {
    return this.eoo;
  }

  public int bcq() {
    return this.eop;
  }

  public boolean bcr() {
    return this.eoq;
  }

  public void cr(long paramLong) {
    this.cLq = paramLong;
  }

  public long akM() {
    return this.cLq;
  }
}