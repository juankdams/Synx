import java.io.File;

public class LS extends cGj
  implements aZH
{
  public static final String bYP = "merydName";
  public static final String bYQ = "merydDesc";
  public static final String bYR = "merydIconUrl";
  private boi bYS;
  private dyT bYT;

  public void a(boi paramboi)
  {
    this.bYS = paramboi;

    Ww();

    dLE.doY().a(this, new String[] { "merydName", "merydDesc", "merydIconUrl" });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (this.bYS == null)
      return null;
    if (paramString.equals("merydName"))
      return this.bYS.bxY();
    if (paramString.equals("merydDesc"))
      return this.bYS.bxT();
    if (paramString.equals("merydIconUrl")) {
      return this.bYT == null ? null : this.bYT.getUrl();
    }
    return null;
  }

  private void Ww() {
    if (this.bYS == null) {
      return;
    }
    String str1 = this.bYS.bxZ();
    if (str1 == null) {
      return;
    }
    File localFile = lh.ai(str1);
    String str2 = lh.i(localFile);

    this.bYT = new dyT(null, str2, "merydIconUrl", this);
    baw.fiD.a(str1, this.bYT);
  }

  public void x(String paramString1, String paramString2) {
    dLE.doY().a(this, new String[] { paramString1 });
  }
}