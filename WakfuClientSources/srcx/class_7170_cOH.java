import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.log4j.Logger;

public class cOH
{
  private static Logger K = Logger.getLogger(cOH.class);
  private static final String kxj = ",";
  private static final String kxk = "%s_";
  private static final String kxl = "%s_%d";
  private final Properties hIu = new Properties();

  public String getString(String paramString)
  {
    String str = this.hIu.getProperty(paramString);
    if (str == null) {
      throw new bdh("Il n'existe pas de propriété: " + paramString);
    }
    return str;
  }

  public String getString(String paramString1, String paramString2) {
    String str = this.hIu.getProperty(paramString1);
    return str == null ? paramString2 : str;
  }

  public ArrayList op(String paramString)
  {
    int i = 1;
    ArrayList localArrayList = new ArrayList();
    String str = String.format("%s_%d", new Object[] { paramString, Integer.valueOf(i) });
    while (this.hIu.containsKey(str)) {
      localArrayList.add(getString(str));
      str = String.format("%s_%d", new Object[] { paramString, Integer.valueOf(++i) });
    }
    return localArrayList;
  }

  public String[] getStringArray(String paramString)
  {
    String str = getString(paramString);
    return ot(str);
  }

  public ArrayList oq(String paramString)
  {
    ArrayList localArrayList1 = op(paramString);
    ArrayList localArrayList2 = new ArrayList();
    for (String str : localArrayList1) {
      localArrayList2.add(ot(str));
    }
    return localArrayList2;
  }

  public int or(String paramString)
  {
    String str = getString(paramString);
    try {
      return Integer.parseInt(str); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new bdh("La propriété " + paramString + " n'est pas un int.");
  }

  public int S(String paramString, int paramInt)
  {
    return bUD.f(this.hIu.getProperty(paramString), paramInt);
  }

  public float getFloat(String paramString)
  {
    String str = getString(paramString);
    try {
      return Float.valueOf(str).floatValue(); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new bdh("La propriété " + paramString + " n'est pas un float.");
  }

  public float getFloat(String paramString, float paramFloat)
  {
    return bUD.e(this.hIu.getProperty(paramString), paramFloat);
  }

  public double getDouble(String paramString)
  {
    String str = getString(paramString);
    try {
      return Double.valueOf(str).doubleValue(); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new bdh("La propriété " + paramString + " n'est pas un double.");
  }

  public double getDouble(String paramString, double paramDouble)
  {
    return bUD.b(this.hIu.getProperty(paramString), paramDouble);
  }

  public boolean getBoolean(String paramString)
  {
    String str = getString(paramString);
    return Boolean.valueOf(str).booleanValue();
  }

  public boolean getBoolean(String paramString, boolean paramBoolean) {
    return bUD.getBoolean(this.hIu.getProperty(paramString), paramBoolean);
  }

  public void setString(String paramString1, String paramString2)
  {
    if (this.hIu != null)
      this.hIu.setProperty(paramString1, paramString2);
  }

  public void e(String paramString, ArrayList paramArrayList)
  {
    int i = 1;
    for (String str1 : paramArrayList) {
      String str2 = String.format("%s_%d", new Object[] { paramString, Integer.valueOf(i++) });
      setString(str2, str1);
    }
  }

  public void f(String paramString, ArrayList paramArrayList)
  {
    int i = 1;
    for (String[] arrayOfString : paramArrayList) {
      String str = String.format("%s_%d", new Object[] { paramString, Integer.valueOf(i++) });
      m(str, arrayOfString);
    }
  }

  public void m(String paramString, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfString.length; i++) {
      localStringBuilder.append(paramArrayOfString[i]);
      if (i < paramArrayOfString.length - 1) {
        localStringBuilder.append(",");
      }
    }
    setString(paramString, localStringBuilder.toString());
  }

  public void T(String paramString, int paramInt)
  {
    setString(paramString, Integer.toString(paramInt));
  }

  public void setFloat(String paramString, float paramFloat)
  {
    setString(paramString, Float.toString(paramFloat));
  }

  public void setDouble(String paramString, double paramDouble)
  {
    setString(paramString, Double.toString(paramDouble));
  }

  public void setBoolean(String paramString, boolean paramBoolean)
  {
    setString(paramString, Boolean.toString(paramBoolean));
  }

  public boolean m(InputStream paramInputStream)
  {
    try
    {
      this.hIu.load(paramInputStream);
    } catch (IOException localIOException) {
      return false;
    }
    return true;
  }

  public boolean i(URL paramURL)
  {
    try
    {
      if (paramURL != null) {
        return m(paramURL.openStream());
      }
      K.error("url nulle au load.");
      return false;
    }
    catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
    return false;
  }

  public boolean load(String paramString)
  {
    try
    {
      File localFile = new File(paramString);
      if (localFile.exists()) {
        return m(new FileInputStream(localFile));
      }
      URL localURL = getClass().getClassLoader().getResource(paramString);
      if (localURL != null) {
        return i(localURL);
      }
      K.error("Impossible de trouver le fichier de propriété " + paramString);
      return false;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return false;
  }

  public boolean save(String paramString)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramString);
      this.hIu.store(localFileOutputStream, null);
      localFileOutputStream.close();
    } catch (FileNotFoundException localFileNotFoundException) {
      return false;
    } catch (IOException localIOException) {
      return false;
    }
    return true;
  }

  public void os(String paramString)
  {
    String str1 = String.format("%s_", new Object[] { paramString });
    Enumeration localEnumeration = this.hIu.keys();
    while (localEnumeration.hasMoreElements()) {
      Object localObject = localEnumeration.nextElement();
      if ((localObject instanceof String)) {
        String str2 = (String)localObject;
        if (str2.startsWith(str1))
          this.hIu.remove(str2);
      }
    }
  }

  private String[] ot(String paramString)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    Vector localVector = new Vector();
    while (localStringTokenizer.hasMoreTokens()) {
      localVector.addElement(localStringTokenizer.nextToken());
    }
    String[] arrayOfString = new String[localVector.size()];
    localVector.copyInto(arrayOfString);
    return arrayOfString;
  }
}