public class aCk extends dY
{
  public static final aCk dWH = new aCk();

  protected byte bJ()
  {
    return 5;
  }

  public dku g(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);
    float f4 = b(paramaYQ, bool, paramFloat);
    float f5 = b(paramaYQ, bool, paramFloat);
    float f6 = b(paramaYQ, bool, paramFloat);
    return new dku(f1, f2, f3, f4, f5, f6);
  }

  protected void a(dSw paramdSw, dku paramdku1, dku paramdku2)
  {
    boolean bool = !a(paramdku1, paramdku2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramdku1.dNO, paramdku2.dNO);
    a(paramdSw, bool, paramdku1.lhE, paramdku2.lhE);
    a(paramdSw, bool, paramdku1.cAH, paramdku2.cAH);
    a(paramdSw, bool, paramdku1.lhF, paramdku2.lhF);
    a(paramdSw, bool, paramdku1.lhG, paramdku2.lhG);
    a(paramdSw, bool, paramdku1.lhH, paramdku2.lhH);
  }

  protected boolean a(dku paramdku1, dku paramdku2)
  {
    return (paramdku1.dNO == paramdku2.dNO) && (paramdku1.lhE == paramdku2.lhE) && (paramdku1.cAH == paramdku2.cAH) && (paramdku1.lhF == paramdku2.lhF) && (paramdku1.lhG == paramdku2.lhG) && (paramdku1.lhH == paramdku2.lhH);
  }
}