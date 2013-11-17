public class csT extends dY
{
  public static final csT icF = new csT();

  protected byte bJ()
  {
    return 2;
  }

  public kX o(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);
    return new kX(f1, f2, f3);
  }

  protected void a(dSw paramdSw, kX paramkX1, kX paramkX2)
  {
    boolean bool = !a(paramkX1, paramkX2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramkX1.aOR, paramkX2.aOR);
    a(paramdSw, bool, paramkX1.aOS, paramkX2.aOS);
    a(paramdSw, bool, paramkX1.aOT, paramkX2.aOT);
  }

  protected boolean a(kX paramkX1, kX paramkX2)
  {
    return (paramkX1.aOR == paramkX2.aOR) && (paramkX1.aOS == paramkX2.aOS) && (paramkX1.aOT == paramkX2.aOT);
  }
}