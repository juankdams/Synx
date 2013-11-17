public class doE extends dY
{
  public static final doE lpd = new doE();

  protected byte bJ()
  {
    return 3;
  }

  public dWk t(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f = b(paramaYQ, bool, paramFloat);
    return new dWk(f);
  }

  protected void a(dSw paramdSw, dWk paramdWk1, dWk paramdWk2)
  {
    boolean bool = !a(paramdWk1, paramdWk2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramdWk1.mvt, paramdWk2.mvt);
  }

  protected boolean a(dWk paramdWk1, dWk paramdWk2)
  {
    return paramdWk1.mvt == paramdWk2.mvt;
  }
}