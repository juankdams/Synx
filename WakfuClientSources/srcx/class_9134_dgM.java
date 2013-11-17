public final class dgM
{
  public static boolean c(aCH paramaCH)
  {
    return (paramaCH == null) || (paramaCH.aOQ().length() == 0);
  }

  public static void a(dMM paramdMM, aCH paramaCH) {
    a(paramdMM, paramaCH, false);
  }

  public static void a(dMM paramdMM, aCH paramaCH, boolean paramBoolean) {
    String str = paramBoolean ? d(paramaCH) + "-Fin" : paramaCH.aOQ();
    if (str.length() == 0) {
      return;
    }
    paramdMM.eq(str);
    paramdMM.ci(paramaCH.aOT());
  }

  public static String d(aCH paramaCH) {
    String str = paramaCH.aOQ();
    int i = str.lastIndexOf("-Debut");
    return i == -1 ? str : str.substring(0, i);
  }
}