import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.apache.log4j.Logger;

public class lh
{
  private static final Logger K = Logger.getLogger(lh.class);

  public static String i(File paramFile)
  {
    try
    {
      return paramFile.toURI().toURL().toString();
    } catch (MalformedURLException localMalformedURLException) {
      K.warn(localMalformedURLException.getMessage());
    }
    return null;
  }

  public static File ai(String paramString)
  {
    String str1 = dtb.qa(paramString);
    String str2 = dtb.qa(str1);

    String str3 = dtb.qb(str2);
    String str4 = dtb.qb(str1);
    String str5 = dtb.pY(paramString);
    String str6 = dtb.pX(paramString);

    String str7 = str3 + str4 + str5 + '.' + str6;
    try
    {
      String str8 = ay.bd().getString("almanachCacheDirectory");
      return new File(str8 + str7);
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }return null;
  }
}