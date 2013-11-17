public final class aUr extends dte
{
  private final int dFY;

  public aUr(int paramInt)
  {
    this.dFY = paramInt;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    cpi localcpi = new cpi(this.dFY);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localcpi);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}