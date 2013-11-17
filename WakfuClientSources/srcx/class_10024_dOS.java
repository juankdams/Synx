import java.io.File;

public class dOS extends cGj
  implements aZH
{
  public static final String mgA = "monthName";
  public static final String mgB = "protectorName";
  public static final String mgC = "protectorDesc";
  public static final String mgD = "protectorIconUrl";
  private cYh mgE;
  private dyT mgF;

  public void a(cYh paramcYh)
  {
    this.mgE = paramcYh;

    Ww();

    dLE.doY().a(this, new String[] { "monthName", "protectorName", "protectorDesc", "protectorIconUrl" });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (this.mgE == null) {
      return null;
    }
    if (paramString.equals("monthName"))
      return bU.fH().getString("calendar.month." + this.mgE.getMonth());
    if (paramString.equals("protectorName"))
      return this.mgE.cLE();
    if (paramString.equals("protectorDesc"))
      return this.mgE.cLF();
    if (paramString.equals("protectorIconUrl")) {
      return this.mgF == null ? null : this.mgF.getUrl();
    }
    return null;
  }

  private void Ww() {
    if (this.mgE == null) {
      return;
    }
    String str1 = this.mgE.cLG();
    if (str1 == null) {
      return;
    }
    File localFile = lh.ai(str1);
    String str2 = lh.i(localFile);

    this.mgF = new dyT(null, str2, "protectorIconUrl", this);
    baw.fiD.a(str1, this.mgF);
  }

  public void x(String paramString1, String paramString2)
  {
    dLE.doY().a(this, new String[] { paramString1 });
  }
}