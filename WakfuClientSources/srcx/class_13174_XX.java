public class XX extends dwE
  implements cBO
{
  private String cyg;

  public void dQ(String paramString)
  {
    this.cyg = paramString;
  }

  public String dR(String paramString)
  {
    if (this.cyg == null) {
      throw new cJ("Missing contains in containsstring");
    }
    if (paramString.indexOf(this.cyg) > -1) {
      return paramString;
    }
    return null;
  }
}