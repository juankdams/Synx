import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import org.apache.log4j.Logger;

public class bWC extends bTp
{
  public static final Logger K = Logger.getLogger(bWC.class);
  private static final int DEFAULT_SIZE = 1024;
  private final ByteArrayOutputStream hiO;

  public bWC(URL paramURL)
  {
    super(paramURL);
    this.hiO = new ByteArrayOutputStream(1024);
  }

  OutputStream bQF() {
    return this.hiO;
  }

  boolean gg(boolean paramBoolean) {
    return paramBoolean;
  }

  public byte[] cbC()
  {
    return this.hiO.toByteArray();
  }

  public String getAsString() {
    return this.hiO.toString("UTF-8");
  }

  public String kz(String paramString) {
    return this.hiO.toString(paramString);
  }

  protected String bQH() {
    return "Memory";
  }
}