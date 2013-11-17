public class cSP extends dY
{
  public static final cSP kFA = new cSP();

  protected byte bJ()
  {
    return 1;
  }

  public deR r(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);
    float f4 = b(paramaYQ, bool, paramFloat);
    int i = paramaYQ.readByte();
    bgW localbgW = bgW.values()[i];
    return new deR(f1, localbgW, f2, f3, f4);
  }

  protected void a(dSw paramdSw, deR paramdeR1, deR paramdeR2)
  {
    boolean bool = !a(paramdeR1, paramdeR2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramdeR1.ghT, paramdeR2.ghT);
    a(paramdSw, bool, paramdeR1.aZs, paramdeR2.aZs);
    a(paramdSw, bool, paramdeR1.aZt, paramdeR2.aZt);
    a(paramdSw, bool, paramdeR1.kYQ, paramdeR2.kYQ);
    byte b = (byte)paramdeR1.kYP.ordinal();
    paramdSw.writeByte(b);
  }

  protected boolean a(deR paramdeR1, deR paramdeR2)
  {
    return (paramdeR1.ghT == paramdeR2.ghT) && (paramdeR1.aZs == paramdeR2.aZs) && (paramdeR1.aZt == paramdeR2.aZt) && (paramdeR1.kYQ == paramdeR2.kYQ);
  }
}