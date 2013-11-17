import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Logger;

public class ciW
{
  protected static final Logger K = Logger.getLogger(ciW.class);
  public static final boolean hIn = false;
  public static final double hIo = 0.0D;
  public static final float hIp = 0.0F;
  public static final int hIq = 0;
  public static final long hIr = 0L;
  public static final String hIs = "";
  public static final String hIt = "preferenceStorePath";
  private final Properties hIu;
  private final Properties hIv;
  private boolean aQS = false;
  private String SL;
  private boolean hIw = false;

  private boolean hIx = false;

  private final ArrayList hIy = new ArrayList();
  private final ArrayList hIz = new ArrayList();

  public ciW()
  {
    this.hIv = new Properties();
    this.hIu = new Properties(this.hIv);
  }

  public ciW(String paramString) {
    this();

    String str = System.getProperty("preferenceStorePath");
    setFileName(str + "/" + paramString);
  }

  public String getFileName()
  {
    return this.SL;
  }

  public void setFileName(String paramString)
  {
    this.SL = paramString;
  }

  public boolean ckN() {
    return this.hIw;
  }

  public void hb(boolean paramBoolean) {
    this.hIw = paramBoolean;
  }

  public boolean ckO() {
    return this.hIx;
  }

  public void hc(boolean paramBoolean) {
    this.hIx = paramBoolean;
  }

