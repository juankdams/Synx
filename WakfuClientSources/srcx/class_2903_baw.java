import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class baw
{
  private static final Logger K = Logger.getLogger(baw.class);
  public static final baw fiD = new baw();
  private final abI fiE;

  public baw()
  {
    this.fiE = new abI(-1);
  }

  public void a(String paramString, crE paramcrE) {
    try {
      File localFile = lh.ai(paramString);
      aOT localaOT = new aOT(bOp.gTA.kf(localFile.getName()));
      bJx localbJx = new bJx(new URL(paramString), localFile, true, true);
      localbJx.a(localaOT);
      this.fiE.a(localbJx, new aLu(paramcrE));
    } catch (MalformedURLException localMalformedURLException) {
      K.warn(localMalformedURLException.getMessage());
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AlmanachDataDownloader");
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}