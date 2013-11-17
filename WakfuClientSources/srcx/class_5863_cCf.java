public class cCf
{
  private static final float iuq = 2.0F;
  public static final int iur = bNa.gRE.get();
  private final float ius;
  private final float iut;
  private final float iuu;
  private final float iuv;
  private final float iuw;
  private final float iux;
  private final float iuy;
  private final float iuz;
  private final float iuA;
  public final boolean iuB;
  public final boolean iuC;
  private final float[] iuD = { 0.0F, 0.0F, 0.0F };
  private final float[] iuE;

  public cCf(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.ius = (bNa.ty(paramInt1) * 2.0F);
    this.iut = (bNa.tx(paramInt1) * 2.0F);
    this.iuu = (bNa.tw(paramInt1) * 2.0F);

    this.iuC = (paramInt2 != iur);
    this.iuv = bNa.ty(paramInt2);
    this.iuw = bNa.tx(paramInt2);
    this.iux = bNa.tw(paramInt2);

    this.iuE = new float[] { 0.0F, 0.0F, paramInt3 == iur ? null : 0.0F };
    this.iuy = (bNa.ty(paramInt3) - 0.5F);
    this.iuz = (bNa.tx(paramInt3) - 0.5F);
    this.iuA = (bNa.tw(paramInt3) - 0.5F);

    this.iuB = paramBoolean;
  }

  public cCf(cCf paramcCf) {
    this.ius = paramcCf.ius;
    this.iut = paramcCf.iut;
    this.iuu = paramcCf.iuu;
    this.iuv = paramcCf.iuv;
    this.iuw = paramcCf.iuw;
    this.iux = paramcCf.iux;
    this.iuy = paramcCf.iuy;
    this.iuz = paramcCf.iuz;
    this.iuA = paramcCf.iuA;
    this.iuB = paramcCf.iuB;
    this.iuC = paramcCf.iuC;
    this.iuE = new float[] { 0.0F, 0.0F, paramcCf.iuE == null ? null : 0.0F };
    System.arraycopy(paramcCf.iuD, 0, this.iuD, 0, this.iuD.length);
  }

  final void cyn()
  {
    this.iuD[0] = this.ius;
    this.iuD[1] = this.iut;
    this.iuD[2] = this.iuu;

    if (this.iuE != null)
    {
      float tmp55_54 = (this.iuE[2] = 0.0F); this.iuE[1] = tmp55_54; this.iuE[0] = tmp55_54;
    }
  }

  final void bS(float paramFloat) { if ((paramFloat <= 0.0F) || (!this.iuC)) {
      this.iuD[0] = this.ius;
      this.iuD[1] = this.iut;
      this.iuD[2] = this.iuu;
      return;
    }

    float f1 = this.ius;
    float f2 = this.iut;
    float f3 = this.iuu;

    float f4 = paramFloat * 2.0F;
    float f5 = -paramFloat + 1.0F;
    f1 *= (this.iuv * f4 + f5);
    f2 *= (this.iuw * f4 + f5);
    f3 *= (this.iux * f4 + f5);

    f1 = bCO.t(f1, 0.0F, 2.0F);
    f2 = bCO.t(f2, 0.0F, 2.0F);
    f3 = bCO.t(f3, 0.0F, 2.0F);

    this.iuD[0] = f1;
    this.iuD[1] = f2;
    this.iuD[2] = f3; }

  final void bT(float paramFloat)
  {
    if (this.iuE == null) {
      return;
    }
    if (paramFloat > 0.0F) {
      float f = paramFloat * 2.0F;
      this.iuE[0] = (this.iuy * f);
      this.iuE[1] = (this.iuz * f);
      this.iuE[2] = (this.iuA * f);
    }
    else
    {
      float tmp75_74 = (this.iuE[2] = 0.0F); this.iuE[1] = tmp75_74; this.iuE[0] = tmp75_74;
    }
  }

  public final float[] ckE() {
    return this.iuD;
  }

  public final float[] cyo()
  {
    return this.iuE;
  }

  public final boolean cyp() {
    return this.iuE != null;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    cCf localcCf = (cCf)paramObject;

    if (this.iuB != localcCf.iuB)
      return false;
    if (!bCO.X(localcCf.iuu, this.iuu))
      return false;
    if (!bCO.X(localcCf.iut, this.iut))
      return false;
    if (!bCO.X(localcCf.ius, this.ius))
      return false;
    if (this.iuC != localcCf.iuC)
      return false;
    if (!bCO.X(localcCf.iuA, this.iuA))
      return false;
    if (!bCO.X(localcCf.iuz, this.iuz))
      return false;
    if (!bCO.X(localcCf.iuy, this.iuy))
      return false;
    if (!bCO.X(localcCf.iux, this.iux))
      return false;
    if (!bCO.X(localcCf.iuw, this.iuw))
      return false;
    if (!bCO.X(localcCf.iuv, this.iuv)) {
      return false;
    }
    return true;
  }
}