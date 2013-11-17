import java.util.regex.Pattern;

public class FJ
{
  private static final Pattern bNS = Pattern.compile(" ");

  public static void a(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    String str = aYD.hD(paramString1);

    if (str.length() == 0) {
      d("error.chat.operationNotPermited", new Object[0]);
      return;
    }

    HR localHR = new HR();
    localHR.setUserName(paramString3);
    localHR.ca(str);
    byv.bFN().aJK().d(localHR);

    if (!paramString3.equals(paramString2))
    {
      aEe localaEe = new aEe(paramString3, paramLong, str);
      localaEe.mm(2);
      CM.LV().a(localaEe, paramString3);
      CM.LV().by(paramString3);
    }
  }

  public static String u(String paramString1, String paramString2)
  {
    if ((paramString1.length() <= 0) || (paramString1.charAt(0) != '/')) {
      return paramString1;
    }
    if (paramString1.startsWith(paramString2)) {
      return paramString1.substring(paramString2.length());
    }

    String[] arrayOfString = bNS.split(paramString1, 2);
    d("error.chat.commandNotFound", new Object[] { arrayOfString[0] });
    return paramString1;
  }

  public static boolean a(czx paramczx) {
    switch (aQx.eNj[bdS.brU().b(paramczx).ordinal()]) {
    case 1:
      break;
    case 2:
      d("error.chat.flood", new Object[0]);

      return false;
    }

    return true;
  }

  public static String bT(String paramString) {
    String str = paramString;
    switch (aQx.eNj[bdS.brU().ia(paramString).ordinal()]) {
    case 1:
      break;
    case 2:
      d("error.chat.flood", new Object[0]);
      return null;
    case 3:
      d("error.chat.sms.light", new Object[0]);

      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("*bwork*");

      int i = paramString.indexOf(' ');
      int j = 0;
      do {
        localStringBuilder.append(' ');
        int k = i - j;
        aiN.a(localStringBuilder, k);
        j = i + 1;
        i = paramString.indexOf(' ', j);
      }while (i != -1);

      aiN.a(localStringBuilder, paramString.length() - j);

      str = localStringBuilder.toString();

      break;
    case 4:
      d("error.chat.sms", new Object[0]);
      return null;
    }

    return str;
  }

  public static void d(String paramString, Object[] paramArrayOfObject) {
    String str = bU.fH().getString(paramString, paramArrayOfObject);
    aEe localaEe = new aEe(str);
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }
}