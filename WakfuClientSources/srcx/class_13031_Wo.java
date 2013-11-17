import java.io.File;
import java.io.IOException;

public class Wo extends FG
{
  private final String cGm;

  public Wo(String paramString, dJY paramdJY)
  {
    super(paramdJY);
    this.cGm = paramString;
  }

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    if (paramFF == null) {
      if (paramFile == null) {
        return a(paramFF, paramArrayOfString1, paramArrayOfString2);
      }
      throw new IOException("Cannot locate antRun script: No project provided");
    }

    String str1 = paramFF.getProperty("ant.home");
    if (str1 == null) {
      throw new IOException("Cannot locate antRun script: Property 'ant.home' not found");
    }

    String str2 = aIk.e(paramFF.PE(), str1 + File.separator + this.cGm).toString();

    File localFile = paramFile;
    if (paramFile == null) {
      localFile = paramFF.PE();
    }

    String[] arrayOfString = new String[paramArrayOfString1.length + 3];
    arrayOfString[0] = "perl";
    arrayOfString[1] = str2;
    arrayOfString[2] = localFile.getAbsolutePath();
    System.arraycopy(paramArrayOfString1, 0, arrayOfString, 3, paramArrayOfString1.length);

    return a(paramFF, arrayOfString, paramArrayOfString2);
  }
}