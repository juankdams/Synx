public class aPf
{
  public static String gX(String paramString)
  {
    return "id=\"" + paramString + "\"";
  }

  public static String gY(String paramString) {
    return "color=\"" + paramString + "\"";
  }

  public static String nu(int paramInt) {
    return "size=\"" + paramInt + "\"";
  }

  public static String gZ(String paramString) {
    return "align=\"" + paramString + "\"";
  }

  public static String e(String paramString, String[] paramArrayOfString) {
    return a(paramString, "b", paramArrayOfString);
  }

  public static String f(String paramString, String[] paramArrayOfString) {
    return a(paramString, "i", paramArrayOfString);
  }

  public static String g(String paramString, String[] paramArrayOfString) {
    return a(paramString, "u", paramArrayOfString);
  }

  public static String c(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    return b(paramString1, paramInt1, paramInt2, paramString2, null);
  }

  public static String b(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3) {
    StringBuilder localStringBuilder = new StringBuilder("<image pixmap=\"");
    localStringBuilder.append(paramString1).append("\"");
    if (paramInt1 > 0) {
      localStringBuilder.append(" width=\"").append(paramInt1).append("\"");
    }
    if (paramInt2 > 0) {
      localStringBuilder.append(" height=\"").append(paramInt2).append("\"");
    }
    if (paramString2 != null) {
      localStringBuilder.append(" align=\"").append(paramString2).append("\"");
    }
    if (paramString3 != null) {
      localStringBuilder.append(" popupTranslatorKey=\"").append(paramString3).append("\"");
    }
    localStringBuilder.append("></image>");
    return localStringBuilder.toString();
  }

  public static String h(String paramString, String[] paramArrayOfString) {
    return a(paramString, "text", paramArrayOfString);
  }

  private static String a(String paramString1, String paramString2, String[] paramArrayOfString) {
    StringBuilder localStringBuilder = new StringBuilder("<").append(paramString2);
    if (paramArrayOfString != null) {
      for (String str : paramArrayOfString) {
        localStringBuilder.append(" ").append(str);
      }
    }
    return ">" + paramString1 + "</" + paramString2 + ">";
  }
}