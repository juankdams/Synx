import java.io.File;

public class bxL extends FG
{
  public bxL(dJY paramdJY)
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

    int i = 6;
    String[] arrayOfString = new String[paramArrayOfString1.length + 6];

    arrayOfString[0] = "cmd";
    arrayOfString[1] = "/c";
    arrayOfString[2] = "cd";
    arrayOfString[3] = "/d";
    arrayOfString[4] = localFile.getAbsolutePath();
    arrayOfString[5] = "&&";

    System.arraycopy(paramArrayOfString1, 0, arrayOfString, 6, paramArrayOfString1.length);

    return a(paramFF, arrayOfString, paramArrayOfString2);
  }
}