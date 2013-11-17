import java.util.HashMap;

public class ZV
{
  public static String cMD = "WALK";
  public static String cME = "RUN";
  public static String cMF = "SLIDE";
  public static String cMG = "SWIM";
  public static String cMH = "WALK_CARRY";
  public static String cMI = "THROW";
  public static String cMJ = "CUSTOM_WALK";

  private static final ZV cMK = new ZV();

  private final HashMap cML = new HashMap();

  public static ZV alJ()
  {
    return cMK;
  }

  private ZV()
  {
    a(cMD, new ZX(this));

    a(cME, new aac(this));

    a(cMF, new aad(this));

    a(cMH, new aaa(this));

    a(cMI, new aab(this));

    a(cMJ, new aae(this));
  }

  public void a(String paramString, apr paramapr)
  {
    this.cML.put(paramString, paramapr);
  }

  public dkU dV(String paramString) {
    apr localapr = (apr)this.cML.get(paramString);
    if (localapr == null) {
      return null;
    }
    return localapr.alL();
  }
}