import java.net.URL;
import org.apache.log4j.Logger;

public class dQU
{
  private Logger K = Logger.getLogger(dQU.class);

  private static dQU mlH = new dQU();

  public uz n(URL paramURL)
  {
    if (paramURL == null) {
      return null;
    }

    String str = paramURL.toString();
    long l = byn.jp(str);

    uz localuz = tq.Bg().b(dHL.lSB.dhZ(), l, str, false, true);
    if (localuz == null) {
      this.K.error("Problème au chargement de la texture " + paramURL);
      crX localcrX = new crX();
      localuz = tq.Bg().b(dHL.lSB.dhZ(), l, localcrX, false);
      localcrX.axl();
    }
    return localuz;
  }

  public uz rO(String paramString)
  {
    return aKN.bcs().gN(paramString);
  }

  public uz rP(String paramString) {
    long l = bUD.getLong(paramString, -1L);
    if (l == -1L) {
      return null;
    }
    return tq.Bg().aw(l);
  }

  public void drR()
  {
  }

  public static dQU drS()
  {
    return mlH;
  }
}