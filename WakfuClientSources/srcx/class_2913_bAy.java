import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public final class bAy
{
  private static final Logger K = Logger.getLogger(bAy.class);

  public static boolean d(URL paramURL) {
    try {
      InputStream localInputStream = paramURL.openStream();
      localInputStream.close();
      return true; } catch (IOException localIOException) {
    }
    return false;
  }

  public static boolean jy(String paramString)
  {
    URL localURL;
    try {
      localURL = new URL(paramString);
    } catch (MalformedURLException localMalformedURLException) {
      return false;
    }

    return d(localURL);
  }

  public static URL c(URL paramURL, String paramString) {
    int i = 0;

    while (paramString.startsWith("../")) {
      paramString = paramString.substring(3);
      i++;
    }

    String str = paramURL.toExternalForm();
    String[] arrayOfString = dzp.c(str, '/');
    if (i > arrayOfString.length - 1) {
      K.error("Impossible de rajouter " + i + " ../ au chemin " + paramURL.toExternalForm());
      return null;
    }

    StringBuilder localStringBuilder = new StringBuilder();

    int j = e(paramURL) ? 0 : 1;
    int k = arrayOfString.length - j - i;
    if (k > 0) {
      for (int m = 0; m < k; m++) {
        localStringBuilder.append(arrayOfString[m]).append('/');
      }

    }
    else
    {
      localStringBuilder.append(paramURL.getProtocol()).append(':');
    }
    localStringBuilder.append(paramString);
    return new URL(localStringBuilder.toString());
  }

  private static boolean e(URL paramURL) {
    String str = paramURL.getFile();
    if (str == null) {
      return false;
    }
    if (paramURL.getProtocol().equals("file")) {
      File localFile = new File(str);
      if (localFile.exists()) {
        return localFile.isDirectory();
      }
      return false;
    }

    int i = str.length();
    int j = str.lastIndexOf('/');

    if ((j != -1) && (j + 1 == i)) {
      return true;
    }

    for (int k = j + 1; k < i; k++) {
      if (str.charAt(k) == '.') {
        return false;
      }
    }
    return true;
  }
}