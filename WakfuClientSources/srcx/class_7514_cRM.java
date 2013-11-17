public class cRM extends dY
{
  public static final cRM kEf = new cRM();

  protected byte bJ()
  {
    return 11;
  }

  public ayf q(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f = b(paramaYQ, bool, paramFloat);
    return new ayf(f);
  }

  protected void a(dSw paramdSw, ayf paramayf1, ayf paramayf2)
  {
    boolean bool = !a(paramayf1, paramayf2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramayf1.dNO, paramayf2.dNO);
  }

  protected boolean a(ayf paramayf1, ayf paramayf2)
  {
    return paramayf1.dNO == paramayf2.dNO;
  }
}