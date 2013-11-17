public class aHv extends bIS
{
  private static aHv efl;

  public aHv()
  {
  }

  public aHv(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public aHv(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public static aHv aTp() {
    return efl;
  }

  public static void a(aHv paramaHv) {
    efl = paramaHv;
  }

  protected byte aTq() {
    return 2;
  }
}