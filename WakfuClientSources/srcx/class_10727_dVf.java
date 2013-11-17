import org.apache.log4j.Logger;

public class dVf extends dY
{
  private static final Logger K = Logger.getLogger(dVf.class);

  public static final dVf mtV = new dVf();

  protected byte bJ()
  {
    return 12;
  }

  public bZQ x(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();
    cEi localcEi1 = a(paramaYQ, paramFloat, bool);
    cEi localcEi2 = a(paramaYQ, paramFloat, bool);
    cEi localcEi3 = a(paramaYQ, paramFloat, bool);
    cEi localcEi4 = a(paramaYQ, paramFloat, bool);

    YD localYD = new YD();
    localYD.cm(0L);
    localYD.co(1000000L);
    localYD.a(localcEi1);
    localYD.b(localcEi2);
    localYD.c(localcEi3);
    localYD.d(localcEi4);
    return new bZQ(localYD);
  }

  private static cEi a(aYQ paramaYQ, float paramFloat, boolean paramBoolean) {
    float f1 = b(paramaYQ, paramBoolean, paramFloat);
    float f2 = b(paramaYQ, paramBoolean, paramFloat);
    float f3 = b(paramaYQ, paramBoolean, paramFloat);
    return new cEi(f1, f2, f3);
  }

  protected void a(dSw paramdSw, bZQ parambZQ1, bZQ parambZQ2)
  {
    boolean bool = !a(parambZQ1, parambZQ2);
    paramdSw.lu(bool);
    paramdSw.dsW();
    a(paramdSw, bool, parambZQ1.ceq(), parambZQ2.ceq());
    a(paramdSw, bool, parambZQ1.cer(), parambZQ2.cer());
    a(paramdSw, bool, parambZQ1.ces(), parambZQ2.ces());
    a(paramdSw, bool, parambZQ1.cet(), parambZQ2.cet());
  }

  private void a(dSw paramdSw, boolean paramBoolean, cEi paramcEi1, cEi paramcEi2) {
    a(paramdSw, paramBoolean, paramcEi1.aOR, paramcEi2.aOR);
    a(paramdSw, paramBoolean, paramcEi1.aOS, paramcEi2.aOS);
    a(paramdSw, paramBoolean, paramcEi1.aOT, paramcEi2.aOT);
  }

  protected boolean a(bZQ parambZQ1, bZQ parambZQ2)
  {
    return (parambZQ1.ceq().equals(parambZQ2.ceq())) && (parambZQ1.cer().equals(parambZQ2.cer())) && (parambZQ1.ces().equals(parambZQ2.ces())) && (parambZQ1.ces().equals(parambZQ2.cet()));
  }
}