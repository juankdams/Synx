import java.io.Reader;

public final class bsp extends bit
  implements bEc
{
  private static final String fZi = "prefix";
  private String prefix = null;

  private String dLi = null;

  public bsp()
  {
  }

  public bsp(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    int i = -1;

    if ((this.dLi != null) && (this.dLi.length() == 0)) {
      this.dLi = null;
    }

    if (this.dLi != null) {
      i = this.dLi.charAt(0);
      this.dLi = this.dLi.substring(1);
      if (this.dLi.length() == 0)
        this.dLi = null;
    }
    else {
      this.dLi = readLine();
      if (this.dLi == null) {
        i = -1;
      } else {
        if (this.prefix != null) {
          this.dLi = (this.prefix + this.dLi);
        }
        return read();
      }
    }
    return i;
  }

  public void setPrefix(String paramString)
  {
    this.prefix = paramString;
  }

  private String getPrefix()
  {
    return this.prefix;
  }

  public Reader b(Reader paramReader)
  {
    bsp localbsp = new bsp(paramReader);
    localbsp.setPrefix(getPrefix());
    localbsp.ax(true);
    return localbsp;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("prefix".equals(arrayOfdaL[i].getName())) {
          this.prefix = arrayOfdaL[i].getValue();
          break;
        }
  }
}