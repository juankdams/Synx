import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.PrintStream;
import org.apache.log4j.Logger;

public final class bOZ
{
  private static final Logger K = Logger.getLogger(bOZ.class);
  public static final String gVh = "( \\d+,)*";

  public static void bVO()
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    String str1 = (String)localaIH.getFieldValue(bmz.fEY.getKey());
    String str2 = (String)localaIH.getFieldValue(bmz.fEZ.getKey());
    adz localadz1;
    adz localadz2;
    try
    {
      localadz1 = kj(str1);
      localadz2 = kj(str2);
    } catch (Exception localException) {
      K.error("Exception levee, on reinitialise à 0 les préférences", localException);
      localaIH.c(bmz.fEY, "");
      localaIH.c(bmz.fEZ, "");
      return;
    }

    a(localadz1, bmz.fEY);
    a(localadz2, bmz.fEZ);

    a(localadz1, localadz2);

    a(localadz1, true);
    a(localadz2, false);
  }

  private static void a(dVg paramdVg, boolean paramBoolean) {
    paramdVg.g(new aGE(paramBoolean));
  }

  private static void a(adz paramadz1, adz paramadz2)
  {
    kr localkr = paramadz1.apz();
    while (localkr.hasNext()) {
      int i = localkr.next();
      if (paramadz2.contains(i))
      {
        localkr.remove();
        paramadz2.remove(i);

        b(bmz.fEY, tH(i));
        b(bmz.fEZ, tH(i));
      }
    }
  }

  private static void a(adz paramadz, dEn paramdEn) { kr localkr = paramadz.apz();
    while (localkr.hasNext()) {
      int i = localkr.next();
      if (bOU.gUc.tG(i) == null) {
        b(paramdEn, tH(i));
        localkr.remove();
      }
    } }

  private static adz kj(String paramString)
  {
    int i = (paramString == null) || (paramString.matches("( \\d+,)*")) ? 1 : 0;
    if (i == 0) {
      throw new IllegalArgumentException("Mauvais formatage des préférences");
    }
    String[] arrayOfString = (paramString != null) && (paramString.length() > 0) ? paramString.split(",") : new String[0];

    adz localadz = new adz();
    for (int j = 0; j < arrayOfString.length; j++) {
      String str = arrayOfString[j].replaceAll(" ", "");
      int k = Integer.parseInt(str);
      localadz.hL(k);
    }

    return localadz;
  }

  public static void c(ayJ paramayJ) {
    String str = tH(paramayJ.getId());
    if (paramayJ.isActive()) {
      a(bmz.fEY, str);
      b(bmz.fEZ, str);
    } else {
      a(bmz.fEZ, str);
      b(bmz.fEY, str);
    }
  }

  private static String tH(int paramInt) {
    return ' ' + Integer.toString(paramInt) + ',';
  }

  private static void a(dEn paramdEn, String paramString) {
    aIH localaIH = WakfuClientInstance.awy().awB();
    String str1 = localaIH.f(paramdEn);
    if ((str1 == null) || (str1.length() == 0)) {
      localaIH.c(paramdEn, paramString);
    }
    else if (!str1.contains(paramString)) {
      String str2 = str1.concat(paramString);
      localaIH.c(paramdEn, str2);
    }
  }

  private static void b(dEn paramdEn, String paramString)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    String str1 = localaIH.f(paramdEn);
    if ((str1 == null) || (str1.length() == 0)) {
      return;
    }
    if (!str1.contains(paramString)) {
      return;
    }
    String str2 = str1.replaceAll(paramString, "");
    localaIH.c(paramdEn, str2);
  }

  public static void main(String[] paramArrayOfString) {
    String str1 = "( \\d+,)*";
    String str2 = "";
    ap(str1, "");
    ap(str1, "qsfd");
    ap(str1, "125");
    ap(str1, "125, 123");
    ap(str1, "125, 1231,");
    ap(str1, "125, 1231, ");
    ap(str1, " 125, 1231, ");
    ap(str1, " 125, 1231,");
    ap(str1, "125, 1231, n, ");
  }

  private static void ap(String paramString1, String paramString2) {
    System.err.println(paramString2 + " -> " + paramString2.matches(paramString1));
  }
}