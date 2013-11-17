import java.io.File;

public class dyb extends FG
{
  public dyb(dJY paramdJY)
  {
    super(paramdJY);
  }

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    File localFile = paramFile;
    if (paramFile == null) {
      if (paramFF != null)
        localFile = paramFF.PE();
      else {
        return a(paramFF, paramArrayOfString1, paramArrayOfString2);
      }

    }

    int i = 7;
    String str = localFile.getAbsolutePath();
    String[] arrayOfString = new String[paramArrayOfString1.length + 7];

    arrayOfString[0] = "cmd";
    arrayOfString[1] = "/c";
    arrayOfString[2] = str.substring(0, 2);
    arrayOfString[3] = "&&";
    arrayOfString[4] = "cd";
    arrayOfString[5] = str.substring(2);
    arrayOfString[6] = "&&";

    System.arraycopy(paramArrayOfString1, 0, arrayOfString, 7, paramArrayOfString1.length);

    return a(paramFF, arrayOfString, paramArrayOfString2);
  }
}