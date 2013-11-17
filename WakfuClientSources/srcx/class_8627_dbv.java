import java.io.Reader;

public final class dbv extends bit
  implements bEc
{
  private static final String kTt = "\r\n";
  private static final String kTu = "linebreaks";
  private String kTv = "\r\n";

  public dbv()
  {
  }

  public dbv(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    int i = this.in.read();
    while ((i != -1) && 
      (this.kTv.indexOf(i) != -1))
    {
      i = this.in.read();
    }

    return i;
  }

  public void oK(String paramString)
  {
    this.kTv = paramString;
  }

  private String cNh()
  {
    return this.kTv;
  }

  public Reader b(Reader paramReader)
  {
    dbv localdbv = new dbv(paramReader);
    localdbv.oK(cNh());
    localdbv.ax(true);
    return localdbv;
  }

  private void initialize()
  {
    String str = null;
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null) {
      for (int i = 0; i < arrayOfdaL.length; i++) {
        if ("linebreaks".equals(arrayOfdaL[i].getName())) {
          str = arrayOfdaL[i].getValue();
          break;
        }
      }
    }
    if (str != null)
      this.kTv = str;
  }
}