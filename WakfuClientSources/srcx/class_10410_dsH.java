import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class dsH extends aGK
{
  protected String name;
  protected String value;
  protected File cGG;
  protected URL url;
  protected String dOz;
  protected aoo cdY;
  protected String luV;
  protected cxK ijI;
  protected String prefix;
  private FF luW;
  private Object luX;
  private boolean luY = false;
  private boolean luZ = false;
  private File bGO;
  private boolean fBQ = false;
  protected boolean lva;

  public dsH()
  {
    this(false);
  }

  protected dsH(boolean paramBoolean)
  {
    this(paramBoolean, null);
  }

  protected dsH(boolean paramBoolean, FF paramFF)
  {
    this.lva = paramBoolean;
    this.luW = paramFF;
  }

  public void setRelative(boolean paramBoolean)
  {
    this.luZ = paramBoolean;
  }

  public void d(File paramFile)
  {
    this.bGO = paramFile;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public String getName()
  {
    return this.name;
  }

  public void E(File paramFile)
  {
    if (this.luZ)
      br(paramFile);
    else
      setValue(paramFile.getAbsolutePath());
  }

  public void setValue(Object paramObject)
  {
    this.luY = true;
    br(paramObject);
  }

  private void br(Object paramObject) {
    this.luX = paramObject;

    this.value = (paramObject == null ? null : paramObject.toString());
  }

  public void setValue(String paramString)
  {
    setValue(paramString);
  }

  public void addText(String paramString)
  {
    if (!this.luY) {
      paramString = Ga().bH(paramString);
      String str = getValue();
      if (str != null) {
        paramString = str + paramString;
      }
      br(paramString);
    } else if (paramString.trim().length() > 0) {
      throw new cJ("can't combine nested text with value attribute");
    }
  }

  public String getValue()
  {
    return this.value;
  }

  public void C(File paramFile)
  {
    this.cGG = paramFile;
  }

  public File getFile()
  {
    return this.cGG;
  }

  public void l(URL paramURL)
  {
    this.url = paramURL;
  }

  public URL cZa()
  {
    return this.url;
  }

  public void setPrefix(String paramString)
  {
    this.prefix = paramString;
    if ((paramString != null) && (!paramString.endsWith(".")))
      this.prefix += ".";
  }

  public String getPrefix()
  {
    return this.prefix;
  }

  public void km(boolean paramBoolean)
  {
    this.fBQ = paramBoolean;
  }

  public boolean cZb()
  {
    return this.fBQ;
  }

  public void a(cxK paramcxK)
  {
    this.ijI = paramcxK;
  }

  public cxK cut()
  {
    return this.ijI;
  }

  public void fP(String paramString)
  {
    this.dOz = paramString;
  }

  public String cFZ()
  {
    return this.dOz;
  }

  public void pQ(String paramString)
  {
    this.luV = paramString;
  }

  public String cZc()
  {
    return this.luV;
  }

  public void h(aoo paramaoo)
  {
    if (this.cdY == null)
      this.cdY = paramaoo;
    else
      this.cdY.e(paramaoo);
  }

  public aoo aKw()
  {
    if (this.cdY == null) {
      this.cdY = new aoo(Ga());
    }
    return this.cdY.aAD();
  }

  public void b(cxK paramcxK)
  {
    aKw().a(paramcxK);
  }

  public aoo bwY()
  {
    return this.cdY;
  }

  public void kn(boolean paramBoolean)
  {
    d("DEPRECATED: Ignoring request to set user property in Property task.", 1);
  }

  public String toString()
  {
    return this.value == null ? "" : this.value;
  }

  public void execute()
  {
    if (Ga() == null) {
      throw new IllegalStateException("project has not been set");
    }

    if (this.name != null) {
      if ((this.luX == null) && (this.ijI == null)) {
        throw new cJ("You must specify value, location or refid with the name attribute", gu());
      }

    }
    else if ((this.url == null) && (this.cGG == null) && (this.dOz == null) && (this.luV == null)) {
      throw new cJ("You must specify url, file, resource or environment when not using the name attribute", gu());
    }

    if ((this.url == null) && (this.cGG == null) && (this.dOz == null) && (this.prefix != null)) {
      throw new cJ("Prefix is only valid when loading from a url, file or resource", gu());
    }

    if ((this.name != null) && (this.luX != null)) {
      if (this.luZ)
        try {
          File localFile1 = (this.luX instanceof File) ? (File)this.luX : new File(this.luX.toString());
          File localFile2 = this.bGO != null ? this.bGO : Ga().PE();
          String str = wh.i(localFile2, localFile1);
          str = str.replace('/', File.separatorChar);
          bh(this.name, str);
        } catch (Exception localException) {
          throw new cJ(localException, gu());
        }
      else {
        w(this.name, this.luX);
      }
    }

    if (this.cGG != null) {
      aa(this.cGG);
    }

    if (this.url != null) {
      m(this.url);
    }

    if (this.dOz != null) {
      pR(this.dOz);
    }

    if (this.luV != null) {
      pS(this.luV);
    }

    if ((this.name != null) && (this.ijI != null))
      try {
        bh(this.name, this.ijI.V(Ga()).toString());
      }
      catch (cJ localcJ) {
        if (this.luW != null) {
          bh(this.name, this.ijI.V(this.luW).toString());
        }
        else
          throw localcJ;
      }
  }

  protected void m(URL paramURL)
  {
    Properties localProperties = new Properties();
    d("Loading " + paramURL, 3);
    try {
      InputStream localInputStream = paramURL.openStream();
      try {
        a(localProperties, localInputStream, paramURL.getFile().endsWith(".xml"));
      } finally {
        if (localInputStream != null) {
          localInputStream.close();
        }
      }
      a(localProperties);
    } catch (IOException localIOException) {
      throw new cJ(localIOException, gu());
    }
  }

  private void a(Properties paramProperties, InputStream paramInputStream, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramProperties.loadFromXML(paramInputStream);
    }
    else
      paramProperties.load(paramInputStream);
  }

  protected void aa(File paramFile)
  {
    Properties localProperties = new Properties();
    d("Loading " + paramFile.getAbsolutePath(), 3);
    try {
      if (paramFile.exists()) {
        FileInputStream localFileInputStream = null;
        try {
          localFileInputStream = new FileInputStream(paramFile);
          a(localProperties, localFileInputStream, paramFile.getName().endsWith(".xml"));
        } finally {
          wh.c(localFileInputStream);
        }
        a(localProperties);
      } else {
        d("Unable to find property file: " + paramFile.getAbsolutePath(), 3);
      }
    }
    catch (IOException localIOException) {
      throw new cJ(localIOException, gu());
    }
  }

  protected void pR(String paramString)
  {
    Properties localProperties = new Properties();
    d("Resource Loading " + paramString, 3);
    InputStream localInputStream = null;
    Object localObject1 = null;
    int i = 0;
    try {
      if (this.cdY != null) {
        i = 1;
        localObject1 = Ga().b(this.cdY);
      } else {
        localObject1 = getClass().getClassLoader();
      }

      if (localObject1 == null)
        localInputStream = ClassLoader.getSystemResourceAsStream(paramString);
      else {
        localInputStream = ((ClassLoader)localObject1).getResourceAsStream(paramString);
      }

      if (localInputStream != null) {
        a(localProperties, localInputStream, paramString.endsWith(".xml"));
        a(localProperties);
      } else {
        d("Unable to find resource " + paramString, 1);
      }
    } catch (IOException localIOException2) {
      throw new cJ(localIOException2, gu());
    } finally {
      if (localInputStream != null)
        try {
          localInputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
      if ((i != 0) && (localObject1 != null))
        ((iA)localObject1).cleanup();
    }
  }

  protected void pS(String paramString)
  {
    Properties localProperties = new Properties();
    if (!paramString.endsWith(".")) {
      paramString = paramString + ".";
    }
    d("Loading Environment " + paramString, 3);
    Map localMap = cyL.cvE();
    for (Iterator localIterator = localMap.entrySet().iterator(); localIterator.hasNext(); ) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localProperties.put(paramString + localEntry.getKey(), localEntry.getValue());
    }
    a(localProperties);
  }

  protected void a(Properties paramProperties)
  {
    HashMap localHashMap = new HashMap(paramProperties);
    h(localHashMap);
    for (Iterator localIterator = localHashMap.keySet().iterator(); localIterator.hasNext(); ) {
      Object localObject = localIterator.next();
      if ((localObject instanceof String)) {
        String str = (String)localObject;
        if (this.prefix != null) {
          str = this.prefix + str;
        }
        w(str, localHashMap.get(localObject));
      }
    }
  }

  protected void bh(String paramString1, String paramString2)
  {
    w(paramString1, paramString2);
  }

  protected void w(String paramString, Object paramObject)
  {
    afR localafR = afR.t(Ga());
    if (this.lva) {
      if (localafR.ek(paramString) == null)
        localafR.l(paramString, paramObject);
      else
        d("Override ignored for " + paramString, 3);
    }
    else
      localafR.j(paramString, paramObject);
  }

  private void h(Map paramMap)
  {
    afR localafR = afR.t(Ga());

    new bkZ(Ga(), localafR, localafR.arj()).a(paramMap, getPrefix(), cZb());
  }
}