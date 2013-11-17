public enum aYU
{
  private final int aw;
  private final String[] ffr;
  private final String RK;
  private final String bU;

  private aYU(int paramString, String[] arg4, String arg5)
  {
    this.aw = paramString;
    String[] arrayOfString;
    this.ffr = arrayOfString;
    this.RK = n(arrayOfString);
    Object localObject;
    this.bU = localObject;
  }

  public int getId() {
    return this.aw;
  }

  public String gp() {
    return this.RK;
  }

  public String bnW() {
    return this.ffr[0];
  }

  public String ata() {
    return this.bU;
  }

  public static int ce(int paramInt1, int paramInt2) {
    return paramInt2 * 100 + paramInt1;
  }

  public static aYU ox(int paramInt) {
    for (aYU localaYU : values()) {
      if (paramInt == localaYU.aw) {
        return localaYU;
      }
    }
    return null;
  }

  public boolean hE(String paramString) {
    for (String str : this.ffr) {
      if (str.equals(paramString)) {
        return true;
      }
    }
    return false;
  }

  private static String n(String[] paramArrayOfString) {
    String str1 = "";
    for (int i = 0; i < paramArrayOfString.length; i++) {
      String str2 = paramArrayOfString[i];
      str1 = str1 + normalize(str2);
      if (i < paramArrayOfString.length - 1) {
        str1 = str1 + " ";
      }
    }
    return str1;
  }

  private static String normalize(String paramString) {
    return paramString;
  }
}