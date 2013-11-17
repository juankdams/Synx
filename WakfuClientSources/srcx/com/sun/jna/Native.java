package com.sun.jna;

import MK;
import YB;
import aEQ;
import arr;
import axA;
import bIG;
import bLd;
import bMB;
import bXj;
import bYH;
import bik;
import cKW;
import cST;
import cTs;
import cph;
import cvp;
import dBN;
import dLb;
import deP;
import dzb;
import dzc;
import dzd;
import dzf;
import dzh;
import dzi;
import dzj;
import dzl;
import hT;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import qd;
import rG;
import vN;

public final class Native
{
  private static final String VERSION = "3.5.2";
  private static final String cuD = "3.5.0";
  private static String cuE = null;
  private static Map cuF = new WeakHashMap();
  private static Map cuG = new WeakHashMap();
  private static Map aPd = new WeakHashMap();
  private static Map cuH = new WeakHashMap();
  private static final cph cuI = new dzb();

  private static cph cuJ = cuI;
  public static final int cuK;
  public static final int LONG_SIZE;
  public static final int cuL;
  public static final int cuM;
  private static final int cuN = 0;
  private static final int cuO = 1;
  private static final int cuP = 2;
  private static final int cuQ = 3;
  private static final int cuR = 0;
  private static final int cuS = -1;
  private static final int cuT = -2;
  private static final Object cuU = new dzc();
  static final String cuV = "jna";
  private static final ThreadLocal cuW = new dzd();

  private static Map cuX = new HashMap();
  private static Map cuY = new HashMap();
  private static Object cuZ = new dzl();
  static final int cva = 1;
  private static final int cvb = -1;
  private static final int cvc = 0;
  private static final int cvd = 1;
  private static final int cve = 2;
  private static final int cvf = 3;
  private static final int cvg = 4;
  private static final int cvh = 5;
  private static final int cvi = 6;
  private static final int cvj = 7;
  private static final int cvk = 8;
  private static final int cvl = 9;
  private static final int cvm = 10;
  private static final int cvn = 11;
  private static final int cvo = 12;
  private static final int cvp = 13;
  private static final int cvq = 14;
  private static final int cvr = 15;
  private static final int cvs = 16;
  private static final int cvt = 17;
  private static final int cvu = 18;
  private static final int cvv = 19;
  private static final int cvw = 20;
  private static final int cvx = 21;
  static final int cvy = 1;
  static final int cvz = 2;
  static Class cvA;
  static Class cvB;
  static Class cvC;
  static Class cvD;
  public static Class bRr;
  public static Class cvE;
  static Class bRq;
  static Class cvF;
  static Class bZS;
  static Class cvG;
  static Class cvH;
  static Class cvI;
  static Class cvJ;
  static Class cvK;
  static Class cvL;
  static Class cvM;
  static Class cvN;
  static Class cvO;
  static Class bZT;
  static Class bRs;
  static Class cvP;
  static Class cvQ;
  static Class cvR;
  static Class cvS;
  public static Class cvT;

  private static void dispose()
  {
    bMB.bUb();
    cuE = null;
  }

  public static boolean z(File paramFile)
  {
    if (paramFile.delete()) {
      return true;
    }

    B(paramFile);

    return false;
  }

  private static native void initIDs();

  public static synchronized native void setProtected(boolean paramBoolean);

  public static synchronized native boolean isProtected();

  public static synchronized native void setPreserveLastError(boolean paramBoolean);

  public static synchronized native boolean getPreserveLastError();

  public static long a(Window paramWindow)
  {
    return rG.a(paramWindow);
  }

  public static long a(Component paramComponent)
  {
    return rG.s(paramComponent);
  }

  public static axA b(Window paramWindow)
  {
    return new axA(rG.a(paramWindow));
  }

  public static axA b(Component paramComponent)
  {
    return new axA(rG.s(paramComponent));
  }

  public static native long getWindowHandle0(Component paramComponent);

  public static axA a(Buffer paramBuffer)
  {
    long l = _getDirectBufferPointer(paramBuffer);
    return l == 0L ? null : new axA(l);
  }

  private static native long _getDirectBufferPointer(Buffer paramBuffer);

