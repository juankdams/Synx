import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public abstract class cNX extends dIA
{
  private static final String ktO = "/antlib.xml";
  private static final ThreadLocal ktP = new aRI();
  private String name;
  private String classname;
  private File cGG;
  private String dOz;
  private boolean ktQ;
  private int format;
  private boolean ktR;
  private int ktS;
  private String ktT;
  private String ktU;
  private Class ktV;
  private Class ktW;

  public cNX()
  {
    this.ktQ = false;

    this.format = 0;
    this.ktR = false;
    this.ktS = 0;
  }

  protected void iC(boolean paramBoolean)
  {
    this.ktQ = paramBoolean;
  }

  public void a(Rz paramRz)
  {
    this.ktS = paramRz.getIndex();
  }

  public void a(aVv paramaVv)
  {
    this.format = paramaVv.getIndex();
  }

  public String getName()
  {
    return this.name;
  }

  public File getFile()
  {
    return this.cGG;
  }

  public String cFZ()
  {
    return this.dOz;
  }

  public void execute()
  {
    ClassLoader localClassLoader = din();
    Object localObject1;
    if (!this.ktR)
    {
      if (getURI() == null) {
        throw new cJ("name, file or resource attribute of " + aSI() + " is undefined", gu());
      }

      if (getURI().startsWith("antlib:"))
      {
        localObject1 = getURI();
        fP(nO((String)localObject1));
      } else {
        throw new cJ("Only antlib URIs can be located from the URI alone, not the URI '" + getURI() + "'");
      }

    }

    if (this.name != null) {
      if (this.classname == null) {
        throw new cJ("classname attribute of " + aSI() + " element " + "is undefined", gu());
      }

      a(localClassLoader, this.name, this.classname);
    } else {
      if (this.classname != null) {
        localObject1 = "You must not specify classname together with file or resource.";

        throw new cJ((String)localObject1, gu());
      }
      URL localURL;
      if (this.cGG == null) {
        localObject1 = f(localClassLoader);
      } else {
        localURL = cGa();
        if (localURL == null) {
          return;
        }
        localObject1 = Collections.enumeration(Collections.singleton(localURL));
      }

      while (((Enumeration)localObject1).hasMoreElements()) {
        localURL = (URL)((Enumeration)localObject1).nextElement();

        int i = this.format;
        if (localURL.toString().toLowerCase(Locale.ENGLISH).endsWith(".xml")) {
          i = 1;
        }

        if (i == 0) {
          a(localClassLoader, localURL);
          break;
        }
        if (((Map)ktP.get()).get(localURL) != null) {
          d("Warning: Recursive loading of " + localURL + " ignored" + " at " + gu() + " originally loaded at " + ((Map)ktP.get()).get(localURL), 1);
        }
        else
        {
          try
          {
            ((Map)ktP.get()).put(localURL, gu());
            b(localClassLoader, localURL);
          } finally {
            ((Map)ktP.get()).remove(localURL);
          }
        }
      }
    }
  }

  public static String nO(String paramString)
  {
    String str1 = paramString.substring("antlib:".length());
    String str2;
    if (str1.startsWith("//"))
    {
      str2 = str1.substring("//".length());
      if (!str2.endsWith(".xml"))
      {
        str2 = str2 + "/antlib.xml";
      }
    }
    else {
      str2 = str1.replace('.', '/') + "/antlib.xml";
    }
    return str2;
  }

  private URL cGa()
  {
    String str = null;
    if (!this.cGG.exists()) {
      str = "File " + this.cGG + " does not exist";
    }
    if ((str == null) && (!this.cGG.isFile())) {
      str = "File " + this.cGG + " is not a file";
    }
    if (str == null) {
      try {
        return wh.Fo().k(this.cGG);
      } catch (Exception localException) {
        str = "File " + this.cGG + " cannot use as URL: " + localException.toString();
      }

    }

    switch (this.ktS) {
    case 3:
      throw new cJ(str);
    case 0:
    case 1:
      d(str, 1);
      break;
    case 2:
      d(str, 3);
      break;
    }

    return null;
  }

  private Enumeration f(ClassLoader paramClassLoader) {
    Enumeration localEnumeration;
    try {
      localEnumeration = paramClassLoader.getResources(this.dOz);
    } catch (IOException localIOException) {
      throw new cJ("Could not fetch resources named " + this.dOz, localIOException, gu());
    }

    if (!localEnumeration.hasMoreElements()) {
      String str = "Could not load definitions from resource " + this.dOz + ". It could not be found.";

      switch (this.ktS) {
      case 3:
        throw new cJ(str);
      case 0:
      case 1:
        d(str, 1);
        break;
      case 2:
        d(str, 3);
        break;
      }

    }

    return localEnumeration;
  }

  protected void a(ClassLoader paramClassLoader, URL paramURL)
  {
    InputStream localInputStream = null;
    try {
      localInputStream = paramURL.openStream();
      if (localInputStream == null) {
        d("Could not load definitions from " + paramURL, 1);
      }
      else
      {
        Properties localProperties = new Properties();
        localProperties.load(localInputStream);
        Enumeration localEnumeration = localProperties.keys();
        while (localEnumeration.hasMoreElements()) {
          this.name = ((String)localEnumeration.nextElement());
          this.classname = localProperties.getProperty(this.name);
          a(paramClassLoader, this.name, this.classname);
        }
      }
    } catch (IOException localIOException) { throw new cJ(localIOException, gu());
    } finally {
      wh.c(localInputStream);
    }
  }

  private void b(ClassLoader paramClassLoader, URL paramURL)
  {
    try
    {
      aYA localaYA = aYA.a(Ga(), paramURL, getURI());
      localaYA.setClassLoader(paramClassLoader);
      localaYA.setURI(getURI());
      localaYA.execute();
    } catch (cJ localcJ) {
      throw dhB.a(localcJ, gu());
    }
  }

  public void C(File paramFile)
  {
    if (this.ktR) {
      cGb();
    }
    this.ktR = true;
    this.cGG = paramFile;
  }

  public void fP(String paramString)
  {
    if (this.ktR) {
      cGb();
    }
    this.ktR = true;
    this.dOz = paramString;
  }

  public void nP(String paramString)
  {
    if (this.ktR) {
      cGb();
    }
    if (!paramString.startsWith("antlib:")) {
      throw new cJ("Invalid antlib attribute - it must start with antlib:");
    }

    setURI(paramString);
    this.dOz = (paramString.substring("antlib:".length()).replace('.', '/') + "/antlib.xml");

    this.ktR = true;
  }

  public void setName(String paramString)
  {
    if (this.ktR) {
      cGb();
    }
    this.ktR = true;
    this.name = paramString;
  }

  public String getClassname()
  {
    return this.classname;
  }

  public void setClassname(String paramString)
  {
    this.classname = paramString;
  }

  public void nQ(String paramString)
  {
    this.ktT = paramString;
  }

  protected void S(Class paramClass)
  {
    this.ktV = paramClass;
  }

  public void nR(String paramString)
  {
    this.ktU = paramString;
  }

  protected void T(Class paramClass)
  {
    this.ktW = paramClass;
  }

  protected void a(ClassLoader paramClassLoader, String paramString1, String paramString2)
  {
    Class localClass = null;
    try {
      try {
        paramString1 = dhB.bg(getURI(), paramString1);

        if (this.ktS != 2) {
          localClass = Class.forName(paramString2, true, paramClassLoader);
        }

        if (this.ktT != null) {
          this.ktV = Class.forName(this.ktT, true, paramClassLoader);
        }

        if (this.ktU != null) {
          this.ktW = Class.forName(this.ktU, true, paramClassLoader);
        }

        dTY localdTY = new dTY();
        localdTY.setName(paramString1);
        localdTY.setClassName(paramString2);
        localdTY.R(localClass);
        localdTY.S(this.ktV);
        localdTY.T(this.ktW);
        localdTY.iC(this.ktQ);
        localdTY.setClassLoader(paramClassLoader);
        if (localClass != null) {
          localdTY.L(Ga());
        }
        aXW.v(Ga()).a(localdTY);
      }
      catch (ClassNotFoundException localClassNotFoundException) {
        str = aSI() + " class " + paramString2 + " cannot be found" + "\n using the classloader " + paramClassLoader;

        throw new cJ(str, localClassNotFoundException, gu());
      } catch (NoClassDefFoundError localNoClassDefFoundError) {
        String str = aSI() + " A class needed by class " + paramString2 + " cannot be found: " + localNoClassDefFoundError.getMessage() + "\n using the classloader " + paramClassLoader;

        throw new cJ(str, localNoClassDefFoundError, gu());
      }
    } catch (cJ localcJ) {
      switch (this.ktS) {
      case 0:
      case 3:
        throw localcJ;
      case 1:
      case 2: }  } d(localcJ.gu() + "Warning: " + localcJ.getMessage(), 1);

    return;

    d(localcJ.gu() + localcJ.getMessage(), 4);
  }

  private void cGb()
  {
    throw new cJ("Only one of the attributes name, file and resource can be set", gu());
  }
}