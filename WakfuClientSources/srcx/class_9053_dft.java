public class dft extends oV
{
  public static final dft kZP = new dft();

  protected byte bJ()
  {
    return 1;
  }

  public czl s(aYQ paramaYQ, float paramFloat)
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
    float f19 = b(paramaYQ, bool1, paramFloat);
    float f20 = b(paramaYQ, bool1, paramFloat);

    float f21 = b(paramaYQ, bool1, paramFloat);
    float f22 = b(paramaYQ, bool1, paramFloat);

    czl localczl = new czl(i, f1, f2, f3, f4, f5, f6, bool2, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);

    localczl.a(f17, f18, f19, f20);
    localczl.f(f21, f22);
    return localczl;
  }

  protected void a(dSw paramdSw, czl paramczl1, czl paramczl2)
  {
    boolean bool = !a(paramczl1, paramczl2);
    paramdSw.lu(bool);
    paramdSw.lu(paramczl1.aYi);
    paramdSw.dsW();
    paramdSw.writeInt(paramczl1.aYo);

    a(paramdSw, bool, paramczl1.aYe, paramczl2.aYe);
    a(paramdSw, bool, paramczl1.aYf, paramczl2.aYf);

    a(paramdSw, bool, paramczl1.aYg, paramczl2.aYg);
    a(paramdSw, bool, paramczl1.aYh, paramczl2.aYh);
    a(paramdSw, bool, paramczl1.aYj, paramczl2.aYj);
    a(paramdSw, bool, paramczl1.aYk, paramczl2.aYk);

    a(paramdSw, bool, paramczl1.aYl, paramczl2.aYl);
    a(paramdSw, bool, paramczl1.aYm, paramczl2.aYm);

    a(paramdSw, bool, paramczl1.aYp, paramczl2.aYp);
    a(paramdSw, bool, paramczl1.aYq, paramczl2.aYq);
    a(paramdSw, bool, paramczl1.aYr, paramczl2.aYr);
    a(paramdSw, bool, paramczl1.aYs, paramczl2.aYs);

    a(paramdSw, bool, paramczl1.aYt, paramczl2.aYt);
    a(paramdSw, bool, paramczl1.aYu, paramczl2.aYu);
    a(paramdSw, bool, paramczl1.aYv, paramczl2.aYv);
    a(paramdSw, bool, paramczl1.aYw, paramczl2.aYw);

    a(paramdSw, bool, paramczl1.aYy, paramczl2.aYy);
    a(paramdSw, bool, paramczl1.aYz, paramczl2.aYz);
    a(paramdSw, bool, paramczl1.aYA, paramczl2.aYA);
    a(paramdSw, bool, paramczl1.aYB, paramczl2.aYB);

    a(paramdSw, bool, paramczl1.aYC, paramczl2.aYC);
    a(paramdSw, bool, paramczl1.aYD, paramczl2.aYD);
  }
}