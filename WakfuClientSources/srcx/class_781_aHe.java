import java.io.Reader;

public final class aHe extends bit
  implements bEc
{
  private static final String eeE = "suffix";
  private String suffix = null;

  private String dLi = null;

  public aHe()
  {
  }

  public aHe(Reader paramReader)
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
        if (this.suffix != null) {
          String str = "";
          if (this.dLi.endsWith("\r\n"))
            str = "\r\n";
          else if (this.dLi.endsWith("\n")) {
            str = "\n";
          }
          this.dLi = (this.dLi.substring(0, this.dLi.length() - str.length()) + this.suffix + str);
        }

        return read();
      }
    }
    return i;
  }

  public void gB(String paramString)
  {
    this.suffix = paramString;
  }

  private String getSuffix()
  {
    return this.suffix;
  }

  public Reader b(Reader paramReader)
  {
    aHe localaHe = new aHe(paramReader);
    localaHe.gB(getSuffix());
    localaHe.ax(true);
    return localaHe;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("suffix".equals(arrayOfdaL[i].getName())) {
          this.suffix = arrayOfdaL[i].getValue();
          break;
        }
  }
}