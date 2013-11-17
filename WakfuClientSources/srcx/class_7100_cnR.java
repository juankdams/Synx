import java.util.ArrayList;

public final class cnR
{
  private static final String LINE_SEPARATOR = "~";
  private static final String SEPARATOR = "|";
  private static final String hVf = "name";
  private static final String hVg = "value";

  public static Object a(String paramString, FH paramFH, ArrayList paramArrayList)
  {
    if (paramString == null) {
      return null;
    }

    String str = paramString;
    if (paramArrayList != null) {
      for (Cs localCs : paramArrayList) {
        str = str.replaceAll("(?i)(\\$\\$" + (String)localCs.getFirst() + ")", (String)localCs.Lp());
      }

    }

    switch (cG.RQ[paramFH.ordinal()]) {
    case 1:
      return Short.valueOf(Short.parseShort(str));
    case 2:
      return Integer.valueOf(Integer.parseInt(str));
    case 3:
      return Long.valueOf(Long.parseLong(str));
    case 4:
      return str;
    }
    throw new IllegalArgumentException("Pas de type connu ? WTF ?");
  }

  public static Object[] a(String[] paramArrayOfString, FH paramFH, ArrayList paramArrayList)
  {
    if (paramArrayOfString == null)
      return null;
    Object localObject;
    switch (cG.RQ[paramFH.ordinal()]) {
    case 1:
      localObject = new Short[paramArrayOfString.length];
      break;
    case 2:
      localObject = new Integer[paramArrayOfString.length];
      break;
    case 3:
      localObject = new Long[paramArrayOfString.length];
      break;
    case 4:
      localObject = new String[paramArrayOfString.length];
      break;
    default:
      throw new IllegalArgumentException("Pas de type connu ? WTF ?");
    }

    for (int i = 0; i < paramArrayOfString.length; i++) {
      localObject[i] = a(paramArrayOfString[i], paramFH, paramArrayList);
    }

    return localObject;
  }

  public static ArrayList ly(String paramString) {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString1 = dzp.aR(paramString, "~");
    for (String str : arrayOfString1) {
      if (str.length() != 0) {
        if (str.endsWith("|")) {
          str = str + " ";
        }
        String[] arrayOfString3 = dzp.aR(str, "\\|");
        Cs localCs = new Cs();
        for (int k = 0; k < arrayOfString3.length; k += 2) {
          if (arrayOfString3[k].equalsIgnoreCase("name"))
            localCs.w(arrayOfString3[(k + 1)] == null ? "" : arrayOfString3[(k + 1)]);
          else if (arrayOfString3[k].equalsIgnoreCase("value")) {
            localCs.x(arrayOfString3[(k + 1)] == null ? "" : arrayOfString3[(k + 1)]);
          }
        }
        localArrayList.add(localCs);
      }
    }
    return localArrayList;
  }
}