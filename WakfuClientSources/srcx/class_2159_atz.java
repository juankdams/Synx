import java.net.URL;
import org.apache.log4j.Logger;

public class atz
{
  private static final Logger K = Logger.getLogger(atz.class);
  public final double dEU;
  public final double dEV;
  public final double dEW;
  public final double dEX;
  public final int dEY;
  public final int dEZ;

  private atz(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt1, int paramInt2)
  {
    this.dEU = paramDouble1;
    this.dEV = paramDouble2;
    this.dEW = paramDouble3;
    this.dEX = paramDouble4;
    this.dEY = paramInt1;
    this.dEZ = paramInt2;
  }

  public static atz s(K paramK) {
    if ((paramK.getName().equals("#text")) || (paramK.getName().equals("#comment"))) {
      return null;
    }
    double d1 = a(paramK, "isoX", 0.0D);
    double d2 = a(paramK, "isoY", 0.0D);
    double d3 = a(paramK, "isoWidth", -1.0D);
    double d4 = a(paramK, "isoHeight", -1.0D);
    int i = a(paramK, "width", -1);
    int j = a(paramK, "height", -1);

    return new atz(d1, d2, d3, d4, i, j);
  }

  public static uz a(K paramK, URL paramURL) {
    K localK = paramK.e("texture");
    if (localK == null) {
      return null;
    }

    String str1 = localK.getStringValue();
    try {
      URL localURL = bAy.c(paramURL, str1);
      String str2 = localURL.toString();
      return fK(str2);
    } catch (Exception localException) {
      K.error("Problème lors de la récupération de la texture de la map");
    }
    return null;
  }

  public static uz a(K paramK, URL paramURL, String paramString) {
    K localK = paramK.e("texture");
    if (localK == null) {
      return null;
    }
    try
    {
      String str = dtb.pY(paramString);
      URL localURL = bAy.c(paramURL, "mask" + cOg.capitalize(str) + ".png");
      return bAy.d(localURL) ? u(localURL.toString(), true) : null;
    } catch (Exception localException) {
      K.error("Problème lors de la récupération de la texture de la map");
    }
    return null;
  }

  private static double a(K paramK, String paramString, double paramDouble) {
    K localK = paramK.e(paramString);
    return localK == null ? paramDouble : localK.getDoubleValue();
  }

  private static int a(K paramK, String paramString, int paramInt) {
    K localK = paramK.e(paramString);
    return localK == null ? paramInt : localK.getIntValue();
  }

  public static uz fK(String paramString) {
    return u(paramString, false);
  }

  public static uz u(String paramString, boolean paramBoolean) {
    if (bAy.jy(paramString)) {
      return tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString), paramString, paramBoolean, true);
    }
    K.info("Impossible de trouver le fichier " + paramString);
    return null;
  }

  public dDq a(uz paramuz) {
    if ((this.dEY != -1) && (this.dEZ != -1)) {
      return new dDq(paramuz, 0, 0, this.dEY, this.dEZ);
    }
    return new dDq(paramuz);
  }
}