import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.log4j.Logger;

class bpZ extends Thread
{
  bpZ(dAE paramdAE, String paramString)
  {
    super(paramString); } 
  public void run() { bwZ localbwZ = new bwZ();
    bpA localbpA = new bpA();
    URL localURL = null;
    Object localObject1;
    Object localObject2;
    try { String str = bU.fH().ajJ().cAZ().getLanguage().toLowerCase();
      localObject1 = ay.bd().getString("rssURL");
      if (localObject1 == null) {
        localObject1 = "http://www.wakfu.com/";
      }
      localURL = new URL((String)localObject1 + str + "/mmorpg/game.xml");
      localObject2 = localURL.openStream();
      localbpA.i((InputStream)localObject2);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
      ((InputStream)localObject2).close();
    } catch (Exception localException) {
      dAE.Re().warn("Problème au chargement du flux rss", localException);
      return;
    }

    adn localadn = new adn();
    try {
      localObject1 = localadn.a(localbwZ, true);
      if (!((czV)localObject1).getItems().isEmpty()) {
        localObject2 = new dgA((czV)localObject1);
        dLE.doY().t("rssFeed", localObject2);
      } else {
        dLE.doY().t("rssFeed", null);
      }
    } catch (aaU localaaU) {
      dAE.Re().warn("Problème lors du chargement du flux rss");
    }
    dAE.a(this.fKv, null);
  }
}