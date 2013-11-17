public class baX
{
  public final boolean fiX;
  public final boolean fiY;
  public final float fiZ;
  public final float fja;
  public final float fjb;
  public final float ayE;
  public final float ayF;

  public baX(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean2)
  {
    this.fiX = paramBoolean1;
    this.fiZ = paramInt1;
    this.fiY = paramBoolean2;
    this.fja = (paramInt2 * 10);
    this.fjb = (paramInt3 * 10);
    this.ayE = crO.dF(paramInt4, paramInt5);
    this.ayF = crO.S(paramInt4, paramInt5, paramInt1);
  }

  public float bjH() {
    return this.ayE;
  }

  public float bjI() {
    return this.ayF;
  }

  public float bjJ() {
    return this.ayE - 43.0F;
  }

  public float bjK() {
    return this.ayE + 43.0F;
  }

  public float bpo() {
    return this.ayF + 21.5F;
  }

  public float bpp() {
    return this.ayF - 21.5F;
  }
}