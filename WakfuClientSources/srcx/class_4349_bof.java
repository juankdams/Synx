import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Vector;

public final class bof
{
  private static final long fHo = 1024L;
  private static final long fHp = 1048576L;
  private static final long fHq = 1073741824L;
  private static final long fHr = 1099511627776L;
  private static final long fHs = 1125899906842624L;
  public static final String LINE_SEP = System.getProperty("line.separator");

  public static Vector iu(String paramString)
  {
    return w(paramString, 10);
  }

  public static Vector w(String paramString, int paramInt)
  {
    Vector localVector = new Vector();
    int i = -1;
    int j = 0;
    while ((i = paramString.indexOf(paramInt, j)) != -1) {
      String str = paramString.substring(j, i);
      localVector.addElement(str);
      j = i + 1;
    }
    localVector.addElement(paramString.substring(j));
    return localVector;
  }

  public static String replace(String paramString1, String paramString2, String paramString3)
  {
    return paramString1.replace(paramString2, paramString3);
  }

  public static String e(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localPrintWriter.close();
    return localStringWriter.toString();
  }

  public static boolean f(StringBuffer paramStringBuffer, String paramString)
  {
    if (paramString.length() > paramStringBuffer.length()) {
      return false;
    }

    int i = paramString.length() - 1;
    int j = paramStringBuffer.length() - 1;
    while (i >= 0) {
      if (paramStringBuffer.charAt(j) != paramString.charAt(i)) {
        return false;
      }
      j--;
      i--;
    }
    return true;
  }

  public static String fX(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      char c = paramString.charAt(j);
      if (i == 0) {
        if (c == '\\')
          i = 1;
        else
          localStringBuffer.append(c);
      }
      else {
        switch (c) {
        case '\\':
          localStringBuffer.append('\\');
          break;
        case 'n':
          localStringBuffer.append('\n');
          break;
        case 'r':
          localStringBuffer.append('\r');
          break;
        case 't':
          localStringBuffer.append('\t');
          break;
        case 'f':
          localStringBuffer.append('\f');
          break;
        case 's':
          localStringBuffer.append(" \t\n\r\f");
          break;
        default:
          localStringBuffer.append(c);
        }
        i = 0;
      }
    }
    return localStringBuffer.toString();
  }

  public static long iv(String paramString)
  {
    long l = 1L;
    int i = paramString.charAt(0);
    switch (i) {
    case 43:
      paramString = paramString.substring(1);
      break;
    case 45:
      l = -1L;
      paramString = paramString.substring(1);
      break;
    }

    char c = paramString.charAt(paramString.length() - 1);
    if (!Character.isDigit(c)) {
      int j = 1;
      switch (c) {
      case 'K':
        l *= 1024L;
        break;
      case 'M':
        l *= 1048576L;
        break;
      case 'G':
        l *= 1073741824L;
        break;
      case 'T':
        l *= 1099511627776L;
        break;
      case 'P':
        l *= 1125899906842624L;
        break;
      case 'H':
      case 'I':
      case 'J':
      case 'L':
      case 'N':
      case 'O':
      case 'Q':
      case 'R':
      case 'S':
      default:
        j = 0;
      }
      paramString = paramString.substring(0, paramString.length() - j);
    }
    try {
      return l * Long.parseLong(paramString);
    } catch (NumberFormatException localNumberFormatException) {
      throw new cJ("Failed to parse \"" + paramString + "\"", localNumberFormatException);
    }
  }

  public static String ab(String paramString1, String paramString2)
  {
    if (paramString1.endsWith(paramString2)) {
      return paramString1.substring(0, paramString1.length() - paramString2.length());
    }
    return paramString1;
  }

  public static String ac(String paramString1, String paramString2)
  {
    if (paramString1.startsWith(paramString2)) {
      return paramString1.substring(paramString2.length());
    }
    return paramString1;
  }
}