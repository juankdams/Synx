import java.io.File;
import java.util.Properties;

public class Kj extends FG
{
  public Kj(dJY paramdJY)
  {
    super(paramdJY);
  }

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    if (paramFile == null) {
      return a(paramFF, paramArrayOfString1, paramArrayOfString2);
    }
    System.getProperties().put("user.dir", paramFile.getAbsolutePath());
    try {
      return a(paramFF, paramArrayOfString1, paramArrayOfString2);
    }
    finally {
      System.getProperties().put("user.dir", System.getProperty("user.dir"));
    }
  }
}