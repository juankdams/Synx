import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.jar.JarFile;

public class wh
{
  private static final int blg = 10;
  private static final int blh = 50;
  private static final wh bli = new wh();

  private static Random blj = new Random(System.currentTimeMillis() + Runtime.getRuntime().freeMemory());

  private static final boolean blk = aCt.gd("netware");
  private static final boolean bll = aCt.gd("dos");
  private static final boolean blm = aCt.gd("win9x");
  private static final boolean bln = aCt.gd("windows");
  static final int BUF_SIZE = 8192;
  public static final long blo = 2000L;
  public static final long blp = 1000L;
  public static final long blq = 1L;
  private Object blr = new Object();
  private String bls = null;
  private String blt = null;
  private static final String blu = "null";

  public static wh Fn()
  {
    return new wh();
  }

  public static wh Fo()
  {
    return bli;
  }

  public URL k(File paramFile)
  {
    return new URL(paramFile.toURI().toASCIIString());
  }

  public void j(String paramString1, String paramString2)
  {
    a(new File(paramString1), new File(paramString2), null, false, false);
  }

  public void a(String paramString1, String paramString2, btc parambtc)
  {
    a(new File(paramString1), new File(paramString2), parambtc, false, false);
  }

  public void a(String paramString1, String paramString2, btc parambtc, boolean paramBoolean)
  {
    a(new File(paramString1), new File(paramString2), parambtc, paramBoolean, false);
  }

  public void a(String paramString1, String paramString2, btc parambtc, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(new File(paramString1), new File(paramString2), parambtc, paramBoolean1, paramBoolean2);
  }

  public void a(String paramString1, String paramString2, btc parambtc, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    a(new File(paramString1), new File(paramString2), parambtc, paramBoolean1, paramBoolean2, paramString3);
  }

  public void a(String paramString1, String paramString2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, String paramString3, FF paramFF)
  {
    a(new File(paramString1), new File(paramString2), parambtc, paramVector, paramBoolean1, paramBoolean2, paramString3, paramFF);
  }

  public void a(String paramString1, String paramString2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, String paramString3, String paramString4, FF paramFF)
  {
    a(new File(paramString1), new File(paramString2), parambtc, paramVector, paramBoolean1, paramBoolean2, paramString3, paramString4, paramFF);
  }

