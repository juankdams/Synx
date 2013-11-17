public class bUa extends bMI
{
  private static final String beE = "value";
  private String bFu;

  public void A(K paramK)
  {
    super.A(paramK);

    K localK = paramK.e("value");
    if (localK != null)
      this.bFu = localK.getStringValue();
  }

  public cMc caj()
  {
    return new bUa();
  }

  protected void a(dEn paramdEn, cZy paramcZy)
  {
    paramcZy.c(paramdEn, this.bFu);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SetPropertyAction");
    localStringBuilder.append("{m_name='").append(this.m_name).append('\'');
    localStringBuilder.append("{m_value='").append(this.bFu).append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}