  public void load()
  {
    if (this.SL == null)
      return;
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(this.SL);
      try {
        load(localFileInputStream);
      } catch (Exception localException) {
        K.info("Erreur dans le fichier de préférences " + this.SL, localException);
      } finally {
        localFileInputStream.close();
      }
    } catch (FileNotFoundException localFileNotFoundException) {
      K.info("Fichier de préférences " + this.SL + " inexistant, on le crée");
    }
  }

  private void load(InputStream paramInputStream)
  {
    try
    {
      this.hIu.load(paramInputStream);
      this.aQS = false;
      ckP();
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.info("Fichier de préférences " + this.SL + " corrompu", localIllegalArgumentException);
    }
  }

  private void ckP()
  {
    if (!this.hIz.isEmpty())
      for (int i = 0; i < this.hIz.size(); i++)
        ((djN)this.hIz.get(i)).d(this);
  }

  public void save()
  {
    if (this.SL == null) {
      throw new IOException("File name not specified");
    }
    FileOutputStream localFileOutputStream = null;
    try {
      localFileOutputStream = new FileOutputStream(this.SL);
      save(localFileOutputStream);
    } finally {
      if (localFileOutputStream != null)
        localFileOutputStream.close();
    }
  }

  public void save(OutputStream paramOutputStream)
  {
    this.hIu.store(paramOutputStream, null);
    this.aQS = false;
  }

  public int ckQ() {
    return this.hIu.size();
  }

  public String[] ckR()
  {
    ArrayList localArrayList = new ArrayList();
    Enumeration localEnumeration = this.hIv.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      localArrayList.add(localEnumeration.nextElement());
    }
    localEnumeration = this.hIu.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      Object localObject = localEnumeration.nextElement();
      if (!localArrayList.contains(localObject)) {
        localArrayList.add(localObject);
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  public void ckS()
  {
    Enumeration localEnumeration = this.hIu.propertyNames();
    this.hIu.clear();
    while (localEnumeration.hasMoreElements()) {
      Object localObject = localEnumeration.nextElement();
      this.hIu.setProperty(String.valueOf(localObject), String.valueOf(this.hIv.getProperty(String.valueOf(localObject))));
    }
    try {
      save();
    } catch (IOException localIOException) {
      K.error("Exception", localIOException);
    }
  }

  public boolean ckT()
  {
    return this.aQS;
  }

  public void a(crD paramcrD)
  {
    this.hIy.add(paramcrD);
  }

  public void b(crD paramcrD)
  {
    this.hIy.remove(paramcrD);
  }

  public void a(djN paramdjN)
  {
    this.hIz.add(paramdjN);
  }

  public void b(djN paramdjN)
  {
    this.hIz.remove(paramdjN);
  }

  public void ckU()
  {
    this.hIy.clear();
  }

  public boolean contains(String paramString)
  {
    return (this.hIu.containsKey(paramString)) || (this.hIv.containsKey(paramString));
  }

  public Enumeration ckV()
  {
    return this.hIu.keys();
  }

  public void kZ(String paramString)
  {
    Object localObject = this.hIu.remove(paramString);
    if (localObject != null) {
      a(paramString, localObject, null);
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public boolean la(String paramString)
  {
    return a(this.hIv, paramString);
  }

  public double lb(String paramString)
  {
    return b(this.hIv, paramString);
  }

  public float lc(String paramString)
  {
    return c(this.hIv, paramString);
  }

  public int ld(String paramString)
  {
    return d(this.hIv, paramString);
  }

  public long le(String paramString)
  {
    return e(this.hIv, paramString);
  }

  public String lf(String paramString)
  {
    return f(this.hIv, paramString);
  }

  public boolean lg(String paramString)
  {
    return (!this.hIu.containsKey(paramString)) && (this.hIv.containsKey(paramString));
  }

  public String getValue(String paramString)
  {
    if (this.hIu.containsKey(paramString)) {
      return this.hIu.getProperty(paramString);
    }
    if (this.hIv.containsKey(paramString)) {
      return this.hIv.getProperty(paramString);
    }
    return null;
  }

  public boolean getBoolean(String paramString)
  {
    return a(null, paramString);
  }

  public double getDouble(String paramString)
  {
    return b(null, paramString);
  }

  public float getFloat(String paramString)
  {
    return c(null, paramString);
  }

  public int getInt(String paramString)
  {
    return d(null, paramString);
  }

  public long getLong(String paramString)
  {
    return e(null, paramString);
  }

  public String getString(String paramString)
  {
    return f(null, paramString);
  }

  public void G(String paramString, boolean paramBoolean)
  {
    a(this.hIv, paramString, paramBoolean);
  }

  public void d(String paramString, double paramDouble)
  {
    a(this.hIv, paramString, paramDouble);
  }

  public void c(String paramString, float paramFloat)
  {
    a(this.hIv, paramString, paramFloat);
  }

  public void D(String paramString, int paramInt)
  {
    a(this.hIv, paramString, paramInt);
  }

  public void i(String paramString, long paramLong)
  {
    a(this.hIv, paramString, paramLong);
  }

  public void at(String paramString1, String paramString2)
  {
    a(this.hIv, paramString1, paramString2);
  }

  public void H(String paramString, boolean paramBoolean)
  {
    boolean bool = getBoolean(paramString);
    if ((bool != paramBoolean) || (!contains(paramString))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString))) {
        return;
      }
      a(this.hIu, paramString, paramBoolean);
      this.aQS = true;
      a(paramString, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean));
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void e(String paramString, double paramDouble)
  {
    double d = getDouble(paramString);
    if ((d != paramDouble) || (!contains(paramString))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString))) {
        return;
      }
      a(this.hIu, paramString, paramDouble);
      this.aQS = true;
      a(paramString, Double.valueOf(d), Double.valueOf(paramDouble));
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void d(String paramString, float paramFloat)
  {
    float f = getFloat(paramString);
    if ((f != paramFloat) || (!contains(paramString))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString))) {
        return;
      }
      a(this.hIu, paramString, paramFloat);
      this.aQS = true;
      a(paramString, Float.valueOf(f), Float.valueOf(paramFloat));
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void E(String paramString, int paramInt)
  {
    int i = getInt(paramString);
    if ((i != paramInt) || (!contains(paramString))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString))) {
        return;
      }
      a(this.hIu, paramString, paramInt);
      this.aQS = true;
      a(paramString, Integer.valueOf(i), Integer.valueOf(paramInt));
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void j(String paramString, long paramLong)
  {
    long l = getLong(paramString);
    if ((l != paramLong) || (!contains(paramString))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString))) {
        return;
      }
      a(this.hIu, paramString, paramLong);
      this.aQS = true;
      a(paramString, Long.valueOf(l), Long.valueOf(paramLong));
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void au(String paramString1, String paramString2)
  {
    String str = getString(paramString1);
    if ((str == null) || (!str.equals(paramString2)) || (!contains(paramString1))) {
      if ((this.hIx) && (!this.hIv.containsKey(paramString1))) {
        return;
      }
      a(this.hIu, paramString1, paramString2);
      this.aQS = true;
      a(paramString1, str, paramString2);
      if (this.hIw)
        try {
          save();
        }
        catch (IOException localIOException)
        {
        }
    }
  }

  public void a(String paramString, Object paramObject1, Object paramObject2)
  {
    if ((this.hIy.size() > 0) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      coN localcoN = new coN(this, paramString, paramObject1, paramObject2);
      for (int i = 0; i < this.hIy.size(); i++) {
        crD localcrD = (crD)this.hIy.get(i);
        localcrD.a(localcoN);
      }
    }
  }

  private boolean a(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return false;
    }
    return Boolean.valueOf(str).booleanValue();
  }

  private double b(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return 0.0D;
    }
    double d = 0.0D;
    try {
      d = Double.valueOf(str).doubleValue();
    } catch (NumberFormatException localNumberFormatException) {
    }
    return d;
  }

  private float c(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return 0.0F;
    }
    float f = 0.0F;
    try {
      f = Float.valueOf(str).floatValue();
    } catch (NumberFormatException localNumberFormatException) {
    }
    return f;
  }

  private int d(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return 0;
    }
    int i = 0;
    try {
      i = Integer.valueOf(str).intValue();
    } catch (NumberFormatException localNumberFormatException) {
    }
    return i;
  }

  private long e(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return 0L;
    }
    long l = 0L;
    try {
      l = Long.valueOf(str).longValue();
    } catch (NumberFormatException localNumberFormatException) {
    }
    return l;
  }

  private String f(Properties paramProperties, String paramString)
  {
    String str = paramProperties != null ? paramProperties.getProperty(paramString) : getValue(paramString);
    if (str == null) {
      return "";
    }
    return str;
  }

  private void a(Properties paramProperties, String paramString, boolean paramBoolean)
  {
    if (paramProperties != null)
      paramProperties.put(paramString, Boolean.toString(paramBoolean));
  }

  private void a(Properties paramProperties, String paramString, double paramDouble)
  {
    if (paramProperties != null)
      paramProperties.put(paramString, Double.toString(paramDouble));
  }

  private void a(Properties paramProperties, String paramString, float paramFloat)
  {
    if (paramProperties != null)
      paramProperties.put(paramString, Float.toString(paramFloat));
  }

  private void a(Properties paramProperties, String paramString, int paramInt)
  {
    if (paramProperties != null)
      paramProperties.put(paramString, Integer.toString(paramInt));
  }

  private void a(Properties paramProperties, String paramString, long paramLong)
  {
    if (paramProperties != null)
      paramProperties.put(paramString, Long.toString(paramLong));
  }

  private void a(Properties paramProperties, String paramString1, String paramString2)
  {
    if (paramProperties != null)
      paramProperties.put(paramString1, paramString2);
  }
}