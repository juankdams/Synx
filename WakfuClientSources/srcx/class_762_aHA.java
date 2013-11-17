import java.io.PrintWriter;
import java.util.Formatter;

public final class aHA
{
  private static final String efr = "{}";
  private static final aHA efs = new aHA();

  private final PrintWriter out = new PrintWriter(System.out);

  private final PrintWriter eft = new PrintWriter(System.err);

  private bKL efu = bKL.gNV;

  private aHA()
  {
    String str = System.getProperty("vlcj.log");
    if (str != null)
      this.efu = bKL.valueOf(str);
  }

  public static void a(bKL parambKL)
  {
    efs.efu = parambKL;
  }

  public static bKL aTv() {
    return efs.efu;
  }

  public static void trace(String paramString, Object[] paramArrayOfObject) {
    if (bKL.gOb.compareTo(efs.efu) <= 0)
      a("TRACE", paramString, null, paramArrayOfObject);
  }

  public static void a(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gOb.compareTo(efs.efu) <= 0)
      a("TRACE", paramString, paramThrowable, paramArrayOfObject);
  }

  public static void debug(String paramString, Object[] paramArrayOfObject)
  {
    if (bKL.gOa.compareTo(efs.efu) <= 0)
      a("DEBUG", paramString, null, paramArrayOfObject);
  }

  public static void b(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gOa.compareTo(efs.efu) <= 0)
      a("DEBUG", paramString, paramThrowable, paramArrayOfObject);
  }

  public static void info(String paramString, Object[] paramArrayOfObject)
  {
    if (bKL.gNZ.compareTo(efs.efu) <= 0)
      a("INFO", paramString, null, paramArrayOfObject);
  }

  public static void c(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gNZ.compareTo(efs.efu) <= 0)
      a("INFO", paramString, paramThrowable, paramArrayOfObject);
  }

  public static void warn(String paramString, Object[] paramArrayOfObject)
  {
    if (bKL.gNY.compareTo(efs.efu) <= 0)
      a("WARN", paramString, null, paramArrayOfObject);
  }

  public static void d(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gNY.compareTo(efs.efu) <= 0)
      a("WARN", paramString, paramThrowable, paramArrayOfObject);
  }

  public static void error(String paramString, Object[] paramArrayOfObject)
  {
    if (bKL.gNX.compareTo(efs.efu) <= 0)
      a("ERROR", paramString, null, paramArrayOfObject);
  }

  public static void e(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gNX.compareTo(efs.efu) <= 0)
      a("ERROR", paramString, paramThrowable, paramArrayOfObject);
  }

  public static void e(String paramString, Object[] paramArrayOfObject)
  {
    if (bKL.gNW.compareTo(efs.efu) <= 0)
      a("FATAL", paramString, null, paramArrayOfObject);
  }

  public static void f(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    if (bKL.gNW.compareTo(efs.efu) <= 0)
      a("FATAL", paramString, paramThrowable, paramArrayOfObject);
  }

  private static void a(String paramString1, String paramString2, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    PrintWriter localPrintWriter1 = efs.out;
    synchronized (localPrintWriter1) {
      StackTraceElement localStackTraceElement = aTw();
      Formatter localFormatter = new Formatter();
      try {
        String str = localFormatter.format("(%s:%d)", new Object[] { localStackTraceElement.getFileName(), Integer.valueOf(localStackTraceElement.getLineNumber()) }).toString();
        localPrintWriter1.printf("vlcj: %-46s | %-5s | %s%n", new Object[] { str, paramString1, format(paramString2, paramArrayOfObject) });
        localPrintWriter1.flush();
        if (paramThrowable != null) {
          PrintWriter localPrintWriter2 = efs.eft;
          localPrintWriter2.printf("vlcj: %-46s | %-5s | %s%n", new Object[] { str, paramString1, paramThrowable.getMessage() });
          localPrintWriter2.flush();
          paramThrowable.printStackTrace();
        }
      }
      finally {
        localFormatter.close();
      }
    }
  }

  private static StackTraceElement aTw() {
    Throwable localThrowable = new Throwable();
    localThrowable.fillInStackTrace();
    StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
    return arrayOfStackTraceElement[3];
  }

  public static String format(String paramString, Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0) || (paramString == null)) {
      return paramString;
    }

    StringBuilder localStringBuilder = new StringBuilder(paramString.length() + paramArrayOfObject.length * 10);
    int i = 0; for (int j = 0; i < paramString.length(); ) {
      int k = paramString.indexOf("{}", i);
      if (k > -1) {
        localStringBuilder.append(paramString.substring(i, k));
        localStringBuilder.append(paramArrayOfObject[(j++)]);
        i = k + "{}".length();
      }
      else {
        localStringBuilder.append(paramString.substring(i));
        break;
      }
    }
    return localStringBuilder.toString();
  }
}