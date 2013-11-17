public class abq extends dY
{
  public static final abq cPP = new abq();

  protected byte bJ()
  {
    return 10;
  }

  public cur e(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f = b(paramaYQ, bool, paramFloat);
    return new cur(f);
  }

  protected void a(dSw paramdSw, cur paramcur1, cur paramcur2)
  {
    boolean bool = !a(paramcur1, paramcur2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramcur1.ghT, paramcur2.ghT);
  }

  protected boolean a(cur paramcur1, cur paramcur2)
  {
    return paramcur1.ghT == paramcur2.ghT;
  }
}