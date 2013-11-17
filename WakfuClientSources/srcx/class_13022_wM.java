import java.io.File;

public abstract class wM extends cwV
  implements ank
{
  private String boz = null;

  public void be(String paramString)
  {
    if (this.boz == null)
      this.boz = paramString;
  }

  public String getError()
  {
    return this.boz;
  }

  public void cd()
  {
    if (cum())
      ((wM)cup()).cd();
  }

  public void validate()
  {
    if (getError() == null) {
      cd();
    }
    if (getError() != null) {
      throw new cJ(this.boz);
    }
    if (!cum())
      cuo();
  }

  public abstract boolean a(File paramFile1, String paramString, File paramFile2);
}