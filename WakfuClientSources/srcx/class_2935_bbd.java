public class bbd extends api
{
  public static final bbd fjg = new bbd();

  protected byte bJ()
  {
    return 2;
  }

  protected void a(dSw paramdSw, dGG paramdGG1, dGG paramdGG2)
  {
    boolean bool = !a(paramdGG1, paramdGG2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramdGG1.bOZ, paramdGG2.bOZ);
    a(paramdSw, bool, paramdGG1.bPa, paramdGG2.bPa);
    a(paramdSw, bool, paramdGG1.bPb, paramdGG2.bPb);
    a(paramdSw, bool, paramdGG1.ghT, paramdGG2.ghT);
    a(paramdSw, bool, paramdGG1.duj, paramdGG2.duj);
  }

  public dGG i(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();

    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);
    float f4 = b(paramaYQ, bool, paramFloat);
    float f5 = b(paramaYQ, bool, paramFloat);
    return new dGG(f1, f2, f3, f4, f5);
  }

  protected boolean a(dGG paramdGG1, dGG paramdGG2)
  {
    return (paramdGG1.bOZ == paramdGG2.bOZ) && (paramdGG1.bPa == paramdGG2.bPa) && (paramdGG1.bPb == paramdGG2.bPb) && (paramdGG1.ghT == paramdGG2.ghT) && (paramdGG1.duj == paramdGG2.duj);
  }
}