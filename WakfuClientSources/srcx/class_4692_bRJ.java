import java.io.File;

public class bRJ extends czj
  implements cjq
{
  private static final wh aIk = wh.Fo();
  private File cGG;
  private File bNx;

  public void C(File paramFile)
  {
    this.cGG = paramFile;
  }

  public void w(File paramFile)
  {
    this.bNx = paramFile;
  }

  public void validate()
  {
    if (lU() != 1) {
      throw new cJ("Only one selector allowed");
    }
    super.validate();
  }

  public boolean gh()
  {
    if (this.cGG == null) {
      throw new cJ("file attribute not set");
    }
    validate();
    File localFile = this.bNx;
    if (localFile == null) {
      localFile = Ga().PE();
    }

    ank localank = a(Ga())[0];
    return localank.a(localFile, aIk.c(localFile, this.cGG), this.cGG);
  }
}