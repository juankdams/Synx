import java.io.File;

public class bJY extends wM
{
  private File bII = null;
  private cYd Rz = null;
  private Jf bIJ = null;
  private boolean gLR = true;

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{presentselector targetdir: ");
    if (this.bII == null)
      localStringBuilder.append("NOT YET SET");
    else {
      localStringBuilder.append(this.bII.getName());
    }
    localStringBuilder.append(" present: ");
    if (this.gLR)
      localStringBuilder.append("both");
    else {
      localStringBuilder.append("srconly");
    }
    if (this.bIJ != null)
      localStringBuilder.append(this.bIJ.toString());
    else if (this.Rz != null) {
      localStringBuilder.append(this.Rz.toString());
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void t(File paramFile)
  {
    this.bII = paramFile;
  }

  public cYd gg()
  {
    if ((this.bIJ != null) || (this.Rz != null)) {
      throw new cJ("Cannot define more than one mapper");
    }
    this.Rz = new cYd(Ga());
    return this.Rz;
  }

  public void b(Jf paramJf)
  {
    if ((this.bIJ != null) || (this.Rz != null)) {
      throw new cJ("Cannot define more than one mapper");
    }
    this.bIJ = paramJf;
  }

  public void a(aVJ paramaVJ)
  {
    if (paramaVJ.getIndex() == 0)
      this.gLR = false;
  }

  public void cd()
  {
    if (this.bII == null) {
      be("The targetdir attribute is required.");
    }
    if (this.bIJ == null)
      if (this.Rz == null) {
        this.bIJ = new cZm();
      } else {
        this.bIJ = this.Rz.cLA();
        if (this.bIJ == null)
          be("Could not set <mapper> element.");
      }
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    String[] arrayOfString = this.bIJ.cg(paramString);

    if (arrayOfString == null) {
      return false;
    }

    if ((arrayOfString.length != 1) || (arrayOfString[0] == null)) {
      throw new cJ("Invalid destination file results for " + this.bII + " with filename " + paramString);
    }

    String str = arrayOfString[0];
    File localFile = wh.Fo().e(this.bII, str);
    return localFile.exists() == this.gLR;
  }
}