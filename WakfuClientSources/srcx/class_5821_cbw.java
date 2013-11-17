public class cbw extends dY
{
  public static final cbw htd = new cbw();

  protected byte bJ()
  {
    return 7;
  }

  public avQ m(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f = b(paramaYQ, bool, paramFloat);
    return new avQ(f);
  }

  protected void a(dSw paramdSw, avQ paramavQ1, avQ paramavQ2)
  {
    boolean bool = !a(paramavQ1, paramavQ2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramavQ1.dKK, paramavQ2.dKK);
  }

  protected boolean a(avQ paramavQ1, avQ paramavQ2)
  {
    return paramavQ1.dKK == paramavQ2.dKK;
  }
}