public class sP extends agw
{
  private String m_name;

  public sP(aUJ paramaUJ)
  {
    super(paramaUJ);
    this.m_name = paramaUJ.getName();
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
    dLE.doY().a(this, new String[] { "name" });
  }
}