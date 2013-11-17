public class dsB extends dJm
{
  public static final dsB luO = new dsB();

  protected byte bJ()
  {
    return 1;
  }

  protected void a(dSw paramdSw, An paramAn1, An paramAn2)
  {
    boolean bool = !paramAn1.equals(paramAn2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, paramAn1.bvL, paramAn2.bvL);
    a(paramdSw, bool, paramAn1.bvM, paramAn2.bvM);
  }

  public An u(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    return new An(f1, f2);
  }

  protected boolean a(An paramAn1, An paramAn2)
  {
    return (paramAn1.bvM == paramAn2.bvM) && (paramAn1.bvL == paramAn2.bvL);
  }
}