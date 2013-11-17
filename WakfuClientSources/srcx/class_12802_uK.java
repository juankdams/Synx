final class uK extends ave
{
  private static final String bdh = "@(#) $RCSfile: AndFilter.java,v $ $Revision: 1.3 $ $Date: 2004/02/06 09:28:31 $";
  private KN biL;
  private KN biM;

  public uK(KN paramKN1, KN paramKN2)
  {
    if ((paramKN1 == null) || (paramKN2 == null)) {
      throw new IllegalArgumentException("null filter not allowed");
    }
    this.biL = paramKN1;
    this.biM = paramKN2;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }

    if ((paramObject instanceof uK)) {
      uK localuK = (uK)paramObject;
      if (((this.biL.equals(localuK.biL)) && (this.biM.equals(localuK.biM))) || (
        (this.biL.equals(localuK.biM)) && (this.biM.equals(localuK.biL)))) {
        return true;
      }
    }
    return false;
  }

  public int hashCode() {
    return 31 * this.biL.hashCode() + this.biM.hashCode();
  }

  public boolean matches(Object paramObject)
  {
    return (this.biL.matches(paramObject)) && (this.biM.matches(paramObject));
  }

  public String toString()
  {
    return 64 + 
      "[AndFilter: " + 
      this.biL.toString() + 
      ",\n" + 
      "            " + 
      this.biM.toString() + 
      "]";
  }
}