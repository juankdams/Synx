public abstract class akE extends bbg
{
  private int dlw;
  private aum bhW;

  public final int axD()
  {
    return this.dlw;
  }

  public static int C(Class paramClass) {
    return eJ(paramClass.getName());
  }

  public static int eJ(String paramString) {
    return bCO.jF(paramString);
  }

  protected void DA()
  {
    super.DA();

    if (this.bhW != null)
      this.bhW.a(this);
  }

  protected final void DL()
  {
    super.DL();
    gM();
  }

  protected abstract void gL();

  protected abstract void gM();

  final void a(int paramInt, aum paramaum) {
    this.dlw = paramInt;
    this.bhW = paramaum;
  }
}