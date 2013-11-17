import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.text.DateFormat;
import java.util.Date;

public class tf
  implements bXz
{
  public static final int bda = 12;
  protected PrintStream out;
  protected PrintStream err;
  protected int bdb = 0;

  private long startTime = System.currentTimeMillis();

  protected static final String bdc = bof.LINE_SEP;

  protected boolean bdd = false;

  public void cQ(int paramInt)
  {
    this.bdb = paramInt;
  }

  public void m(PrintStream paramPrintStream)
  {
    this.out = new PrintStream(paramPrintStream, true);
  }

  public void n(PrintStream paramPrintStream)
  {
    this.err = new PrintStream(paramPrintStream, true);
  }

  public void Y(boolean paramBoolean)
  {
    this.bdd = paramBoolean;
  }

  public void a(aaQ paramaaQ)
  {
    this.startTime = System.currentTimeMillis();
  }

  static void a(StringBuffer paramStringBuffer, Throwable paramThrowable, boolean paramBoolean) {
    while ((paramThrowable instanceof cJ)) {
      Throwable localThrowable = paramThrowable.getCause();
      if (localThrowable == null) {
        break;
      }
      String str1 = paramThrowable.toString();
      String str2 = localThrowable.toString();
      if (!str1.endsWith(str2)) break;
      paramStringBuffer.append(str1.substring(0, str1.length() - str2.length()));
      paramThrowable = localThrowable;
    }

    if ((paramBoolean) || (!(paramThrowable instanceof cJ)))
      paramStringBuffer.append(bof.e(paramThrowable));
    else
      paramStringBuffer.append(paramThrowable).append(bdc);
  }

  public void b(aaQ paramaaQ)
  {
    Throwable localThrowable = paramaaQ.getException();
    StringBuffer localStringBuffer = new StringBuffer();
    if (localThrowable == null) {
      localStringBuffer.append(bof.LINE_SEP);
      localStringBuffer.append(AG());
    } else {
      localStringBuffer.append(bof.LINE_SEP);
      localStringBuffer.append(AF());
      localStringBuffer.append(bof.LINE_SEP);
      a(localStringBuffer, localThrowable, 3 <= this.bdb);
    }
    localStringBuffer.append(bof.LINE_SEP);
    localStringBuffer.append("Total time: ");
    localStringBuffer.append(ab(System.currentTimeMillis() - this.startTime));

    String str = localStringBuffer.toString();
    if (localThrowable == null)
      a(str, this.out, 3);
    else {
      a(str, this.err, 0);
    }
    log(str);
  }

  protected String AF()
  {
    return "BUILD FAILED";
  }

  protected String AG()
  {
    return "BUILD SUCCESSFUL";
  }

  public void e(aaQ paramaaQ)
  {
    if ((2 <= this.bdb) && (!paramaaQ.anA().getName().equals("")))
    {
      String str = bof.LINE_SEP + paramaaQ.anA().getName() + ":";

      a(str, this.out, paramaaQ.getPriority());
      log(str);
    }
  }

  public void f(aaQ paramaaQ)
  {
  }

  public void g(aaQ paramaaQ)
  {
  }

  public void h(aaQ paramaaQ)
  {
  }

  public void i(aaQ paramaaQ)
  {
    int i = paramaaQ.getPriority();

    if (i <= this.bdb)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      if ((paramaaQ.anB() != null) && (!this.bdd))
      {
        localObject1 = paramaaQ.anB().aSI();
        str1 = "[" + (String)localObject1 + "] ";
        int j = 12 - str1.length();
        StringBuffer localStringBuffer2 = new StringBuffer();
        for (int k = 0; k < j; k++) {
          localStringBuffer2.append(" ");
        }
        localStringBuffer2.append(str1);
        str1 = localStringBuffer2.toString();

        BufferedReader localBufferedReader = null;
        try {
          localBufferedReader = new BufferedReader(new StringReader(paramaaQ.getMessage()));

          String str2 = localBufferedReader.readLine();
          int m = 1;
          do {
            if (m != 0) {
              if (str2 == null) {
                localStringBuffer1.append(str1);
                break;
              }
            }
            else localStringBuffer1.append(bof.LINE_SEP);

            m = 0;
            localStringBuffer1.append(str1).append(str2);
            str2 = localBufferedReader.readLine();
          }while (str2 != null);
        }
        catch (IOException localIOException) {
          localStringBuffer1.append(str1).append(paramaaQ.getMessage());
        } finally {
          if (localBufferedReader != null) {
            wh.e(localBufferedReader);
          }
        }
      }
      else
      {
        localStringBuffer1.append(paramaaQ.getMessage());
      }
      Object localObject1 = paramaaQ.getException();
      if ((4 <= this.bdb) && (localObject1 != null)) {
        localStringBuffer1.append(bof.e((Throwable)localObject1));
      }

      String str1 = localStringBuffer1.toString();
      if (i != 0)
        a(str1, this.out, i);
      else {
        a(str1, this.err, i);
      }
      log(str1);
    }
  }

  protected static String ab(long paramLong)
  {
    return dtT.km(paramLong);
  }

  protected void a(String paramString, PrintStream paramPrintStream, int paramInt)
  {
    paramPrintStream.println(paramString);
  }

  protected void log(String paramString)
  {
  }

  protected String AH()
  {
    Date localDate = new Date(System.currentTimeMillis());
    DateFormat localDateFormat = DateFormat.getDateTimeInstance(3, 3);
    String str = localDateFormat.format(localDate);
    return str;
  }

  protected String j(aaQ paramaaQ)
  {
    FF localFF = paramaaQ.Ga();
    return localFF != null ? localFF.getName() : null;
  }
}