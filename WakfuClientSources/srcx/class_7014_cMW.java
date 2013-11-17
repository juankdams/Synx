public class cMW
  implements cjq
{
  private String string;
  private String kso;
  private boolean caseSensitive = true;

  public void setString(String paramString)
  {
    this.string = paramString;
  }

  public void nM(String paramString)
  {
    this.kso = paramString;
  }

  public void bu(boolean paramBoolean)
  {
    this.caseSensitive = paramBoolean;
  }

  public boolean gh()
  {
    if ((this.string == null) || (this.kso == null)) {
      throw new cJ("both string and substring are required in contains");
    }

    return this.string.indexOf(this.kso) > -1;
  }
}