import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

public class Yj extends dwE
  implements cjq
{
  private static final int cIG = 400;
  private static final String cIH = "GET";
  private String cII = null;
  private String cIJ = "GET";

  private int cIK = 400;

  public void setUrl(String paramString)
  {
    this.cII = paramString;
  }

  public void ho(int paramInt)
  {
    this.cIK = paramInt;
  }

  public void setRequestMethod(String paramString)
  {
    this.cIJ = (paramString == null ? "GET" : paramString.toUpperCase(Locale.ENGLISH));
  }

  public boolean gh()
  {
    if (this.cII == null) {
      throw new cJ("No url specified in http condition");
    }
    d("Checking for " + this.cII, 3);
    try {
      URL localURL = new URL(this.cII);
      try {
        URLConnection localURLConnection = localURL.openConnection();
        if ((localURLConnection instanceof HttpURLConnection)) {
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURLConnection;
          localHttpURLConnection.setRequestMethod(this.cIJ);
          int i = localHttpURLConnection.getResponseCode();
          d("Result code for " + this.cII + " was " + i, 3);

          if ((i > 0) && (i < this.cIK)) {
            return true;
          }
          return false;
        }
      } catch (ProtocolException localProtocolException) {
        throw new cJ("Invalid HTTP protocol: " + this.cIJ, localProtocolException);
      }
      catch (IOException localIOException) {
        return false;
      }
    } catch (MalformedURLException localMalformedURLException) {
      throw new cJ("Badly formed URL: " + this.cII, localMalformedURLException);
    }
    return true;
  }
}