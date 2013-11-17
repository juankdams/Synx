public final class aWk
{
  public final String fbq;
  public final int fbr;

  public aWk(String paramString, int paramInt)
  {
    this.fbq = paramString;
    this.fbr = paramInt;
  }

  public int hashCode()
  {
    return 31 * this.fbq.hashCode() + this.fbr;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aWk))
      return false;
    aWk localaWk = (aWk)paramObject;
    return (this.fbr == localaWk.fbr) && (this.fbq.equals(localaWk.fbq));
  }
}