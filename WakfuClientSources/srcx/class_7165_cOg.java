import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cOg
{
  public static final String kwq = "";
  public static final int eWw = -1;
  private static final int kwr = 8192;
  private static final Pattern kws = Pattern.compile("\\s+");

  private static boolean kwt = false;
  private static Method kwu = null;
  private static final Pattern kwv = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

  private static boolean kww = false;
  private static Method kwx = null;
  private static Object kwy = null;
  private static final Pattern kwz = kwv;

  public static boolean f(CharSequence paramCharSequence)
  {
    return (paramCharSequence == null) || (paramCharSequence.length() == 0);
  }

  public static boolean g(CharSequence paramCharSequence)
  {
    return !f(paramCharSequence);
  }

  public static boolean h(CharSequence paramCharSequence)
  {
    int i;
    if ((paramCharSequence == null) || ((i = paramCharSequence.length()) == 0)) {
      return true;
    }
    for (int j = 0; j < i; j++) {
      if (!Character.isWhitespace(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean i(CharSequence paramCharSequence)
  {
    return !h(paramCharSequence);
  }

  public static String nS(String paramString)
  {
    return paramString == null ? null : paramString.trim();
  }

  public static String nT(String paramString)
  {
    String str = nS(paramString);
    return f(str) ? null : str;
  }

  public static String nU(String paramString)
  {
    return paramString == null ? "" : paramString.trim();
  }

  public static String nV(String paramString)
  {
    return aJ(paramString, null);
  }

  public static String nW(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = aJ(paramString, null);
    return paramString.length() == 0 ? null : paramString;
  }

  public static String nX(String paramString)
  {
    return paramString == null ? "" : aJ(paramString, null);
  }

  public static String aJ(String paramString1, String paramString2)
  {
    if (f(paramString1)) {
      return paramString1;
    }
    paramString1 = aK(paramString1, paramString2);
    return aL(paramString1, paramString2);
  }

  public static String aK(String paramString1, String paramString2)
  {
    int i;
    if ((paramString1 == null) || ((i = paramString1.length()) == 0)) {
      return paramString1;
    }
    int j = 0;
    if (paramString2 == null) {
      while ((j != i) && (Character.isWhitespace(paramString1.charAt(j))))
        j++;
    }
    if (paramString2.length() == 0) {
      return paramString1;
    }
    while ((j != i) && (paramString2.indexOf(paramString1.charAt(j)) != -1)) {
      j++;
    }

    return paramString1.substring(j);
  }

  public static String aL(String paramString1, String paramString2)
  {
    int i;
    if ((paramString1 == null) || ((i = paramString1.length()) == 0)) {
      return paramString1;
    }

    if (paramString2 == null) {
      while ((i != 0) && (Character.isWhitespace(paramString1.charAt(i - 1))))
        i--;
    }
    if (paramString2.length() == 0) {
      return paramString1;
    }
    while ((i != 0) && (paramString2.indexOf(paramString1.charAt(i - 1)) != -1)) {
      i--;
    }

    return paramString1.substring(0, i);
  }

  public static String[] H(String[] paramArrayOfString)
  {
    return a(paramArrayOfString, null);
  }

  public static String[] a(String[] paramArrayOfString, String paramString)
  {
    int i;
    if ((paramArrayOfString == null) || ((i = paramArrayOfString.length) == 0)) {
      return paramArrayOfString;
    }
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++) {
      arrayOfString[j] = aJ(paramArrayOfString[j], paramString);
    }
    return arrayOfString;
  }

  public static String nY(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      String str = null;
      if (kww)
        str = j(paramString);
      else if (kwt)
        str = k(paramString);
      else {
        throw new UnsupportedOperationException("The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM");
      }

      return str;
    } catch (IllegalArgumentException localIllegalArgumentException) {
      throw new RuntimeException("IllegalArgumentException occurred", localIllegalArgumentException);
    } catch (IllegalAccessException localIllegalAccessException) {
      throw new RuntimeException("IllegalAccessException occurred", localIllegalAccessException);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw new RuntimeException("InvocationTargetException occurred", localInvocationTargetException);
    } catch (SecurityException localSecurityException) {
      throw new RuntimeException("SecurityException occurred", localSecurityException);
    }
  }

  private static String j(CharSequence paramCharSequence)
  {
    if ((!kww) || (kwy == null)) {
      throw new IllegalStateException("java.text.Normalizer is not available");
    }

    String str = (String)kwx.invoke(null, new Object[] { paramCharSequence, kwy });
    str = kwz.matcher(str).replaceAll("");
    return str;
  }

  private static String k(CharSequence paramCharSequence)
  {
    if (!kwt) {
      throw new IllegalStateException("sun.text.Normalizer is not available");
    }

    String str = (String)kwu.invoke(null, new Object[] { paramCharSequence, Boolean.FALSE, Integer.valueOf(0) });
    str = kwv.matcher(str).replaceAll("");
    return str;
  }

  public static boolean c(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return paramCharSequence1 == null ? false : paramCharSequence2 == null ? true : paramCharSequence1.equals(paramCharSequence2);
  }

  public static boolean d(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return paramCharSequence1 == paramCharSequence2;
    }
    return aWU.a(paramCharSequence1, true, 0, paramCharSequence2, 0, Math.max(paramCharSequence1.length(), paramCharSequence2.length()));
  }

  public static int d(CharSequence paramCharSequence, int paramInt)
  {
    if (f(paramCharSequence)) {
      return -1;
    }
    return aWU.b(paramCharSequence, paramInt, 0);
  }

  public static int b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (f(paramCharSequence)) {
      return -1;
    }
    return aWU.b(paramCharSequence, paramInt1, paramInt2);
  }

  public static int e(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    return aWU.a(paramCharSequence1, paramCharSequence2, 0);
  }

  public static int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    return aWU.a(paramCharSequence1, paramCharSequence2, paramInt);
  }

  public static int c(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    return a(paramCharSequence1, paramCharSequence2, paramInt, false);
  }

  private static int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt, boolean paramBoolean)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null) || (paramInt <= 0)) {
      return -1;
    }
    if (paramCharSequence2.length() == 0) {
      return paramBoolean ? paramCharSequence1.length() : 0;
    }
    int i = 0;
    int j = paramBoolean ? paramCharSequence1.length() : -1;
    do {
      if (paramBoolean)
        j = aWU.b(paramCharSequence1, paramCharSequence2, j - 1);
      else {
        j = aWU.a(paramCharSequence1, paramCharSequence2, j + 1);
      }
      if (j < 0) {
        return j;
      }
      i++;
    }while (i < paramInt);
    return j;
  }

  public static int f(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return d(paramCharSequence1, paramCharSequence2, 0);
  }

  public static int d(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    int i = paramCharSequence1.length() - paramCharSequence2.length() + 1;
    if (paramInt > i) {
      return -1;
    }
    if (paramCharSequence2.length() == 0) {
      return paramInt;
    }
    for (int j = paramInt; j < i; j++) {
      if (aWU.a(paramCharSequence1, true, j, paramCharSequence2, 0, paramCharSequence2.length())) {
        return j;
      }
    }
    return -1;
  }

  public static int e(CharSequence paramCharSequence, int paramInt)
  {
    if (f(paramCharSequence)) {
      return -1;
    }
    return aWU.c(paramCharSequence, paramInt, paramCharSequence.length());
  }

  public static int c(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (f(paramCharSequence)) {
      return -1;
    }
    return aWU.c(paramCharSequence, paramInt1, paramInt2);
  }

  public static int g(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    return aWU.b(paramCharSequence1, paramCharSequence2, paramCharSequence1.length());
  }

  public static int e(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    return a(paramCharSequence1, paramCharSequence2, paramInt, true);
  }

  public static int b(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    return aWU.b(paramCharSequence1, paramCharSequence2, paramInt);
  }

  public static int h(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    return f(paramCharSequence1, paramCharSequence2, paramCharSequence1.length());
  }

  public static int f(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return -1;
    }
    if (paramInt > paramCharSequence1.length() - paramCharSequence2.length()) {
      paramInt = paramCharSequence1.length() - paramCharSequence2.length();
    }
    if (paramInt < 0) {
      return -1;
    }
    if (paramCharSequence2.length() == 0) {
      return paramInt;
    }

    for (int i = paramInt; i >= 0; i--) {
      if (aWU.a(paramCharSequence1, true, i, paramCharSequence2, 0, paramCharSequence2.length())) {
        return i;
      }
    }
    return -1;
  }

  public static boolean f(CharSequence paramCharSequence, int paramInt)
  {
    if (f(paramCharSequence)) {
      return false;
    }
    return aWU.b(paramCharSequence, paramInt, 0) >= 0;
  }

  public static boolean i(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return false;
    }
    return aWU.a(paramCharSequence1, paramCharSequence2, 0) >= 0;
  }

  public static boolean j(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return false;
    }
    int i = paramCharSequence2.length();
    int j = paramCharSequence1.length() - i;
    for (int k = 0; k <= j; k++) {
      if (aWU.a(paramCharSequence1, true, k, paramCharSequence2, 0, i)) {
        return true;
      }
    }
    return false;
  }

  public static boolean l(CharSequence paramCharSequence)
  {
    if (f(paramCharSequence)) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (Character.isWhitespace(paramCharSequence.charAt(j))) {
        return true;
      }
    }
    return false;
  }

  public static int a(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    if ((f(paramCharSequence)) || (aUP.f(paramArrayOfChar))) {
      return -1;
    }
    int i = paramCharSequence.length();
    int j = i - 1;
    int k = paramArrayOfChar.length;
    int m = k - 1;
    for (int n = 0; n < i; n++) {
      char c = paramCharSequence.charAt(n);
      for (int i1 = 0; i1 < k; i1++) {
        if (paramArrayOfChar[i1] == c) {
          if ((n < j) && (i1 < m) && (Character.isHighSurrogate(c)))
          {
            if (paramArrayOfChar[(i1 + 1)] == paramCharSequence.charAt(n + 1))
              return n;
          }
          else {
            return n;
          }
        }
      }
    }
    return -1;
  }

  public static int b(CharSequence paramCharSequence, String paramString)
  {
    if ((f(paramCharSequence)) || (f(paramString))) {
      return -1;
    }
    return a(paramCharSequence, paramString.toCharArray());
  }

  public static boolean b(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    if ((f(paramCharSequence)) || (aUP.f(paramArrayOfChar))) {
      return false;
    }
    int i = paramCharSequence.length();
    int j = paramArrayOfChar.length;
    int k = i - 1;
    int m = j - 1;
    for (int n = 0; n < i; n++) {
      char c = paramCharSequence.charAt(n);
      for (int i1 = 0; i1 < j; i1++) {
        if (paramArrayOfChar[i1] == c) {
          if (Character.isHighSurrogate(c)) {
            if (i1 == m)
            {
              return true;
            }
            if ((n < k) && (paramArrayOfChar[(i1 + 1)] == paramCharSequence.charAt(n + 1)))
              return true;
          }
          else
          {
            return true;
          }
        }
      }
    }
    return false;
  }

  public static boolean k(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (paramCharSequence2 == null) {
      return false;
    }
    return b(paramCharSequence1, aWU.d(paramCharSequence2));
  }

  public static int c(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    if ((f(paramCharSequence)) || (aUP.f(paramArrayOfChar))) {
      return -1;
    }
    int i = paramCharSequence.length();
    int j = i - 1;
    int k = paramArrayOfChar.length;
    int m = k - 1;

    label127: for (int n = 0; n < i; n++) {
      char c = paramCharSequence.charAt(n);
      for (int i1 = 0; i1 < k; i1++) {
        if ((paramArrayOfChar[i1] == c) && (
          (n >= j) || (i1 >= m) || (!Character.isHighSurrogate(c)) || 
          (paramArrayOfChar[(i1 + 1)] == paramCharSequence.charAt(n + 1))))
        {
          break label127;
        }

      }

      return n;
    }
    return -1;
  }

  public static int l(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((f(paramCharSequence1)) || (f(paramCharSequence2))) {
      return -1;
    }
    int i = paramCharSequence1.length();
    for (int j = 0; j < i; j++) {
      char c = paramCharSequence1.charAt(j);
      int k = aWU.b(paramCharSequence2, c, 0) >= 0 ? 1 : 0;
      if ((j + 1 < i) && (Character.isHighSurrogate(c))) {
        int m = paramCharSequence1.charAt(j + 1);
        if ((k != 0) && (aWU.b(paramCharSequence2, m, 0) < 0)) {
          return j;
        }
      }
      else if (k == 0) {
        return j;
      }
    }

    return -1;
  }

  public static boolean d(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    if ((paramArrayOfChar == null) || (paramCharSequence == null)) {
      return false;
    }
    if (paramCharSequence.length() == 0) {
      return true;
    }
    if (paramArrayOfChar.length == 0) {
      return false;
    }
    return c(paramCharSequence, paramArrayOfChar) == -1;
  }

  public static boolean c(CharSequence paramCharSequence, String paramString)
  {
    if ((paramCharSequence == null) || (paramString == null)) {
      return false;
    }
    return d(paramCharSequence, paramString.toCharArray());
  }

  public static boolean e(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    if ((paramCharSequence == null) || (paramArrayOfChar == null)) {
      return true;
    }
    int i = paramCharSequence.length();
    int j = i - 1;
    int k = paramArrayOfChar.length;
    int m = k - 1;
    for (int n = 0; n < i; n++) {
      char c = paramCharSequence.charAt(n);
      for (int i1 = 0; i1 < k; i1++) {
        if (paramArrayOfChar[i1] == c) {
          if (Character.isHighSurrogate(c)) {
            if (i1 == m)
            {
              return false;
            }
            if ((n < j) && (paramArrayOfChar[(i1 + 1)] == paramCharSequence.charAt(n + 1)))
              return false;
          }
          else
          {
            return false;
          }
        }
      }
    }
    return true;
  }

  public static boolean d(CharSequence paramCharSequence, String paramString)
  {
    if ((paramCharSequence == null) || (paramString == null)) {
      return true;
    }
    return e(paramCharSequence, paramString.toCharArray());
  }

  public static int a(CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence)
  {
    if ((paramCharSequence == null) || (paramArrayOfCharSequence == null)) {
      return -1;
    }
    int i = paramArrayOfCharSequence.length;

    int j = 2147483647;

    int k = 0;
    for (int m = 0; m < i; m++) {
      CharSequence localCharSequence = paramArrayOfCharSequence[m];
      if (localCharSequence != null)
      {
        k = aWU.a(paramCharSequence, localCharSequence, 0);
        if (k != -1)
        {
          if (k < j)
            j = k;
        }
      }
    }
    return j == 2147483647 ? -1 : j;
  }

  public static int b(CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence)
  {
    if ((paramCharSequence == null) || (paramArrayOfCharSequence == null)) {
      return -1;
    }
    int i = paramArrayOfCharSequence.length;
    int j = -1;
    int k = 0;
    for (int m = 0; m < i; m++) {
      CharSequence localCharSequence = paramArrayOfCharSequence[m];
      if (localCharSequence != null)
      {
        k = aWU.b(paramCharSequence, localCharSequence, paramCharSequence.length());
        if (k > j)
          j = k;
      }
    }
    return j;
  }

  public static String K(String paramString, int paramInt)
  {
    if (paramString == null) {
      return null;
    }

    if (paramInt < 0) {
      paramInt = paramString.length() + paramInt;
    }

    if (paramInt < 0) {
      paramInt = 0;
    }
    if (paramInt > paramString.length()) {
      return "";
    }

    return paramString.substring(paramInt);
  }

  public static String j(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }

    if (paramInt2 < 0) {
      paramInt2 = paramString.length() + paramInt2;
    }
    if (paramInt1 < 0) {
      paramInt1 = paramString.length() + paramInt1;
    }

    if (paramInt2 > paramString.length()) {
      paramInt2 = paramString.length();
    }

    if (paramInt1 > paramInt2) {
      return "";
    }

    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }

    return paramString.substring(paramInt1, paramInt2);
  }

  public static String L(String paramString, int paramInt)
  {
    if (paramString == null) {
      return null;
    }
    if (paramInt < 0) {
      return "";
    }
    if (paramString.length() <= paramInt) {
      return paramString;
    }
    return paramString.substring(0, paramInt);
  }

  public static String M(String paramString, int paramInt)
  {
    if (paramString == null) {
      return null;
    }
    if (paramInt < 0) {
      return "";
    }
    if (paramString.length() <= paramInt) {
      return paramString;
    }
    return paramString.substring(paramString.length() - paramInt);
  }

  public static String k(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }
    if ((paramInt2 < 0) || (paramInt1 > paramString.length())) {
      return "";
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramString.length() <= paramInt1 + paramInt2) {
      return paramString.substring(paramInt1);
    }
    return paramString.substring(paramInt1, paramInt1 + paramInt2);
  }

  public static String aM(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (paramString2 == null)) {
      return paramString1;
    }
    if (paramString2.length() == 0) {
      return "";
    }
    int i = paramString1.indexOf(paramString2);
    if (i == -1) {
      return paramString1;
    }
    return paramString1.substring(0, i);
  }

  public static String aN(String paramString1, String paramString2)
  {
    if (f(paramString1)) {
      return paramString1;
    }
    if (paramString2 == null) {
      return "";
    }
    int i = paramString1.indexOf(paramString2);
    if (i == -1) {
      return "";
    }
    return paramString1.substring(i + paramString2.length());
  }

  public static String aO(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    int i = paramString1.lastIndexOf(paramString2);
    if (i == -1) {
      return paramString1;
    }
    return paramString1.substring(0, i);
  }

  public static String aP(String paramString1, String paramString2)
  {
    if (f(paramString1)) {
      return paramString1;
    }
    if (f(paramString2)) {
      return "";
    }
    int i = paramString1.lastIndexOf(paramString2);
    if ((i == -1) || (i == paramString1.length() - paramString2.length())) {
      return "";
    }
    return paramString1.substring(i + paramString2.length());
  }

  public static String aQ(String paramString1, String paramString2)
  {
    return i(paramString1, paramString2, paramString2);
  }

  public static String i(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      return null;
    }
    int i = paramString1.indexOf(paramString2);
    if (i != -1) {
      int j = paramString1.indexOf(paramString3, i + paramString2.length());
      if (j != -1) {
        return paramString1.substring(i + paramString2.length(), j);
      }
    }
    return null;
  }

  public static String[] j(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (f(paramString2)) || (f(paramString3))) {
      return null;
    }
    int i = paramString1.length();
    if (i == 0) {
      return aUP.EMPTY_STRING_ARRAY;
    }
    int j = paramString3.length();
    int k = paramString2.length();
    ArrayList localArrayList = new ArrayList();
    int m = 0;
    while (m < i - j) {
      int n = paramString1.indexOf(paramString2, m);
      if (n < 0) {
        break;
      }
      n += k;
      int i1 = paramString1.indexOf(paramString3, n);
      if (i1 < 0) {
        break;
      }
      localArrayList.add(paramString1.substring(n, i1));
      m = i1 + j;
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public static String[] split(String paramString)
  {
    return e(paramString, null, -1);
  }

  public static String[] c(String paramString, char paramChar)
  {
    return a(paramString, paramChar, false);
  }

  public static String[] aR(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2, -1, false);
  }

  public static String[] e(String paramString1, String paramString2, int paramInt)
  {
    return b(paramString1, paramString2, paramInt, false);
  }

  public static String[] aS(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, -1, false);
  }

  public static String[] f(String paramString1, String paramString2, int paramInt)
  {
    return a(paramString1, paramString2, paramInt, false);
  }

  public static String[] aT(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, -1, true);
  }

  public static String[] g(String paramString1, String paramString2, int paramInt)
  {
    return a(paramString1, paramString2, paramInt, true);
  }

  private static String[] a(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    if (paramString1 == null) {
      return null;
    }

    int i = paramString1.length();

    if (i == 0) {
      return aUP.EMPTY_STRING_ARRAY;
    }

    if ((paramString2 == null) || ("".equals(paramString2)))
    {
      return b(paramString1, null, paramInt, paramBoolean);
    }

    int j = paramString2.length();

    ArrayList localArrayList = new ArrayList();
    int k = 0;
    int m = 0;
    int n = 0;
    while (n < i) {
      n = paramString1.indexOf(paramString2, m);

      if (n > -1) {
        if (n > m) {
          k++;

          if (k == paramInt) {
            n = i;
            localArrayList.add(paramString1.substring(m));
          }
          else
          {
            localArrayList.add(paramString1.substring(m, n));

            m = n + j;
          }
        }
        else {
          if (paramBoolean) {
            k++;
            if (k == paramInt) {
              n = i;
              localArrayList.add(paramString1.substring(m));
            } else {
              localArrayList.add("");
            }
          }
          m = n + j;
        }
      }
      else {
        localArrayList.add(paramString1.substring(m));
        n = i;
      }
    }

    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public static String[] nZ(String paramString)
  {
    return b(paramString, null, -1, true);
  }

  public static String[] d(String paramString, char paramChar)
  {
    return a(paramString, paramChar, true);
  }

  private static String[] a(String paramString, char paramChar, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.length();
    if (i == 0) {
      return aUP.EMPTY_STRING_ARRAY;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 0; int k = 0;
    int m = 0;
    int n = 0;
    while (j < i)
      if (paramString.charAt(j) == paramChar) {
        if ((m != 0) || (paramBoolean)) {
          localArrayList.add(paramString.substring(k, j));
          m = 0;
          n = 1;
        }
        j++; k = j;
      }
      else {
        n = 0;
        m = 1;
        j++;
      }
    if ((m != 0) || ((paramBoolean) && (n != 0))) {
      localArrayList.add(paramString.substring(k, j));
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public static String[] aU(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2, -1, true);
  }

  public static String[] h(String paramString1, String paramString2, int paramInt)
  {
    return b(paramString1, paramString2, paramInt, true);
  }

  private static String[] b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    if (paramString1 == null) {
      return null;
    }
    int i = paramString1.length();
    if (i == 0) {
      return aUP.EMPTY_STRING_ARRAY;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int k = 0; int m = 0;
    int n = 0;
    int i1 = 0;
    if (paramString2 == null)
    {
      while (k < i)
        if (Character.isWhitespace(paramString1.charAt(k))) {
          if ((n != 0) || (paramBoolean)) {
            i1 = 1;
            if (j++ == paramInt) {
              k = i;
              i1 = 0;
            }
            localArrayList.add(paramString1.substring(m, k));
            n = 0;
          }
          k++; m = k;
        }
        else {
          i1 = 0;
          n = 1;
          k++;
        }
    }
    if (paramString2.length() == 1)
    {
      int i2 = paramString2.charAt(0);
      while (k < i)
        if (paramString1.charAt(k) == i2) {
          if ((n != 0) || (paramBoolean)) {
            i1 = 1;
            if (j++ == paramInt) {
              k = i;
              i1 = 0;
            }
            localArrayList.add(paramString1.substring(m, k));
            n = 0;
          }
          k++; m = k;
        }
        else {
          i1 = 0;
          n = 1;
          k++;
        }
    }
    else {
      while (k < i)
        if (paramString2.indexOf(paramString1.charAt(k)) >= 0) {
          if ((n != 0) || (paramBoolean)) {
            i1 = 1;
            if (j++ == paramInt) {
              k = i;
              i1 = 0;
            }
            localArrayList.add(paramString1.substring(m, k));
            n = 0;
          }
          k++; m = k;
        }
        else {
          i1 = 0;
          n = 1;
          k++;
        }
    }
    if ((n != 0) || ((paramBoolean) && (i1 != 0))) {
      localArrayList.add(paramString1.substring(m, k));
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public static String[] oa(String paramString)
  {
    return O(paramString, false);
  }

  public static String[] ob(String paramString)
  {
    return O(paramString, true);
  }

  private static String[] O(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() == 0) {
      return aUP.EMPTY_STRING_ARRAY;
    }
    char[] arrayOfChar = paramString.toCharArray();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = Character.getType(arrayOfChar[i]);
    for (int k = i + 1; k < arrayOfChar.length; k++) {
      int m = Character.getType(arrayOfChar[k]);
      if (m != j)
      {
        if ((paramBoolean) && (m == 2) && (j == 1)) {
          int n = k - 1;
          if (n != i) {
            localArrayList.add(new String(arrayOfChar, i, n - i));
            i = n;
          }
        } else {
          localArrayList.add(new String(arrayOfChar, i, k - i));
          i = k;
        }
        j = m;
      }
    }
    localArrayList.add(new String(arrayOfChar, i, arrayOfChar.length - i));
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public static String C(Object[] paramArrayOfObject)
  {
    return a(paramArrayOfObject, null);
  }

  public static String a(Object[] paramArrayOfObject, char paramChar)
  {
    if (paramArrayOfObject == null) {
      return null;
    }

    return a(paramArrayOfObject, paramChar, 0, paramArrayOfObject.length);
  }

  public static String a(Object[] paramArrayOfObject, char paramChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder(i * 16);

    for (int j = paramInt1; j < paramInt2; j++) {
      if (j > paramInt1) {
        localStringBuilder.append(paramChar);
      }
      if (paramArrayOfObject[j] != null) {
        localStringBuilder.append(paramArrayOfObject[j]);
      }
    }
    return localStringBuilder.toString();
  }

  public static String a(Object[] paramArrayOfObject, String paramString)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    return a(paramArrayOfObject, paramString, 0, paramArrayOfObject.length);
  }

  public static String a(Object[] paramArrayOfObject, String paramString, int paramInt1, int paramInt2)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    if (paramString == null) {
      paramString = "";
    }

    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder(i * 16);

    for (int j = paramInt1; j < paramInt2; j++) {
      if (j > paramInt1) {
        localStringBuilder.append(paramString);
      }
      if (paramArrayOfObject[j] != null) {
        localStringBuilder.append(paramArrayOfObject[j]);
      }
    }
    return localStringBuilder.toString();
  }

  public static String a(Iterator paramIterator, char paramChar)
  {
    if (paramIterator == null) {
      return null;
    }
    if (!paramIterator.hasNext()) {
      return "";
    }
    Object localObject1 = paramIterator.next();
    if (!paramIterator.hasNext()) {
      return aqV.toString(localObject1);
    }

    StringBuilder localStringBuilder = new StringBuilder(256);
    if (localObject1 != null) {
      localStringBuilder.append(localObject1);
    }

    while (paramIterator.hasNext()) {
      localStringBuilder.append(paramChar);
      Object localObject2 = paramIterator.next();
      if (localObject2 != null) {
        localStringBuilder.append(localObject2);
      }
    }

    return localStringBuilder.toString();
  }

  public static String a(Iterator paramIterator, String paramString)
  {
    if (paramIterator == null) {
      return null;
    }
    if (!paramIterator.hasNext()) {
      return "";
    }
    Object localObject1 = paramIterator.next();
    if (!paramIterator.hasNext()) {
      return aqV.toString(localObject1);
    }

    StringBuilder localStringBuilder = new StringBuilder(256);
    if (localObject1 != null) {
      localStringBuilder.append(localObject1);
    }

    while (paramIterator.hasNext()) {
      if (paramString != null) {
        localStringBuilder.append(paramString);
      }
      Object localObject2 = paramIterator.next();
      if (localObject2 != null) {
        localStringBuilder.append(localObject2);
      }
    }
    return localStringBuilder.toString();
  }

  public static String a(Iterable paramIterable, char paramChar)
  {
    if (paramIterable == null) {
      return null;
    }
    return a(paramIterable.iterator(), paramChar);
  }

  public static String a(Iterable paramIterable, String paramString)
  {
    if (paramIterable == null) {
      return null;
    }
    return a(paramIterable.iterator(), paramString);
  }

  public static String oc(String paramString)
  {
    if (f(paramString)) {
      return paramString;
    }
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = 0;
    for (int k = 0; k < i; k++) {
      if (!Character.isWhitespace(paramString.charAt(k))) {
        arrayOfChar[(j++)] = paramString.charAt(k);
      }
    }
    if (j == i) {
      return paramString;
    }
    return new String(arrayOfChar, 0, j);
  }

  public static String aV(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    if (paramString1.startsWith(paramString2)) {
      return paramString1.substring(paramString2.length());
    }
    return paramString1;
  }

  public static String aW(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    if (s(paramString1, paramString2)) {
      return paramString1.substring(paramString2.length());
    }
    return paramString1;
  }

  public static String aX(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    if (paramString1.endsWith(paramString2)) {
      return paramString1.substring(0, paramString1.length() - paramString2.length());
    }
    return paramString1;
  }

  public static String aY(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    if (u(paramString1, paramString2)) {
      return paramString1.substring(0, paramString1.length() - paramString2.length());
    }
    return paramString1;
  }

  public static String aZ(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    return a(paramString1, paramString2, "", -1);
  }

  public static String e(String paramString, char paramChar)
  {
    if ((f(paramString)) || (paramString.indexOf(paramChar) == -1)) {
      return paramString;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    for (int j = 0; j < arrayOfChar.length; j++) {
      if (arrayOfChar[j] != paramChar) {
        arrayOfChar[(i++)] = arrayOfChar[j];
      }
    }
    return new String(arrayOfChar, 0, i);
  }

  public static String k(String paramString1, String paramString2, String paramString3)
  {
    return a(paramString1, paramString2, paramString3, 1);
  }

  public static String replace(String paramString1, String paramString2, String paramString3)
  {
    return a(paramString1, paramString2, paramString3, -1);
  }

  public static String a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if ((f(paramString1)) || (f(paramString2)) || (paramString3 == null) || (paramInt == 0)) {
      return paramString1;
    }
    int i = 0;
    int j = paramString1.indexOf(paramString2, i);
    if (j == -1) {
      return paramString1;
    }
    int k = paramString2.length();
    int m = paramString3.length() - k;
    m = m < 0 ? 0 : m;
    m *= (paramInt > 64 ? 64 : paramInt < 0 ? 16 : paramInt);
    StringBuilder localStringBuilder = new StringBuilder(paramString1.length() + m);
    while (j != -1) {
      localStringBuilder.append(paramString1.substring(i, j)).append(paramString3);
      i = j + k;
      paramInt--; if (paramInt == 0) {
        break;
      }
      j = paramString1.indexOf(paramString2, i);
    }
    localStringBuilder.append(paramString1.substring(i));
    return localStringBuilder.toString();
  }

  public static String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    return a(paramString, paramArrayOfString1, paramArrayOfString2, false, 0);
  }

  public static String b(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = paramArrayOfString1 == null ? 0 : paramArrayOfString1.length;
    return a(paramString, paramArrayOfString1, paramArrayOfString2, true, i);
  }

  private static String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfString1 == null) || (paramArrayOfString1.length == 0) || (paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
    {
      return paramString;
    }

    if (paramInt < 0) {
      throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
    }

    int i = paramArrayOfString1.length;
    int j = paramArrayOfString2.length;

    if (i != j) {
      throw new IllegalArgumentException("Search and Replace array lengths don't match: " + i + " vs " + j);
    }

    boolean[] arrayOfBoolean = new boolean[i];

    int k = -1;
    int m = -1;
    int n = -1;

    for (int i1 = 0; i1 < i; i1++) {
      if ((arrayOfBoolean[i1] == 0) && (paramArrayOfString1[i1] != null) && (paramArrayOfString1[i1].length() != 0) && (paramArrayOfString2[i1] != null))
      {
        n = paramString.indexOf(paramArrayOfString1[i1]);

        if (n == -1) {
          arrayOfBoolean[i1] = true;
        }
        else if ((k == -1) || (n < k)) {
          k = n;
          m = i1;
        }

      }

    }

    if (k == -1) {
      return paramString;
    }

    i1 = 0;

    int i2 = 0;

    for (int i3 = 0; i3 < paramArrayOfString1.length; i3++) {
      if ((paramArrayOfString1[i3] != null) && (paramArrayOfString2[i3] != null))
      {
        i4 = paramArrayOfString2[i3].length() - paramArrayOfString1[i3].length();
        if (i4 > 0) {
          i2 += 3 * i4;
        }
      }
    }
    i2 = Math.min(i2, paramString.length() / 5);

    StringBuilder localStringBuilder = new StringBuilder(paramString.length() + i2);

    while (k != -1)
    {
      for (i4 = i1; i4 < k; i4++) {
        localStringBuilder.append(paramString.charAt(i4));
      }
      localStringBuilder.append(paramArrayOfString2[m]);

      i1 = k + paramArrayOfString1[m].length();

      k = -1;
      m = -1;
      n = -1;

      for (i4 = 0; i4 < i; i4++) {
        if ((arrayOfBoolean[i4] == 0) && (paramArrayOfString1[i4] != null) && (paramArrayOfString1[i4].length() != 0) && (paramArrayOfString2[i4] != null))
        {
          n = paramString.indexOf(paramArrayOfString1[i4], i1);

          if (n == -1) {
            arrayOfBoolean[i4] = true;
          }
          else if ((k == -1) || (n < k)) {
            k = n;
            m = i4;
          }
        }
      }

    }

    int i4 = paramString.length();
    for (int i5 = i1; i5 < i4; i5++) {
      localStringBuilder.append(paramString.charAt(i5));
    }
    String str = localStringBuilder.toString();
    if (!paramBoolean) {
      return str;
    }

    return a(str, paramArrayOfString1, paramArrayOfString2, paramBoolean, paramInt - 1);
  }

  public static String a(String paramString, char paramChar1, char paramChar2)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.replace(paramChar1, paramChar2);
  }

  public static String l(String paramString1, String paramString2, String paramString3)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }
    if (paramString3 == null) {
      paramString3 = "";
    }
    int i = 0;
    int j = paramString3.length();
    int k = paramString1.length();
    StringBuilder localStringBuilder = new StringBuilder(k);
    for (int m = 0; m < k; m++) {
      char c = paramString1.charAt(m);
      int n = paramString2.indexOf(c);
      if (n >= 0) {
        i = 1;
        if (n < j)
          localStringBuilder.append(paramString3.charAt(n));
      }
      else {
        localStringBuilder.append(c);
      }
    }
    if (i != 0) {
      return localStringBuilder.toString();
    }
    return paramString1;
  }

  public static String a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (paramString1 == null) {
      return null;
    }
    if (paramString2 == null) {
      paramString2 = "";
    }
    int i = paramString1.length();
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt1 > i) {
      paramInt1 = i;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    if (paramInt2 > i) {
      paramInt2 = i;
    }
    if (paramInt1 > paramInt2) {
      int j = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = j;
    }
    return i + paramInt1 - paramInt2 + paramString2.length() + 1 + paramString1.substring(0, paramInt1) + paramString2 + paramString1.substring(paramInt2);
  }

  public static String od(String paramString)
  {
    if (f(paramString)) {
      return paramString;
    }

    if (paramString.length() == 1) {
      i = paramString.charAt(0);
      if ((i == 13) || (i == 10)) {
        return "";
      }
      return paramString;
    }

    int i = paramString.length() - 1;
    int j = paramString.charAt(i);

    if (j == 10) {
      if (paramString.charAt(i - 1) == '\r')
        i--;
    }
    else if (j != 13) {
      i++;
    }
    return paramString.substring(0, i);
  }

  public static String ba(String paramString1, String paramString2)
  {
    if ((f(paramString1)) || (paramString2 == null)) {
      return paramString1;
    }
    if (paramString1.endsWith(paramString2)) {
      return paramString1.substring(0, paramString1.length() - paramString2.length());
    }
    return paramString1;
  }

  public static String oe(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.length();
    if (i < 2) {
      return "";
    }
    int j = i - 1;
    String str = paramString.substring(0, j);
    int k = paramString.charAt(j);
    if ((k == 10) && (str.charAt(j - 1) == '\r')) {
      return str.substring(0, j - 1);
    }
    return str;
  }

  public static String N(String paramString, int paramInt)
  {
    if (paramString == null) {
      return null;
    }
    if (paramInt <= 0) {
      return "";
    }
    int i = paramString.length();
    if ((paramInt == 1) || (i == 0)) {
      return paramString;
    }
    if ((i == 1) && (paramInt <= 8192)) {
      return b(paramString.charAt(0), paramInt);
    }

    int j = i * paramInt;
    switch (i) {
    case 1:
      return b(paramString.charAt(0), paramInt);
    case 2:
      int k = paramString.charAt(0);
      int m = paramString.charAt(1);
      char[] arrayOfChar = new char[j];
      for (int n = paramInt * 2 - 2; n >= 0; n--) {
        arrayOfChar[n] = k;
        arrayOfChar[(n + 1)] = m;

        n--;
      }

      return new String(arrayOfChar);
    }
    StringBuilder localStringBuilder = new StringBuilder(j);
    for (int i1 = 0; i1 < paramInt; i1++) {
      localStringBuilder.append(paramString);
    }
    return localStringBuilder.toString();
  }

  public static String i(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return N(paramString1, paramInt);
    }

    String str = N(paramString1 + paramString2, paramInt);
    return aX(str, paramString2);
  }

  public static String b(char paramChar, int paramInt)
  {
    char[] arrayOfChar = new char[paramInt];
    for (int i = paramInt - 1; i >= 0; i--) {
      arrayOfChar[i] = paramChar;
    }
    return new String(arrayOfChar);
  }

  public static String O(String paramString, int paramInt)
  {
    return a(paramString, paramInt, ' ');
  }

  public static String a(String paramString, int paramInt, char paramChar)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramInt - paramString.length();
    if (i <= 0) {
      return paramString;
    }
    if (i > 8192) {
      return a(paramString, paramInt, String.valueOf(paramChar));
    }
    return paramString.concat(b(paramChar, i));
  }

  public static String a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    if (f(paramString2)) {
      paramString2 = " ";
    }
    int i = paramString2.length();
    int j = paramString1.length();
    int k = paramInt - j;
    if (k <= 0) {
      return paramString1;
    }
    if ((i == 1) && (k <= 8192)) {
      return a(paramString1, paramInt, paramString2.charAt(0));
    }

    if (k == i)
      return paramString1.concat(paramString2);
    if (k < i) {
      return paramString1.concat(paramString2.substring(0, k));
    }
    char[] arrayOfChar1 = new char[k];
    char[] arrayOfChar2 = paramString2.toCharArray();
    for (int m = 0; m < k; m++) {
      arrayOfChar1[m] = arrayOfChar2[(m % i)];
    }
    return paramString1.concat(new String(arrayOfChar1));
  }

  public static String P(String paramString, int paramInt)
  {
    return b(paramString, paramInt, ' ');
  }

  public static String b(String paramString, int paramInt, char paramChar)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramInt - paramString.length();
    if (i <= 0) {
      return paramString;
    }
    if (i > 8192) {
      return b(paramString, paramInt, String.valueOf(paramChar));
    }
    return b(paramChar, i).concat(paramString);
  }

  public static String b(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    if (f(paramString2)) {
      paramString2 = " ";
    }
    int i = paramString2.length();
    int j = paramString1.length();
    int k = paramInt - j;
    if (k <= 0) {
      return paramString1;
    }
    if ((i == 1) && (k <= 8192)) {
      return b(paramString1, paramInt, paramString2.charAt(0));
    }

    if (k == i)
      return paramString2.concat(paramString1);
    if (k < i) {
      return paramString2.substring(0, k).concat(paramString1);
    }
    char[] arrayOfChar1 = new char[k];
    char[] arrayOfChar2 = paramString2.toCharArray();
    for (int m = 0; m < k; m++) {
      arrayOfChar1[m] = arrayOfChar2[(m % i)];
    }
    return new String(arrayOfChar1).concat(paramString1);
  }

  public static int m(CharSequence paramCharSequence)
  {
    return paramCharSequence == null ? 0 : paramCharSequence.length();
  }

  public static String Q(String paramString, int paramInt)
  {
    return c(paramString, paramInt, ' ');
  }

  public static String c(String paramString, int paramInt, char paramChar)
  {
    if ((paramString == null) || (paramInt <= 0)) {
      return paramString;
    }
    int i = paramString.length();
    int j = paramInt - i;
    if (j <= 0) {
      return paramString;
    }
    paramString = b(paramString, i + j / 2, paramChar);
    paramString = a(paramString, paramInt, paramChar);
    return paramString;
  }

  public static String c(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 == null) || (paramInt <= 0)) {
      return paramString1;
    }
    if (f(paramString2)) {
      paramString2 = " ";
    }
    int i = paramString1.length();
    int j = paramInt - i;
    if (j <= 0) {
      return paramString1;
    }
    paramString1 = b(paramString1, i + j / 2, paramString2);
    paramString1 = a(paramString1, paramInt, paramString2);
    return paramString1;
  }

  public static String of(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.toUpperCase();
  }

  public static String a(String paramString, Locale paramLocale)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.toUpperCase(paramLocale);
  }

  public static String og(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.toLowerCase();
  }

  public static String b(String paramString, Locale paramLocale)
  {
    if (paramString == null) {
      return null;
    }
    return paramString.toLowerCase(paramLocale);
  }

  public static String capitalize(String paramString)
  {
    int i;
    if ((paramString == null) || ((i = paramString.length()) == 0)) {
      return paramString;
    }
    return i + Character.toTitleCase(paramString.charAt(0)) + paramString.substring(1);
  }

  public static String oh(String paramString)
  {
    int i;
    if ((paramString == null) || ((i = paramString.length()) == 0)) {
      return paramString;
    }
    return i + Character.toLowerCase(paramString.charAt(0)) + paramString.substring(1);
  }

  public static String oi(String paramString)
  {
    if (f(paramString)) {
      return paramString;
    }

    char[] arrayOfChar = paramString.toCharArray();

    for (int i = 0; i < arrayOfChar.length; i++) {
      char c = arrayOfChar[i];
      if (Character.isUpperCase(c))
        arrayOfChar[i] = Character.toLowerCase(c);
      else if (Character.isTitleCase(c))
        arrayOfChar[i] = Character.toLowerCase(c);
      else if (Character.isLowerCase(c)) {
        arrayOfChar[i] = Character.toUpperCase(c);
      }
    }
    return new String(arrayOfChar);
  }

  public static int m(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((f(paramCharSequence1)) || (f(paramCharSequence2))) {
      return 0;
    }
    int i = 0;
    int j = 0;
    while ((j = aWU.a(paramCharSequence1, paramCharSequence2, j)) != -1) {
      i++;
      j += paramCharSequence2.length();
    }
    return i;
  }

  public static boolean n(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0)) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isLetter(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean o(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if ((!Character.isLetter(paramCharSequence.charAt(j))) && (paramCharSequence.charAt(j) != ' ')) {
        return false;
      }
    }
    return true;
  }

  public static boolean p(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0)) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isLetterOrDigit(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean q(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if ((!Character.isLetterOrDigit(paramCharSequence.charAt(j))) && (paramCharSequence.charAt(j) != ' ')) {
        return false;
      }
    }
    return true;
  }

  public static boolean r(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!aZu.A(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean s(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0)) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isDigit(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean t(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if ((!Character.isDigit(paramCharSequence.charAt(j))) && (paramCharSequence.charAt(j) != ' ')) {
        return false;
      }
    }
    return true;
  }

  public static boolean u(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isWhitespace(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean v(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (f(paramCharSequence))) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isLowerCase(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static boolean w(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (f(paramCharSequence))) {
      return false;
    }
    int i = paramCharSequence.length();
    for (int j = 0; j < i; j++) {
      if (!Character.isUpperCase(paramCharSequence.charAt(j))) {
        return false;
      }
    }
    return true;
  }

  public static String oj(String paramString)
  {
    return paramString == null ? "" : paramString;
  }

  public static String bb(String paramString1, String paramString2)
  {
    return paramString1 == null ? paramString2 : paramString1;
  }

  public static CharSequence n(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return h(paramCharSequence1) ? paramCharSequence2 : paramCharSequence1;
  }

  public static CharSequence o(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return f(paramCharSequence1) ? paramCharSequence2 : paramCharSequence1;
  }

  public static String ok(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new StringBuilder(paramString).reverse().toString();
  }

  public static String f(String paramString, char paramChar)
  {
    if (paramString == null) {
      return null;
    }

    String[] arrayOfString = c(paramString, paramChar);
    aUP.m(arrayOfString);
    return a(arrayOfString, paramChar);
  }

  public static String R(String paramString, int paramInt)
  {
    return l(paramString, 0, paramInt);
  }

  public static String l(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }
    if (paramInt2 < 4) {
      throw new IllegalArgumentException("Minimum abbreviation width is 4");
    }
    if (paramString.length() <= paramInt2) {
      return paramString;
    }
    if (paramInt1 > paramString.length()) {
      paramInt1 = paramString.length();
    }
    if (paramString.length() - paramInt1 < paramInt2 - 3) {
      paramInt1 = paramString.length() - (paramInt2 - 3);
    }
    String str = "...";
    if (paramInt1 <= 4) {
      return paramString.substring(0, paramInt2 - 3) + "...";
    }
    if (paramInt2 < 7) {
      throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
    }
    if (paramInt1 + (paramInt2 - 3) < paramString.length()) {
      return "..." + R(paramString.substring(paramInt1), paramInt2 - 3);
    }
    return "..." + paramString.substring(paramString.length() - (paramInt2 - 3));
  }

  public static String j(String paramString1, String paramString2, int paramInt)
  {
    if ((f(paramString1)) || (f(paramString2))) {
      return paramString1;
    }

    if ((paramInt >= paramString1.length()) || (paramInt < paramString2.length() + 2)) {
      return paramString1;
    }

    int i = paramInt - paramString2.length();
    int j = i / 2 + i % 2;
    int k = paramString1.length() - i / 2;

    StringBuilder localStringBuilder = new StringBuilder(paramInt);
    localStringBuilder.append(paramString1.substring(0, j));
    localStringBuilder.append(paramString2);
    localStringBuilder.append(paramString1.substring(k));

    return localStringBuilder.toString();
  }

  public static String bc(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2;
    }
    if (paramString2 == null) {
      return paramString1;
    }
    int i = p(paramString1, paramString2);
    if (i == -1) {
      return "";
    }
    return paramString2.substring(i);
  }

  public static int p(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (paramCharSequence1 == paramCharSequence2) {
      return -1;
    }
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return 0;
    }

    for (int i = 0; (i < paramCharSequence1.length()) && (i < paramCharSequence2.length()) && 
      (paramCharSequence1.charAt(i) == paramCharSequence2.charAt(i)); i++);
    if ((i < paramCharSequence2.length()) || (i < paramCharSequence1.length())) {
      return i;
    }
    return -1;
  }

  public static int a(CharSequence[] paramArrayOfCharSequence)
  {
    if ((paramArrayOfCharSequence == null) || (paramArrayOfCharSequence.length <= 1)) {
      return -1;
    }
    int i = 0;
    int j = 1;
    int k = paramArrayOfCharSequence.length;
    int m = 2147483647;
    int n = 0;

    for (int i1 = 0; i1 < k; i1++) {
      if (paramArrayOfCharSequence[i1] == null) {
        i = 1;
        m = 0;
      } else {
        j = 0;
        m = Math.min(paramArrayOfCharSequence[i1].length(), m);
        n = Math.max(paramArrayOfCharSequence[i1].length(), n);
      }

    }

    if ((j != 0) || ((n == 0) && (i == 0))) {
      return -1;
    }

    if (m == 0) {
      return 0;
    }

    i1 = -1;
    for (int i2 = 0; i2 < m; i2++) {
      int i3 = paramArrayOfCharSequence[0].charAt(i2);
      for (int i4 = 1; i4 < k; i4++) {
        if (paramArrayOfCharSequence[i4].charAt(i2) != i3) {
          i1 = i2;
          break;
        }
      }
      if (i1 != -1)
      {
        break;
      }
    }
    if ((i1 == -1) && (m != n))
    {
      return m;
    }
    return i1;
  }

  public static String I(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return "";
    }
    int i = a(paramArrayOfString);
    if (i == -1)
    {
      if (paramArrayOfString[0] == null) {
        return "";
      }
      return paramArrayOfString[0];
    }if (i == 0)
    {
      return "";
    }

    return paramArrayOfString[0].substring(0, i);
  }

  public static int q(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      throw new IllegalArgumentException("Strings must not be null");
    }

    int i = paramCharSequence1.length();
    int j = paramCharSequence2.length();

    if (i == 0)
      return j;
    if (j == 0) {
      return i;
    }

    if (i > j)
    {
      localObject1 = paramCharSequence1;
      paramCharSequence1 = paramCharSequence2;
      paramCharSequence2 = (CharSequence)localObject1;
      i = j;
      j = paramCharSequence2.length();
    }

    Object localObject1 = new int[i + 1];
    Object localObject2 = new int[i + 1];

    for (int k = 0; k <= i; k++) {
      localObject1[k] = k;
    }

    for (int m = 1; m <= j; m++) {
      int n = paramCharSequence2.charAt(m - 1);
      localObject2[0] = m;

      for (k = 1; k <= i; k++) {
        int i1 = paramCharSequence1.charAt(k - 1) == n ? 0 : 1;

        localObject2[k] = Math.min(Math.min(localObject2[(k - 1)] + 1, localObject1[k] + 1), localObject1[(k - 1)] + i1);
      }

      Object localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }

    return localObject1[i];
  }

  public static int g(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      throw new IllegalArgumentException("Strings must not be null");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Threshold must not be negative");
    }

    int i = paramCharSequence1.length();
    int j = paramCharSequence2.length();

    if (i == 0)
      return j <= paramInt ? j : -1;
    if (j == 0) {
      return i <= paramInt ? i : -1;
    }

    if (i > j)
    {
      localObject1 = paramCharSequence1;
      paramCharSequence1 = paramCharSequence2;
      paramCharSequence2 = (CharSequence)localObject1;
      i = j;
      j = paramCharSequence2.length();
    }

    Object localObject1 = new int[i + 1];
    Object localObject2 = new int[i + 1];

    int k = Math.min(i, paramInt) + 1;
    for (int m = 0; m < k; m++) {
      localObject1[m] = m;
    }

    Arrays.fill((int[])localObject1, k, localObject1.length, 2147483647);
    Arrays.fill((int[])localObject2, 2147483647);

    for (m = 1; m <= j; m++) {
      int n = paramCharSequence2.charAt(m - 1);
      localObject2[0] = m;

      int i1 = Math.max(1, m - paramInt);
      int i2 = Math.min(i, m + paramInt);

      if (i1 > i2) {
        return -1;
      }

      if (i1 > 1) {
        localObject2[(i1 - 1)] = 2147483647;
      }

      for (int i3 = i1; i3 <= i2; i3++) {
        if (paramCharSequence1.charAt(i3 - 1) == n)
        {
          localObject2[i3] = localObject1[(i3 - 1)];
        }
        else {
          localObject2[i3] = (1 + Math.min(Math.min(localObject2[(i3 - 1)], localObject1[i3]), localObject1[(i3 - 1)]));
        }

      }

      Object localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }

    if (localObject1[i] <= paramInt) {
      return localObject1[i];
    }
    return -1;
  }

  public static boolean r(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return a(paramCharSequence1, paramCharSequence2, false);
  }

  public static boolean s(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return a(paramCharSequence1, paramCharSequence2, true);
  }

  private static boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return (paramCharSequence1 == null) && (paramCharSequence2 == null);
    }
    if (paramCharSequence2.length() > paramCharSequence1.length()) {
      return false;
    }
    return aWU.a(paramCharSequence1, paramBoolean, 0, paramCharSequence2, 0, paramCharSequence2.length());
  }

  public static boolean c(CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence)
  {
    if ((f(paramCharSequence)) || (aUP.n(paramArrayOfCharSequence))) {
      return false;
    }
    for (CharSequence localCharSequence : paramArrayOfCharSequence) {
      if (r(paramCharSequence, localCharSequence)) {
        return true;
      }
    }
    return false;
  }

  public static boolean t(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return b(paramCharSequence1, paramCharSequence2, false);
  }

  public static boolean u(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return b(paramCharSequence1, paramCharSequence2, true);
  }

  private static boolean b(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    if ((paramCharSequence1 == null) || (paramCharSequence2 == null)) {
      return (paramCharSequence1 == null) && (paramCharSequence2 == null);
    }
    if (paramCharSequence2.length() > paramCharSequence1.length()) {
      return false;
    }
    int i = paramCharSequence1.length() - paramCharSequence2.length();
    return aWU.a(paramCharSequence1, paramBoolean, i, paramCharSequence2, 0, paramCharSequence2.length());
  }

  public static String ol(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return kws.matcher(nS(paramString)).replaceAll(" ");
  }

  public static boolean d(CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence)
  {
    if ((f(paramCharSequence)) || (aUP.n(paramArrayOfCharSequence))) {
      return false;
    }
    for (CharSequence localCharSequence : paramArrayOfCharSequence) {
      if (t(paramCharSequence, localCharSequence)) {
        return true;
      }
    }
    return false;
  }

  static
  {
    try
    {
      Class localClass1 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");

      kwy = localClass1.getField("NFD").get(null);
      Class localClass3 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer");

      kwx = localClass3.getMethod("normalize", new Class[] { CharSequence.class, localClass1 });

      kww = true;
    } catch (ClassNotFoundException localClassNotFoundException1) {
      kww = false;
    } catch (NoSuchFieldException localNoSuchFieldException) {
      kww = false;
    } catch (IllegalAccessException localIllegalAccessException) {
      kww = false;
    } catch (NoSuchMethodException localNoSuchMethodException1) {
      kww = false;
    }

    try
    {
      Class localClass2 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer");

      kwu = localClass2.getMethod("decompose", new Class[] { String.class, Boolean.TYPE, Integer.TYPE });

      kwt = true;
    } catch (ClassNotFoundException localClassNotFoundException2) {
      kwt = false;
    } catch (NoSuchMethodException localNoSuchMethodException2) {
      kwt = false;
    }
  }
}