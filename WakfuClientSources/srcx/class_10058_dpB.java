import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

class dpB
  implements Runnable
{
  dpB(pN parampN)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(500L);
      String str1 = ay.bd().getString("autoLogin_login");
      String str2 = ay.bd().getString("autoLogin_password");
      String str3 = null;
      int i = 0;
      try {
        str3 = ay.bd().getString("autoLogin_proxyGroup");
      } catch (bdh localbdh) {
        pN.K.warn("Impossible de trouver la propriété 'autoLogin_proxyGroup' : on prend le premier proxy de la liste.");
        i = 1;
      }
      Object localObject1 = null;
      ArrayList localArrayList = doh.a(ay.bd(), "proxyGroup", "proxyAddresses", "proxyCommunity");
      Object localObject2;
      if (i == 0) {
        i = 1;
        for (localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { doh localdoh = (doh)((Iterator)localObject2).next();
          if (String.valueOf(localdoh.getIndex()).equalsIgnoreCase(str3)) {
            localObject1 = localdoh;
            i = 0;
            break;
          }
        }
      }
      if ((i != 0) && (localArrayList.size() > 0)) {
        localObject1 = (doh)localArrayList.get(0);
      }
      if (localObject1 != null) {
        pN.K.info("Envoi de la requête de login (login=" + str1 + ", password=" + str2 + ", proxyGroup=" + localObject1 + ")");
        localObject2 = dDD.dfr();
        ((dDD)localObject2).hY(str1);
        ((dDD)localObject2).setPassword(str2);
        ((dDD)localObject2).a((doh)localObject1);
        ((dDD)localObject2).b(Boolean.valueOf(true));
        cjO.clE().j((cWG)localObject2);
      } else {
        pN.K.error("Impossible de trouver un ProxyGroup convenable.");
        pN.a(this.lqo, false);
      }
    } catch (Exception localException) {
      pN.K.error("Impossible de démarrer l'AutoLogin", localException);
      pN.a(this.lqo, false);
    }
  }
}