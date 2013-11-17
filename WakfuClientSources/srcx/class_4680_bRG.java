import java.io.Reader;

public final class bRG extends bit
  implements bEc
{
  private static final int hbl = 8;
  private static final String hbm = "tablength";
  private int hbn = 8;

  private int hbo = 0;

  public bRG()
  {
  }

  public bRG(Reader paramReader)
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

    if (this.hbo > 0) {
      this.hbo -= 1;
      i = 32;
    } else {
      i = this.in.read();
      if (i == 9) {
        this.hbo = (this.hbn - 1);
        i = 32;
      }
    }
    return i;
  }

  public void tQ(int paramInt)
  {
    this.hbn = paramInt;
  }

  private int bYM()
  {
    return this.hbn;
  }

  public Reader b(Reader paramReader)
  {
    bRG localbRG = new bRG(paramReader);
    localbRG.tQ(bYM());
    localbRG.ax(true);
    return localbRG;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ((arrayOfdaL[i] != null) && 
          ("tablength".equals(arrayOfdaL[i].getName()))) {
          this.hbn = Integer.parseInt(arrayOfdaL[i].getValue());
          break;
        }
  }
}