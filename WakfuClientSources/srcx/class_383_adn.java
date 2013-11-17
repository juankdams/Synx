import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class adn
{
  private static final Logger K = Logger.getLogger(adn.class);
  private static final String cTt = "rss";
  private static final String cTu = "channel";
  private static final String cTv = "title";
  private static final String cTw = "link";
  private static final String aLh = "description";
  private static final String cTx = "image";
  private static final String URL = "url";
  private static final String cTy = "item";

  public czV a(bwZ parambwZ, boolean paramBoolean)
  {
    CC localCC1 = parambwZ.bEx();
    if (!localCC1.getName().equals("rss")) {
      if (!paramBoolean) {
        throw new aaU("La racine n'est pas un tag rss");
      }
      return null;
    }
    CC localCC2 = (CC)localCC1.b("channel");
    if (localCC2 == null) {
      if (!paramBoolean) {
        throw new aaU("tag channel manquant dans rss");
      }
      return null;
    }
    String str1 = null;
    CC localCC3 = (CC)localCC2.b("title");
    if (localCC3 == null) {
      if (!paramBoolean) {
        throw new aaU("tag title manquant dans channel");
      }
      K.warn("tag title manquant dans channel");
    } else {
      str1 = a(localCC3);
    }

    String str2 = null;
    CC localCC4 = (CC)localCC2.b("link");
    if (localCC4 == null) {
      if (!paramBoolean) {
        throw new aaU("tag link manquant dans channel");
      }
      K.warn("tag link manquant dans channel");
    } else {
      str2 = a(localCC4).trim();
    }
    String str3 = null;
    CC localCC5 = (CC)localCC2.b("description");
    if (localCC5 == null) {
      if (!paramBoolean) {
        throw new aaU("tag description manquant dans channel");
      }
      K.warn("tag description manquant dans channel");
    } else {
      str3 = a(localCC5);
    }
    czV localczV = new czV(str1, str2, str3);

    CC localCC6 = (CC)localCC2.b("image");
    if (localCC6 != null) {
      localczV.a(a(localCC6, paramBoolean));
    }
    ArrayList localArrayList = localCC2.c("item");
    if (localArrayList != null) {
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        tI localtI = b((CC)localArrayList.get(i), paramBoolean);
        if (localtI != null)
          localczV.a(localtI);
      }
    }
    return localczV;
  }

  private Wq a(CC paramCC, boolean paramBoolean)
  {
    if (paramBoolean) {
      localObject = paramCC.getChildren();
      if ((localObject == null) || (((ArrayList)localObject).size() == 0)) {
        return null;
      }
    }
    Object localObject = (CC)paramCC.b("url");
    if (localObject == null) {
      if (!paramBoolean) {
        throw new aaU("tag url manquant dans Image");
      }
      K.warn("tag url manquant dans Image");
      return null;
    }
    String str1 = a((CC)localObject).trim();

    CC localCC1 = (CC)paramCC.b("title");
    if (localCC1 == null) {
      if (!paramBoolean) {
        throw new aaU("tag title manquant dans Image");
      }
      K.warn("tag title manquant dans Image");
      return null;
    }
    String str2 = a(localCC1);

    CC localCC2 = (CC)paramCC.b("link");
    if (localCC2 == null) {
      if (!paramBoolean) {
        throw new aaU("tag link manquant dans Image");
      }
      K.warn("tag link manquant dans Image");
      return null;
    }
    String str3 = a(localCC2).trim();

    return new Wq(str1, str2, str3);
  }

  private tI b(CC paramCC, boolean paramBoolean) {
    String str1 = null;
    String str2 = null;
    String str3 = null;

    CC localCC1 = (CC)paramCC.b("title");
    if (localCC1 != null) {
      str1 = a(localCC1);
    }
    CC localCC2 = (CC)paramCC.b("link");
    if (localCC2 != null) {
      str2 = a(localCC2).trim();
    }
    CC localCC3 = (CC)paramCC.b("description");
    if (localCC3 != null) {
      str3 = a(localCC3);
    }
    if ((str1 == null) && (str3 == null)) {
      if (!paramBoolean) {
        throw new aaU("tag title et description manquants dans item");
      }
      K.warn("tag title et description manquants dans item");
      return null;
    }

    tI localtI = new tI(str1, str2, str3);

    CC localCC4 = (CC)paramCC.b("image");
    if (localCC4 != null) {
      localtI.a(a(localCC4, paramBoolean));
    }
    return localtI;
  }

  public String a(CC paramCC) {
    lZ locallZ = new lZ();
    ArrayList localArrayList = paramCC.getChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      CC localCC = (CC)localArrayList.get(i);
      if ((localCC.getName().equals("#text")) || (localCC.getName().equals("#cdata-section"))) {
        locallZ.a(localCC.getStringValue());
      }
    }
    return locallZ.tP();
  }

  public static void main(String[] paramArrayOfString)
  {
    bwZ localbwZ = new bwZ();
    bpA localbpA = new bpA();
    try {
      InputStream localInputStream = new URL("http://penny-arcade.com/feed").openStream();
      localbpA.i(localInputStream);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
      localInputStream.close();
    } catch (Exception localException) {
      System.out.println(localException.getMessage());
      return;
    }

    adn localadn = new adn();
    try {
      localadn.a(localbwZ, false);
    } catch (aaU localaaU) {
      System.out.println(localaaU.getMessage());
    }
  }
}