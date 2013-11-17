import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class cTr
{
  private static final Logger K = Logger.getLogger(cTr.class);
  public static final cTr kFU = new cTr();
  private final abI fiE;

  public cTr()
  {
    this.fiE = new abI(-1);
  }

  public void a(String paramString, crE paramcrE) {
    try {
      File localFile = Bh.ai(paramString);
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
    localStringBuilder.append("WebShopDataDownloader");
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}