  public void a(File paramFile1, File paramFile2)
  {
    a(paramFile1, paramFile2, null, false, false);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc)
  {
    a(paramFile1, paramFile2, parambtc, false, false);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, boolean paramBoolean)
  {
    a(paramFile1, paramFile2, parambtc, paramBoolean, false);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramFile1, paramFile2, parambtc, paramBoolean1, paramBoolean2, null);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    a(paramFile1, paramFile2, parambtc, null, paramBoolean1, paramBoolean2, paramString, null);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, String paramString, FF paramFF)
  {
    a(paramFile1, paramFile2, parambtc, paramVector, paramBoolean1, paramBoolean2, paramString, paramString, paramFF);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, FF paramFF)
  {
    a(paramFile1, paramFile2, parambtc, paramVector, paramBoolean1, paramBoolean2, false, paramString1, paramString2, paramFF);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, FF paramFF)
  {
    a(paramFile1, paramFile2, parambtc, paramVector, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, paramFF, false);
  }

  public void a(File paramFile1, File paramFile2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, FF paramFF, boolean paramBoolean4)
  {
    btC.a(new WO(paramFile1), new WO(paramFile2), parambtc, paramVector, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, paramFF, paramBoolean4);
  }

  public void a(File paramFile, long paramLong)
  {
    btC.a(new WO(paramFile), paramLong);
  }

  public File e(File paramFile, String paramString)
  {
    if (!isAbsolutePath(paramString)) {
      char c = File.separatorChar;
      paramString = paramString.replace('/', c).replace('\\', c);
      if (aQ(paramString)) {
        paramFile = null;

        String str = System.getProperty("user.dir");
        if ((paramString.charAt(0) == c) && (str.charAt(0) == c)) {
          paramString = aT(str)[0] + paramString.substring(1);
        }
      }
      paramString = new File(paramFile, paramString).getAbsolutePath();
    }
    return aS(paramString);
  }

  public static boolean aQ(String paramString)
  {
    if (((!bll) && (!blk)) || (paramString.length() == 0)) {
      return false;
    }
    char c1 = File.separatorChar;
    paramString = paramString.replace('/', c1).replace('\\', c1);
    char c2 = paramString.charAt(0);
    int i = paramString.length();
    return ((c2 == c1) && ((i == 1) || (paramString.charAt(1) != c1))) || ((Character.isLetter(c2)) && (i > 1) && (paramString.indexOf(':') == 1) && ((i == 2) || (paramString.charAt(2) != c1)));
  }

  public static boolean isAbsolutePath(String paramString)
  {
    int i = paramString.length();
    if (i == 0) {
      return false;
    }
    char c1 = File.separatorChar;
    paramString = paramString.replace('/', c1).replace('\\', c1);
    char c2 = paramString.charAt(0);
    if ((!bll) && (!blk)) {
      return c2 == c1;
    }
    if (c2 == c1)
    {
      if ((!bll) || (i <= 4) || (paramString.charAt(1) != c1)) {
        return false;
      }

      j = paramString.indexOf(c1, 2);
      return (j > 2) && (j + 1 < i);
    }
    int j = paramString.indexOf(':');
    return ((Character.isLetter(c2)) && (j == 1) && (paramString.length() > 2) && (paramString.charAt(2) == c1)) || ((blk) && (j > 0));
  }

  public static String aR(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramString.length() + 50);
    dGZ localdGZ = new dGZ(paramString);
    while (localdGZ.hasMoreTokens()) {
      String str = localdGZ.nextToken();
      str = str.replace('/', File.separatorChar);
      str = str.replace('\\', File.separatorChar);
      if (localStringBuffer.length() != 0) {
        localStringBuffer.append(File.pathSeparatorChar);
      }
      localStringBuffer.append(str);
    }
    return localStringBuffer.toString();
  }

  public File aS(String paramString)
  {
    Stack localStack = new Stack();
    String[] arrayOfString = aT(paramString);
    localStack.push(arrayOfString[0]);

    StringTokenizer localStringTokenizer = new StringTokenizer(arrayOfString[1], File.separator);
    while (localStringTokenizer.hasMoreTokens()) {
      localObject = localStringTokenizer.nextToken();
      if (!".".equals(localObject))
      {
        if ("..".equals(localObject)) {
          if (localStack.size() < 2)
          {
            return new File(paramString);
          }
          localStack.pop();
        } else {
          localStack.push(localObject);
        }
      }
    }
    Object localObject = new StringBuffer();
    int i = localStack.size();
    for (int j = 0; j < i; j++) {
      if (j > 1)
      {
        ((StringBuffer)localObject).append(File.separatorChar);
      }
      ((StringBuffer)localObject).append(localStack.elementAt(j));
    }
    return new File(((StringBuffer)localObject).toString());
  }

  public String[] aT(String paramString)
  {
    char c = File.separatorChar;
    paramString = paramString.replace('/', c).replace('\\', c);

    if (!isAbsolutePath(paramString)) {
      throw new cJ(paramString + " is not an absolute path");
    }
    String str = null;
    int i = paramString.indexOf(':');
    int j;
    if ((i > 0) && ((bll) || (blk)))
    {
      j = i + 1;
      str = paramString.substring(0, j);
      char[] arrayOfChar = paramString.toCharArray();
      str = str + c;

      j = arrayOfChar[j] == c ? j + 1 : j;

      StringBuffer localStringBuffer = new StringBuffer();

      for (int k = j; k < arrayOfChar.length; k++) {
        if ((arrayOfChar[k] != c) || (arrayOfChar[(k - 1)] != c)) {
          localStringBuffer.append(arrayOfChar[k]);
        }
      }
      paramString = localStringBuffer.toString();
    } else if ((paramString.length() > 1) && (paramString.charAt(1) == c))
    {
      j = paramString.indexOf(c, 2);
      j = paramString.indexOf(c, j + 1);
      str = j > 2 ? paramString.substring(0, j + 1) : paramString;
      paramString = paramString.substring(str.length());
    } else {
      str = File.separator;
      paramString = paramString.substring(1);
    }
    return new String[] { str, paramString };
  }

  public String l(File paramFile)
  {
    String str2 = aS(paramFile.getAbsolutePath()).getPath();
    String str3 = paramFile.getName();
    int i = str2.charAt(0) == File.separatorChar ? 1 : 0;

    int j = (paramFile.isDirectory()) && (!str3.regionMatches(true, str3.length() - 4, ".DIR", 0, 4)) ? 1 : 0;

    String str4 = null;
    StringBuffer localStringBuffer = null;
    String str5 = null;

    int k = 0;

    if (i != 0) {
      k = str2.indexOf(File.separatorChar, 1);
      if (k == -1) {
        return str2.substring(1) + ":[000000]";
      }
      str4 = str2.substring(1, k++);
    }
    if (j != 0) {
      localStringBuffer = new StringBuffer(str2.substring(k).replace(File.separatorChar, '.'));
    } else {
      int m = str2.lastIndexOf(File.separatorChar, str2.length());
      if ((m == -1) || (m < k)) {
        str5 = str2.substring(k);
      } else {
        localStringBuffer = new StringBuffer(str2.substring(k, m).replace(File.separatorChar, '.'));

        k = m + 1;
        if (str2.length() > k) {
          str5 = str2.substring(k);
        }
      }
    }
    if ((i == 0) && (localStringBuffer != null)) {
      localStringBuffer.insert(0, '.');
    }
    String str1 = (str4 != null ? str4 + ":" : "") + (localStringBuffer != null ? "[" + localStringBuffer + "]" : "") + (str5 != null ? str5 : "");

    return str1;
  }

  public File createTempFile(String paramString1, String paramString2, File paramFile)
  {
    return a(paramString1, paramString2, paramFile, false, false);
  }

  public File a(String paramString1, String paramString2, File paramFile, boolean paramBoolean1, boolean paramBoolean2)
  {
    File localFile = null;
    String str = paramFile == null ? System.getProperty("java.io.tmpdir") : paramFile.getPath();

    if (paramString1 == null) {
      paramString1 = "null";
    }
    if (paramString2 == null) {
      paramString2 = "null";
    }

    if (paramBoolean2) {
      try {
        localFile = File.createTempFile(paramString1, paramString2, new File(str));
      } catch (IOException localIOException) {
        throw new cJ("Could not create tempfile in " + str, localIOException);
      }
    }
    else {
      DecimalFormat localDecimalFormat = new DecimalFormat("#####");
      synchronized (blj) {
        do {
          localFile = new File(str, paramString1 + localDecimalFormat.format(blj.nextInt(2147483647)) + paramString2);
        }
        while (localFile.exists());
      }
    }

    if (paramBoolean1) {
      localFile.deleteOnExit();
    }
    return localFile;
  }

  public File a(String paramString1, String paramString2, File paramFile, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramFile, paramBoolean, false);
  }

  public boolean b(File paramFile1, File paramFile2)
  {
    return a(paramFile1, paramFile2, false);
  }

  public boolean a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    return btC.a(new WO(paramFile1), new WO(paramFile2), paramBoolean);
  }

  public File m(File paramFile)
  {
    return paramFile == null ? null : paramFile.getParentFile();
  }

  public static String c(Reader paramReader)
  {
    return a(paramReader, 8192);
  }

  public static String a(Reader paramReader, int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Buffer size must be greater than 0");
    }

    char[] arrayOfChar = new char[paramInt];
    int i = 0;
    Object localObject = null;
    while (i != -1) {
      i = paramReader.read(arrayOfChar);
      if (i > 0) {
        localObject = localObject == null ? new StringBuffer() : localObject;
        localObject.append(new String(arrayOfChar, 0, i));
      }
    }
    return localObject == null ? null : localObject.toString();
  }

  public static String d(Reader paramReader)
  {
    String str = c(paramReader);
    return str == null ? "" : str;
  }

  public boolean n(File paramFile)
  {
    return paramFile.createNewFile();
  }

  public boolean a(File paramFile, boolean paramBoolean)
  {
    File localFile = paramFile.getParentFile();
    if ((paramBoolean) && (!localFile.exists())) {
      localFile.mkdirs();
    }
    return paramFile.createNewFile();
  }

  public boolean f(File paramFile, String paramString)
  {
    dtA localdtA = dtA.cZN();
    if (paramFile == null) {
      return localdtA.qg(paramString);
    }
    return localdtA.f(paramFile, paramString);
  }

  public String c(File paramFile1, File paramFile2)
  {
    String str1 = aS(paramFile1.getAbsolutePath()).getAbsolutePath();
    String str2 = aS(paramFile2.getAbsolutePath()).getAbsolutePath();
    if (str1.equals(str2)) {
      return "";
    }

    if (!str1.endsWith(File.separator)) {
      str1 = str1 + File.separator;
    }
    return str2.startsWith(str1) ? str2.substring(str1.length()) : str2;
  }

  public boolean d(File paramFile1, File paramFile2)
  {
    String str1 = aS(paramFile1.getAbsolutePath()).getAbsolutePath();
    String str2 = aS(paramFile2.getAbsolutePath()).getAbsolutePath();
    if (str1.equals(str2)) {
      return true;
    }

    if (!str1.endsWith(File.separator)) {
      str1 = str1 + File.separator;
    }
    return str2.startsWith(str1);
  }

  public String aU(String paramString)
  {
    return new File(paramString).toURI().toASCIIString();
  }

  public String aV(String paramString)
  {
    synchronized (this.blr) {
      if (paramString.equals(this.bls)) {
        return this.blt;
      }
      String str1 = djy.aV(paramString);
      String str2 = isAbsolutePath(str1) ? aS(str1).getAbsolutePath() : str1;
      this.bls = paramString;
      this.blt = str2;
      return str2;
    }
  }

  public boolean e(File paramFile1, File paramFile2)
  {
    return aS(paramFile1.getAbsolutePath()).getAbsolutePath().equals(aS(paramFile2.getAbsolutePath()).getAbsolutePath());
  }

  public boolean f(File paramFile1, File paramFile2)
  {
    if ((paramFile1 == null) && (paramFile2 == null)) {
      return true;
    }
    if ((paramFile1 == null) || (paramFile2 == null)) {
      return false;
    }
    File localFile1 = aS(paramFile1.getAbsolutePath());
    File localFile2 = aS(paramFile2.getAbsolutePath());
    return (localFile1.equals(localFile2)) || (localFile1.getCanonicalFile().equals(localFile2.getCanonicalFile()));
  }

  public void g(File paramFile1, File paramFile2)
  {
    paramFile1 = aS(paramFile1.getAbsolutePath()).getCanonicalFile();
    paramFile2 = aS(paramFile2.getAbsolutePath());
    if (!paramFile1.exists()) {
      System.err.println("Cannot rename nonexistent file " + paramFile1);
      return;
    }
    if (paramFile1.getAbsolutePath().equals(paramFile2.getAbsolutePath())) {
      System.err.println("Rename of " + paramFile1 + " to " + paramFile2 + " is a no-op.");
      return;
    }
    if ((paramFile2.exists()) && (!f(paramFile1, paramFile2)) && (!q(paramFile2))) {
      throw new IOException("Failed to delete " + paramFile2 + " while trying to rename " + paramFile1);
    }
    File localFile = paramFile2.getParentFile();
    if ((localFile != null) && (!localFile.exists()) && (!localFile.mkdirs())) {
      throw new IOException("Failed to create directory " + localFile + " while trying to rename " + paramFile1);
    }

    if (!paramFile1.renameTo(paramFile2)) {
      a(paramFile1, paramFile2);
      if (!q(paramFile1))
        throw new IOException("Failed to delete " + paramFile1 + " while trying to rename it.");
    }
  }

  public long Fp()
  {
    if (blm) {
      return 2000L;
    }
    if (bln) {
      return 1L;
    }
    if (bll) {
      return 2000L;
    }
    return 1000L;
  }

  public boolean o(File paramFile)
  {
    paramFile = aS(paramFile.getAbsolutePath());
    if (!paramFile.exists()) {
      return false;
    }
    String str = paramFile.getName();
    dss localdss = new dss(this, str);

    String[] arrayOfString = paramFile.getParentFile().list(localdss);
    return (arrayOfString != null) && (arrayOfString.length == 1);
  }

  public boolean a(File paramFile1, File paramFile2, long paramLong)
  {
    if (!paramFile2.exists())
    {
      return false;
    }
    long l1 = paramFile1.lastModified();
    long l2 = paramFile2.lastModified();
    return a(l1, l2, paramLong);
  }

  public boolean h(File paramFile1, File paramFile2)
  {
    return a(paramFile1, paramFile2, Fp());
  }

  public boolean a(long paramLong1, long paramLong2, long paramLong3)
  {
    return (paramLong2 != -1L) && (paramLong2 >= paramLong1 + paramLong3);
  }

  public boolean e(long paramLong1, long paramLong2)
  {
    return a(paramLong1, paramLong2, Fp());
  }

  public static void a(Writer paramWriter)
  {
    if (null != paramWriter)
      try {
        paramWriter.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void e(Reader paramReader)
  {
    if (null != paramReader)
      try {
        paramReader.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void b(OutputStream paramOutputStream)
  {
    if (null != paramOutputStream)
      try {
        paramOutputStream.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void c(InputStream paramInputStream)
  {
    if (null != paramInputStream)
      try {
        paramInputStream.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void a(Channel paramChannel)
  {
    if (null != paramChannel)
      try {
        paramChannel.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void a(URLConnection paramURLConnection)
  {
    if (paramURLConnection != null)
      try {
        if ((paramURLConnection instanceof JarURLConnection)) {
          JarURLConnection localJarURLConnection = (JarURLConnection)paramURLConnection;
          JarFile localJarFile = localJarURLConnection.getJarFile();
          localJarFile.close();
          localJarFile = null;
        } else if ((paramURLConnection instanceof HttpURLConnection)) {
          ((HttpURLConnection)paramURLConnection).disconnect();
        }
      }
      catch (IOException localIOException)
      {
      }
  }

  public static void p(File paramFile)
  {
    if (paramFile != null)
      paramFile.delete();
  }

  public boolean q(File paramFile)
  {
    return b(paramFile, bln);
  }

  public boolean b(File paramFile, boolean paramBoolean)
  {
    if (!paramFile.delete()) {
      if (paramBoolean)
        System.gc();
      try
      {
        Thread.sleep(10L);
      }
      catch (InterruptedException localInterruptedException) {
      }
      return paramFile.delete();
    }
    return true;
  }

  public static String i(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getCanonicalPath();
    String str2 = paramFile2.getCanonicalPath();

    String[] arrayOfString1 = aW(str1);
    String[] arrayOfString2 = aW(str2);

    if ((0 < arrayOfString2.length) && (0 < arrayOfString1.length)) {
      if (!arrayOfString1[0].equals(arrayOfString2[0]))
      {
        return c(Arrays.asList(arrayOfString2));
      }
    }
    else {
      return c(Arrays.asList(arrayOfString2));
    }

    int i = Math.min(arrayOfString1.length, arrayOfString2.length);
    int j = 1;

    while ((j < i) && (arrayOfString1[j].equals(arrayOfString2[j]))) {
      j++;
    }

    ArrayList localArrayList = new ArrayList();

    for (int k = j; k < arrayOfString1.length; k++) {
      localArrayList.add("..");
    }

    for (k = j; k < arrayOfString2.length; k++) {
      localArrayList.add(arrayOfString2[k]);
    }

    return c(localArrayList);
  }

  public static String[] aW(String paramString)
  {
    String str = paramString.replace(File.separatorChar, '/');

    return str.split("/");
  }

  public static String c(List paramList)
  {
    return a(paramList, '/');
  }

  public static String a(List paramList, char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer();

    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext()) {
      localStringBuffer.append(localIterator.next());
    }
    while (localIterator.hasNext()) {
      localStringBuffer.append(paramChar);
      localStringBuffer.append(localIterator.next());
    }
    return localStringBuffer.toString();
  }

  public String Fq()
  {
    InputStreamReader localInputStreamReader = new InputStreamReader(new dsm(this));
    try
    {
      return localInputStreamReader.getEncoding();
    } finally {
      e(localInputStreamReader);
    }
  }
}