  public static String toString(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, System.getProperty("jna.encoding"));
  }

  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    String str = null;
    if (paramString != null)
      try {
        str = new String(paramArrayOfByte, paramString);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      }
    if (str == null) {
      str = new String(paramArrayOfByte);
    }
    int i = str.indexOf(0);
    if (i != -1)
      str = str.substring(0, i);
    return str;
  }

  public static String toString(char[] paramArrayOfChar)
  {
    String str = new String(paramArrayOfChar);
    int i = str.indexOf(0);
    if (i != -1)
      str = str.substring(0, i);
    return str;
  }

  public static Object m(Class paramClass)
  {
    return e(null, paramClass);
  }

  public static Object a(Class paramClass, Map paramMap)
  {
    return a(null, paramClass, paramMap);
  }

  public static Object e(String paramString, Class paramClass)
  {
    return a(paramString, paramClass, Collections.EMPTY_MAP);
  }

  public static Object a(String paramString, Class paramClass, Map paramMap)
  {
    bLd localbLd = new bLd(paramString, paramClass, paramMap);

    ClassLoader localClassLoader = paramClass.getClassLoader();
    cST localcST = (cST)Proxy.newProxyInstance(localClassLoader, new Class[] { paramClass }, localbLd);

    a(paramClass, paramMap, localcST);
    return localcST;
  }

  private static void n(Class paramClass)
  {
    if ((paramClass != null) && (!cuH.containsKey(paramClass)))
      try {
        Field[] arrayOfField = paramClass.getFields();
        for (int i = 0; i < arrayOfField.length; i++) {
          Field localField = arrayOfField[i];
          if ((localField.getType() == paramClass) && (Modifier.isStatic(localField.getModifiers())))
          {
            cuH.put(paramClass, new WeakReference(localField.get(null)));
            break;
          }
        }
      }
      catch (Exception localException) {
        throw new IllegalArgumentException("Could not access instance of " + paramClass + " (" + localException + ")");
      }
  }

  static Class o(Class paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    synchronized (cuH) {
      if (aPd.containsKey(paramClass)) {
        return paramClass;
      }
    }
    if ((cvA == null ? (Native.cvA = cd("cST")) : cvA).isAssignableFrom(paramClass)) {
      return paramClass;
    }
    if ((cvB == null ? (Native.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) {
      paramClass = dLb.au(paramClass);
    }
    ??? = paramClass.getDeclaringClass();
    Class localClass = o((Class)???);
    if (localClass != null) {
      return localClass;
    }
    return o(paramClass.getSuperclass());
  }

  public static Map p(Class paramClass)
  {
    synchronized (cuH) {
      Class localClass = o(paramClass);
      if (localClass != null)
        n(localClass);
      else
        localClass = paramClass;
      if (!aPd.containsKey(localClass)) {
        try {
          Field localField = localClass.getField("OPTIONS");
          localField.setAccessible(true);
          aPd.put(localClass, localField.get(null));
        }
        catch (NoSuchFieldException localNoSuchFieldException) {
        }
        catch (Exception localException) {
          throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + localException + "): " + localClass);
        }
      }

      return (Map)aPd.get(localClass);
    }
  }

  public static bXj q(Class paramClass)
  {
    synchronized (cuH) {
      Class localClass = o(paramClass);
      if (localClass != null)
        n(localClass);
      else {
        localClass = paramClass;
      }
      if (!cuF.containsKey(localClass)) {
        try {
          Field localField = localClass.getField("TYPE_MAPPER");
          localField.setAccessible(true);
          cuF.put(localClass, localField.get(null));
        }
        catch (NoSuchFieldException localNoSuchFieldException) {
          Map localMap = p(paramClass);
          if ((localMap != null) && (localMap.containsKey("type-mapper")))
          {
            cuF.put(localClass, localMap.get("type-mapper"));
          }
        }
        catch (Exception localException) {
          throw new IllegalArgumentException("TYPE_MAPPER must be a public field of type " + (cvC == null ? (Native.cvC = cd("bXj")) : cvC).getName() + " (" + localException + "): " + localClass);
        }

      }

      return (bXj)cuF.get(localClass);
    }
  }

  public static int r(Class paramClass)
  {
    synchronized (cuH) {
      Class localClass = o(paramClass);
      if (localClass != null)
        n(localClass);
      else
        localClass = paramClass;
      if (!cuG.containsKey(localClass)) {
        try {
          Field localField = localClass.getField("STRUCTURE_ALIGNMENT");
          localField.setAccessible(true);
          cuG.put(localClass, localField.get(null));
        }
        catch (NoSuchFieldException localNoSuchFieldException) {
          Map localMap = p(localClass);
          if ((localMap != null) && (localMap.containsKey("structure-alignment")))
          {
            cuG.put(localClass, localMap.get("structure-alignment"));
          }
        }
        catch (Exception localException) {
          throw new IllegalArgumentException("STRUCTURE_ALIGNMENT must be a public field of type int (" + localException + "): " + localClass);
        }
      }

      Integer localInteger = (Integer)cuG.get(localClass);
      return localInteger != null ? localInteger.intValue() : 0;
    }
  }

  public static byte[] getBytes(String paramString)
  {
    try
    {
      return getBytes(paramString, System.getProperty("jna.encoding"));
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
    }
    return paramString.getBytes();
  }

  static byte[] getBytes(String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      return paramString1.getBytes(paramString2);
    }
    return paramString1.getBytes();
  }

  public static byte[] dz(String paramString)
  {
    byte[] arrayOfByte1 = getBytes(paramString);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }

  public static byte[] z(String paramString1, String paramString2)
  {
    byte[] arrayOfByte1 = getBytes(paramString1, paramString2);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }

  public static char[] dA(String paramString)
  {
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length + 1];
    System.arraycopy(arrayOfChar1, 0, arrayOfChar2, 0, arrayOfChar1.length);
    return arrayOfChar2;
  }

  public static String agi()
  {
    return a(bIG.bPS(), System.getProperty("os.arch"), System.getProperty("os.name"));
  }

  public static String a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = paramString1.toLowerCase();
    if ("powerpc".equals(paramString1)) {
      paramString1 = "ppc";
    }
    else if ("powerpc64".equals(paramString1))
      paramString1 = "ppc64";
    String str;
    switch (paramInt) {
    case 8:
      if (paramString1.startsWith("arm")) {
        paramString1 = "arm";
      }
      str = "android-" + paramString1;
      break;
    case 2:
      if ("i386".equals(paramString1)) {
        paramString1 = "x86";
      }
      str = "win32-" + paramString1;
      break;
    case 6:
      str = "w32ce-" + paramString1;
      break;
    case 0:
      str = "darwin";
      break;
    case 1:
      if ("x86".equals(paramString1)) {
        paramString1 = "i386";
      }
      else if ("x86_64".equals(paramString1)) {
        paramString1 = "amd64";
      }
      str = "linux-" + paramString1;
      break;
    case 3:
      str = "sunos-" + paramString1;
      break;
    case 4:
    case 5:
    case 7:
    default:
      str = paramString2.toLowerCase();
      if ("x86".equals(paramString1)) {
        paramString1 = "i386";
      }
      if ("x86_64".equals(paramString1)) {
        paramString1 = "amd64";
      }
      int i = str.indexOf(" ");
      if (i != -1) {
        str = str.substring(0, i);
      }
      str = str + "-" + paramString1;
    }

    return str;
  }

  private static void agj()
  {
    agm();

    String str1 = System.getProperty("jna.boot.library.name", "jnidispatch");
    String str2 = System.getProperty("jna.boot.library.path");
    if (str2 != null)
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(str2, File.pathSeparator);
      while (localStringTokenizer.hasMoreTokens()) {
        String str3 = localStringTokenizer.nextToken();
        File localFile = new File(new File(str3), System.mapLibraryName(str1));
        String str4 = localFile.getAbsolutePath();
        if (localFile.exists()) {
          try {
            System.load(str4);
            cuE = str4;
            return;
          }
          catch (UnsatisfiedLinkError localUnsatisfiedLinkError2)
          {
          }
        }

        if (bIG.bPT())
        {
          String str5;
          String str6;
          if (str4.endsWith("dylib")) {
            str5 = "dylib";
            str6 = "jnilib";
          } else {
            str5 = "jnilib";
            str6 = "dylib";
          }
          str4 = str4.substring(0, str4.lastIndexOf(str5)) + str6;
          if (new File(str4).exists()) {
            try {
              System.load(str4);
              cuE = str4;
              return;
            } catch (UnsatisfiedLinkError localUnsatisfiedLinkError3) {
              System.err.println("File found at " + str4 + " but not loadable: " + localUnsatisfiedLinkError3.getMessage());
            }
          }
        }
      }
    }
    if (bIG.bPU())
    {
      System.setProperty("jna.nounpack", "true");
    }
    try {
      if (!Boolean.getBoolean("jna.nosys")) {
        System.loadLibrary(str1);
        return;
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError1) {
      if (Boolean.getBoolean("jna.nounpack")) {
        throw localUnsatisfiedLinkError1;
      }
    }
    if (!Boolean.getBoolean("jna.nounpack")) {
      agk();
      return;
    }
    throw new UnsatisfiedLinkError("Native jnidispatch library not found");
  }

  private static void agk()
  {
    try
    {
      String str = "com/sun/jna/" + agi();
      File localFile = a("jnidispatch", str, (cvD == null ? (Native.cvD = cd("com.sun.jna.Native")) : cvD).getClassLoader());
      System.load(localFile.getAbsolutePath());
      cuE = localFile.getAbsolutePath();

      if (A(localFile))
        z(localFile);
    }
    catch (IOException localIOException)
    {
      throw new UnsatisfiedLinkError(localIOException.getMessage());
    }
  }

  public static boolean A(File paramFile)
  {
    return paramFile.getName().startsWith("jna");
  }

  public static File dB(String paramString)
  {
    return a(paramString, agi(), Thread.currentThread().getContextClassLoader());
  }

  static File a(String paramString1, String paramString2, ClassLoader paramClassLoader)
  {
    String str1 = System.mapLibraryName(paramString1);
    String str2 = paramString2 + "/" + str1;
    URL localURL = paramClassLoader.getResource(str2);

    if ((localURL == null) && (bIG.bPT())) {
      if (str2.endsWith(".jnilib")) {
        str2 = str2.substring(0, str2.lastIndexOf(".jnilib")) + ".dylib";
      }
      else if (str2.endsWith(".dylib")) {
        str2 = str2.substring(0, str2.lastIndexOf(".dylib")) + ".jnilib";
      }
      localURL = paramClassLoader.getResource(str2);
    }
    if (localURL == null) {
      throw new IOException("JNA native support (" + str2 + ") not found in resource path (" + System.getProperty("java.class.path") + ")");
    }

    File localFile1 = null;
    if (localURL.getProtocol().toLowerCase().equals("file")) {
      try {
        localFile1 = new File(new URI(localURL.toString()));
      }
      catch (URISyntaxException localURISyntaxException) {
        localFile1 = new File(localURL.getPath());
      }
      if (!localFile1.exists())
        throw new IOException("File URL " + localURL + " could not be properly decoded");
    }
    else
    {
      InputStream localInputStream = paramClassLoader.getResourceAsStream(str2);
      if (localInputStream == null) {
        throw new IOException("Can't obtain InputStream for " + str2);
      }

      FileOutputStream localFileOutputStream = null;
      try
      {
        File localFile2 = agl();
        localFile1 = File.createTempFile("jna", bIG.bPY() ? ".dll" : null, localFile2);
        localFile1.deleteOnExit();
        localFileOutputStream = new FileOutputStream(localFile1);

        byte[] arrayOfByte = new byte[1024];
        int i;
        while ((i = localInputStream.read(arrayOfByte, 0, arrayOfByte.length)) > 0)
          localFileOutputStream.write(arrayOfByte, 0, i);
      }
      catch (IOException localIOException3)
      {
        throw new IOException("Failed to create temporary file for " + paramString1 + " library: " + localIOException3.getMessage());
      } finally {
        try {
          localInputStream.close(); } catch (IOException localIOException4) {
        }if (localFileOutputStream != null) try {
            localFileOutputStream.close();
          } catch (IOException localIOException5) {  }
 
      }
    }
    return localFile1;
  }

  private static native int sizeof(int paramInt);

  private static native String getNativeVersion();

  private static native String getAPIChecksum();

  public static int getLastError()
  {
    return ((Integer)cuW.get()).intValue();
  }

  public static native void setLastError(int paramInt);

  static void gL(int paramInt)
  {
    cuW.set(new Integer(paramInt));
  }

  public static cST a(cST paramcST)
  {
    Class localClass = paramcST.getClass();
    if (!Proxy.isProxyClass(localClass)) {
      throw new IllegalArgumentException("Library must be a proxy class");
    }
    InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(paramcST);
    if (!(localInvocationHandler instanceof bLd)) {
      throw new IllegalArgumentException("Unrecognized proxy handler: " + localInvocationHandler);
    }
    bLd localbLd = (bLd)localInvocationHandler;
    dzf localdzf = new dzf(localbLd, paramcST);

    return (cST)Proxy.newProxyInstance(localClass.getClassLoader(), localClass.getInterfaces(), localdzf);
  }

  public static String dC(String paramString)
  {
    if (System.getProperty("javawebstart.version") == null)
      return null;
    try
    {
      ClassLoader localClassLoader = (cvD == null ? (Native.cvD = cd("com.sun.jna.Native")) : cvD).getClassLoader();
      Method localMethod = (Method)AccessController.doPrivileged(new dzh());

      String str = (String)localMethod.invoke(localClassLoader, new Object[] { paramString });
      if (str != null) {
        return new File(str).getParent();
      }
      return null;
    } catch (Exception localException) {
    }
    return null;
  }

  static void B(File paramFile)
  {
    try
    {
      File localFile = new File(paramFile.getParentFile(), paramFile.getName() + ".x");
      localFile.createNewFile();
    } catch (IOException localIOException) {
      localIOException.printStackTrace();
    }
  }

  static File agl()
  {
    String str = System.getProperty("jna.tmpdir");
    Object localObject;
    if (str != null) {
      localObject = new File(str);
    }
    else {
      File localFile = new File(System.getProperty("java.io.tmpdir"));
      localObject = new File(localFile, "jna-" + System.getProperty("user.name"));
      ((File)localObject).mkdirs();
      if ((!((File)localObject).exists()) || (!((File)localObject).canWrite())) {
        localObject = localFile;
      }
    }
    if (!((File)localObject).exists()) {
      throw new Error("JNA temporary directory " + localObject + " does not exist");
    }
    if (!((File)localObject).canWrite()) {
      throw new Error("JNA temporary directory " + localObject + " is not writable");
    }
    return localObject;
  }

  static void agm()
  {
    File localFile1 = agl();
    dzi localdzi = new dzi();

    File[] arrayOfFile = localFile1.listFiles(localdzi);
    for (int i = 0; (arrayOfFile != null) && (i < arrayOfFile.length); i++) {
      File localFile2 = arrayOfFile[i];
      String str = localFile2.getName();
      str = str.substring(0, str.length() - 2);
      File localFile3 = new File(localFile2.getParentFile(), str);
      if ((!localFile3.exists()) || (localFile3.delete()))
        localFile2.delete();
    }
  }

  public static int a(Class paramClass, Object paramObject)
  {
    if (paramClass.isArray()) {
      int i = Array.getLength(paramObject);
      if (i > 0) {
        Object localObject = Array.get(paramObject, 0);
        return i * a(paramClass.getComponentType(), localObject);
      }

      throw new IllegalArgumentException("Arrays of length zero not allowed: " + paramClass);
    }
    if ((bRq == null ? (Native.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) if (!(cvF == null ? (Native.cvF = cd("ckM")) : cvF).isAssignableFrom(paramClass))
      {
        return bik.a(paramClass, (bik)paramObject);
      } try
    {
      return s(paramClass);
    }
    catch (IllegalArgumentException localIllegalArgumentException) {
      throw new IllegalArgumentException("The type \"" + paramClass.getName() + "\" is not supported: " + localIllegalArgumentException.getMessage());
    }
  }

  public static int s(Class paramClass)
  {
    if ((bZS == null ? (Native.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      paramClass = MK.k(paramClass).WJ();
    }

    if (paramClass != Boolean.TYPE) { if (paramClass != (cvG == null ? (Native.cvG = cd("java.lang.Boolean")) : cvG)); } else return 4;
    if (paramClass != Byte.TYPE) { if (paramClass != (cvH == null ? (Native.cvH = cd("java.lang.Byte")) : cvH)); } else return 1;
    if (paramClass != Short.TYPE) { if (paramClass != (cvI == null ? (Native.cvI = cd("java.lang.Short")) : cvI)); } else return 2;
    if (paramClass != Character.TYPE) { if (paramClass != (cvJ == null ? (Native.cvJ = cd("java.lang.Character")) : cvJ)); } else return cuL;
    if (paramClass != Integer.TYPE) { if (paramClass != (cvK == null ? (Native.cvK = cd("java.lang.Integer")) : cvK)); } else return 4;
    if (paramClass != Long.TYPE) { if (paramClass != (cvL == null ? (Native.cvL = cd("java.lang.Long")) : cvL)); } else return 8;
    if (paramClass != Float.TYPE) { if (paramClass != (cvM == null ? (Native.cvM = cd("java.lang.Float")) : cvM)); } else return 4;
    if (paramClass != Double.TYPE) { if (paramClass != (cvN == null ? (Native.cvN = cd("java.lang.Double")) : cvN)); } else return 8;
    if ((bRq == null ? (Native.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
      if ((cvO == null ? (Native.cvO = cd("qR")) : cvO).isAssignableFrom(paramClass)) {
        return bik.N(paramClass);
      }
      return cuK;
    }
    if ((!(bZT == null ? (Native.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) && ((!bIG.gIh) || (!YB.z(paramClass)))) if (!(cvB == null ? (Native.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) if ((bRr == null ? (Native.bRr = cd("java.lang.String")) : bRr) != paramClass) if ((bRs == null ? (Native.bRs = cd("cFg")) : bRs) != paramClass)
          {
            break label500;
          }

    return cuK;

    label500: throw new IllegalArgumentException("Native size for type \"" + paramClass.getName() + "\" is unknown");
  }

  public static boolean t(Class paramClass)
  {
    if ((bRq == null ? (Native.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass))
      return true;
    try
    {
      return s(paramClass) != 0;
    } catch (IllegalArgumentException localIllegalArgumentException) {
    }
    return false;
  }

  public static void a(cph paramcph)
  {
    cuJ = paramcph == null ? cuI : paramcph;
  }

  public static cph agn()
  {
    return cuJ;
  }

  public static void register(String paramString)
  {
    a(u(ago()), bMB.jU(paramString));
  }

  public static void a(bMB parambMB)
  {
    a(u(ago()), parambMB);
  }

  static Class u(Class paramClass) {
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    for (int i = 0; i < arrayOfMethod.length; i++) {
      if ((arrayOfMethod[i].getModifiers() & 0x100) != 0) {
        return paramClass;
      }
    }
    i = paramClass.getName().lastIndexOf("$");
    if (i != -1) {
      String str = paramClass.getName().substring(0, i);
      try {
        return u(Class.forName(str, true, paramClass.getClassLoader()));
      }
      catch (ClassNotFoundException localClassNotFoundException) {
      }
    }
    throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + paramClass + ")");
  }

  static Class ago() {
    Class[] arrayOfClass = new dzj().getClassContext();

    if (arrayOfClass.length < 4) {
      throw new IllegalStateException("This method must be called from the static initializer of a class");
    }
    return arrayOfClass[3];
  }

  public static void a(dBN paramdBN, cTs paramcTs)
  {
    dLb.a(paramdBN, paramcTs);
  }

  public static void unregister()
  {
    v(u(ago()));
  }

  public static void v(Class paramClass)
  {
    synchronized (cuX) {
      if (cuX.containsKey(paramClass)) {
        unregister(paramClass, (long[])cuX.get(paramClass));
        cuX.remove(paramClass);
        cuY.remove(paramClass);
      }
    }
  }

  private static native void unregister(Class paramClass, long[] paramArrayOfLong);

  private static String w(Class paramClass)
  {
    if (paramClass.isArray()) {
      return "[" + w(paramClass.getComponentType());
    }
    if (paramClass.isPrimitive()) {
      if (paramClass == Void.TYPE) return "V";
      if (paramClass == Boolean.TYPE) return "Z";
      if (paramClass == Byte.TYPE) return "B";
      if (paramClass == Short.TYPE) return "S";
      if (paramClass == Character.TYPE) return "C";
      if (paramClass == Integer.TYPE) return "I";
      if (paramClass == Long.TYPE) return "J";
      if (paramClass == Float.TYPE) return "F";
      if (paramClass == Double.TYPE) return "D";
    }
    return "L" + replace(".", "/", paramClass.getName()) + ";";
  }

  static String replace(String paramString1, String paramString2, String paramString3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (true) {
      int i = paramString3.indexOf(paramString1);
      if (i == -1) {
        localStringBuffer.append(paramString3);
        break;
      }

      localStringBuffer.append(paramString3.substring(0, i));
      localStringBuffer.append(paramString2);
      paramString3 = paramString3.substring(i + paramString1.length());
    }

    return localStringBuffer.toString();
  }

  private static int a(Class paramClass, bXj parambXj)
  {
    if (paramClass == (cvG == null ? (Native.cvG = cd("java.lang.Boolean")) : cvG)) paramClass = Boolean.TYPE;
    else if (paramClass == (cvH == null ? (Native.cvH = cd("java.lang.Byte")) : cvH)) paramClass = Byte.TYPE;
    else if (paramClass == (cvI == null ? (Native.cvI = cd("java.lang.Short")) : cvI)) paramClass = Short.TYPE;
    else if (paramClass == (cvJ == null ? (Native.cvJ = cd("java.lang.Character")) : cvJ)) paramClass = Character.TYPE;
    else if (paramClass == (cvK == null ? (Native.cvK = cd("java.lang.Integer")) : cvK)) paramClass = Integer.TYPE;
    else if (paramClass == (cvL == null ? (Native.cvL = cd("java.lang.Long")) : cvL)) paramClass = Long.TYPE;
    else if (paramClass == (cvM == null ? (Native.cvM = cd("java.lang.Float")) : cvM)) paramClass = Float.TYPE;
    else if (paramClass == (cvN == null ? (Native.cvN = cd("java.lang.Double")) : cvN)) paramClass = Double.TYPE;
    else if (paramClass == (cvP == null ? (Native.cvP = cd("java.lang.Void")) : cvP)) paramClass = Void.TYPE;

    if ((parambXj != null) && ((parambXj.W(paramClass) != null) || (parambXj.X(paramClass) != null)))
    {
      return 21;
    }

    if ((bZT == null ? (Native.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) {
      return 1;
    }
    if ((bRr == null ? (Native.bRr = cd("java.lang.String")) : bRr) == paramClass) {
      return 2;
    }
    if ((bRs == null ? (Native.bRs = cd("cFg")) : bRs).isAssignableFrom(paramClass)) {
      return 18;
    }
    if ((bIG.gIh) && (YB.z(paramClass))) {
      return 5;
    }
    if ((bRq == null ? (Native.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
      if ((cvO == null ? (Native.cvO = cd("qR")) : cvO).isAssignableFrom(paramClass)) {
        return 4;
      }
      return 3;
    }
    if (paramClass.isArray())
      switch (paramClass.getName().charAt(1)) { case 'Z':
        return 13;
      case 'B':
        return 6;
      case 'S':
        return 7;
      case 'C':
        return 8;
      case 'I':
        return 9;
      case 'J':
        return 10;
      case 'F':
        return 11;
      case 'D':
        return 12;
      case 'E':
      case 'G':
      case 'H':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'T':
      case 'U':
      case 'V':
      case 'W':
      case 'X':
      case 'Y': }  if (paramClass.isPrimitive()) {
      return paramClass == Boolean.TYPE ? 14 : 0;
    }
    if ((cvB == null ? (Native.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) {
      return 15;
    }
    if ((cvQ == null ? (Native.cvQ = cd("dNT")) : cvQ).isAssignableFrom(paramClass)) {
      return 19;
    }
    if ((cvR == null ? (Native.cvR = cd("dyj")) : cvR).isAssignableFrom(paramClass)) {
      return 20;
    }
    if ((bZS == null ? (Native.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      return 17;
    }
    return -1;
  }

  public static void a(Class paramClass, bMB parambMB)
  {
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    ArrayList localArrayList = new ArrayList();
    bXj localbXj = (bXj)parambMB.getOptions().get("type-mapper");

    for (int i = 0; i < arrayOfMethod.length; i++) {
      if ((arrayOfMethod[i].getModifiers() & 0x100) != 0) {
        localArrayList.add(arrayOfMethod[i]);
      }
    }
    long[] arrayOfLong1 = new long[localArrayList.size()];
    for (int j = 0; j < arrayOfLong1.length; j++) {
      Method localMethod = (Method)localArrayList.get(j);
      String str1 = "(";
      Class localClass1 = localMethod.getReturnType();

      Class[] arrayOfClass1 = localMethod.getParameterTypes();
      long[] arrayOfLong2 = new long[arrayOfClass1.length];
      long[] arrayOfLong3 = new long[arrayOfClass1.length];
      int[] arrayOfInt = new int[arrayOfClass1.length];
      aEQ[] arrayOfaEQ = new aEQ[arrayOfClass1.length];
      bYH localbYH = null;
      int k = a(localClass1, localbXj);
      boolean bool = false;
      long l2;
      long l1;
      switch (k) {
      case -1:
        throw new IllegalArgumentException(localClass1 + " is not a supported return type (in method " + localMethod.getName() + " in " + paramClass + ")");
      case 21:
        localbYH = localbXj.W(localClass1);
        l2 = deP.bi(localClass1).dMH;
        l1 = deP.bi(localbYH.WJ()).dMH;
        break;
      case 17:
      case 19:
      case 20:
        l2 = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH;
        l1 = deP.bi(MK.k(localClass1).WJ()).dMH;
        break;
      case 3:
        l2 = l1 = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH;
        break;
      case 4:
        l2 = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH;
        l1 = deP.bi(localClass1).dMH;
        break;
      case 0:
      case 1:
      case 2:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 18:
      default:
        l2 = l1 = deP.bi(localClass1).dMH;
      }

      for (int m = 0; m < arrayOfClass1.length; m++) {
        Class localClass2 = arrayOfClass1[m];
        str1 = str1 + w(localClass2);
        arrayOfInt[m] = a(localClass2, localbXj);
        if (arrayOfInt[m] == -1) {
          throw new IllegalArgumentException(localClass2 + " is not a supported argument type (in method " + localMethod.getName() + " in " + paramClass + ")");
        }
        if ((arrayOfInt[m] == 17) || (arrayOfInt[m] == 19))
        {
          localClass2 = MK.k(localClass2).WJ();
        }
        else if (arrayOfInt[m] == 21) {
          arrayOfaEQ[m] = localbXj.X(localClass2);
        }

        switch (arrayOfInt[m]) {
        case 4:
        case 17:
        case 19:
        case 20:
          arrayOfLong2[m] = deP.bi(localClass2).dMH;
          arrayOfLong3[m] = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH;
          break;
        case 21:
          if (localClass2.isPrimitive())
            arrayOfLong3[m] = deP.bi(localClass2).dMH;
          else
            arrayOfLong3[m] = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH;
          arrayOfLong2[m] = deP.bi(arrayOfaEQ[m].WJ()).dMH;
          break;
        case 0:
          long tmp880_877 = deP.bi(localClass2).dMH; arrayOfLong2[m] = tmp880_877; arrayOfLong3[m] = tmp880_877;
          break;
        default:
          long tmp921_918 = deP.bi(bZT == null ? (Native.bZT = cd("axA")) : bZT).dMH; arrayOfLong2[m] = tmp921_918; arrayOfLong3[m] = tmp921_918;
        }
      }

      str1 = str1 + ")";
      str1 = str1 + w(localClass1);

      Class[] arrayOfClass2 = localMethod.getExceptionTypes();
      for (int n = 0; n < arrayOfClass2.length; n++) {
        if ((cvS == null ? (Native.cvS = cd("dRy")) : cvS).isAssignableFrom(arrayOfClass2[n])) {
          bool = true;
          break;
        }
      }

      String str2 = localMethod.getName();
      vN localvN = (vN)parambMB.getOptions().get("function-mapper");
      if (localvN != null) {
        str2 = localvN.a(parambMB, localMethod);
      }
      cvp localcvp = parambMB.a(str2, localMethod);
      try {
        arrayOfLong1[j] = registerMethod(paramClass, localMethod.getName(), str1, arrayOfInt, arrayOfLong3, arrayOfLong2, k, l2, l1, localClass1, localcvp.dMH, localcvp.ctg(), bool, arrayOfaEQ, localbYH);
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        throw new UnsatisfiedLinkError("No method " + localMethod.getName() + " with signature " + str1 + " in " + paramClass);
      }
    }
    synchronized (cuX) {
      cuX.put(paramClass, arrayOfLong1);
      cuY.put(paramClass, parambMB);
    }
    a(paramClass, parambMB.getOptions(), null);
  }

  private static void a(Class paramClass, Map paramMap, Object paramObject)
  {
    synchronized (cuH) {
      if (!paramMap.isEmpty())
        aPd.put(paramClass, paramMap);
      if (paramMap.containsKey("type-mapper"))
        cuF.put(paramClass, paramMap.get("type-mapper"));
      if (paramMap.containsKey("structure-alignment"))
        cuG.put(paramClass, paramMap.get("structure-alignment"));
      if (paramObject != null) {
        cuH.put(paramClass, new WeakReference(paramObject));
      }

      if (!paramClass.isInterface()) if ((cvA == null ? (Native.cvA = cd("cST")) : cvA).isAssignableFrom(paramClass))
        {
          Class[] arrayOfClass = paramClass.getInterfaces();
          for (int i = 0; i < arrayOfClass.length; i++)
            if ((cvA == null ? (Native.cvA = cd("cST")) : cvA).isAssignableFrom(arrayOfClass[i])) {
              a(arrayOfClass[i], paramMap, paramObject);
              break;
            }
        }
    }
  }

  private static native long registerMethod(Class paramClass1, String paramString1, String paramString2, int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, int paramInt1, long paramLong1, long paramLong2, Class paramClass2, long paramLong3, int paramInt2, boolean paramBoolean, aEQ[] paramArrayOfaEQ, bYH parambYH);

  private static arr b(Class paramClass, Object paramObject)
  {
    return (arr)MK.k(paramClass).a(paramObject, new hT(paramClass));
  }

  private static Class x(Class paramClass) {
    return MK.k(paramClass).WJ();
  }

  private static Object a(aEQ paramaEQ, Object paramObject)
  {
    return paramaEQ.a(paramObject, new qd());
  }

  private static Object a(bYH parambYH, Object paramObject, Class paramClass)
  {
    return parambYH.a(paramObject, new hT(paramClass));
  }

  public static native long ffi_prep_cif(int paramInt1, int paramInt2, long paramLong1, long paramLong2);

  public static native void ffi_call(long paramLong1, long paramLong2, long paramLong3, long paramLong4);

  public static native long ffi_prep_closure(long paramLong, cKW paramcKW);

  public static native void ffi_free_closure(long paramLong);

  static native int initialize_ffi_type(long paramLong);

  public static void main(String[] paramArrayOfString)
  {
    String str1 = "Java Native Access (JNA)";
    String str2 = "3.5.2";
    String str3 = "3.5.2 (package information missing)";
    Package localPackage = (cvD == null ? (Native.cvD = cd("com.sun.jna.Native")) : cvD).getPackage();
    String str4 = localPackage != null ? localPackage.getSpecificationTitle() : "Java Native Access (JNA)";

    if (str4 == null) str4 = "Java Native Access (JNA)";
    String str5 = localPackage != null ? localPackage.getSpecificationVersion() : "3.5.2";

    if (str5 == null) str5 = "3.5.2";
    str4 = str4 + " API Version " + str5;
    System.out.println(str4);
    str5 = localPackage != null ? localPackage.getImplementationVersion() : "3.5.2 (package information missing)";

    if (str5 == null) str5 = "3.5.2 (package information missing)";
    System.out.println("Version: " + str5);
    System.out.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");

    System.out.println(" Prefix: " + agi());
  }

  public static synchronized native void freeNativeCallback(long paramLong);

  public static synchronized native long createNativeCallback(dBN paramdBN, Method paramMethod, Class[] paramArrayOfClass, Class paramClass, int paramInt1, int paramInt2);

  public static native int invokeInt(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static native long invokeLong(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static native void invokeVoid(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static native float invokeFloat(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static native double invokeDouble(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static native long invokePointer(long paramLong, int paramInt, Object[] paramArrayOfObject);

  private static native void invokeStructure(long paramLong1, int paramInt, Object[] paramArrayOfObject, long paramLong2, long paramLong3);

  public static bik a(long paramLong, int paramInt, Object[] paramArrayOfObject, bik parambik)
  {
    invokeStructure(paramLong, paramInt, paramArrayOfObject, parambik.sF().dMH, parambik.RT().dMH);

    return parambik;
  }

  public static native Object invokeObject(long paramLong, int paramInt, Object[] paramArrayOfObject);

  public static long dD(String paramString)
  {
    return open(paramString, -1);
  }

  public static native long open(String paramString, int paramInt);

  public static native void close(long paramLong);

  public static native long findSymbol(long paramLong, String paramString);

  public static native long indexOf(long paramLong, byte paramByte);

  public static native void read(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public static native void read(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2);

  public static native void read(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public static native void read(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2);

  public static native void read(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2);

  public static native void read(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2);

  public static native void read(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2);

  public static native void write(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public static native void write(long paramLong, short[] paramArrayOfShort, int paramInt1, int paramInt2);

  public static native void write(long paramLong, char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public static native void write(long paramLong, int[] paramArrayOfInt, int paramInt1, int paramInt2);

  public static native void write(long paramLong, long[] paramArrayOfLong, int paramInt1, int paramInt2);

  public static native void write(long paramLong, float[] paramArrayOfFloat, int paramInt1, int paramInt2);

  public static native void write(long paramLong, double[] paramArrayOfDouble, int paramInt1, int paramInt2);

  public static native byte getByte(long paramLong);

  public static native char getChar(long paramLong);

  public static native short getShort(long paramLong);

  public static native int getInt(long paramLong);

  public static native long getLong(long paramLong);

  public static native float getFloat(long paramLong);

  public static native double getDouble(long paramLong);

  public static axA bX(long paramLong)
  {
    long l = _getPointer(paramLong);
    return l == 0L ? null : new axA(l);
  }

  private static native long _getPointer(long paramLong);

  public static native String getString(long paramLong, boolean paramBoolean);

  public static native void setMemory(long paramLong1, long paramLong2, byte paramByte);

  public static native void setByte(long paramLong, byte paramByte);

  public static native void setShort(long paramLong, short paramShort);

  public static native void setChar(long paramLong, char paramChar);

  public static native void setInt(long paramLong, int paramInt);

  public static native void setLong(long paramLong1, long paramLong2);

  public static native void setFloat(long paramLong, float paramFloat);

  public static native void setDouble(long paramLong, double paramDouble);

  public static native void setPointer(long paramLong1, long paramLong2);

  public static native void setString(long paramLong, String paramString, boolean paramBoolean);

  public static native long malloc(long paramLong);

  public static native void free(long paramLong);

  public static native ByteBuffer getDirectByteBuffer(long paramLong1, long paramLong2);

  public static void bt(boolean paramBoolean)
  {
    setLastError(paramBoolean ? -1 : -2);
  }

  public static void sH()
  {
    dispose();
  }

  public static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }

  public static Map agp()
  {
    return cuX; } 
  public static void a(Class paramClass, long[] paramArrayOfLong) { unregister(paramClass, paramArrayOfLong); }


  static
  {
    agj();
    cuK = sizeof(0);
    LONG_SIZE = sizeof(1);
    cuL = sizeof(2);
    cuM = sizeof(3);

    initIDs();
    if (Boolean.getBoolean("jna.protected")) {
      setProtected(true);
    }
    String str1 = getNativeVersion();
    if (!"3.5.0".equals(str1)) {
      String str2 = System.getProperty("line.separator");
      throw new Error(str2 + str2 + "There is an incompatible JNA native library installed on this system." + str2 + "To resolve this issue you may do one of the following:" + str2 + " - remove or uninstall the offending library" + str2 + " - set the system property jna.nosys=true" + str2 + " - set jna.boot.library.path to include the path to the version of the " + str2 + "   jnidispatch library included with the JNA jar file you are using" + str2);
    }

    setPreserveLastError("true".equalsIgnoreCase(System.getProperty("jna.preserve_last_error", "true")));
  }
}