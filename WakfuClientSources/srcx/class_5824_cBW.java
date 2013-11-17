public class cBW extends api
{
  public static final cBW iuf = new cBW();

  protected byte bJ()
  {
    return 1;
  }

  protected boolean a(dmN paramdmN1, dmN paramdmN2)
  {
    return (paramdmN1.lkS == paramdmN2.lkS) && (paramdmN1.lkT == paramdmN2.lkT) && (paramdmN1.aVV == paramdmN2.aVV) && (paramdmN1.cxr == paramdmN2.cxr) && (paramdmN1.lkU == paramdmN2.lkU) && (paramdmN1.lkV == paramdmN2.lkV) && (paramdmN1.lkW == paramdmN2.lkW) && (paramdmN1.lkX == paramdmN2.lkX) && (paramdmN1.lkY == paramdmN2.lkY) && (paramdmN1.lkZ == paramdmN2.lkZ) && (paramdmN1.lla == paramdmN2.lla) && (paramdmN1.llb == paramdmN2.llb) && (paramdmN1.llc == paramdmN2.llc) && (paramdmN1.lld == paramdmN2.lld) && (paramdmN1.lle == paramdmN2.lle) && (paramdmN1.llf == paramdmN2.llf) && (paramdmN1.llg == paramdmN2.llg) && (paramdmN1.llh == paramdmN2.llh) && (paramdmN1.lkQ == paramdmN2.lkQ) && (paramdmN1.lkR == paramdmN2.lkR);
  }

  public dmN p(aYQ paramaYQ, float paramFloat)
  {
    boolean bool1 = paramaYQ.bnT();
    boolean bool2 = paramaYQ.bnT();
    int i = a(paramaYQ, bool1, paramFloat);
    int j = a(paramaYQ, bool1, paramFloat);
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

    return new dmN(f17, f18, i, j, f1, f3, f2, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, bool2);
  }

  protected void a(dSw paramdSw, dmN paramdmN1, dmN paramdmN2)
  {
    boolean bool = !a(paramdmN1, paramdmN2);
    paramdSw.lu(bool);
    paramdSw.lu(paramdmN1.gFN);
    paramdSw.dsW();
    a(paramdSw, bool, paramdmN1.lkS, paramdmN2.lkS);
    a(paramdSw, bool, paramdmN1.lkT, paramdmN2.lkT);
    a(paramdSw, bool, paramdmN1.aVV, paramdmN2.aVV);
    a(paramdSw, bool, paramdmN1.cxr, paramdmN2.cxr);
    a(paramdSw, bool, paramdmN1.lkU, paramdmN2.lkU);
    a(paramdSw, bool, paramdmN1.lkV, paramdmN2.lkV);

    a(paramdSw, bool, paramdmN1.lkW, paramdmN2.lkW);
    a(paramdSw, bool, paramdmN1.lkX, paramdmN2.lkX);
    a(paramdSw, bool, paramdmN1.lkY, paramdmN2.lkY);
    a(paramdSw, bool, paramdmN1.lkZ, paramdmN2.lkZ);
    a(paramdSw, bool, paramdmN1.lla, paramdmN2.lla);
    a(paramdSw, bool, paramdmN1.llb, paramdmN2.llb);

    a(paramdSw, bool, paramdmN1.llc, paramdmN2.llc);
    a(paramdSw, bool, paramdmN1.lld, paramdmN2.lld);
    a(paramdSw, bool, paramdmN1.lle, paramdmN2.lle);
    a(paramdSw, bool, paramdmN1.llf, paramdmN2.llf);
    a(paramdSw, bool, paramdmN1.llg, paramdmN2.llg);
    a(paramdSw, bool, paramdmN1.llh, paramdmN2.llh);

    a(paramdSw, bool, paramdmN1.lkQ, paramdmN2.lkQ);
    a(paramdSw, bool, paramdmN1.lkR, paramdmN2.lkR);
  }
}