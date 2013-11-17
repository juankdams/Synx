import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Locale;

public final class djy
{
  private static final int hVq = 4;
  private static final int lgv = 15;
  private static final int lgw = 128;
  private static final int BYTE_SIZE = 256;
  private static final int WORD = 16;
  private static final int SPACE = 32;
  private static final int lgx = 127;
  public static final String URI_ENCODING = "UTF-8";
  private static boolean[] lgy = new boolean[''];

  private static char[] lgz = new char[''];

  private static char[] lgA = new char[''];
  private static char[] lgB = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
  public static final String lgC = "Can only handle valid file: URIs, not ";
  static Class lgD;

  public static File ak(Class paramClass)
  {
    String str = paramClass.getName().replace('.', '/') + ".class";
    return b(paramClass.getClassLoader(), str);
  }

  public static File b(ClassLoader paramClassLoader, String paramString)
  {
    if (paramClassLoader == null) {
      paramClassLoader = (lgD == null ? (djy.lgD = cd("djy")) : lgD).getClassLoader();
    }
    URL localURL = null;
    if (paramClassLoader == null)
      localURL = ClassLoader.getSystemResource(paramString);
    else {
      localURL = paramClassLoader.getResource(paramString);
    }
    if (localURL != null) {
      String str1 = localURL.toString();
      try {
        if (str1.startsWith("jar:file:"))
          return new File(pn(str1));
        if (str1.startsWith("file:")) {
          int i = str1.indexOf(paramString);
          String str2 = str1.substring(0, i);
          return new File(aV(str2));
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException) {
        return null;
      }
    }
    return null;
  }

  public static String aV(String paramString)
  {
    return pm(paramString);
  }

  private static String pm(String paramString)
  {
    URL localURL = null;
    try {
      localURL = new URL(paramString);
    }
    catch (MalformedURLException localMalformedURLException) {
    }
    if ((localURL == null) || (!"file".equals(localURL.getProtocol()))) {
      throw new IllegalArgumentException("Can only handle valid file: URIs, not " + paramString);
    }
    StringBuffer localStringBuffer = new StringBuffer(localURL.getHost());
    if (localStringBuffer.length() > 0) {
      localStringBuffer.insert(0, File.separatorChar).insert(0, File.separatorChar);
    }
    String str1 = localURL.getFile();
    int i = str1.indexOf('?');
    localStringBuffer.append(i < 0 ? str1 : str1.substring(0, i));

    paramString = localStringBuffer.toString().replace('/', File.separatorChar);

    if ((File.pathSeparatorChar == ';') && (paramString.startsWith("\\")) && (paramString.length() > 2) && (Character.isLetter(paramString.charAt(1))) && (paramString.lastIndexOf(':') > -1))
    {
      paramString = paramString.substring(1);
    }
    String str2 = null;
    try {
      str2 = po(paramString);

      String str3 = System.getProperty("user.dir");
      int j = str3.indexOf(':');
      boolean bool1 = str2.startsWith(File.separator);
      boolean bool2 = str2.startsWith("" + File.separator + File.separator);
      if ((j > 0) && (bool1) && (!bool2)) {
        str2 = str3.substring(0, j + 1) + str2;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new IllegalStateException("Could not convert URI " + paramString + " to path: " + localUnsupportedEncodingException.getMessage());
    }

    return str2;
  }

  public static String pn(String paramString)
  {
    int i = paramString.indexOf('!');
    String str = paramString.substring("jar:".length(), i);
    return aV(str);
  }

  public static String po(String paramString)
  {
    if (paramString.indexOf('%') == -1) {
      return paramString;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramString.length());
    StringCharacterIterator localStringCharacterIterator = new StringCharacterIterator(paramString);
    for (int i = localStringCharacterIterator.first(); i != 65535; 
      i = localStringCharacterIterator.next()) {
      if (i == 37) {
        int j = localStringCharacterIterator.next();
        if (j != 65535) {
          int k = Character.digit(j, 16);
          int m = localStringCharacterIterator.next();
          if (m != 65535) {
            int n = Character.digit(m, 16);
            localByteArrayOutputStream.write((char)((k << 4) + n));
          }
        }
      } else {
        localByteArrayOutputStream.write(i);
      }
    }
    return localByteArrayOutputStream.toString("UTF-8");
  }

  public static String pp(String paramString)
  {
    int i = 0;
    int j = paramString.length();
    int k = 0;
    StringBuffer localStringBuffer = null;
    for (; i < j; i++) {
      k = paramString.charAt(i);

      if (k >= 128) {
        break;
      }
      if (lgy[k] != 0) {
        if (localStringBuffer == null) {
          localStringBuffer = new StringBuffer(paramString.substring(0, i));
        }
        localStringBuffer.append('%');
        localStringBuffer.append(lgz[k]);
        localStringBuffer.append(lgA[k]);
      }
      else if (localStringBuffer != null) {
        localStringBuffer.append((char)k);
      }

    }

    if (i < j) {
      if (localStringBuffer == null) {
        localStringBuffer = new StringBuffer(paramString.substring(0, i));
      }

      byte[] arrayOfByte = null;

      arrayOfByte = paramString.substring(i).getBytes("UTF-8");
      j = arrayOfByte.length;

      for (i = 0; i < j; i++) {
        int m = arrayOfByte[i];

        if (m < 0) {
          k = m + 256;
          localStringBuffer.append('%');
          localStringBuffer.append(lgB[(k >> 4)]);
          localStringBuffer.append(lgB[(k & 0xF)]);
        } else if (lgy[m] != 0) {
          localStringBuffer.append('%');
          localStringBuffer.append(lgz[m]);
          localStringBuffer.append(lgA[m]);
        } else {
          localStringBuffer.append((char)m);
        }
      }
    }
    return localStringBuffer == null ? paramString : localStringBuffer.toString();
  }

  public static URL X(File paramFile)
  {
    try
    {
      return new URL(pp(paramFile.toURL().toString()));
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new MalformedURLException(localUnsupportedEncodingException.toString());
    }
  }

  public static File cSu()
  {
    int i = 0;
    try
    {
      Class.forName("com.sun.tools.javac.Main");
      i = 1;
    } catch (Exception localException1) {
      try {
        Class.forName("sun.tools.javac.Main");
        i = 1;
      }
      catch (Exception localException2) {
      }
    }
    if (i != 0) {
      return null;
    }

    String str1 = File.separator + "lib" + File.separator + "tools.jar";

    String str2 = System.getProperty("java.home");
    File localFile = new File(str2 + str1);
    if (localFile.exists())
    {
      return localFile;
    }
    if (str2.toLowerCase(Locale.US).endsWith(File.separator + "jre")) {
      str2 = str2.substring(0, str2.length() - "/jre".length());

      localFile = new File(str2 + str1);
    }
    if (!localFile.exists()) {
      System.out.println("Unable to locate tools.jar. Expected to find it in " + localFile.getPath());

      return null;
    }
    return localFile;
  }

  public static URL[] Y(File paramFile)
  {
    return b(paramFile, new String[] { ".jar" });
  }

  public static URL[] b(File paramFile, String[] paramArrayOfString)
  {
    URL[] arrayOfURL = new URL[0];

    if (!paramFile.exists()) {
      return arrayOfURL;
    }
    if (!paramFile.isDirectory()) {
      arrayOfURL = new URL[1];
      localObject = paramFile.getPath();
      String str = ((String)localObject).toLowerCase(Locale.US);
      for (int j = 0; j < paramArrayOfString.length; j++) {
        if (str.endsWith(paramArrayOfString[j])) {
          arrayOfURL[0] = X(paramFile);
          break;
        }
      }
      return arrayOfURL;
    }
    Object localObject = paramFile.listFiles(new bDu(paramArrayOfString));

    arrayOfURL = new URL[localObject.length];
    for (int i = 0; i < localObject.length; i++) {
      arrayOfURL[i] = X(localObject[i]);
    }
    return arrayOfURL;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError(localClassNotFoundException.getMessage()); }

  }

  static
  {
    for (int i = 0; i < 32; i++) {
      lgy[i] = true;
      lgz[i] = lgB[(i >> 4)];
      lgA[i] = lgB[(i & 0xF)];
    }
    lgy[127] = true;
    lgz[127] = '7';
    lgA[127] = 'F';
    char[] arrayOfChar = { ' ', '<', '>', '#', '%', '"', '{', '}', '|', '\\', '^', '~', '[', ']', '`' };

    int j = arrayOfChar.length;

    for (int m = 0; m < j; m++) {
      int k = arrayOfChar[m];
      lgy[k] = true;
      lgz[k] = lgB[(k >> 4)];
      lgA[k] = lgB[(k & 0xF)];
    }
  }
}