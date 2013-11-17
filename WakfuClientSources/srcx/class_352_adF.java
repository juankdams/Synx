import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public class adF
{
  private static final Logger K = Logger.getLogger(adF.class);
  public static final byte cTV = 0;
  public static final byte cTW = 1;
  public static final byte cTX = 2;
  private static final HashMap bhO = new HashMap();
  private static byte cTY = 0;

  private static String cTZ = "";

  public static void aL(byte paramByte)
  {
    cTY = paramByte;
  }

  public static void ea(String paramString) {
    cTZ = paramString;
  }

  public static hf j(String paramString, boolean paramBoolean) {
    hf localhf = ee(paramString);
    if (localhf == null) {
      return k(paramString, paramBoolean);
    }
    return localhf;
  }

  public static hf eb(String paramString) {
    return j(paramString, false);
  }

  public static hf c(String paramString, int paramInt1, int paramInt2) {
    return a(paramString, paramInt1, paramInt2, false);
  }

  public static hf a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    String str = paramString.toLowerCase();
    str = str + '-';
    if ((paramInt1 & 0x1) != 0) {
      str = str + "bold";
    }
    if ((paramInt1 & 0x2) != 0) {
      str = str + "italic";
    }
    if ((paramInt1 & 0x4) != 0) {
      str = str + "bordered";
    }
    if (paramInt1 == 0) {
      str = str + "plain";
    }

    str = str + "-";
    str = str + paramInt2;
    hf localhf = ee(str);
    if (localhf == null) {
      localhf = k(str, paramBoolean);
    }
    return localhf;
  }

  public static int ec(String paramString) {
    int i = 0;
    if (paramString == null) {
      return i;
    }

    String str = paramString.toLowerCase();
    if (str.contains("bold")) {
      i |= 1;
    }
    if (str.contains("italic")) {
      i |= 2;
    }
    if (str.contains("bordered")) {
      i |= 4;
    }
    return i;
  }

  public static int ed(String paramString) {
    int i = paramString.lastIndexOf('-') + 1;
    if (i == 0) {
      return 0;
    }
    String str = paramString.substring(i);
    try {
      return Integer.parseInt(str);
    } catch (Exception localException) {
    }
    return 0;
  }

  public static String getType(String paramString)
  {
    int i = paramString.indexOf('-');
    if (i <= 0) {
      return paramString;
    }
    return paramString.substring(0, i);
  }

  private static hf ee(String paramString)
  {
    return (hf)bhO.get(paramString);
  }

  private static hf k(String paramString, boolean paramBoolean) {
    boolean bool = bT(paramBoolean);

    hf localhf = bsB.g(paramString, cTZ, bool);
    if (localhf == null) {
      K.error("Unable to load the font " + paramString + " from path " + cTZ);
      localhf = ef(paramString);
    }
    bhO.put(paramString, localhf);
    return localhf;
  }

  public static boolean bT(boolean paramBoolean)
  {
    boolean bool;
    switch (cTY) {
    case 2:
      bool = true;
      break;
    case 1:
      bool = false;
      break;
    case 0:
    default:
      bool = paramBoolean;
    }

    return bool;
  }

  private static hf ef(String paramString) {
    hf localhf = null;
    float f1 = 3.4028235E+38F;
    Iterator localIterator = bhO.entrySet().iterator();
    while (localIterator.hasNext()) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      float f2 = A(paramString, str);
      if (f2 < f1) {
        f1 = f2;
        localhf = (hf)localEntry.getValue();
      }
    }
    return localhf;
  }

  private static float A(String paramString1, String paramString2) {
    String str1 = getType(paramString1);
    int i = ed(paramString1);
    int j = ec(paramString1);

    String str2 = getType(paramString2);
    int k = ed(paramString2);
    int m = ec(paramString2);

    float f = 0.0F;
    if (!str2.equals(str1)) {
      f += 2.0F;
    }
    f += Math.abs(i - k);
    if (m != j) {
      f += 4.0F;
    }
    return f;
  }
}