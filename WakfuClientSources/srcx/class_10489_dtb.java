import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.zip.CRC32;

public class dtb
{
  private static final boolean lvv = true;

  public static URL getURL(String paramString)
  {
    try
    {
      return new URL(paramString);
    } catch (MalformedURLException localMalformedURLException) {
      File localFile = new File(paramString);
      return localFile.toURI().toURL();
    }
  }

  public static byte[] ab(File paramFile) {
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    byte[] arrayOfByte = n(localFileInputStream);
    localFileInputStream.close();
    return arrayOfByte;
  }

  public static byte[] readFile(String paramString) {
    InputStream localInputStream = pT(paramString);
    byte[] arrayOfByte = n(localInputStream);
    localInputStream.close();
    return arrayOfByte;
  }

  public static byte[] X(String paramString, int paramInt) {
    InputStream localInputStream = pT(paramString);
    byte[] arrayOfByte = readStream(localInputStream, paramInt);
    localInputStream.close();
    return arrayOfByte;
  }

  public static InputStream pT(String paramString)
  {
    BufferedInputStream localBufferedInputStream;
    try {
      localBufferedInputStream = new BufferedInputStream(new URL(paramString).openStream());
    }
    catch (Exception localException)
    {
      String str1 = "file://";
      int i = paramString.indexOf("file://");
      String str2 = paramString;
      if (i >= 0) {
        str2 = paramString.substring(i + "file://".length());
      }
      File localFile = new File(str2);

      localBufferedInputStream = new BufferedInputStream(new FileInputStream(localFile));
    }

    return localBufferedInputStream;
  }

  public static int a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    int i = 0;
    int j = 0;
    do {
      i = paramInputStream.read(paramArrayOfByte, paramInt1 + j, paramInt2 - j);
      j += i;
    }while ((i != -1) && (j != paramInt2));

    return j;
  }
  public static byte[] n(InputStream paramInputStream) { int i = paramInputStream.available();
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int k;
    do { k = paramInputStream.read(arrayOfByte, j, i - j);
      j += k;
    }
    while ((k != 0) && (j != i));
    if ((!bB) && (j != i)) throw new AssertionError();

    return arrayOfByte; } 
  public static byte[] readStream(InputStream paramInputStream, int paramInt) {
    int i = Math.min(paramInt, paramInputStream.available());
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int k;
    do { k = paramInputStream.read(arrayOfByte, j, i - j);
      j += k;
    }
    while ((k != 0) && (j != i));
    if ((!bB) && (j != i)) throw new AssertionError();

    return arrayOfByte;
  }

  public static boolean pU(String paramString) {
    File localFile = new File(paramString);
    return (localFile.exists()) || (bAy.jy(paramString));
  }

  public static void dg(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      return;
    }
    if (!localFile.isFile()) {
      return;
    }
    localFile.delete();
  }

  public static void pV(String paramString) {
    R(paramString, false);
  }

  public static void R(String paramString, boolean paramBoolean) {
    File localFile1 = new File(paramString);
    if (!localFile1.exists()) {
      return;
    }
    File[] arrayOfFile1 = localFile1.listFiles();
    if (arrayOfFile1 == null) {
      return;
    }

    for (File localFile2 : arrayOfFile1) {
      if (localFile2.isDirectory())
        pV(localFile2.getPath());
      else {
        localFile2.delete();
      }
    }

    if (!paramBoolean)
      localFile1.delete();
  }

  public static String cZj()
  {
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(System.nanoTime().getBytes());
    return localCRC32.getValue();
  }

  public static void j(String paramString1, String paramString2) {
    byte[] arrayOfByte = readFile(paramString1);

    FileOutputStream localFileOutputStream = qd(paramString2);
    localFileOutputStream.write(arrayOfByte);
    localFileOutputStream.close();
  }

  public static void a(dSw paramdSw, boolean paramBoolean) {
    if (paramBoolean)
      paramdSw.writeByte((byte)1);
    else
      paramdSw.writeByte((byte)0);
  }

  public static String getName(String paramString)
  {
    int i = qc(paramString);
    return paramString.substring(i + 1);
  }

  public static String getPath(String paramString) {
    int i = qc(paramString);
    if (i == -1) {
      return "";
    }
    return paramString.substring(0, i);
  }

  public static String pW(String paramString) {
    int i = qc(paramString);
    return paramString.substring(0, i + 1);
  }

  public static String pX(String paramString) {
    int i = paramString.lastIndexOf('.');
    if (i == -1) {
      return "";
    }
    return paramString.substring(i + 1);
  }

  public static String pY(String paramString) {
    int i = qc(paramString) + 1;
    int j = paramString.lastIndexOf('.');
    if (j < 0) {
      return paramString.substring(i);
    }
    return paramString.substring(i, j);
  }

  public static String pZ(String paramString) {
    int i = paramString.lastIndexOf('.');
    if (i < 0) {
      return paramString;
    }
    return paramString.substring(0, i);
  }

  public static String qa(String paramString) {
    String str = paramString.replace('\\', '/');
    int i = str.lastIndexOf('/');
    if (i == str.length() - 1) {
      i = str.substring(0, i).lastIndexOf('/');
    }
    return str.substring(0, i);
  }

  public static String qb(String paramString) {
    String str = paramString.replace('\\', '/');
    int i = str.lastIndexOf('/');
    if (i == str.length() - 1) {
      i = str.substring(0, i).lastIndexOf('/');
      return str.substring(i + 1, str.length() - 1);
    }
    return str.substring(i + 1, str.length());
  }

  private static int qc(String paramString) {
    int i = paramString.lastIndexOf('/');
    if (i >= 0) {
      return i;
    }
    return paramString.lastIndexOf('\\');
  }

  public static FileOutputStream qd(String paramString)
  {
    File localFile1 = new File(paramString);
    File localFile2 = localFile1.getParentFile();
    if (localFile2 != null) {
      localFile2.mkdirs();
    }
    return new FileOutputStream(localFile1);
  }

  public static void c(String paramString, byte[] paramArrayOfByte)
  {
    FileOutputStream localFileOutputStream = qd(paramString);
    localFileOutputStream.write(paramArrayOfByte);
    localFileOutputStream.close();
  }

  public static boolean ac(File paramFile) {
    if (!paramFile.exists()) {
      return false;
    }

    File[] arrayOfFile1 = paramFile.listFiles();
    if (arrayOfFile1 == null) {
      return false;
    }
    for (File localFile : arrayOfFile1) {
      if (localFile.isDirectory())
        ac(localFile);
      else {
        localFile.delete();
      }
    }
    return paramFile.delete();
  }
}