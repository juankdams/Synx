public abstract class cQa
{
  public void a(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    dwZ localdwZ = b(paramdhJ, paramaZK, paramLong);
    if (localdwZ != dwZ.lDa) {
      a(localdwZ);
      return;
    }

    c(paramdhJ, paramaZK, paramLong);
  }

  public abstract void a(aZK paramaZK, dhJ paramdhJ);

  public abstract void b(aZK paramaZK, dhJ paramdhJ);

  public abstract dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong);

  protected abstract void c(dhJ paramdhJ, aZK paramaZK, long paramLong);

  protected abstract void a(dwZ paramdwZ);

  public abstract dFN cHc();

  public String toString()
  {
    return "TravelProvider{" + getClass().getSimpleName() + ", TravelType:" + cHc() + '}';
  }
}