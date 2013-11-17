import java.io.File;

public abstract class Ee extends wM
{
  private static final wh aIk = wh.Fo();

  protected File bII = null;
  protected cYd Rz = null;
  protected Jf bIJ = null;
  protected int bIK = 0;

  public Ee()
  {
    this.bIK = ((int)aIk.Fp());
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
      throw new cJ("Invalid destination file results for " + this.bII.getName() + " with filename " + paramString);
    }

    String str = arrayOfString[0];
    File localFile = aIk.e(this.bII, str);

    boolean bool = j(paramFile2, localFile);
    return bool;
  }

  protected abstract boolean j(File paramFile1, File paramFile2);

  public void eG(int paramInt)
  {
    this.bIK = paramInt;
  }
}