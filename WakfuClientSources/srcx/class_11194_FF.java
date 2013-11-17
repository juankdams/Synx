import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.WeakHashMap;

public class FF
  implements bnA
{
  public static final int bNd = 0;
  public static final int bNe = 1;
  public static final int bNf = 2;
  public static final int bNg = 3;
  public static final int bNh = 4;
  private static final String bNi = "VISITING";
  private static final String bNj = "VISITED";
  public static final String bNk = "1.0";
  public static final String bNl = "1.1";
  public static final String bNm = "1.2";
  public static final String bNn = "1.3";
  public static final String bNo = "1.4";
  public static final String bNp = "@";
  public static final String bNq = "@";
  private static final wh aIk = wh.Fo();
  private String name;
  private String description;
  private Hashtable bNr = new aR();

  private HashMap bNs = new HashMap();
  private String bNt;
  private Hashtable bNu = new Hashtable();

  private Jt bNv = new Jt();
  private btc bNw;
  private File bNx;
  private final Object bNy;
  private volatile bXm[] bNz;
  private final ThreadLocal bNA;
  private ClassLoader bNB;
  private final Map bNC;
  private final Map bND;
  private aKd bNE;
  private InputStream bNF;
  private boolean bNG;

  public void a(aKd paramaKd)
  {
    this.bNE = paramaKd;
  }

  public void d(InputStream paramInputStream)
  {
    this.bNF = paramInputStream;
  }

  public InputStream Pr()
  {
    return this.bNF;
  }

  public aKd Ps()
  {
    return this.bNE;
  }

  public FF()
  {
    this.bNv.b(this);

    this.bNw = new btc(this.bNv);

    this.bNy = new Object();

    this.bNz = new bXm[0];

    this.bNA = new Er(this);

    this.bNB = null;

    this.bNC = Collections.synchronizedMap(new WeakHashMap());

    this.bND = Collections.synchronizedMap(new WeakHashMap());

    this.bNE = null;

    this.bNF = null;

    this.bNG = false;

    this.bNE = new daN();
  }

  public FF Pt()
  {
    FF localFF = null;
    try {
      localFF = (FF)getClass().newInstance();
    } catch (Exception localException) {
      localFF = new FF();
    }
    k(localFF);
    return localFF;
  }

  public void k(FF paramFF)
  {
    aXW.v(paramFF).b(aXW.v(this));

    paramFF.d(Pr());
    paramFF.aC(PF());
    paramFF.a(PP().Ny());
  }

  public void init()
  {
    Pu();

    aXW.v(this).bnl();
  }

  public void Pu()
  {
    PH();
    PI();
    s("ant.version", bze.bHL());
    Pv();
  }

  private void Pv()
  {
    File localFile = djy.ak(FF.class);

    if (localFile != null)
      s("ant.core.lib", localFile.getAbsolutePath());
  }

  public iA b(aoo paramaoo)
  {
    return iA.a(getClass().getClassLoader(), this, paramaoo, true);
  }

  public iA a(ClassLoader paramClassLoader, aoo paramaoo)
  {
    return iA.a(paramClassLoader, this, paramaoo, true);
  }

  public void b(ClassLoader paramClassLoader)
  {
    this.bNB = paramClassLoader;
  }

  public ClassLoader Pw()
  {
    return this.bNB;
  }

  public void a(bXm parambXm)
  {
    synchronized (this.bNy)
    {
      for (int i = 0; i < this.bNz.length; i++) {
        if (this.bNz[i] == parambXm) {
          return;
        }
      }

      bXm[] arrayOfbXm = new bXm[this.bNz.length + 1];

      System.arraycopy(this.bNz, 0, arrayOfbXm, 0, this.bNz.length);
      arrayOfbXm[this.bNz.length] = parambXm;
      this.bNz = arrayOfbXm;
    }
  }

  public void b(bXm parambXm)
  {
    synchronized (this.bNy)
    {
      for (int i = 0; i < this.bNz.length; i++)
        if (this.bNz[i] == parambXm) {
          bXm[] arrayOfbXm = new bXm[this.bNz.length - 1];

          System.arraycopy(this.bNz, 0, arrayOfbXm, 0, i);
          System.arraycopy(this.bNz, i + 1, arrayOfbXm, i, this.bNz.length - i - 1);

          this.bNz = arrayOfbXm;
          break;
        }
    }
  }

  public Vector Px()
  {
    synchronized (this.bNy) {
      Vector localVector = new Vector(this.bNz.length);
      for (int i = 0; i < this.bNz.length; i++) {
        localVector.add(this.bNz[i]);
      }
      return localVector;
    }
  }

  public void log(String paramString)
  {
    d(paramString, 2);
  }

  public void d(String paramString, int paramInt)
  {
    a(paramString, null, paramInt);
  }

  public void a(String paramString, Throwable paramThrowable, int paramInt)
  {
    a(this, paramString, paramThrowable, paramInt);
  }

  public void a(aGK paramaGK, String paramString, int paramInt)
  {
    b(paramaGK, paramString, null, paramInt);
  }

  public void a(aGK paramaGK, String paramString, Throwable paramThrowable, int paramInt)
  {
    b(paramaGK, paramString, paramThrowable, paramInt);
  }

  public void a(wZ paramwZ, String paramString, int paramInt)
  {
    a(paramwZ, paramString, null, paramInt);
  }

  public void a(wZ paramwZ, String paramString, Throwable paramThrowable, int paramInt)
  {
    b(paramwZ, paramString, paramThrowable, paramInt);
  }

  public Jt Py()
  {
    return this.bNv;
  }

  public void setProperty(String paramString1, String paramString2)
  {
    afR.t(this).b(paramString1, paramString2, true);
  }

  public void p(String paramString1, String paramString2)
  {
    afR.t(this).j(paramString1, paramString2);
  }

  public void q(String paramString1, String paramString2)
  {
    afR.t(this).k(paramString1, paramString2);
  }

  public void r(String paramString1, String paramString2)
  {
    afR.t(this).l(paramString1, paramString2);
  }

  private void s(String paramString1, String paramString2)
  {
    afR.t(this).b(paramString1, paramString2, false);
  }

  public String getProperty(String paramString)
  {
    Object localObject = afR.t(this).getProperty(paramString);
    return localObject == null ? null : String.valueOf(localObject);
  }

  public String bH(String paramString)
  {
    return afR.t(this).a(null, paramString, null);
  }

  public String bI(String paramString)
  {
    return (String)afR.t(this).ek(paramString);
  }

  public Hashtable Pz()
  {
    return afR.t(this).Pz();
  }

  public Hashtable PA()
  {
    return afR.t(this).PA();
  }

  public Hashtable PB()
  {
    return afR.t(this).PB();
  }

  public void l(FF paramFF)
  {
    afR.t(this).l(paramFF);
  }

  public void m(FF paramFF)
  {
    afR.t(this).m(paramFF);
  }

  public void bJ(String paramString)
  {
    bK(paramString);
  }

  public String PC()
  {
    return this.bNt;
  }

  public void bK(String paramString)
  {
    if (paramString != null) {
      q("ant.project.default-target", paramString);
    }
    this.bNt = paramString;
  }

  public void setName(String paramString)
  {
    q("ant.project.name", paramString);
    this.name = paramString;
  }

  public String getName()
  {
    return this.name;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    if (this.description == null) {
      this.description = bjx.x(this);
    }
    return this.description;
  }

  public void t(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return;
    }
    this.bNv.a(new bCX(paramString1, paramString2));
  }

  public Hashtable PD()
  {
    return this.bNv.TD();
  }

  public void K(String paramString)
  {
    w(new File(paramString));
  }

  public void w(File paramFile)
  {
    paramFile = aIk.aS(paramFile.getAbsolutePath());
    if (!paramFile.exists()) {
      throw new cJ("Basedir " + paramFile.getAbsolutePath() + " does not exist");
    }

    if (!paramFile.isDirectory()) {
      throw new cJ("Basedir " + paramFile.getAbsolutePath() + " is not a directory");
    }

    this.bNx = paramFile;
    s("basedir", this.bNx.getPath());
    String str = "Project base dir set to: " + this.bNx;
    d(str, 3);
  }

  public File PE()
  {
    if (this.bNx == null) {
      try {
        K(".");
      } catch (cJ localcJ) {
        localcJ.printStackTrace();
      }
    }
    return this.bNx;
  }

  public void aC(boolean paramBoolean)
  {
    this.bNG = paramBoolean;
  }

  public boolean PF()
  {
    return this.bNG;
  }

  public static String PG()
  {
    return cpW.PG();
  }

  public void PH()
  {
    String str = cpW.PG();
    s("ant.java.version", str);

    if (!cpW.lP("1.4")) {
      throw new cJ("Ant cannot work on Java prior to 1.4");
    }
    d("Detected Java version: " + str + " in: " + System.getProperty("java.home"), 3);

    d("Detected OS: " + System.getProperty("os.name"), 3);
  }

  public void PI()
  {
    Properties localProperties = System.getProperties();
    Enumeration localEnumeration = localProperties.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = localProperties.getProperty(str1);
      if (str2 != null)
        s(str1, str2);
    }
  }

  public void b(String paramString, Class paramClass)
  {
    aXW.v(this).b(paramString, paramClass);
  }

  public void f(Class paramClass)
  {
    aXW.v(this).f(paramClass);
    String str1;
    if (!Modifier.isPublic(paramClass.getModifiers())) {
      str1 = paramClass + " is not public";
      d(str1, 0);
      throw new cJ(str1);
    }
    if (Modifier.isAbstract(paramClass.getModifiers())) {
      str1 = paramClass + " is abstract";
      d(str1, 0);
      throw new cJ(str1);
    }
    try {
      paramClass.getConstructor(new Class[0]);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      str2 = "No public no-arg constructor in " + paramClass;

      d(str2, 0);
      throw new cJ(str2);
    } catch (LinkageError localLinkageError) {
      String str2 = "Could not load " + paramClass + ": " + localLinkageError;
      d(str2, 0);
      throw new cJ(str2, localLinkageError);
    }
    if (!aGK.class.isAssignableFrom(paramClass))
      dTR.a(paramClass, this);
  }

  public Hashtable PJ()
  {
    return aXW.v(this).PJ();
  }

  public Map PK()
  {
    return new HashMap(PJ());
  }

  public void c(String paramString, Class paramClass)
  {
    aXW.v(this).c(paramString, paramClass);
  }

  public Hashtable PL()
  {
    return aXW.v(this).PL();
  }

  public Map PM()
  {
    return new HashMap(PL());
  }

  public void a(wZ paramwZ)
  {
    a(paramwZ.getName(), paramwZ);
  }

  public void a(String paramString, wZ paramwZ)
  {
    if (this.bNu.get(paramString) != null) {
      throw new cJ("Duplicate target: `" + paramString + "'");
    }
    b(paramString, paramwZ);
  }

  public void b(wZ paramwZ)
  {
    b(paramwZ.getName(), paramwZ);
  }

  public void b(String paramString, wZ paramwZ)
  {
    String str = " +Target: " + paramString;
    d(str, 4);
    paramwZ.b(this);
    this.bNu.put(paramString, paramwZ);
  }

  public Hashtable PN()
  {
    return this.bNu;
  }

  public Map PO()
  {
    return new HashMap(this.bNu);
  }

  public aGK bL(String paramString)
  {
    return aXW.v(this).bL(paramString);
  }

  public Object bM(String paramString)
  {
    return aXW.v(this).bM(paramString);
  }

  public void a(cTb paramcTb)
  {
    g("ant.executor", paramcTb);
  }

  public cTb PP()
  {
    Object localObject = bR("ant.executor");
    if (localObject == null) {
      String str = getProperty("ant.executor.class");
      if (str == null) {
        str = bSF.class.getName();
      }
      d("Attempting to create object of type " + str, 4);
      try {
        localObject = Class.forName(str, true, this.bNB).newInstance();
      }
      catch (ClassNotFoundException localClassNotFoundException) {
        try {
          localObject = Class.forName(str).newInstance();
        } catch (Exception localException2) {
          d(localException2.toString(), 0);
        }
      } catch (Exception localException1) {
        d(localException1.toString(), 0);
      }
      if (localObject == null) {
        throw new cJ("Unable to obtain a Target Executor instance.");
      }

      a((cTb)localObject);
    }
    return (cTb)localObject;
  }

  public void a(Vector paramVector)
  {
    q("ant.project.invoked-targets", dst.w(paramVector));

    PP().a(this, (String[])paramVector.toArray(new String[paramVector.size()]));
  }

  public void h(String paramString, boolean paramBoolean)
  {
    aGK localaGK = a(Thread.currentThread());
    if (localaGK == null) {
      d(paramString, paramBoolean ? 1 : 2);
    }
    else if (paramBoolean)
      localaGK.gx(paramString);
    else
      localaGK.gv(paramString);
  }

  public int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.bNF != null) {
      System.out.flush();
      return this.bNF.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    throw new EOFException("No input provided for project");
  }

  public int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    aGK localaGK = a(Thread.currentThread());
    if (localaGK == null) {
      return c(paramArrayOfByte, paramInt1, paramInt2);
    }
    return localaGK.g(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void i(String paramString, boolean paramBoolean)
  {
    aGK localaGK = a(Thread.currentThread());
    if (localaGK == null) {
      a(this, paramString, paramBoolean ? 0 : 2);
    }
    else if (paramBoolean)
      localaGK.gy(paramString);
    else
      localaGK.gw(paramString);
  }

  public void bN(String paramString)
  {
    if (paramString == null) {
      String str = "No target specified";
      throw new cJ(str);
    }

    b(a(paramString, this.bNu, false));
  }

  public void b(Vector paramVector)
  {
    HashSet localHashSet = new HashSet();
    cJ localcJ = null;
    for (wZ localwZ : paramVector) {
      int i = 1;
      Object localObject = localwZ.Gc();
      while (((Enumeration)localObject).hasMoreElements()) {
        String str = (String)((Enumeration)localObject).nextElement();
        if (!localHashSet.contains(str)) {
          i = 0;
          a(localwZ, "Cannot execute '" + localwZ.getName() + "' - '" + str + "' failed or was not executed.", 0);

          break;
        }
      }
      if (i != 0) {
        localObject = null;
        try {
          localwZ.Gf();
          localHashSet.add(localwZ.getName());
        } catch (RuntimeException localRuntimeException) {
          if (!this.bNG) {
            throw localRuntimeException;
          }
          localObject = localRuntimeException;
        } catch (Throwable localThrowable) {
          if (!this.bNG) {
            throw new cJ(localThrowable);
          }
          localObject = localThrowable;
        }
        if (localObject != null) {
          if ((localObject instanceof cJ)) {
            a(localwZ, "Target '" + localwZ.getName() + "' failed with message '" + ((Throwable)localObject).getMessage() + "'.", 0);

            if (localcJ == null)
              localcJ = (cJ)localObject;
          }
          else {
            a(localwZ, "Target '" + localwZ.getName() + "' failed with message '" + ((Throwable)localObject).getMessage() + "'.", 0);

            ((Throwable)localObject).printStackTrace(System.err);
            if (localcJ == null) {
              localcJ = new cJ((Throwable)localObject);
            }
          }
        }
      }
    }

    if (localcJ != null)
      throw localcJ;
  }

  public File a(String paramString, File paramFile)
  {
    return aIk.e(paramFile, paramString);
  }

  public File bO(String paramString)
  {
    return aIk.e(this.bNx, paramString);
  }

  public static String aR(String paramString)
  {
    return wh.aR(paramString);
  }

  public void j(String paramString1, String paramString2)
  {
    aIk.j(paramString1, paramString2);
  }

  public void b(String paramString1, String paramString2, boolean paramBoolean)
  {
    aIk.a(paramString1, paramString2, paramBoolean ? this.bNw : null);
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    aIk.a(paramString1, paramString2, paramBoolean1 ? this.bNw : null, paramBoolean2);
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    aIk.a(paramString1, paramString2, paramBoolean1 ? this.bNw : null, paramBoolean2, paramBoolean3);
  }

  public void a(File paramFile1, File paramFile2)
  {
    aIk.a(paramFile1, paramFile2);
  }

  public void b(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    aIk.a(paramFile1, paramFile2, paramBoolean ? this.bNw : null);
  }

  public void a(File paramFile1, File paramFile2, boolean paramBoolean1, boolean paramBoolean2)
  {
    aIk.a(paramFile1, paramFile2, paramBoolean1 ? this.bNw : null, paramBoolean2);
  }

  public void a(File paramFile1, File paramFile2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    aIk.a(paramFile1, paramFile2, paramBoolean1 ? this.bNw : null, paramBoolean2, paramBoolean3);
  }

  public void a(File paramFile, long paramLong)
  {
    aIk.a(paramFile, paramLong);
    d("Setting modification time for " + paramFile, 3);
  }

  public static boolean bP(String paramString)
  {
    return ("on".equalsIgnoreCase(paramString)) || ("true".equalsIgnoreCase(paramString)) || ("yes".equalsIgnoreCase(paramString));
  }

  public static FF E(Object paramObject)
  {
    if ((paramObject instanceof dwE))
      return ((dwE)paramObject).Ga();
    try
    {
      Method localMethod = paramObject.getClass().getMethod("getProject", (Class[])null);
      if (FF.class == localMethod.getReturnType())
        return (FF)localMethod.invoke(paramObject, (Object[])null);
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final Vector a(String paramString, Hashtable paramHashtable)
  {
    return a(new String[] { paramString }, paramHashtable, true);
  }

  public final Vector a(String paramString, Hashtable paramHashtable, boolean paramBoolean)
  {
    return a(new String[] { paramString }, paramHashtable, paramBoolean);
  }

  public final Vector a(String[] paramArrayOfString, Hashtable paramHashtable, boolean paramBoolean)
  {
    Wm localWm = new Wm();
    Hashtable localHashtable = new Hashtable();
    Stack localStack = new Stack();

    for (int i = 0; i < paramArrayOfString.length; i++) {
      String str1 = (String)localHashtable.get(paramArrayOfString[i]);
      if (str1 == null)
        a(paramArrayOfString[i], paramHashtable, localHashtable, localStack, localWm);
      else if (str1 == "VISITING") {
        throw new RuntimeException("Unexpected node in visiting state: " + paramArrayOfString[i]);
      }
    }

    StringBuffer localStringBuffer = new StringBuffer("Build sequence for target(s)");

    for (int j = 0; j < paramArrayOfString.length; j++) {
      localStringBuffer.append(j == 0 ? " `" : ", `").append(paramArrayOfString[j]).append('\'');
    }
    localStringBuffer.append(" is " + localWm);
    d(localStringBuffer.toString(), 3);

    Vector localVector = paramBoolean ? localWm : new Vector(localWm);
    for (Enumeration localEnumeration = paramHashtable.keys(); localEnumeration.hasMoreElements(); ) {
      String str2 = (String)localEnumeration.nextElement();
      String str3 = (String)localHashtable.get(str2);
      if (str3 == null)
        a(str2, paramHashtable, localHashtable, localStack, localVector);
      else if (str3 == "VISITING") {
        throw new RuntimeException("Unexpected node in visiting state: " + str2);
      }
    }

    d("Complete build sequence is " + localVector, 3);
    return localWm;
  }

  private void a(String paramString, Hashtable paramHashtable1, Hashtable paramHashtable2, Stack paramStack, Vector paramVector)
  {
    paramHashtable2.put(paramString, "VISITING");
    paramStack.push(paramString);

    wZ localwZ = (wZ)paramHashtable1.get(paramString);
    String str1;
    if (localwZ == null) {
      localObject = new StringBuilder("Target \"");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("\" does not exist in the project \"");
      ((StringBuilder)localObject).append(this.name);
      ((StringBuilder)localObject).append("\". ");
      paramStack.pop();
      if (!paramStack.empty()) {
        str1 = (String)paramStack.peek();
        ((StringBuilder)localObject).append("It is used from target \"");
        ((StringBuilder)localObject).append(str1);
        ((StringBuilder)localObject).append("\".");
      }
      throw new cJ(new String((StringBuilder)localObject));
    }
    for (Object localObject = localwZ.Gc(); ((Enumeration)localObject).hasMoreElements(); ) {
      str1 = (String)((Enumeration)localObject).nextElement();
      String str2 = (String)paramHashtable2.get(str1);
      if (str2 == null)
      {
        a(str1, paramHashtable1, paramHashtable2, paramStack, paramVector);
      } else if (str2 == "VISITING")
      {
        throw a(str1, paramStack);
      }
    }
    localObject = (String)paramStack.pop();
    if (paramString != localObject) {
      throw new RuntimeException("Unexpected internal error: expected to pop " + paramString + " but got " + (String)localObject);
    }

    paramHashtable2.put(paramString, "VISITED");
    paramVector.addElement(localwZ);
  }

  private static cJ a(String paramString, Stack paramStack)
  {
    StringBuilder localStringBuilder = new StringBuilder("Circular dependency: ");
    localStringBuilder.append(paramString);
    String str;
    do
    {
      str = (String)paramStack.pop();
      localStringBuilder.append(" <- ");
      localStringBuilder.append(str);
    }while (!str.equals(paramString));
    return new cJ(localStringBuilder.toString());
  }

  public void n(FF paramFF)
  {
  }

  public void f(String paramString, Object paramObject)
  {
    this.bNs.put(paramString, paramObject);
  }

  public void g(String paramString, Object paramObject)
  {
    Object localObject = aR.a((aR)this.bNr, paramString);
    if (localObject == paramObject)
    {
      return;
    }
    if ((localObject != null) && (!(localObject instanceof aQS))) {
      d("Overriding previous definition of reference to " + paramString, 3);
    }

    d("Adding reference: " + paramString, 4);
    this.bNr.put(paramString, paramObject);
  }

  public Hashtable PQ()
  {
    return this.bNr;
  }

  public boolean bQ(String paramString)
  {
    return this.bNr.containsKey(paramString);
  }

  public Map PR()
  {
    return new HashMap(this.bNr);
  }

  public Object bR(String paramString)
  {
    Object localObject = this.bNr.get(paramString);
    if (localObject != null) {
      return localObject;
    }
    if (!paramString.equals("ant.PropertyHelper")) {
      try {
        if (afR.t(this).ej(paramString)) {
          d("Unresolvable reference " + paramString + " might be a misuse of property expansion syntax.", 1);
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public String F(Object paramObject)
  {
    return aXW.v(this).F(paramObject);
  }

  public void PS()
  {
    aaQ localaaQ = new aaQ(this);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      arrayOfbXm[i].a(localaaQ);
  }

  public void b(Throwable paramThrowable)
  {
    aaQ localaaQ = new aaQ(this);
    localaaQ.setException(paramThrowable);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++) {
      arrayOfbXm[i].b(localaaQ);
    }

    wE.clearCache();
  }

  public void PT()
  {
    aaQ localaaQ = new aaQ(this);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      if ((arrayOfbXm[i] instanceof dAh))
        ((dAh)arrayOfbXm[i]).d(localaaQ);
  }

  public void c(Throwable paramThrowable)
  {
    aaQ localaaQ = new aaQ(this);
    localaaQ.setException(paramThrowable);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      if ((arrayOfbXm[i] instanceof dAh))
        ((dAh)arrayOfbXm[i]).c(localaaQ);
  }

  protected void c(wZ paramwZ)
  {
    aaQ localaaQ = new aaQ(paramwZ);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      arrayOfbXm[i].e(localaaQ);
  }

  protected void a(wZ paramwZ, Throwable paramThrowable)
  {
    aaQ localaaQ = new aaQ(paramwZ);
    localaaQ.setException(paramThrowable);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      arrayOfbXm[i].f(localaaQ);
  }

  protected void b(aGK paramaGK)
  {
    a(Thread.currentThread(), paramaGK);
    aaQ localaaQ = new aaQ(paramaGK);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      arrayOfbXm[i].g(localaaQ);
  }

  protected void a(aGK paramaGK, Throwable paramThrowable)
  {
    a(Thread.currentThread(), null);
    System.out.flush();
    System.err.flush();
    aaQ localaaQ = new aaQ(paramaGK);
    localaaQ.setException(paramThrowable);
    bXm[] arrayOfbXm = this.bNz;
    for (int i = 0; i < arrayOfbXm.length; i++)
      arrayOfbXm[i].h(localaaQ);
  }

  private void a(aaQ paramaaQ, String paramString, int paramInt)
  {
    if (paramString == null) {
      paramString = String.valueOf(paramString);
    }
    if (paramString.endsWith(bof.LINE_SEP)) {
      int i = paramString.length() - bof.LINE_SEP.length();
      paramaaQ.i(paramString.substring(0, i), paramInt);
    } else {
      paramaaQ.i(paramString, paramInt);
    }
    if (this.bNA.get() != Boolean.FALSE)
    {
      return;
    }
    try {
      this.bNA.set(Boolean.TRUE);
      bXm[] arrayOfbXm = this.bNz;
      for (int j = 0; j < arrayOfbXm.length; j++)
        arrayOfbXm[j].i(paramaaQ);
    }
    finally {
      this.bNA.set(Boolean.FALSE);
    }
  }

  protected void a(FF paramFF, String paramString, int paramInt)
  {
    a(paramFF, paramString, null, paramInt);
  }

  protected void a(FF paramFF, String paramString, Throwable paramThrowable, int paramInt)
  {
    aaQ localaaQ = new aaQ(paramFF);
    localaaQ.setException(paramThrowable);
    a(localaaQ, paramString, paramInt);
  }

  protected void b(wZ paramwZ, String paramString, int paramInt)
  {
    b(paramwZ, paramString, null, paramInt);
  }

  protected void b(wZ paramwZ, String paramString, Throwable paramThrowable, int paramInt)
  {
    aaQ localaaQ = new aaQ(paramwZ);
    localaaQ.setException(paramThrowable);
    a(localaaQ, paramString, paramInt);
  }

  protected void b(aGK paramaGK, String paramString, int paramInt)
  {
    b(paramaGK, paramString, null, paramInt);
  }

  protected void b(aGK paramaGK, String paramString, Throwable paramThrowable, int paramInt)
  {
    aaQ localaaQ = new aaQ(paramaGK);
    localaaQ.setException(paramThrowable);
    a(localaaQ, paramString, paramInt);
  }

  public void a(Thread paramThread, aGK paramaGK)
  {
    synchronized (this.bNC) {
      if (paramaGK != null) {
        this.bNC.put(paramThread, paramaGK);
        this.bND.put(paramThread.getThreadGroup(), paramaGK);
      } else {
        this.bNC.remove(paramThread);
        this.bND.remove(paramThread.getThreadGroup());
      }
    }
  }

  public aGK a(Thread paramThread)
  {
    synchronized (this.bNC) {
      aGK localaGK = (aGK)this.bNC.get(paramThread);
      if (localaGK == null) {
        ThreadGroup localThreadGroup = paramThread.getThreadGroup();
        while ((localaGK == null) && (localThreadGroup != null)) {
          localaGK = (aGK)this.bND.get(localThreadGroup);
          localThreadGroup = localThreadGroup.getParent();
        }
      }
      return localaGK;
    }
  }

  public final void G(Object paramObject)
  {
    if ((paramObject instanceof dwE)) {
      ((dwE)paramObject).b(this);
      return;
    }
    try {
      Method localMethod = paramObject.getClass().getMethod("setProject", new Class[] { FF.class });

      if (localMethod != null)
        localMethod.invoke(paramObject, new Object[] { this });
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public bFe bS(String paramString)
  {
    return new WO(PE(), paramString);
  }
}