import java.io.File;

public class daB extends dwE
{
  private String[] giQ;
  private String prefix = "";
  private String suffix = "";

  public void setValue(String paramString)
  {
    this.giQ = new String[] { paramString };
  }

  public void oH(String paramString)
  {
    if (paramString == null) {
      return;
    }
    this.giQ = aDr.gl(paramString);
  }

  public void j(aoo paramaoo)
  {
    this.giQ = new String[] { paramaoo.toString() };
  }

  public void e(cxK paramcxK)
  {
    aoo localaoo = new aoo(Ga());
    localaoo.a(paramcxK);
    this.giQ = new String[] { localaoo.toString() };
  }

  public void C(File paramFile)
  {
    this.giQ = new String[] { paramFile.getAbsolutePath() };
  }

  public void setPrefix(String paramString)
  {
    this.prefix = (paramString != null ? paramString : "");
  }

  public void gB(String paramString)
  {
    this.suffix = (paramString != null ? paramString : "");
  }

  public String[] bEZ()
  {
    if ((this.giQ == null) || (this.giQ.length == 0) || ((this.prefix.length() == 0) && (this.suffix.length() == 0)))
    {
      return this.giQ;
    }
    String[] arrayOfString = new String[this.giQ.length];
    for (int i = 0; i < arrayOfString.length; i++) {
      arrayOfString[i] = (this.prefix + this.giQ[i] + this.suffix);
    }
    return arrayOfString;
  }
}