public class dTC extends bIS
{
  private static dTC mqA;

  public dTC()
  {
  }

  public dTC(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public dTC(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public static dTC dtz() {
    return mqA;
  }

  public static void a(dTC paramdTC) {
    mqA = paramdTC;
  }

  protected byte aTq()
  {
    return 3;
  }
}