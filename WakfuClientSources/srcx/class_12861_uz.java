public abstract class uz extends crX
{
  private static final bIN bij = bIN.gJf;
  protected long bik;
  protected String SL;
  protected boolean bil;
  protected boolean bim;
  protected axZ bin;
  protected boolean bio;
  protected boolean bip;
  protected boolean biq;
  protected boolean bir;
  protected int bis;
  private static short SU = 500;
  private short ST;
  protected Qg bit = Qg.cpc;

  protected uz(long paramLong, String paramString, boolean paramBoolean)
  {
    a(paramLong, paramString, paramBoolean);
    this.biq = false;
  }

  protected uz(long paramLong, crX paramcrX, boolean paramBoolean) {
    super(paramcrX);
    a(paramLong, null, paramBoolean);
    this.biq = false;
  }

  protected uz(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(bij, new cSJ(paramInt1, paramInt2, (short)32, null, bPR.EMPTY_BYTE_ARRAY));
    wn(0).axl();
    a(paramLong, null, false);
    this.biq = true;
    this.bir = paramBoolean;
  }

  public void ac(boolean paramBoolean) {
    this.bip = paramBoolean;
  }

  public final long Dt() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.bik;
  }

  public final String getFileName() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.SL;
  }

  public final boolean load(String paramString)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return lU(paramString.concat(this.SL));
  }

  public final boolean ad(boolean paramBoolean)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if (paramBoolean)
      return lU(this.SL);
    return lV(this.SL);
  }

  public final boolean Du()
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.bil;
  }

  public final void ae(boolean paramBoolean) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.bil = paramBoolean;
  }

  public void a(int paramInt, cSJ paramcSJ)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    super.a(paramInt, paramcSJ);
    this.bim = false;
  }

  public final boolean gI()
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return (this.bim) && (!this.Vm);
  }

  public final void Dv() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    for (int i = 0; i < cqt(); i++) {
      cSJ localcSJ = wn(i);
      if (localcSJ != ibK)
        localcSJ.cIy();
    }
  }

  public final axZ Dw() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.bin;
  }

  public final void a(axZ paramaxZ) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.bin = paramaxZ;
  }

  public final boolean Dx() {
    return this.biq;
  }

  public abstract boolean c(bSr parambSr);

  public abstract void d(bSr parambSr);

  public abstract void e(bSr parambSr);

  public abstract void f(bSr parambSr);

  public abstract void g(bSr parambSr);

  public abstract boolean isCompressed();

  public abstract boolean h(bSr parambSr);

  public float Dy()
  {
    float f = bCO.sj(wo(0).getX()) * bCO.sj(wo(0).getY()) * 4 / 1024.0F;
    if (this.bir) {
      f *= 2.0F;
    }
    if (isCompressed()) {
      f /= 4.0F;
    }
    return f;
  }

  public int Dz() {
    int i = 0;
    if (this.bis == 0)
      i = 32;
    else if (this.bis < 256)
      i = (int)(i + (32.0D - 4.0D * Math.log(this.bis)));
    if (gR() < -1000)
      i += 34;
    else {
      i += -gR() * 34 / 1000;
    }
    float f = Dy();
    if (f >= 1024.0F)
      i += 34;
    else {
      i = (int)(i + f * 34.0F / 1024.0F);
    }
    return i;
  }

  public final void gQ()
  {
    super.gQ();
    this.ST = SU;
  }

  public final short gR() {
    return this.ST;
  }

  public final void gS() {
    if ((bpu() == 0) && (this.ST > -32768))
      this.ST = ((short)(this.ST - 1));
  }

  protected void DA() {
    super.DA();
  }

  private void a(long paramLong, String paramString, boolean paramBoolean)
  {
    this.bik = paramLong;
    this.SL = paramString;
    this.bil = false;
    this.bin = axZ.dNB;
    this.bio = paramBoolean;
    this.ST = SU;
  }
}