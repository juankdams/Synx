import java.io.File;
import java.io.IOException;

public class cea
  implements cjq
{
  private static final wh aIk = wh.Fo();
  private File hxW;
  private File hxX;
  private boolean hxY = false;

  public void I(File paramFile)
  {
    this.hxW = paramFile;
  }

  public void J(File paramFile)
  {
    this.hxX = paramFile;
  }

  public void gN(boolean paramBoolean)
  {
    this.hxY = paramBoolean;
  }

  public boolean gh()
  {
    if ((this.hxW == null) || (this.hxX == null)) {
      throw new cJ("both file1 and file2 are required in filesmatch");
    }

    boolean bool = false;
    try {
      bool = aIk.a(this.hxW, this.hxX, this.hxY);
    } catch (IOException localIOException) {
      throw new cJ("when comparing files: " + localIOException.getMessage(), localIOException);
    }

    return bool;
  }
}