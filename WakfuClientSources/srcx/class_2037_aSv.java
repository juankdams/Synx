public abstract class aSv extends dNg
{
  private final byte[] ePJ = new byte[Je.getDataLength(324)];

  public boolean I(int paramInt1, int paramInt2)
  {
    return Je.c(this.ePJ, (paramInt2 - this.hZ) * 18 + paramInt1 - this.hY);
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    paramaYQ.W(this.ePJ);
  }

  protected final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    Je.a(this.ePJ, (paramInt2 - this.hZ) * 18 + paramInt1 - this.hY, paramBoolean);
  }
}