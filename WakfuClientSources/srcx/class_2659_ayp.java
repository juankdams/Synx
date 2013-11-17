import java.io.File;

public class ayp extends aGK
  implements cjq
{
  private static final wh aIk = wh.Fo();
  private String Ru;
  private String classname;
  private String filename;
  private File cGG;
  private aoo dOy;
  private String dOz;
  private oX dOA;
  private aoo cdY;
  private iA dOB;
  private Object value;
  private boolean dOC;
  private boolean dOD;
  private boolean dOE;

  public ayp()
  {
    this.value = "true";
    this.dOC = false;
    this.dOD = false;
    this.dOE = false;
  }

  public void cZ(boolean paramBoolean)
  {
    this.dOE = paramBoolean;
  }

  public void h(aoo paramaoo)
  {
    aKw().e(paramaoo);
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

  public void i(aoo paramaoo)
  {
    aKx().e(paramaoo);
  }

  public aoo aKx()
  {
    if (this.dOy == null) {
      this.dOy = new aoo(Ga());
    }
    return this.dOy.aAD();
  }

  public void w(String paramString)
  {
    this.Ru = paramString;
  }

  public void setValue(Object paramObject)
  {
    this.value = paramObject;
  }

  public void setValue(String paramString)
  {
    setValue(paramString);
  }

  public void setClassname(String paramString)
  {
    if (!"".equals(paramString))
      this.classname = paramString;
  }

  public void C(File paramFile)
  {
    this.cGG = paramFile;
    this.filename = aIk.c(Ga().PE(), paramFile);
  }

  public void fP(String paramString)
  {
    this.dOz = paramString;
  }

  public void setType(String paramString)
  {
    d("DEPRECATED - The setType(String) method has been deprecated. Use setType(Available.FileDir) instead.", 1);

    this.dOA = new oX();
    this.dOA.setValue(paramString);
  }

  public void a(oX paramoX)
  {
    this.dOA = paramoX;
  }

  public void da(boolean paramBoolean)
  {
    this.dOD = paramBoolean;
  }

  public void execute()
  {
    if (this.Ru == null) {
      throw new cJ("property attribute is required", gu());
    }

    this.dOC = true;
    try {
      if (gh()) {
        afR localafR = afR.t(Ga());
        Object localObject1 = localafR.getProperty(this.Ru);
        if ((null != localObject1) && (!localObject1.equals(this.value))) {
          d("DEPRECATED - <available> used to override an existing property." + bof.LINE_SEP + "  Build file should not reuse the same property" + " name for different values.", 1);
        }

        localafR.b(this.Ru, this.value, true);
      }
    } finally {
      this.dOC = false;
    }
  }

  public boolean gh()
  {
    try
    {
      if ((this.classname == null) && (this.cGG == null) && (this.dOz == null)) {
        throw new cJ("At least one of (classname|file|resource) is required", gu());
      }

      if ((this.dOA != null) && 
        (this.cGG == null)) {
        throw new cJ("The type attribute is only valid when specifying the file attribute.", gu());
      }

      if (this.cdY != null) {
        this.cdY.b(Ga());
        this.dOB = Ga().b(this.cdY);
      }
      String str = "";
      if (this.dOC)
        str = " to set property " + this.Ru;
      else {
        dt("available");
      }
      if ((this.classname != null) && (!fR(this.classname))) {
        d("Unable to load class " + this.classname + str, 3);

        return false;
      }
      if ((this.cGG != null) && (!aKy())) {
        StringBuffer localStringBuffer = new StringBuffer("Unable to find ");
        if (this.dOA != null) {
          localStringBuffer.append(this.dOA).append(' ');
        }
        localStringBuffer.append(this.filename).append(str);
        d(localStringBuffer.toString(), 3);
        return false;
      }
      if ((this.dOz != null) && (!fQ(this.dOz))) {
        d("Unable to load resource " + this.dOz + str, 3);

        return false;
      }
    } finally {
      if (this.dOB != null) {
        this.dOB.cleanup();
        this.dOB = null;
      }
      if (!this.dOC) {
        dt(null);
      }
    }
    return true;
  }

  private boolean aKy()
  {
    if (this.dOy == null) {
      return g(this.cGG, this.filename);
    }
    String[] arrayOfString = this.dOy.list();
    for (int i = 0; i < arrayOfString.length; i++) {
      d("Searching " + arrayOfString[i], 3);
      File localFile1 = new File(arrayOfString[i]);

      if ((localFile1.exists()) && ((this.filename.equals(arrayOfString[i])) || (this.filename.equals(localFile1.getName()))))
      {
        if (this.dOA == null) {
          d("Found: " + localFile1, 3);
          return true;
        }if ((this.dOA.wq()) && (localFile1.isDirectory()))
        {
          d("Found directory: " + localFile1, 3);
          return true;
        }if ((this.dOA.isFile()) && (localFile1.isFile()))
        {
          d("Found file: " + localFile1, 3);
          return true;
        }

        return false;
      }
      File localFile2 = localFile1.getParentFile();

      if ((localFile2 != null) && (localFile2.exists()) && (this.filename.equals(localFile2.getAbsolutePath())))
      {
        if (this.dOA == null) {
          d("Found: " + localFile2, 3);
          return true;
        }if (this.dOA.wq()) {
          d("Found directory: " + localFile2, 3);
          return true;
        }

        return false;
      }

      if ((localFile1.exists()) && (localFile1.isDirectory()) && 
        (g(new File(localFile1, this.filename), this.filename + " in " + localFile1)))
      {
        return true;
      }

      while ((this.dOE) && (localFile2 != null) && (localFile2.exists())) {
        if (g(new File(localFile2, this.filename), this.filename + " in " + localFile2))
        {
          return true;
        }
        localFile2 = localFile2.getParentFile();
      }
    }

    return false;
  }

  private boolean g(File paramFile, String paramString)
  {
    if (this.dOA != null) {
      if (this.dOA.wq()) {
        if (paramFile.isDirectory()) {
          d("Found directory: " + paramString, 3);
        }
        return paramFile.isDirectory();
      }if (this.dOA.isFile()) {
        if (paramFile.isFile()) {
          d("Found file: " + paramString, 3);
        }
        return paramFile.isFile();
      }
    }
    if (paramFile.exists()) {
      d("Found: " + paramString, 3);
    }
    return paramFile.exists();
  }

  private boolean fQ(String paramString)
  {
    if (this.dOB != null) {
      return this.dOB.getResourceAsStream(paramString) != null;
    }
    ClassLoader localClassLoader = getClass().getClassLoader();
    if (localClassLoader != null) {
      return localClassLoader.getResourceAsStream(paramString) != null;
    }
    return ClassLoader.getSystemResourceAsStream(paramString) != null;
  }

  private boolean fR(String paramString)
  {
    try
    {
      if (this.dOD) {
        this.dOB = Ga().b(this.cdY);
        this.dOB.v(false);
        this.dOB.qu();
        try {
          this.dOB.findClass(paramString);
        }
        catch (SecurityException localSecurityException)
        {
          return true;
        }
      } else if (this.dOB != null) {
        this.dOB.loadClass(paramString);
      } else {
        ClassLoader localClassLoader = getClass().getClassLoader();

        if (localClassLoader != null)
          Class.forName(paramString, true, localClassLoader);
        else {
          Class.forName(paramString);
        }
      }
      return true;
    } catch (ClassNotFoundException localClassNotFoundException) {
      d("class \"" + paramString + "\" was not found", 4);

      return false;
    } catch (NoClassDefFoundError localNoClassDefFoundError) {
      d("Could not load dependent class \"" + localNoClassDefFoundError.getMessage() + "\" for class \"" + paramString + "\"", 4);
    }

    return false;
  }
}