import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

public class iA extends ClassLoader
  implements dAh
{
  private static final wh aIk = wh.Fo();
  private static final int bt = 8192;
  private static final int aIl = 256;
  private Vector aIm = new Wm();
  private FF aIn;
  private boolean aIo = true;

  private Vector aIp = new Vector();

  private Vector aIq = new Vector();

  private boolean aIr = false;

  private ClassLoader aIs = null;

  private Hashtable aIt = new Hashtable();

  private static Map aIu = Collections.synchronizedMap(new HashMap());

  private ClassLoader aIv = null;

  private boolean aIw = false;

  private static Class aIx = null;
  private static final Class[] aIy = { ClassLoader.class, FF.class, aoo.class, Boolean.TYPE };

  public iA(ClassLoader paramClassLoader, FF paramFF, aoo paramaoo)
  {
    a(paramClassLoader);
    a(paramaoo);
    b(paramFF);
  }

  public iA()
  {
    a(null);
  }

  public iA(FF paramFF, aoo paramaoo)
  {
    a(null);
    b(paramFF);
    a(paramaoo);
  }

  public iA(ClassLoader paramClassLoader, FF paramFF, aoo paramaoo, boolean paramBoolean)
  {
    this(paramFF, paramaoo);
    if (paramClassLoader != null) {
      a(paramClassLoader);
    }
    v(paramBoolean);
    qu();
  }

  public iA(FF paramFF, aoo paramaoo, boolean paramBoolean)
  {
    this(null, paramFF, paramaoo, paramBoolean);
  }

  public iA(ClassLoader paramClassLoader, boolean paramBoolean)
  {
    a(paramClassLoader);
    this.aIn = null;
    this.aIo = paramBoolean;
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
    if (paramFF != null)
      paramFF.a(this);
  }

  public void a(aoo paramaoo)
  {
    this.aIm.removeAllElements();
    if (paramaoo != null) {
      aoo localaoo = paramaoo.eQ("ignore");
      String[] arrayOfString = localaoo.list();
      for (int i = 0; i < arrayOfString.length; i++)
        try {
          S(arrayOfString[i]);
        }
        catch (cJ localcJ)
        {
        }
    }
  }

  public void a(ClassLoader paramClassLoader)
  {
    this.aIs = (paramClassLoader == null ? iA.class.getClassLoader() : paramClassLoader);
  }

  public void v(boolean paramBoolean)
  {
    this.aIo = paramBoolean;
  }

  protected void d(String paramString, int paramInt)
  {
    if (this.aIn != null)
      this.aIn.d(paramString, paramInt);
  }

  public void qp()
  {
    if (this.aIw) {
      throw new cJ("Context loader has not been reset");
    }
    if (cRj.cHL()) {
      this.aIv = cRj.getContextClassLoader();
      Object localObject = this;
      if ((this.aIn != null) && ("only".equals(this.aIn.getProperty("build.sysclasspath")))) {
        localObject = getClass().getClassLoader();
      }
      cRj.setContextClassLoader((ClassLoader)localObject);
      this.aIw = true;
    }
  }

  public void qq()
  {
    if ((cRj.cHL()) && (this.aIw)) {
      cRj.setContextClassLoader(this.aIv);
      this.aIv = null;
      this.aIw = false;
    }
  }

  public void S(String paramString)
  {
    File localFile = this.aIn != null ? this.aIn.bO(paramString) : new File(paramString);
    try
    {
      f(localFile);
    } catch (IOException localIOException) {
      throw new cJ(localIOException);
    }
  }

  public void e(File paramFile)
  {
    if (this.aIm.contains(paramFile)) {
      return;
    }
    this.aIm.addElement(paramFile);
  }

  protected void f(File paramFile)
  {
    if (!this.aIm.contains(paramFile)) {
      this.aIm.addElement(paramFile);
    }
    if (paramFile.isDirectory()) {
      return;
    }

    String str1 = paramFile.getAbsolutePath() + paramFile.lastModified() + "-" + paramFile.length();

    String str2 = (String)aIu.get(str1);
    Object localObject1;
    Object localObject2;
    if (str2 == null) {
      localObject1 = null;
      try {
        localObject1 = new JarFile(paramFile);
        localObject2 = ((JarFile)localObject1).getManifest();
        if (localObject2 == null) {
          return;
        }
        str2 = ((Manifest)localObject2).getMainAttributes().getValue(Attributes.Name.CLASS_PATH);
      }
      finally {
        if (localObject1 != null) {
          ((JarFile)localObject1).close();
        }
      }
      if (str2 == null) {
        str2 = "";
      }
      aIu.put(str1, str2);
    }

    if (!"".equals(str2)) {
      localObject1 = aIk.k(paramFile);
      localObject2 = new StringTokenizer(str2);
      while (((StringTokenizer)localObject2).hasMoreTokens()) {
        String str3 = ((StringTokenizer)localObject2).nextToken();
        URL localURL = new URL((URL)localObject1, str3);
        if (!localURL.getProtocol().equals("file")) {
          d("Skipping jar library " + str3 + " since only relative URLs are supported by this" + " loader", 3);
        }
        else
        {
          String str4 = djy.po(localURL.getFile());
          File localFile = new File(str4);
          if ((localFile.exists()) && (!h(localFile)))
            f(localFile);
        }
      }
    }
  }

  public String qr()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    Enumeration localEnumeration = this.aIm.elements();
    while (localEnumeration.hasMoreElements()) {
      if (i == 0)
        localStringBuilder.append(System.getProperty("path.separator"));
      else {
        i = 0;
      }
      localStringBuilder.append(((File)localEnumeration.nextElement()).getAbsolutePath());
    }
    return localStringBuilder.toString();
  }

  public synchronized void w(boolean paramBoolean)
  {
    this.aIr = paramBoolean;
  }

  public static void a(Class paramClass)
  {
    Constructor[] arrayOfConstructor = paramClass.getDeclaredConstructors();

    if ((arrayOfConstructor != null) && 
      (arrayOfConstructor.length > 0) && (arrayOfConstructor[0] != null)) {
      String[] arrayOfString = new String[256];
      try {
        arrayOfConstructor[0].newInstance((Object[])arrayOfString);
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void T(String paramString)
  {
    this.aIp.addElement(paramString + (paramString.endsWith(".") ? "" : "."));
  }

  public void U(String paramString)
  {
    this.aIq.addElement(paramString + (paramString.endsWith(".") ? "" : "."));
  }

  public Class V(String paramString)
  {
    d("force loading " + paramString, 4);

    Class localClass = findLoadedClass(paramString);

    if (localClass == null) {
      localClass = findClass(paramString);
    }
    return localClass;
  }

  public Class W(String paramString)
  {
    d("force system loading " + paramString, 4);

    Class localClass = findLoadedClass(paramString);

    if (localClass == null) {
      localClass = ad(paramString);
    }
    return localClass;
  }

  public InputStream getResourceAsStream(String paramString)
  {
    InputStream localInputStream = null;
    if (Z(paramString)) {
      localInputStream = Y(paramString);
    }
    if (localInputStream != null) {
      d("ResourceStream for " + paramString + " loaded from parent loader", 4);
    }
    else {
      localInputStream = X(paramString);
      if (localInputStream != null) {
        d("ResourceStream for " + paramString + " loaded from ant loader", 4);
      }
    }

    if ((localInputStream == null) && (!Z(paramString))) {
      if (this.aIr)
        localInputStream = qs() == null ? null : qs().getResourceAsStream(paramString);
      else {
        localInputStream = Y(paramString);
      }
      if (localInputStream != null) {
        d("ResourceStream for " + paramString + " loaded from parent loader", 4);
      }
    }

    if (localInputStream == null) {
      d("Couldn't load ResourceStream for " + paramString, 4);
    }
    return localInputStream;
  }

  private InputStream X(String paramString)
  {
    InputStream localInputStream = null;

    Enumeration localEnumeration = this.aIm.elements();
    while ((localEnumeration.hasMoreElements()) && (localInputStream == null)) {
      File localFile = (File)localEnumeration.nextElement();
      localInputStream = a(localFile, paramString);
    }
    return localInputStream;
  }

  private InputStream Y(String paramString)
  {
    return this.aIs == null ? super.getResourceAsStream(paramString) : this.aIs.getResourceAsStream(paramString);
  }

  private InputStream a(File paramFile, String paramString)
  {
    try
    {
      JarFile localJarFile = (JarFile)this.aIt.get(paramFile);
      Object localObject;
      if ((localJarFile == null) && (paramFile.isDirectory())) {
        localObject = new File(paramFile, paramString);
        if (((File)localObject).exists())
          return new FileInputStream((File)localObject);
      }
      else {
        if (localJarFile == null) {
          if (paramFile.exists()) {
            localJarFile = new JarFile(paramFile);
            this.aIt.put(paramFile, localJarFile);
          } else {
            return null;
          }

          localJarFile = (JarFile)this.aIt.get(paramFile);
        }
        localObject = localJarFile.getJarEntry(paramString);
        if (localObject != null)
          return localJarFile.getInputStream((ZipEntry)localObject);
      }
    }
    catch (Exception localException) {
      d("Ignoring Exception " + localException.getClass().getName() + ": " + localException.getMessage() + " reading resource " + paramString + " from " + paramFile, 3);
    }

    return null;
  }

  private boolean Z(String paramString)
  {
    boolean bool = this.aIo;

    for (Enumeration localEnumeration = this.aIp.elements(); localEnumeration.hasMoreElements(); ) {
      str = (String)localEnumeration.nextElement();
      if (paramString.startsWith(str)) {
        bool = true;
        break;
      }
    }
    String str;
    for (localEnumeration = this.aIq.elements(); localEnumeration.hasMoreElements(); ) {
      str = (String)localEnumeration.nextElement();
      if (paramString.startsWith(str)) {
        bool = false;
        break;
      }
    }
    return bool;
  }

  private ClassLoader qs()
  {
    ClassLoader localClassLoader = getClass().getClassLoader();
    while ((localClassLoader != null) && (localClassLoader.getParent() != null)) {
      localClassLoader = localClassLoader.getParent();
    }
    return localClassLoader;
  }

  public URL getResource(String paramString)
  {
    URL localURL = null;
    if (Z(paramString)) {
      localURL = this.aIs == null ? super.getResource(paramString) : this.aIs.getResource(paramString);
    }
    if (localURL != null) {
      d("Resource " + paramString + " loaded from parent loader", 4);
    }
    else
    {
      Enumeration localEnumeration = this.aIm.elements();
      while ((localEnumeration.hasMoreElements()) && (localURL == null)) {
        File localFile = (File)localEnumeration.nextElement();
        localURL = b(localFile, paramString);
        if (localURL != null) {
          d("Resource " + paramString + " loaded from ant loader", 4);
        }
      }
    }
    if ((localURL == null) && (!Z(paramString)))
    {
      if (this.aIr)
        localURL = qs() == null ? null : qs().getResource(paramString);
      else {
        localURL = this.aIs == null ? super.getResource(paramString) : this.aIs.getResource(paramString);
      }
      if (localURL != null) {
        d("Resource " + paramString + " loaded from parent loader", 4);
      }
    }
    if (localURL == null) {
      d("Couldn't load Resource " + paramString, 4);
    }
    return localURL;
  }

  public Enumeration aa(String paramString)
  {
    return findResources(paramString, false);
  }

  protected Enumeration findResources(String paramString)
  {
    return findResources(paramString, true);
  }

  protected Enumeration findResources(String paramString, boolean paramBoolean)
  {
    ckf localckf = new ckf(this, paramString);
    Object localObject;
    if ((this.aIs != null) && ((!paramBoolean) || (this.aIs != getParent())))
    {
      localObject = this.aIs.getResources(paramString);
    }
    else
    {
      localObject = new dkH();
    }
    if (Z(paramString))
    {
      return dst.a((Enumeration)localObject, localckf);
    }
    if (this.aIr) {
      return qs() == null ? localckf : dst.a(localckf, qs().getResources(paramString));
    }

    return dst.a(localckf, (Enumeration)localObject);
  }

  protected URL b(File paramFile, String paramString)
  {
    try
    {
      JarFile localJarFile = (JarFile)this.aIt.get(paramFile);
      if ((localJarFile == null) && (paramFile.isDirectory())) {
        localObject = new File(paramFile, paramString);

        if (((File)localObject).exists())
          try {
            return aIk.k((File)localObject);
          } catch (MalformedURLException localMalformedURLException1) {
            return null;
          }
      }
      else {
        if (localJarFile == null) {
          if (paramFile.exists()) {
            localJarFile = new JarFile(paramFile);
            this.aIt.put(paramFile, localJarFile);
          } else {
            return null;
          }

          localJarFile = (JarFile)this.aIt.get(paramFile);
        }
        localObject = localJarFile.getJarEntry(paramString);
        if (localObject != null)
          try {
            return new URL("jar:" + aIk.k(paramFile) + "!/" + localObject);
          } catch (MalformedURLException localMalformedURLException2) {
            return null;
          }
      }
    }
    catch (Exception localException) {
      Object localObject = "Unable to obtain resource from " + paramFile + ": ";
      d((String)localObject + localException, 1);
      System.err.println((String)localObject);
      localException.printStackTrace();
    }
    return null;
  }

  protected synchronized Class loadClass(String paramString, boolean paramBoolean)
  {
    Class localClass = findLoadedClass(paramString);
    if (localClass != null) {
      return localClass;
    }
    if (Z(paramString))
      try {
        localClass = ad(paramString);
        d("Class " + paramString + " loaded from parent loader " + "(parentFirst)", 4);
      }
      catch (ClassNotFoundException localClassNotFoundException1) {
        localClass = findClass(paramString);
        d("Class " + paramString + " loaded from ant loader " + "(parentFirst)", 4);
      }
    else {
      try
      {
        localClass = findClass(paramString);
        d("Class " + paramString + " loaded from ant loader", 4);
      } catch (ClassNotFoundException localClassNotFoundException2) {
        if (this.aIr) {
          throw localClassNotFoundException2;
        }
        localClass = ad(paramString);
        d("Class " + paramString + " loaded from parent loader", 4);
      }
    }
    if (paramBoolean) {
      resolveClass(localClass);
    }
    return localClass;
  }

  private String ab(String paramString)
  {
    return paramString.replace('.', '/') + ".class";
  }

  protected Class a(File paramFile, byte[] paramArrayOfByte, String paramString)
  {
    c(paramFile, paramString);
    ProtectionDomain localProtectionDomain1 = FF.class.getProtectionDomain();
    String str = ab(paramString);
    CodeSource localCodeSource = new CodeSource(aIk.k(paramFile), d(paramFile, str));

    ProtectionDomain localProtectionDomain2 = new ProtectionDomain(localCodeSource, localProtectionDomain1.getPermissions(), this, localProtectionDomain1.getPrincipals());

    return defineClass(paramString, paramArrayOfByte, 0, paramArrayOfByte.length, localProtectionDomain2);
  }

  protected void c(File paramFile, String paramString)
  {
    int i = paramString.lastIndexOf('.');
    if (i == -1) {
      return;
    }
    String str = paramString.substring(0, i);
    if (getPackage(str) != null)
    {
      return;
    }

    Manifest localManifest = g(paramFile);

    if (localManifest == null)
      definePackage(str, null, null, null, null, null, null, null);
    else
      a(paramFile, str, localManifest);
  }

  private Manifest g(File paramFile)
  {
    if (paramFile.isDirectory()) {
      return null;
    }
    JarFile localJarFile = (JarFile)this.aIt.get(paramFile);
    if (localJarFile == null) {
      return null;
    }
    return localJarFile.getManifest();
  }

  private Certificate[] d(File paramFile, String paramString)
  {
    if (paramFile.isDirectory()) {
      return null;
    }
    JarFile localJarFile = (JarFile)this.aIt.get(paramFile);
    if (localJarFile == null) {
      return null;
    }
    JarEntry localJarEntry = localJarFile.getJarEntry(paramString);
    return localJarEntry == null ? null : localJarEntry.getCertificates();
  }

  protected void a(File paramFile, String paramString, Manifest paramManifest)
  {
    String str1 = paramString.replace('.', '/') + "/";

    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    URL localURL = null;

    Attributes localAttributes1 = paramManifest.getAttributes(str1);
    if (localAttributes1 != null) {
      str2 = localAttributes1.getValue(Attributes.Name.SPECIFICATION_TITLE);
      str3 = localAttributes1.getValue(Attributes.Name.SPECIFICATION_VENDOR);
      str4 = localAttributes1.getValue(Attributes.Name.SPECIFICATION_VERSION);
      str5 = localAttributes1.getValue(Attributes.Name.IMPLEMENTATION_TITLE);
      str6 = localAttributes1.getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
      str7 = localAttributes1.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
      str8 = localAttributes1.getValue(Attributes.Name.SEALED);
    }
    Attributes localAttributes2 = paramManifest.getMainAttributes();
    if (localAttributes2 != null) {
      if (str2 == null) {
        str2 = localAttributes2.getValue(Attributes.Name.SPECIFICATION_TITLE);
      }
      if (str3 == null) {
        str3 = localAttributes2.getValue(Attributes.Name.SPECIFICATION_VENDOR);
      }
      if (str4 == null) {
        str4 = localAttributes2.getValue(Attributes.Name.SPECIFICATION_VERSION);
      }
      if (str5 == null) {
        str5 = localAttributes2.getValue(Attributes.Name.IMPLEMENTATION_TITLE);
      }
      if (str6 == null) {
        str6 = localAttributes2.getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
      }
      if (str7 == null) {
        str7 = localAttributes2.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
      }
      if (str8 == null) {
        str8 = localAttributes2.getValue(Attributes.Name.SEALED);
      }
    }
    if ((str8 != null) && (str8.equalsIgnoreCase("true")))
      try {
        localURL = new URL(wh.Fo().aU(paramFile.getAbsolutePath()));
      }
      catch (MalformedURLException localMalformedURLException)
      {
      }
    definePackage(paramString, str2, str4, str3, str5, str7, str6, localURL);
  }

  private Class a(InputStream paramInputStream, String paramString, File paramFile)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = -1;
    byte[] arrayOfByte1 = new byte[8192];

    while ((i = paramInputStream.read(arrayOfByte1, 0, 8192)) != -1) {
      localByteArrayOutputStream.write(arrayOfByte1, 0, i);
    }
    byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
    return a(paramFile, arrayOfByte2, paramString);
  }

  public Class findClass(String paramString)
  {
    d("Finding class " + paramString, 4);
    return ac(paramString);
  }

  protected boolean h(File paramFile)
  {
    return this.aIm.contains(paramFile);
  }

  private Class ac(String paramString)
  {
    String str = ab(paramString);
    Enumeration localEnumeration = this.aIm.elements();
    while (localEnumeration.hasMoreElements()) {
      File localFile = (File)localEnumeration.nextElement();
      InputStream localInputStream = null;
      try {
        localInputStream = a(localFile, str);
        if (localInputStream != null) {
          d("Loaded from " + localFile + " " + str, 4);

          return a(localInputStream, paramString, localFile);
        }
      } catch (SecurityException localSecurityException) {
        throw localSecurityException;
      }
      catch (IOException localIOException) {
        d("Exception reading component " + localFile + " (reason: " + localIOException.getMessage() + ")", 3);
      }
      finally {
        wh.c(localInputStream);
      }
    }
    throw new ClassNotFoundException(paramString);
  }

  private Class ad(String paramString)
  {
    return this.aIs == null ? findSystemClass(paramString) : this.aIs.loadClass(paramString);
  }

  public synchronized void cleanup()
  {
    for (Enumeration localEnumeration = this.aIt.elements(); localEnumeration.hasMoreElements(); ) {
      JarFile localJarFile = (JarFile)localEnumeration.nextElement();
      try {
        localJarFile.close();
      }
      catch (IOException localIOException) {
      }
    }
    this.aIt = new Hashtable();
    if (this.aIn != null) {
      this.aIn.b(this);
    }
    this.aIn = null;
  }

  public ClassLoader qt()
  {
    return this.aIs;
  }

  public void a(aaQ paramaaQ)
  {
  }

  public void b(aaQ paramaaQ)
  {
    cleanup();
  }

  public void c(aaQ paramaaQ)
  {
    if (paramaaQ.Ga() == this.aIn)
      cleanup();
  }

  public void d(aaQ paramaaQ)
  {
  }

  public void e(aaQ paramaaQ)
  {
  }

  public void f(aaQ paramaaQ)
  {
  }

  public void g(aaQ paramaaQ)
  {
  }

  public void h(aaQ paramaaQ)
  {
  }

  public void i(aaQ paramaaQ)
  {
  }

  public void qu()
  {
    Vector localVector = cpW.cpq();
    Enumeration localEnumeration = localVector.elements();
    while (localEnumeration.hasMoreElements()) {
      String str = (String)localEnumeration.nextElement();
      T(str);
    }
  }

  public String toString()
  {
    return "AntClassLoader[" + qr() + "]";
  }

  public static iA a(ClassLoader paramClassLoader, FF paramFF, aoo paramaoo, boolean paramBoolean)
  {
    if (aIx != null) {
      return (iA)beh.a(aIx, aIy, new Object[] { paramClassLoader, paramFF, paramaoo, Boolean.valueOf(paramBoolean) });
    }

    return new iA(paramClassLoader, paramFF, paramaoo, paramBoolean);
  }

  static
  {
    if (cpW.lP("1.5"))
      try {
        aIx = Class.forName("org.apache.tools.ant.loader.AntClassLoader5");
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
      }
  }
}