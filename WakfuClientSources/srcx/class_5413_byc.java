public class byc extends dY
{
  public static final byc gjA = new byc();

  protected byte bJ()
  {
    return 4;
  }

  public cVK j(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);
    float f4 = b(paramaYQ, bool, paramFloat);
    float f5 = b(paramaYQ, bool, paramFloat);
    return new cVK(f1, f2, f3, f4, f5);
  }

  protected void a(dSw paramdSw, cVK paramcVK1, cVK paramcVK2)
  {
    boolean bool = !a(paramcVK1, paramcVK2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramcVK1.bOZ, paramcVK2.bOZ);
    a(paramdSw, bool, paramcVK1.bPa, paramcVK2.bPa);
    a(paramdSw, bool, paramcVK1.bPb, paramcVK2.bPb);
    a(paramdSw, bool, paramcVK1.bPc, paramcVK2.bPc);
    a(paramdSw, bool, paramcVK1.buM, paramcVK2.buM);
  }

  protected boolean a(cVK paramcVK1, cVK paramcVK2)
  {
    return (paramcVK1.bOZ == paramcVK2.bOZ) && (paramcVK1.bPa == paramcVK2.bPa) && (paramcVK1.bPb == paramcVK2.bPb) && (paramcVK1.bPc == paramcVK2.bPc) && (paramcVK1.buM == paramcVK2.buM);
  }
}