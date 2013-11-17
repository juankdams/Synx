public class crb extends oV
{
  public static final crb iaG = new crb();

  protected byte bJ()
  {
    return 2;
  }

  public akA n(aYQ paramaYQ, float paramFloat)
  {
    boolean bool1 = paramaYQ.bnT();
    boolean bool2 = paramaYQ.bnT();

    int i = paramaYQ.readInt();

    float f1 = b(paramaYQ, bool1, paramFloat);
    float f2 = b(paramaYQ, bool1, paramFloat);

    float f3 = b(paramaYQ, bool1, paramFloat);
    float f4 = b(paramaYQ, bool1, paramFloat);
    float f5 = b(paramaYQ, bool1, paramFloat);
    float f6 = b(paramaYQ, bool1, paramFloat);

    float f7 = b(paramaYQ, bool1, paramFloat);
    float f8 = b(paramaYQ, bool1, paramFloat);

    float f9 = b(paramaYQ, bool1, paramFloat);
    float f10 = b(paramaYQ, bool1, paramFloat);
    float f11 = b(paramaYQ, bool1, paramFloat);
    float f12 = b(paramaYQ, bool1, paramFloat);

    float f13 = b(paramaYQ, bool1, paramFloat);
    float f14 = b(paramaYQ, bool1, paramFloat);
    float f15 = b(paramaYQ, bool1, paramFloat);
    float f16 = b(paramaYQ, bool1, paramFloat);

    float f17 = b(paramaYQ, bool1, paramFloat);
    float f18 = b(paramaYQ, bool1, paramFloat);

    aTy localaTy = aTy.a(paramaYQ, false);

    float f19 = b(paramaYQ, bool1, paramFloat);
    int j = c(paramaYQ, bool1, paramFloat);

    akA localakA = new akA(i, f1, f2, f3, f4, f5, f6, bool2, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, localaTy, f19, j);

    localakA.f(f17, f18);
    return localakA;
  }

  protected void a(dSw paramdSw, akA paramakA1, akA paramakA2)
  {
    boolean bool = !a(paramakA1, paramakA2);
    paramdSw.lu(bool);
    paramdSw.lu(paramakA1.aYi);
    paramdSw.dsW();
    paramdSw.writeInt(paramakA1.aYo);

    a(paramdSw, bool, paramakA1.aYe, paramakA2.aYe);
    a(paramdSw, bool, paramakA1.aYf, paramakA2.aYf);

    a(paramdSw, bool, paramakA1.aYg, paramakA2.aYg);
    a(paramdSw, bool, paramakA1.aYh, paramakA2.aYh);
    a(paramdSw, bool, paramakA1.aYj, paramakA2.aYj);
    a(paramdSw, bool, paramakA1.aYk, paramakA2.aYk);

    a(paramdSw, bool, paramakA1.aYl, paramakA2.aYl);
    a(paramdSw, bool, paramakA1.aYm, paramakA2.aYm);

    a(paramdSw, bool, paramakA1.aYp, paramakA2.aYp);
    a(paramdSw, bool, paramakA1.aYq, paramakA2.aYq);
    a(paramdSw, bool, paramakA1.aYr, paramakA2.aYr);
    a(paramdSw, bool, paramakA1.aYs, paramakA2.aYs);

    a(paramdSw, bool, paramakA1.aYt, paramakA2.aYt);
    a(paramdSw, bool, paramakA1.aYu, paramakA2.aYu);
    a(paramdSw, bool, paramakA1.aYv, paramakA2.aYv);
    a(paramdSw, bool, paramakA1.aYw, paramakA2.aYw);

    a(paramdSw, bool, paramakA1.aYC * 0.5F, paramakA2.aYC * 0.5F);
    a(paramdSw, bool, paramakA1.aYD * 0.5F, paramakA2.aYD * 0.5F);

    paramakA1.dlt.a(paramdSw);
    a(paramdSw, bool, paramakA1.buM, paramakA2.buM);
    if ((paramakA1.dls == -1) || (paramakA2.dls == -1))
      b(paramdSw, bool, -1, -1);
    else
      b(paramdSw, bool, paramakA1.dls, paramakA2.dls);
  }

  protected boolean a(akA paramakA1, akA paramakA2)
  {
    if (!super.a(paramakA1, paramakA2)) {
      return false;
    }
    return (paramakA1.buM == paramakA2.buM) && (paramakA1.dls == paramakA2.dls);
  }
}