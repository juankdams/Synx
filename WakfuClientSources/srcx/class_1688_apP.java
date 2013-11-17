import java.util.HashMap;
import org.apache.log4j.Logger;

public class apP
  implements Runnable
{
  private static Logger K = Logger.getLogger(apP.class);

  private final HashMap dwt = new HashMap();

  private final Object aNy = new Object();

  private boolean dwu = false;

  public void p(String paramString, int paramInt)
  {
    dgk localdgk = (dgk)this.dwt.get(paramString);
    if (localdgk != null) {
      return;
    }

    if (paramInt < 1)
      paramInt = 1;
    try
    {
      localdgk = new dgk(paramString, paramInt);
      synchronized (this.dwt) {
        this.dwt.put(paramString, localdgk);
      }
      synchronized (this.aNy) {
        this.aNy.notify();
      }
      this.dwu = true;
    } catch (Exception localException) {
      K.error("Resource invalide : " + paramString);
    }
  }

  public void fh(String paramString)
  {
    dgk localdgk = null;
    synchronized (this.dwt) {
      localdgk = (dgk)this.dwt.remove(paramString);
    }
    if (localdgk != null)
      localdgk.clean();
  }

  public void aBK()
  {
    for (dgk localdgk : this.dwt.values())
      localdgk.clean();
  }

  public aNL fi(String paramString)
  {
    dgk localdgk;
    synchronized (this.dwt) {
      localdgk = (dgk)this.dwt.get(paramString);
    }
    if (localdgk != null) {
      synchronized (this.aNy) {
        this.aNy.notify();
      }
      this.dwu = true;
      return localdgk.cPL();
    }
    return null;
  }

  public void run()
  {
    while (true)
    {
      try
      {
        synchronized (this.aNy) {
          if (!this.dwu)
            this.aNy.wait();
        }
      }
      catch (InterruptedException )
      {
        K.warn("Interrupted Exception");
      }

      synchronized (this.dwt) {
        for (dgk localdgk : this.dwt.values()) {
          if (localdgk.cPM()) {
            localdgk.cPN();
          }
        }
      }

      this.dwu = false;
    }
  }
}