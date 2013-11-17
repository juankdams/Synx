final class ccN extends ave
{
  private static final String bdh = "@(#) $RCSfile: NegateFilter.java,v $ $Revision: 1.3 $ $Date: 2004/02/06 09:28:31 $";
  private KN Vx;

  public ccN(KN paramKN)
  {
    this.Vx = paramKN;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }

    if ((paramObject instanceof ccN)) {
      return this.Vx.equals(((ccN)paramObject).Vx);
    }
    return false;
  }

  public int hashCode() {
    return this.Vx.hashCode() ^ 0xFFFFFFFF;
  }

  public boolean matches(Object paramObject)
  {
    return this.Vx.matches(paramObject) ^ true;
  }

  public KN aHh() {
    return this.Vx;
  }

  public String toString()
  {
    return 64 + 
      "[NegateFilter: " + 
      this.Vx.toString() + 
      "]";
  }
}