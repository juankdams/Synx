public class dNL extends bxG
{
  private final Su aWG;
  private final cWV men;

  public dNL(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, cWV paramcWV)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.aWG = dX(paramLong);

    this.men = paramcWV;
  }

  protected long mC()
  {
    if (this.aWG == null) {
      return 0L;
    }
    if (!this.aWG.aeF())
      return 0L;
    cew localcew = this.aWG.aeL();
    return localcew.c(this.men);
  }
}