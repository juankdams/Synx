public class ckv extends dwE
  implements cjq
{
  private String Ru;

  public void w(String paramString)
  {
    this.Ru = paramString;
  }

  public boolean gh()
  {
    if (this.Ru == null) {
      throw new cJ("No property specified for isset condition");
    }
    return Ga().getProperty(this.Ru) != null;
  }
}