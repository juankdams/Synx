import java.io.Reader;

public final class qs extends bit
  implements bEc
{
  private static final String aXr = "lines";
  private static final String aXs = "skip";
  private long aXt = 0L;
  private static final int aXu = 10;
  private long aXv = 10L;

  private long aXw = 0L;

  private asN aXx = null;

  private String aXy = null;

  private int aXz = 0;
  private boolean eof;

  public qs()
  {
  }

  public qs(Reader paramReader)
  {
    super(paramReader);
    this.aXx = new asN();
    this.aXx.cQ(true);
  }

  public int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    while ((this.aXy == null) || (this.aXy.length() == 0)) {
      this.aXy = this.aXx.g(this.in);
      if (this.aXy == null) {
        return -1;
      }
      this.aXy = av(this.aXy);
      if (this.eof) {
        return -1;
      }
      this.aXz = 0;
    }

    int i = this.aXy.charAt(this.aXz);
    this.aXz += 1;
    if (this.aXz == this.aXy.length()) {
      this.aXy = null;
    }
    return i;
  }

  public void V(long paramLong)
  {
    this.aXv = paramLong;
  }

  private long xz()
  {
    return this.aXv;
  }

  public void W(long paramLong)
  {
    this.aXw = paramLong;
  }

  private long xA()
  {
    return this.aXw;
  }

  public Reader b(Reader paramReader)
  {
    qs localqs = new qs(paramReader);
    localqs.V(xz());
    localqs.W(xA());
    localqs.ax(true);
    return localqs;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("lines".equals(arrayOfdaL[i].getName())) {
          this.aXv = Long.parseLong(arrayOfdaL[i].getValue());
        }
        else if ("skip".equals(arrayOfdaL[i].getName()))
          this.aXw = Long.parseLong(arrayOfdaL[i].getValue());
  }

  private String av(String paramString)
  {
    this.aXt += 1L;
    if ((this.aXw > 0L) && 
      (this.aXt - 1L < this.aXw)) {
      return null;
    }

    if ((this.aXv > 0L) && 
      (this.aXt > this.aXv + this.aXw)) {
      this.eof = true;
      return null;
    }

    return paramString;
  }
}