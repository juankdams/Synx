public class bLx extends dJm
{
  public static final bLx gPi = new bLx();

  protected byte bJ()
  {
    return 2;
  }

  protected void a(dSw paramdSw, bJR parambJR1, bJR parambJR2)
  {
    boolean bool = !a(parambJR1, parambJR2);
    paramdSw.lu(bool);
    paramdSw.lu(parambJR1.gLJ);
    paramdSw.dsW();
    paramdSw.writeByte((byte)parambJR1.gLI.ordinal());
    a(paramdSw, bool, parambJR1.cxl, parambJR2.cxl);
  }

  public bJR k(aYQ paramaYQ, float paramFloat)
  {
    boolean bool1 = paramaYQ.bnT();
    boolean bool2 = paramaYQ.bnT();
    int i = paramaYQ.readByte();
    bXZ localbXZ = bXZ.values()[i];
    int j = a(paramaYQ, bool1, paramFloat);
    return new bJR(j, localbXZ, bool2);
  }

  protected boolean a(bJR parambJR1, bJR parambJR2)
  {
    return parambJR1.cxl == parambJR2.cxl;
  }
}