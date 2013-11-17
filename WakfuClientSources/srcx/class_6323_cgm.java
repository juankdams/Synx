import java.io.Reader;
import java.util.LinkedList;

public final class cgm extends bit
  implements bEc
{
  private static final String aXr = "lines";
  private static final String aXs = "skip";
  private static final int aXu = 10;
  private long aXv = 10L;

  private long aXw = 0L;

  private boolean hDR = false;

  private asN aXx = null;

  private String aXy = null;

  private int aXz = 0;

  private LinkedList hDS = new LinkedList();

  public cgm()
  {
  }

  public cgm(Reader paramReader)
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
      this.aXy = kX(this.aXy);
      if (this.aXy == null) {
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
    cgm localcgm = new cgm(paramReader);
    localcgm.V(xz());
    localcgm.W(xA());
    localcgm.ax(true);
    return localcgm;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("lines".equals(arrayOfdaL[i].getName())) {
          V(Long.parseLong(arrayOfdaL[i].getValue()));
        }
        else if ("skip".equals(arrayOfdaL[i].getName()))
          this.aXw = Long.parseLong(arrayOfdaL[i].getValue());
  }

  private String kX(String paramString)
  {
    if (!this.hDR) {
      if (paramString != null) {
        this.hDS.add(paramString);
        if (this.aXv == -1L) {
          if (this.hDS.size() > this.aXw)
            return (String)this.hDS.removeFirst();
        }
        else {
          long l = this.aXv + (this.aXw > 0L ? this.aXw : 0L);
          if (l < this.hDS.size()) {
            this.hDS.removeFirst();
          }
        }
        return "";
      }
      this.hDR = true;
      if (this.aXw > 0L) {
        for (int i = 0; i < this.aXw; i++) {
          this.hDS.removeLast();
        }
      }
      if (this.aXv > -1L) {
        while (this.hDS.size() > this.aXv) {
          this.hDS.removeFirst();
        }
      }
    }
    if (this.hDS.size() > 0) {
      return (String)this.hDS.removeFirst();
    }
    return null;
  }
}