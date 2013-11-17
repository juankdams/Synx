public class agL
{
  public static agL daF = new agL();

  private final cSR daG = new cSR();

  public void a(cdf paramcdf) {
    this.daG.put(paramcdf.getId(), paramcdf);
  }

  public cdf ib(int paramInt)
  {
    return (cdf)this.daG.get(paramInt);
  }
}