import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;

public class Vl
  implements kL
{
  private static final Logger K = Logger.getLogger(Vl.class);

  private final Object aNy = new Object();
  private final String czy;
  private final bPj czz;
  private final ArrayList czA = new ArrayList();
  private Map czB;

  public Vl(String paramString, bPj parambPj)
  {
    this.czy = paramString;
    this.czz = parambPj;
  }

  protected void c(Map paramMap) {
    this.czB = paramMap;
  }

  public void b(bwK parambwK) {
    synchronized (this.aNy) {
      if (this.czA.contains(parambwK)) {
        return;
      }
      boolean bool = this.czA.isEmpty();

      this.czA.add(parambwK);
      if (bool)
        c(parambwK);
    }
  }

  protected void c(bwK parambwK) {
    ccy localccy = new ccy(this.czy);
    localccy.a(parambwK.mu());
    try
    {
      iY localiY = new iY(localccy, new URL(this.czy), this, this.czB);
      localiY.qY();
    } catch (MalformedURLException localMalformedURLException) {
      K.warn("Erreur : " + localMalformedURLException.getMessage());
      air();
    } catch (IOException localIOException) {
      K.warn("Erreur : " + localIOException.getMessage());
      air();
    }
  }

  private void air() {
    if (this.czA.isEmpty()) {
      return;
    }
    this.czA.remove(0);

    if (!this.czA.isEmpty())
      c((bwK)this.czA.get(0));
  }

  public void a(ccy paramccy) {
    synchronized (this.aNy) {
      this.czz.a(paramccy, (bwK)this.czA.get(0));
      air();
    }
  }

  public void ah(String paramString) {
    K.warn(paramString);
    synchronized (this.aNy) {
      this.czz.a((bwK)this.czA.get(0));
      air();
    }
  }

  public String toString()
  {
    return "SoapEntryLoader{m_soapServiceUrl='" + this.czy + '\'' + '}';
  }
}