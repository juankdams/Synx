import java.net.URL;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class CM
{
  private static final Pattern bGV = Pattern.compile("<[^<>]*>");

  private static final Logger K = Logger.getLogger(CM.class);
  private static final Logger bGW = Logger.getLogger("chat");

  private static final CM bGX = new CM();
  private cth bGY;
  private dnT bGZ;
  private cSR bHa;
  private final boolean bHb = true;
  private final boolean bHc = false;
  private final LinkedList bHd = new LinkedList();
  private final LinkedList bHe = new LinkedList();

  public static CM LV()
  {
    return bGX;
  }

  public void a(dnc paramdnc, URL paramURL, dnT paramdnT)
  {
    this.bGY = new cth();
    this.bGY.hw(false);
    this.bGY.hv(false);
    this.bGY.a(paramdnc);
    if (paramURL != null)
      this.bGY.f(paramURL);
    else {
      K.error("Impossible de charger les commandes de chat !");
    }
    this.bGZ = paramdnT;
  }

  public cth LW() {
    return this.bGY;
  }

  public void a(int paramInt, dab paramdab) {
    if (this.bHa == null) {
      this.bHa = new cSR();
    }

    this.bHa.put(paramInt, paramdab);
  }

  public void ey(int paramInt) {
    if (this.bHa != null)
      this.bHa.remove(paramInt);
  }

  public dab ez(int paramInt)
  {
    return (dab)this.bHa.get(paramInt);
  }

  public int bv(String paramString) {
    dmn localdmn = this.bHa.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      if (((dab)localdmn.value()).getInternalName().equals(paramString)) {
        return localdmn.zY();
      }
    }
    return -1;
  }

  public dab bw(String paramString) {
    dmn localdmn = this.bHa.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      if (((dab)localdmn.value()).getName().equals(paramString)) {
        return (dab)localdmn.value();
      }
    }
    return null;
  }

  public void f(String paramString, int paramInt)
  {
    aEe localaEe = new aEe(paramString);
    localaEe.mm(paramInt);
    b(localaEe);
    dab localdab = (dab)this.bHa.get(localaEe.aQj());
    localdab.a(localaEe);
  }

  public void a(aEe paramaEe, String paramString)
  {
    b(paramaEe);
    dab localdab = (dab)this.bHa.get(paramaEe.aQj());
    localdab.a(paramaEe, paramString);
  }

  public void a(aEe paramaEe)
  {
    b(paramaEe);
    dab localdab = (dab)this.bHa.get(paramaEe.aQj());
    localdab.a(paramaEe);
  }

  private void b(aEe paramaEe) {
    String str1 = ((dab)this.bHa.get(paramaEe.aQj())).getName();
    String str2 = paramaEe.getSourceName();
    String str3 = paramaEe.getMessage();
    bGW.info("[" + str1 + "] " + (str2 == null ? "" : new StringBuilder().append(str2).append(" : ").toString()) + bx(str3));
  }

  private static String bx(String paramString) {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramString.trim();

    Matcher localMatcher = bGV.matcher(str);
    int i = 0;

    while (localMatcher.find()) {
      localStringBuilder.append(str, i, localMatcher.start());
      i = localMatcher.end();
    }

    localStringBuilder.append(str, i, str.length());

    return localStringBuilder.toString();
  }

  public String aw(boolean paramBoolean)
  {
    if (this.bHd.size() == 0)
      return null;
    String str;
    if (paramBoolean) {
      str = (String)this.bHd.removeFirst();
      this.bHd.addLast(str);
    } else {
      str = (String)this.bHd.removeLast();
      this.bHd.addFirst(str);
    }
    return str;
  }

  public void by(String paramString) {
    if (!this.bHd.contains(paramString)) {
      this.bHd.add(paramString);
    } else {
      this.bHd.remove(paramString);
      this.bHd.addLast(paramString);
    }
    if (!this.bHe.contains(paramString)) {
      this.bHe.add(paramString);
    }
    if ((this.bHe.size() > 10) || (this.bHd.size() > 10)) {
      String str = (String)this.bHe.removeFirst();
      this.bHd.remove(str);
    }
  }

  public void clean() {
    this.bHd.clear();
    this.bHe.clear();

    for (dmn localdmn = this.bHa.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((dab)localdmn.value()).clean();
    }
  }

  public dmn LX() {
    return this.bHa.yF();
  }

  public dnT LY() {
    return this.bGZ;
  }
}