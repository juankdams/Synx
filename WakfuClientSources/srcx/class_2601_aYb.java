public class aYb extends dY
{
  public static final aYb fdL = new aYb();

  protected byte bJ()
  {
    return 8;
  }

  public bGB h(aYQ paramaYQ, float paramFloat)
  {
    boolean bool1 = paramaYQ.bnT();
    boolean bool2 = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool1, paramFloat);
    float f2 = b(paramaYQ, bool1, paramFloat);
    float f3 = b(paramaYQ, bool1, paramFloat);
    return bGB.a(f1, f2, f3, bool2);
  }

  protected void a(dSw paramdSw, bGB parambGB1, bGB parambGB2)
  {
    boolean bool = !a(parambGB1, parambGB2);
    paramdSw.lu(bool);
    paramdSw.lu(parambGB1 instanceof bdb);
    paramdSw.dsW();
    a(paramdSw, bool, parambGB1.aOR * 33.0F, parambGB2.aOR * 33.0F);
    a(paramdSw, bool, parambGB1.aOS * 33.0F, parambGB2.aOS * 33.0F);
    a(paramdSw, bool, parambGB1.aOT * 33.0F, parambGB2.aOT * 33.0F);
  }

  protected boolean a(bGB parambGB1, bGB parambGB2)
  {
    return (parambGB1.aOR == parambGB2.aOR) && (parambGB1.aOS == parambGB2.aOS) && (parambGB1.aOT == parambGB2.aOT);
  }
}