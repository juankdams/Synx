public class Ki extends dY
{
  public static final Ki bWB = new Ki();

  protected byte bJ()
  {
    return 9;
  }

  public yl c(aYQ paramaYQ, float paramFloat)
  {
    boolean bool = paramaYQ.bnT();

    float f1 = b(paramaYQ, bool, paramFloat);
    float f2 = b(paramaYQ, bool, paramFloat);
    float f3 = b(paramaYQ, bool, paramFloat);

    float f4 = b(paramaYQ, bool, paramFloat);
    float f5 = b(paramaYQ, bool, paramFloat);
    float f6 = b(paramaYQ, bool, paramFloat);

    float f7 = b(paramaYQ, bool, paramFloat);
    float f8 = b(paramaYQ, bool, paramFloat);
    float f9 = b(paramaYQ, bool, paramFloat);

    float f10 = b(paramaYQ, bool, paramFloat);
    float f11 = b(paramaYQ, bool, paramFloat);
    float f12 = b(paramaYQ, bool, paramFloat);

    return new yl(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
  }

  protected void a(dSw paramdSw, yl paramyl1, yl paramyl2)
  {
    boolean bool = !a(paramyl1, paramyl2);
    paramdSw.lu(bool);
    paramdSw.dsW();

    a(paramdSw, bool, paramyl1.Vf, paramyl2.Vf);
    a(paramdSw, bool, paramyl1.Vh, paramyl2.Vh);
    a(paramdSw, bool, paramyl1.brE, paramyl2.brE);

    a(paramdSw, bool, paramyl1.Vg, paramyl2.Vg);
    a(paramdSw, bool, paramyl1.Vi, paramyl2.Vi);
    a(paramdSw, bool, paramyl1.brF, paramyl2.brF);

    a(paramdSw, bool, paramyl1.brG, paramyl2.brG);
    a(paramdSw, bool, paramyl1.brH, paramyl2.brH);
    a(paramdSw, bool, paramyl1.brI, paramyl2.brI);

    a(paramdSw, bool, paramyl1.brJ, paramyl2.brJ);
    a(paramdSw, bool, paramyl1.brK, paramyl2.brK);
    a(paramdSw, bool, paramyl1.brL, paramyl2.brL);
  }

  protected boolean a(yl paramyl1, yl paramyl2)
  {
    return (paramyl1.Vf == paramyl2.Vf) && (paramyl1.Vh == paramyl2.Vh) && (paramyl1.brE == paramyl2.brE) && (paramyl1.Vg == paramyl2.Vg) && (paramyl1.Vi == paramyl2.Vi) && (paramyl1.brF == paramyl2.brF) && (paramyl1.brG == paramyl2.brG) && (paramyl1.brH == paramyl2.brH) && (paramyl1.brI == paramyl2.brI) && (paramyl1.brJ == paramyl2.brJ) && (paramyl1.brK == paramyl2.brK) && (paramyl1.brL == paramyl2.brL);
  }
}