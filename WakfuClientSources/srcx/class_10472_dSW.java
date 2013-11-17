import java.io.File;
import java.io.IOException;

public class dSW extends Ee
{
  private static final wh aIk = wh.Fo();

  private boolean mpr = true;
  private boolean mps = false;

  public void lw(boolean paramBoolean)
  {
    this.mpr = paramBoolean;
  }

  public void lx(boolean paramBoolean)
  {
    this.mps = paramBoolean;
  }

  protected boolean j(File paramFile1, File paramFile2)
  {
    if (paramFile1.exists() != paramFile2.exists()) {
      return true;
    }

    if (paramFile1.length() != paramFile2.length())
    {
      return true;
    }

    if (!this.mpr)
    {
      int i = (paramFile2.lastModified() >= paramFile1.lastModified() - this.bIK) && (paramFile2.lastModified() <= paramFile1.lastModified() + this.bIK) ? 1 : 0;

      if (i == 0) {
        return true;
      }
    }
    if (!this.mps) {
      try
      {
        return !aIk.b(paramFile1, paramFile2);
      } catch (IOException localIOException) {
        throw new cJ("while comparing " + paramFile1 + " and " + paramFile2, localIOException);
      }
    }

    return false;
  }
}