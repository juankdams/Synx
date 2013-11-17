public class CR
  implements bwK
{
  private static final String bHg = "Authentification";
  private static final String KEY = "sKey";
  private final String bde;

  public CR(String paramString)
  {
    this.bde = paramString;
  }

  public bcx mu() {
    cVe localcVe = new cVe("Authentification");

    localcVe.bd("sKey", this.bde);

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    CR localCR = (CR)paramObject;

    return this.bde.equals(localCR.bde);
  }

  public int hashCode()
  {
    return this.bde.hashCode();
  }

  public String toString()
  {
    return "Authentification{m_key='" + this.bde + '\'' + '}';
  }
}