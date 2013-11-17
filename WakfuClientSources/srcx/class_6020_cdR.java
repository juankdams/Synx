public abstract class cdR
{
  protected final zO[] gCm;
  protected final zO[] hxQ;
  protected aYH[] hxR;
  protected final agQ gCl;

  protected cdR(agQ paramagQ)
  {
    this.gCl = paramagQ;
    this.gCm = paramagQ.asr();
    this.hxQ = paramagQ.asq();
  }

  public final zO uT(int paramInt) {
    return this.hxQ[paramInt];
  }
  public final zO uU(int paramInt) {
    return this.gCm[paramInt];
  }

  public final int xj() {
    return this.gCl.xj();
  }

  public final sF adi() {
    return this.gCl.adi();
  }

  public int asp() {
    return this.gCl.asp();
  }

  public void a(aYH[] paramArrayOfaYH) {
    if ((!bB) && (paramArrayOfaYH.length != asp())) throw new AssertionError();
    this.hxR = paramArrayOfaYH;
  }

  public abstract void update(int paramInt);
}