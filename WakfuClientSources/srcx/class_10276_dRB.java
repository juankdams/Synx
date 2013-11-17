import java.io.File;
import java.io.IOException;

public class dRB extends dJY
{
  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    try
    {
      if (paramFF != null) {
        paramFF.d("Execute:Java13CommandLauncher: " + aDr.i(paramArrayOfString1), 4);
      }

      return Runtime.getRuntime().exec(paramArrayOfString1, paramArrayOfString2, paramFile);
    } catch (IOException localIOException) {
      throw localIOException;
    }
    catch (Exception localException) {
      throw new cJ("Unable to execute command", localException);
    }
  }
}