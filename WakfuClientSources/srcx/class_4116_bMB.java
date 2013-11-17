import com.sun.jna.Native;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class bMB
{
  private long handle;
  private final String gQh;
  private final String gQi;
  private final Map gOT = new HashMap();
  final int gQj;
  final Map aPd;
  private static final Map cuH = new HashMap();
  private static final Map gQk = Collections.synchronizedMap(new HashMap());
  private static final List gQl = new LinkedList();
  private static final int gQm = -1;
  static Class cvS;

  private static String B(String paramString, int paramInt)
  {
    return paramString + "|" + paramInt;
  }

  private bMB(String paramString1, String paramString2, long paramLong, Map paramMap) {
    this.gQh = jT(paramString1);
    this.gQi = paramString2;
    this.handle = paramLong;
    Object localObject1 = paramMap.get("calling-convention");
    int i = (localObject1 instanceof Integer) ? ((Integer)localObject1).intValue() : 0;

    this.gQj = i;
    this.aPd = paramMap;

    if ((bIG.bPY()) && ("kernel32".equals(this.gQh.toLowerCase())))
      synchronized (this.gOT) {
        dVQ localdVQ = new dVQ(this, this, "GetLastError", 1);

        this.gOT.put(B("GetLastError", this.gQj), localdVQ);
      }
  }

  private static int k(Map paramMap)
  {
    try
    {
      return ((Integer)paramMap.get("open-flags")).intValue();
    } catch (Throwable localThrowable) {
    }
    return -1;
  }

  private static bMB b(String paramString, Map paramMap)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = k(paramMap);

    String str = Native.dC(paramString);
    if (str != null) {
      localLinkedList.add(str);
    }

    List localList = (List)gQk.get(paramString);
    if (localList != null) {
      synchronized (localList) {
        localLinkedList.addAll(0, localList);
      }
    }

    localLinkedList.addAll(jY("jna.library.path"));
    ??? = b(paramString, localLinkedList);
    long l = 0L;
    try
    {
      l = Native.open((String)???, i);
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError1)
    {
      localLinkedList.addAll(gQl);
    }
    try {
      if (l == 0L) {
        ??? = b(paramString, localLinkedList);
        l = Native.open((String)???, i);
        if (l == 0L)
          throw new UnsatisfiedLinkError("Failed to load library '" + paramString + "'");
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError2)
    {
      Object localObject2;
      if (bIG.bPU()) {
        try {
          System.loadLibrary(paramString);
          l = Native.open((String)???, i);
        } catch (UnsatisfiedLinkError localUnsatisfiedLinkError3) {
          localObject2 = localUnsatisfiedLinkError3;
        }
      } else if (bIG.bPV())
      {
        ??? = c(paramString, localLinkedList);
        if (??? != null) {
          try {
            l = Native.open((String)???, i);
          } catch (UnsatisfiedLinkError localUnsatisfiedLinkError4) {
            localObject2 = localUnsatisfiedLinkError4;
          }
        }
      }
      else if ((bIG.bPT()) && (!paramString.endsWith(".dylib"))) {
        ??? = jS(paramString);
        if (??? != null) {
          try {
            l = Native.open((String)???, i);
          } catch (UnsatisfiedLinkError localUnsatisfiedLinkError5) {
            localObject2 = localUnsatisfiedLinkError5;
          }
        }
      }
      else if (bIG.bPY()) {
        ??? = b("lib" + paramString, localLinkedList);
        try { l = Native.open((String)???, i); } catch (UnsatisfiedLinkError localUnsatisfiedLinkError6) {
          localObject2 = localUnsatisfiedLinkError6;
        }
      }

      if (l == 0L) {
        try {
          File localFile = Native.dB(paramString);
          l = Native.dD(localFile.getAbsolutePath());

          if (Native.A(localFile))
            Native.z(localFile);
        }
        catch (IOException localIOException) {
          localObject2 = new UnsatisfiedLinkError(localIOException.getMessage());
        }
      }
      if (l == 0L) {
        throw new UnsatisfiedLinkError("Unable to load library '" + paramString + "': " + ((UnsatisfiedLinkError)localObject2).getMessage());
      }
    }

    return new bMB(paramString, (String)???, l, paramMap);
  }

  static String jS(String paramString)
  {
    File localFile = new File(paramString);
    if (localFile.isAbsolute()) {
      if ((paramString.indexOf(".framework") != -1) && (localFile.exists()))
      {
        return localFile.getAbsolutePath();
      }
      localFile = new File(new File(localFile.getParentFile(), localFile.getName() + ".framework"), localFile.getName());
      if (localFile.exists())
        return localFile.getAbsolutePath();
    }
    else
    {
      String[] arrayOfString = { System.getProperty("user.home"), "", "/System" };
      String str1 = paramString.indexOf(".framework") == -1 ? paramString + ".framework/" + paramString : paramString;

      for (int i = 0; i < arrayOfString.length; i++) {
        String str2 = arrayOfString[i] + "/Library/Frameworks/" + str1;
        if (new File(str2).exists()) {
          return str2;
        }
      }
    }
    return null;
  }

  private String jT(String paramString) {
    String str1 = paramString;
    String str2 = "---";
    String str3 = mapLibraryName("---");
    int i = str3.indexOf("---");
    if ((i > 0) && (str1.startsWith(str3.substring(0, i)))) {
      str1 = str1.substring(i);
    }
    String str4 = str3.substring(i + "---".length());
    int j = str1.indexOf(str4);
    if (j != -1) {
      str1 = str1.substring(0, j);
    }
    return str1;
  }

  public static final bMB jU(String paramString)
  {
    return c(paramString, Collections.EMPTY_MAP);
  }

  public static final bMB c(String paramString, Map paramMap)
  {
    paramMap = new HashMap(paramMap);
    if (paramMap.get("calling-convention") == null) {
      paramMap.put("calling-convention", new Integer(0));
    }

    if (((bIG.bPV()) || (bIG.bPW())) && (bIG.gIk.equals(paramString)))
    {
      paramString = null;
    }
    synchronized (cuH) {
      WeakReference localWeakReference = (WeakReference)cuH.get(paramString + paramMap);
      bMB localbMB = localWeakReference != null ? (bMB)localWeakReference.get() : null;

      if (localbMB == null) {
        if (paramString == null) {
          localbMB = new bMB("<process>", null, Native.open(null, k(paramMap)), paramMap);
        }
        else {
          localbMB = b(paramString, paramMap);
        }
        localWeakReference = new WeakReference(localbMB);
        cuH.put(localbMB.getName() + paramMap, localWeakReference);
        File localFile = localbMB.getFile();
        if (localFile != null) {
          cuH.put(localFile.getAbsolutePath() + paramMap, localWeakReference);
          cuH.put(localFile.getName() + paramMap, localWeakReference);
        }
      }
      return localbMB;
    }
  }

  public static final synchronized bMB bUa()
  {
    return jU(null);
  }

  public static final synchronized bMB l(Map paramMap)
  {
    return c(null, paramMap);
  }

  public static final void an(String paramString1, String paramString2)
  {
    synchronized (gQk) {
      List localList = (List)gQk.get(paramString1);
      if (localList == null) {
        localList = Collections.synchronizedList(new LinkedList());
        gQk.put(paramString1, localList);
      }

      localList.add(paramString2);
    }
  }

  public cvp jV(String paramString)
  {
    return C(paramString, this.gQj);
  }

  public cvp a(String paramString, Method paramMethod)
  {
    int i = this.gQj;
    Class[] arrayOfClass = paramMethod.getExceptionTypes();
    for (int j = 0; j < arrayOfClass.length; j++) {
      if ((cvS == null ? (bMB.cvS = cd("dRy")) : cvS).isAssignableFrom(arrayOfClass[j])) {
        i |= 4;
      }
    }
    return C(paramString, i);
  }

  public cvp C(String paramString, int paramInt)
  {
    if (paramString == null)
      throw new NullPointerException("Function name may not be null");
    synchronized (this.gOT) {
      String str = B(paramString, paramInt);
      cvp localcvp = (cvp)this.gOT.get(str);
      if (localcvp == null) {
        localcvp = new cvp(this, paramString, paramInt);
        this.gOT.put(str, localcvp);
      }
      return localcvp;
    }
  }

  public Map getOptions()
  {
    return this.aPd;
  }

  public axA jW(String paramString)
  {
    try
    {
      return new axA(jX(paramString));
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
      throw new UnsatisfiedLinkError("Error looking up '" + paramString + "': " + localUnsatisfiedLinkError.getMessage());
    }
  }

  long jX(String paramString)
  {
    if (this.handle == 0L) {
      throw new UnsatisfiedLinkError("Library has been unloaded");
    }
    return Native.findSymbol(this.handle, paramString);
  }
  public String toString() {
    return "Native Library <" + this.gQi + "@" + this.handle + ">";
  }

  public String getName() {
    return this.gQh;
  }

  public File getFile()
  {
    if (this.gQi == null)
      return null;
    return new File(this.gQi);
  }

  protected void finalize() {
    dispose();
  }

  public static void bUb()
  {
    HashSet localHashSet;
    synchronized (cuH) {
      localHashSet = new HashSet(cuH.values());
    }
    for (??? = localHashSet.iterator(); ((Iterator)???).hasNext(); ) {
      WeakReference localWeakReference = (WeakReference)((Iterator)???).next();
      bMB localbMB = (bMB)localWeakReference.get();
      if (localbMB != null)
        localbMB.dispose();
    }
  }

  public void dispose()
  {
    Iterator localIterator;
    synchronized (cuH) {
      for (localIterator = cuH.values().iterator(); localIterator.hasNext(); ) {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() == this) {
          localIterator.remove();
        }
      }
    }
    synchronized (this) {
      if (this.handle != 0L) {
        Native.close(this.handle);
        this.handle = 0L;
      }
    }
  }

  private static List jY(String paramString) {
    String str1 = System.getProperty(paramString, "");
    if ("".equals(str1)) {
      return Collections.EMPTY_LIST;
    }
    StringTokenizer localStringTokenizer = new StringTokenizer(str1, File.pathSeparator);
    ArrayList localArrayList = new ArrayList();
    while (localStringTokenizer.hasMoreTokens()) {
      String str2 = localStringTokenizer.nextToken();
      if (!"".equals(str2)) {
        localArrayList.add(str2);
      }
    }
    return localArrayList;
  }

  private static String b(String paramString, List paramList)
  {
    if (new File(paramString).isAbsolute()) {
      return paramString;
    }

    String str1 = mapLibraryName(paramString);

    for (Iterator localIterator = paramList.iterator(); localIterator.hasNext(); ) {
      String str2 = (String)localIterator.next();
      File localFile = new File(str2, str1);
      if (localFile.exists()) {
        return localFile.getAbsolutePath();
      }
      if (bIG.bPT())
      {
        if (str1.endsWith(".dylib")) {
          localFile = new File(str2, str1.substring(0, str1.lastIndexOf(".dylib")) + ".jnilib");
          if (localFile.exists()) {
            return localFile.getAbsolutePath();
          }

        }

      }

    }

    return str1;
  }

  private static String mapLibraryName(String paramString) {
    if (bIG.bPT()) {
      if ((paramString.startsWith("lib")) && ((paramString.endsWith(".dylib")) || (paramString.endsWith(".jnilib"))))
      {
        return paramString;
      }
      String str = System.mapLibraryName(paramString);

      if (str.endsWith(".jnilib")) {
        return str.substring(0, str.lastIndexOf(".jnilib")) + ".dylib";
      }
      return str;
    }
    if (bIG.bPV()) {
      if ((jZ(paramString)) || (paramString.endsWith(".so")))
      {
        return paramString;
      }
    }
    else if (bIG.bPW()) {
      if (paramString.startsWith("lib")) {
        return paramString;
      }
    }
    else if ((bIG.bPY()) && (
      (paramString.endsWith(".drv")) || (paramString.endsWith(".dll")))) {
      return paramString;
    }

    return System.mapLibraryName(paramString);
  }

  private static boolean jZ(String paramString) {
    if (paramString.startsWith("lib")) {
      int i = paramString.lastIndexOf(".so.");
      if ((i != -1) && (i + 4 < paramString.length())) {
        for (int j = i + 4; j < paramString.length(); j++) {
          char c = paramString.charAt(j);
          if ((!Character.isDigit(c)) && (c != '.')) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  static String c(String paramString, List paramList)
  {
    File localFile = new File(paramString);
    if (localFile.isAbsolute()) {
      paramList = Arrays.asList(new String[] { localFile.getParent() });
    }
    dVP localdVP = new dVP(paramString);

    LinkedList localLinkedList = new LinkedList();
    for (Iterator localIterator1 = paramList.iterator(); localIterator1.hasNext(); ) {
      File[] arrayOfFile = new File((String)localIterator1.next()).listFiles(localdVP);
      if ((arrayOfFile != null) && (arrayOfFile.length > 0)) {
        localLinkedList.addAll(Arrays.asList(arrayOfFile));
      }

    }

    double d1 = -1.0D;
    Object localObject = null;
    for (Iterator localIterator2 = localLinkedList.iterator(); localIterator2.hasNext(); ) {
      String str1 = ((File)localIterator2.next()).getAbsolutePath();
      String str2 = str1.substring(str1.lastIndexOf(".so.") + 4);
      double d2 = ka(str2);
      if (d2 > d1) {
        d1 = d2;
        localObject = str1;
      }
    }
    return localObject;
  }

  static double ka(String paramString) {
    double d1 = 0.0D;
    double d2 = 1.0D;
    int i = paramString.indexOf(".");
    while (paramString != null)
    {
      String str;
      if (i != -1) {
        str = paramString.substring(0, i);
        paramString = paramString.substring(i + 1);
        i = paramString.indexOf(".");
      }
      else {
        str = paramString;
        paramString = null;
      }
      try {
        d1 += Integer.parseInt(str) / d2;
      }
      catch (NumberFormatException localNumberFormatException) {
        return 0.0D;
      }
      d2 *= 100.0D;
    }

    return d1;
  }

  private static String bUc()
  {
    String str1 = System.getProperty("os.arch").toLowerCase().trim();
    String str2 = bIG.bQc() ? "" : bIG.bQd() ? "-kfreebsd" : "-linux";

    String str3 = "-gnu";

    if (bIG.bQg()) {
      str1 = bIG.is64Bit() ? "x86_64" : "i386";
    }
    else if (bIG.bQh()) {
      str1 = bIG.is64Bit() ? "powerpc64" : "powerpc";
    }
    else if (bIG.bQi()) {
      str1 = "arm";
      str3 = "-gnueabi";
    }

    return str1 + str2 + str3;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }

  static boolean kb(String paramString)
  {
    return jZ(paramString);
  }

  static
  {
    if (Native.cuK == 0) {
      throw new Error("Native library not initialized");
    }

    String str1 = Native.dC("jnidispatch");
    if (str1 != null) {
      gQl.add(str1);
    }
    if ((System.getProperty("jna.platform.library.path") == null) && (!bIG.bPY()))
    {
      String str2 = "";
      String str3 = "";
      String str4 = "";

      if ((bIG.bPV()) || (bIG.bPZ()) || (bIG.bQa()) || (bIG.bQd()))
      {
        str4 = (bIG.bPZ() ? "/" : "") + axA.SIZE * 8;
      }
      String[] arrayOfString = { "/usr/lib" + str4, "/lib" + str4, "/usr/lib", "/lib" };

      if ((bIG.bPV()) || (bIG.bQd()) || (bIG.bQc())) {
        String str5 = bUc();

        arrayOfString = new String[] { "/usr/lib/" + str5, "/lib/" + str5, "/usr/lib" + str4, "/lib" + str4, "/usr/lib", "/lib" };
      }

      for (int i = 0; i < arrayOfString.length; i++) {
        File localFile = new File(arrayOfString[i]);
        if ((localFile.exists()) && (localFile.isDirectory())) {
          str2 = str2 + str3 + arrayOfString[i];
          str3 = File.pathSeparator;
        }
      }
      if (!"".equals(str2)) {
        System.setProperty("jna.platform.library.path", str2);
      }
    }
    gQl.addAll(jY("jna.platform.library.path"));
  }
}