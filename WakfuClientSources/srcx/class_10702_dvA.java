import java.io.File;
import java.util.StringTokenizer;
import java.util.Vector;

public final class dvA
{
  public static final String lAP = "**";
  private static final dvA lAQ = new dvA();
  private static final wh aIk = wh.Fo();

  public static dvA daW()
  {
    return lAQ;
  }

  public static boolean ad(String paramString1, String paramString2)
  {
    return d(paramString1, paramString2, true);
  }

  public static boolean d(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString2.startsWith(File.separator) != paramString1.startsWith(File.separator))
    {
      return false;
    }

    String[] arrayOfString1 = qu(paramString1);
    String[] arrayOfString2 = qu(paramString2);
    return a(arrayOfString1, arrayOfString2, paramBoolean);
  }

  static boolean a(String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    int i = 0;
    int j = paramArrayOfString1.length - 1;
    int k = 0;
    int m = paramArrayOfString2.length - 1;

    while ((i <= j) && (k <= m)) {
      String str = paramArrayOfString1[i];
      if (str.equals("**")) {
        break;
      }
      if (!f(str, paramArrayOfString2[k], paramBoolean)) {
        return false;
      }
      i++;
      k++;
    }

    if (k > m)
    {
      return true;
    }if (i > j)
    {
      return false;
    }

    return true;
  }

  public static boolean ae(String paramString1, String paramString2)
  {
    String[] arrayOfString = qu(paramString1);
    return b(arrayOfString, qu(paramString2), true);
  }

  public static boolean e(String paramString1, String paramString2, boolean paramBoolean)
  {
    String[] arrayOfString = qu(paramString1);
    return b(arrayOfString, qu(paramString2), paramBoolean);
  }

  static boolean b(String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    String str1 = 0;
    String str2 = paramArrayOfString1.length - 1;
    int i = 0;
    int j = paramArrayOfString2.length - 1;
    String str3;
    while ((str1 <= str2) && (i <= j)) {
      str3 = paramArrayOfString1[str1];
      if (str3.equals("**")) {
        break;
      }
      if (!f(str3, paramArrayOfString2[i], paramBoolean)) {
        return false;
      }
      str1++;
      i++;
    }
    if (i > j)
    {
      for (str3 = str1; str3 <= str2; str3++) {
        if (!paramArrayOfString1[str3].equals("**")) {
          return false;
        }
      }
      return true;
    }
    if (str1 > str2)
    {
      return false;
    }

    while ((str1 <= str2) && (i <= j)) {
      str3 = paramArrayOfString1[str2];
      if (str3.equals("**")) {
        break;
      }
      if (!f(str3, paramArrayOfString2[j], paramBoolean)) {
        return false;
      }
      str2--;
      j--;
    }
    if (i > j)
    {
      for (str3 = str1; str3 <= str2; str3++) {
        if (!paramArrayOfString1[str3].equals("**")) {
          return false;
        }
      }
      return true;
    }

    while ((str1 != str2) && (i <= j)) {
      str4 = -1;
      for (String str5 = str1 + 1; str5 <= str2; str5++) {
        if (paramArrayOfString1[str5].equals("**")) {
          str4 = str5;
          break;
        }
      }
      if (str4 == str1 + 1)
      {
        str1++;
      }
      else
      {
        int k = str4 - str1 - 1;
        int m = j - i + 1;
        int n = -1;

        label376: for (int i1 = 0; i1 <= m - k; i1++) {
          for (int i2 = 0; i2 < k; i2++) {
            String str6 = paramArrayOfString1[(str1 + i2 + 1)];
            String str7 = paramArrayOfString2[(i + i1 + i2)];
            if (!f(str6, str7, paramBoolean))
            {
              break label376;
            }
          }
          n = i + i1;
          break;
        }

        if (n == -1) {
          return false;
        }

        str1 = str4;
        i = n + k;
      }
    }
    for (String str4 = str1; str4 <= str2; str4++) {
      if (!paramArrayOfString1[str4].equals("**")) {
        return false;
      }
    }

    return true;
  }

  public static boolean af(String paramString1, String paramString2)
  {
    return f(paramString1, paramString2, true);
  }

  public static boolean f(String paramString1, String paramString2, boolean paramBoolean)
  {
    char[] arrayOfChar1 = paramString1.toCharArray();
    char[] arrayOfChar2 = paramString2.toCharArray();
    int i = 0;
    int j = arrayOfChar1.length - 1;
    int k = 0;
    int m = arrayOfChar2.length - 1;

    int n = 0;
    for (int i1 = 0; i1 < arrayOfChar1.length; i1++)
      if (arrayOfChar1[i1] == '*') {
        n = 1;
        break;
      }
    char c;
    if (n == 0)
    {
      if (j != m) {
        return false;
      }
      for (i1 = 0; i1 <= j; i1++) {
        c = arrayOfChar1[i1];
        if ((c != '?') && 
          (a(paramBoolean, c, arrayOfChar2[i1]))) {
          return false;
        }
      }

      return true;
    }

    if (j == 0) {
      return true;
    }

    while (true)
    {
      c = arrayOfChar1[i];
      if ((c == '*') || (k > m)) {
        break;
      }
      if ((c != '?') && 
        (a(paramBoolean, c, arrayOfChar2[k]))) {
        return false;
      }

      i++;
      k++;
    }
    if (k > m)
    {
      return c(arrayOfChar1, i, j);
    }

    while (true)
    {
      c = arrayOfChar1[j];
      if ((c == '*') || (k > m)) {
        break;
      }
      if ((c != '?') && 
        (a(paramBoolean, c, arrayOfChar2[m]))) {
        return false;
      }

      j--;
      m--;
    }
    if (k > m)
    {
      return c(arrayOfChar1, i, j);
    }

    while ((i != j) && (k <= m)) {
      i1 = -1;
      for (int i2 = i + 1; i2 <= j; i2++) {
        if (arrayOfChar1[i2] == '*') {
          i1 = i2;
          break;
        }
      }
      if (i1 == i + 1)
      {
        i++;
      }
      else
      {
        i2 = i1 - i - 1;
        int i3 = m - k + 1;
        int i4 = -1;

        label442: for (int i5 = 0; i5 <= i3 - i2; i5++) {
          for (int i6 = 0; i6 < i2; i6++) {
            c = arrayOfChar1[(i + i6 + 1)];
            if ((c != '?') && 
              (a(paramBoolean, c, arrayOfChar2[(k + i5 + i6)])))
            {
              break label442;
            }

          }

          i4 = k + i5;
          break;
        }

        if (i4 == -1) {
          return false;
        }

        i = i1;
        k = i4 + i2;
      }

    }

    return c(arrayOfChar1, i, j);
  }

  private static boolean c(char[] paramArrayOfChar, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i <= paramInt2; i++) {
      if (paramArrayOfChar[i] != '*') {
        return false;
      }
    }
    return true;
  }

  private static boolean a(boolean paramBoolean, char paramChar1, char paramChar2)
  {
    return paramChar1 != paramChar2;
  }

  public static Vector qt(String paramString)
  {
    return bi(paramString, File.separator);
  }

  public static Vector bi(String paramString1, String paramString2)
  {
    Vector localVector = new Vector();
    if (wh.isAbsolutePath(paramString1)) {
      localObject = aIk.aT(paramString1);
      localVector.add(localObject[0]);
      paramString1 = localObject[1];
    }
    Object localObject = new StringTokenizer(paramString1, paramString2);
    while (((StringTokenizer)localObject).hasMoreTokens()) {
      localVector.addElement(((StringTokenizer)localObject).nextToken());
    }
    return localVector;
  }

  static String[] qu(String paramString)
  {
    Object localObject = null;
    if (wh.isAbsolutePath(paramString)) {
      String[] arrayOfString1 = aIk.aT(paramString);
      localObject = arrayOfString1[0];
      paramString = arrayOfString1[1];
    }
    int i = File.separatorChar;
    int j = 0;
    int k = paramString.length();
    int m = 0;
    for (int n = 0; n < k; n++) {
      if (paramString.charAt(n) == i) {
        if (n != j) {
          m++;
        }
        j = n + 1;
      }
    }
    if (k != j) {
      m++;
    }
    String[] arrayOfString2 = new String[m + (localObject == null ? 0 : 1)];

    if (localObject != null) {
      arrayOfString2[0] = localObject;
      m = 1;
    } else {
      m = 0;
    }
    j = 0;
    for (int i1 = 0; i1 < k; i1++) {
      if (paramString.charAt(i1) == i) {
        if (i1 != j) {
          String str2 = paramString.substring(j, i1);
          arrayOfString2[(m++)] = str2;
        }
        j = i1 + 1;
      }
    }
    if (k != j) {
      String str1 = paramString.substring(j);
      arrayOfString2[m] = str1;
    }
    return arrayOfString2;
  }

  public static boolean a(File paramFile1, File paramFile2, int paramInt)
  {
    if (!paramFile1.exists()) {
      return false;
    }
    if (!paramFile2.exists()) {
      return true;
    }
    if (paramFile1.lastModified() - paramInt > paramFile2.lastModified()) {
      return true;
    }
    return false;
  }

  public static boolean a(bFe parambFe1, bFe parambFe2, int paramInt)
  {
    return a(parambFe1, parambFe2, paramInt);
  }

  public static boolean a(bFe parambFe1, bFe parambFe2, long paramLong)
  {
    long l1 = parambFe1.getLastModified();
    long l2 = parambFe2.getLastModified();
    return (parambFe1.TY()) && ((l1 == 0L) || (l2 == 0L) || (l1 - paramLong > l2));
  }

  public static String qv(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString != null) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString);
      while (localStringTokenizer.hasMoreTokens()) {
        localStringBuffer.append(localStringTokenizer.nextToken());
      }
    }
    return localStringBuffer.toString();
  }

  public static boolean qw(String paramString)
  {
    return (paramString.indexOf('*') != -1) || (paramString.indexOf('?') != -1);
  }

  public static String qx(String paramString)
  {
    return new dmj(paramString).cTZ().toString();
  }
}