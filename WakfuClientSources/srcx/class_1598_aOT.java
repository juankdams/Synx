import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class aOT extends cib
{
  public static final String ewb = "ETag";
  public static final String ewc = "Last-Modified";
  private String ewd;
  private String ewe;

  public aOT(String paramString)
  {
    this.ewd = paramString;
  }

  public boolean isValid()
  {
    try {
      URLConnection localURLConnection = ((bJx)this.cQa).bvo().openConnection();

      Object localObject = null;

      for (int i = 0; ; i++) {
        String str1 = localURLConnection.getHeaderFieldKey(i);
        String str2 = localURLConnection.getHeaderField(i);

        if ((str1 == null) && (str2 == null)) {
          break;
        }
        if ("ETag".equals(str1)) {
          localObject = str2;
          break;
        }if ("Last-Modified".equals(str1)) {
          localObject = str2;
        }

      }

      this.ewe = localObject;
      return (this.ewe != null) && (this.ewe.equals(this.ewd)); } catch (IOException localIOException) {
    }
    return false;
  }

  public String bfL()
  {
    return this.ewd;
  }

  public String bfM() {
    return this.ewe;
  }
}