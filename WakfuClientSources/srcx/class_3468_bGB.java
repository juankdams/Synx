public abstract class bGB extends FA
{
  public final float aOR;
  public final float aOS;
  public final float aOT;

  protected bGB(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
  }

  public static bGB a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean) {
    return paramBoolean ? new bdb(paramFloat1, paramFloat2, paramFloat3, null) : new dlt(paramFloat1, paramFloat2, paramFloat3, null);
  }
}