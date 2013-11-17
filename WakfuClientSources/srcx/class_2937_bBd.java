public final class bBd
{
  private static final int gtr = "getStackTrace".equals(str) ? 0 : 1;

  private static final String[] gts = { "com.ankamagames.wakfu.server.game", "com.ankamagames.wakfu.server.ia", "com.ankamagames.wakfu.server", "com.ankamagames.wakfu.client", "com.ankamagames.wakfu.common", "com.ankamagames.baseImpl", "com.ankamagames.framework" };

  private static final String[] gtt = { "GAME", "IA", "SRV", "CLI", "COMM", "BIMP", "FWK" };

  public static boolean gtu = true;

  public static String g(Throwable paramThrowable)
  {
    return b(paramThrowable, 2147483647);
  }

  public static String b(Throwable paramThrowable, int paramInt) {
    if (paramThrowable == null) {
      return " [null Throwable in ExceptionFormatter.toString()]";
    }

    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append(' ').append(paramThrowable.toString());

    if (arrayOfStackTraceElement.length == 0)
      localStringBuilder.append("emptyStacktrace, current is ").append(rV(paramInt));
    else {
      localStringBuilder.append(a(arrayOfStackTraceElement, 0, paramInt));
    }
    if (paramThrowable.getCause() != null) {
      localStringBuilder.append(" caused by ").append(b(paramThrowable.getCause(), paramInt));
    }
    return localStringBuilder.toString();
  }

  public static String bJO()
  {
    return cH(1, 2147483647);
  }

  public static String rV(int paramInt) {
    return cH(1, paramInt);
  }

  public static String cH(int paramInt1, int paramInt2) {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    return a(arrayOfStackTraceElement, 2 + gtr + paramInt1, paramInt2);
  }

  private static String a(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder("stackTrace=");
    a(localStringBuilder, paramArrayOfStackTraceElement, paramInt1, paramInt2, ' ');
    return localStringBuilder.toString();
  }

  private static void a(StringBuilder paramStringBuilder, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt1, int paramInt2, char paramChar) {
    for (int i = paramInt1; (i < paramArrayOfStackTraceElement.length) && (i - paramInt1 < paramInt2); i++)
      a(paramStringBuilder, paramArrayOfStackTraceElement[i], paramChar);
  }

  private static StringBuilder a(StringBuilder paramStringBuilder, StackTraceElement paramStackTraceElement, char paramChar)
  {
    return paramStringBuilder.append(' ').append(jB(paramStackTraceElement.getClassName())).append('.').append(paramStackTraceElement.getMethodName()).append('(').append(paramStackTraceElement.getFileName()).append(':').append(paramStackTraceElement.getLineNumber()).append(')').append(paramChar);
  }

  static String jB(String paramString) {
    if (!gtu) {
      return paramString;
    }

    String str1 = jC(paramString);

    for (int i = 0; i < gts.length; i++) {
      String str2 = gts[i];

      if (paramString.startsWith(str2)) {
        str1 = '[' + gtt[i] + ']' + str1;
        break;
      }
    }

    return str1;
  }

  private static String jC(String paramString) {
    int i = paramString.lastIndexOf('.');
    return i == -1 ? paramString : paramString.substring(i + 1);
  }

  static
  {
    String str = Thread.currentThread().getStackTrace()[0].getMethodName();
  }
}