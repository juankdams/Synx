import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;

public class aXW
{
  private Map fdt = new HashMap();

  private final Hashtable fdu = new Hashtable();

  private final Hashtable fdv = new Hashtable();

  private boolean fdw = true;

  private final Hashtable fdx = new Hashtable();

  private boolean fdy = true;

  private final HashSet fdz = new HashSet();

  private Stack fdA = new Stack();

  private String fdB = null;
  private aXW fdC;
  private FF aIn;
  private static final String fdD = "Can't load default task list";
  private static final String fdE = "Can't load default type list";
  public static final String fdF = "ant.ComponentHelper";
  private static final String fdG = "only";
  private static final String fdH = "property";
  private static Properties[] fdI = new Properties[2];

  public FF Ga()
  {
    return this.aIn;
  }

  public static aXW v(FF paramFF)
  {
    if (paramFF == null) {
      return null;
    }

    aXW localaXW = (aXW)paramFF.bR("ant.ComponentHelper");
    if (localaXW != null) {
      return localaXW;
    }
    localaXW = new aXW();
    localaXW.b(paramFF);

    paramFF.g("ant.ComponentHelper", localaXW);
    return localaXW;
  }

  public void a(aXW paramaXW)
  {
    this.fdC = paramaXW;
  }

  public aXW bni()
  {
    return this.fdC;
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  private synchronized Set bnj()
  {
    Set localSet = (Set)this.fdz.clone();
    return localSet;
  }

  private Map bnk()
  {
    HashMap localHashMap = new HashMap();
    synchronized (this.fdt) {
      for (Map.Entry localEntry : this.fdt.entrySet()) {
        Object localObject1 = (List)localEntry.getValue();
        synchronized (localObject1)
        {
          localObject1 = new ArrayList((Collection)localObject1);
        }
        localHashMap.put(localEntry.getKey(), localObject1);
      }
    }
    return localHashMap;
  }

  public void b(aXW paramaXW)
  {
    Hashtable localHashtable = (Hashtable)paramaXW.fdu.clone();
    synchronized (this.fdu) {
      for (dTY localdTY : localHashtable.values()) {
        this.fdu.put(localdTY.getName(), localdTY);
      }
    }

    ??? = paramaXW.bnj();
    synchronized (this) {
      this.fdz.addAll((Collection)???);
    }
    ??? = paramaXW.bnk();
    synchronized (this.fdt) {
      this.fdt.putAll((Map)???);
    }
  }

  public Object a(aQS paramaQS, String paramString1, String paramString2)
  {
    Object localObject = hv(paramString2);
    if ((localObject instanceof aGK)) {
      aGK localaGK = (aGK)localObject;
      localaGK.a(paramaQS.gu());
      localaGK.gu(paramString2);
      localaGK.dt(paramaQS.aSI());
      localaGK.d(paramaQS.aSH());
      localaGK.init();
    }
    return localObject;
  }

  public Object hv(String paramString)
  {
    dTY localdTY = hx(paramString);
    return localdTY == null ? null : localdTY.w(this.aIn);
  }

  public Class hw(String paramString)
  {
    dTY localdTY = hx(paramString);
    return localdTY == null ? null : localdTY.J(this.aIn);
  }

  public dTY hx(String paramString)
  {
    hB(paramString);
    return (dTY)this.fdu.get(paramString);
  }

  public void bnl()
  {
    bnp();
    bnq();
    new bhf(this).execute();
  }

  public void b(String paramString, Class paramClass)
  {
    f(paramClass);
    dTY localdTY = new dTY();
    localdTY.setName(paramString);
    localdTY.setClassLoader(paramClass.getClassLoader());
    localdTY.R(paramClass);
    localdTY.S(dTR.class);
    localdTY.setClassName(paramClass.getName());
    localdTY.T(aGK.class);
    d(localdTY);
  }

  public void f(Class paramClass)
  {
    String str1;
    if (!Modifier.isPublic(paramClass.getModifiers())) {
      str1 = paramClass + " is not public";
      this.aIn.d(str1, 0);
      throw new cJ(str1);
    }
    if (Modifier.isAbstract(paramClass.getModifiers())) {
      str1 = paramClass + " is abstract";
      this.aIn.d(str1, 0);
      throw new cJ(str1);
    }
    try {
      paramClass.getConstructor((Class[])null);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      String str2 = "No public no-arg constructor in " + paramClass;
      this.aIn.d(str2, 0);
      throw new cJ(str2);
    }
    if (!aGK.class.isAssignableFrom(paramClass))
      dTR.a(paramClass, this.aIn);
  }

  public Hashtable PJ()
  {
    synchronized (this.fdv) {
      synchronized (this.fdu) {
        if (this.fdw) {
          this.fdv.clear();
          for (Map.Entry localEntry : this.fdu.entrySet()) {
            Class localClass = ((dTY)localEntry.getValue()).J(this.aIn);
            if (localClass != null)
            {
              if (aGK.class.isAssignableFrom(localClass))
                this.fdv.put(localEntry.getKey(), ((dTY)localEntry.getValue()).K(this.aIn));
            }
          }
          this.fdw = false;
        }
      }
    }
    return this.fdv;
  }

  public Hashtable PL()
  {
    synchronized (this.fdx) {
      synchronized (this.fdu) {
        if (this.fdy) {
          this.fdx.clear();
          for (Map.Entry localEntry : this.fdu.entrySet()) {
            Class localClass = ((dTY)localEntry.getValue()).J(this.aIn);
            if (localClass != null)
            {
              if (!aGK.class.isAssignableFrom(localClass))
                this.fdx.put(localEntry.getKey(), ((dTY)localEntry.getValue()).K(this.aIn));
            }
          }
          this.fdy = false;
        }
      }
    }
    return this.fdx;
  }

  public List hy(String paramString)
  {
    synchronized (this.fdt) {
      return (List)this.fdt.get(paramString);
    }
  }

  public void c(String paramString, Class paramClass)
  {
    dTY localdTY = new dTY();
    localdTY.setName(paramString);
    localdTY.R(paramClass);
    d(localdTY);
    this.aIn.d(" +User datatype: " + paramString + "     " + paramClass.getName(), 4);
  }

  public void a(dTY paramdTY)
  {
    if (!paramdTY.dub())
      d(paramdTY);
    else
      c(paramdTY);
  }

  public Hashtable bnm()
  {
    return this.fdu;
  }

  public aGK bL(String paramString)
  {
    aGK localaGK = hz(paramString);
    if ((localaGK == null) && (paramString.equals("property")))
    {
      b("property", dsH.class);
      localaGK = hz(paramString);
    }
    return localaGK;
  }

  private aGK hz(String paramString)
  {
    Class localClass = hw(paramString);
    if ((localClass == null) || (!aGK.class.isAssignableFrom(localClass))) {
      return null;
    }
    Object localObject = hv(paramString);
    if (localObject == null) {
      return null;
    }
    if (!(localObject instanceof aGK)) {
      throw new cJ("Expected a Task from '" + paramString + "' but got an instance of " + localObject.getClass().getName() + " instead");
    }

    aGK localaGK = (aGK)localObject;
    localaGK.gu(paramString);

    localaGK.dt(paramString);

    this.aIn.d("   +Task: " + paramString, 4);
    return localaGK;
  }

  public Object bM(String paramString)
  {
    return hv(paramString);
  }

  public String F(Object paramObject)
  {
    return c(paramObject, false);
  }

  public String c(Object paramObject, boolean paramBoolean)
  {
    Class localClass = paramObject.getClass();
    String str1 = localClass.getName();
    synchronized (this.fdu) {
      for (dTY localdTY : this.fdu.values()) {
        if ((str1.equals(localdTY.getClassName())) && (localClass == localdTY.J(this.aIn)))
        {
          String str2 = localdTY.getName();
          return "The <" + str2 + "> type";
        }
      }
    }
    return a(paramObject.getClass(), paramBoolean);
  }

  public static String a(FF paramFF, Object paramObject, boolean paramBoolean)
  {
    if (paramFF == null) {
      paramFF = FF.E(paramObject);
    }
    return paramFF == null ? a(paramObject.getClass(), paramBoolean) : v(paramFF).c(paramObject, paramBoolean);
  }

  private static String a(Class paramClass, boolean paramBoolean)
  {
    if (paramBoolean) {
      String str = paramClass.getName();
      return str.substring(str.lastIndexOf('.') + 1);
    }
    return paramClass.toString();
  }

  private boolean b(dTY paramdTY)
  {
    return (paramdTY.K(this.aIn) != null) && (paramdTY.J(this.aIn) != null);
  }

  private boolean a(dTY paramdTY1, dTY paramdTY2)
  {
    boolean bool = b(paramdTY1);
    int i = bool == b(paramdTY2) ? 1 : 0;

    return (i != 0) && ((!bool) || (paramdTY1.a(paramdTY2, this.aIn)));
  }

  private void c(dTY paramdTY)
  {
    String str = paramdTY.getName();
    Object localObject1 = null;
    synchronized (this.fdt) {
      localObject1 = (List)this.fdt.get(str);
      if (localObject1 == null) {
        localObject1 = new ArrayList();
        this.fdt.put(str, localObject1);
      }

    }

    synchronized (localObject1) {
      for (Iterator localIterator = ((List)localObject1).iterator(); localIterator.hasNext(); ) {
        dTY localdTY = (dTY)localIterator.next();
        if (localdTY.getClassName().equals(paramdTY.getClassName())) {
          localIterator.remove();
          break;
        }
      }
      ((List)localObject1).add(paramdTY);
    }
  }

  private void d(dTY paramdTY)
  {
    String str = paramdTY.getName();
    synchronized (this.fdu) {
      this.fdw = true;
      this.fdy = true;
      dTY localdTY = (dTY)this.fdu.get(str);
      if (localdTY != null) {
        if (a(paramdTY, localdTY)) {
          return;
        }
        Class localClass = localdTY.J(this.aIn);
        int i = (localClass != null) && (aGK.class.isAssignableFrom(localClass)) ? 1 : 0;
        this.aIn.d("Trying to override old definition of " + (i != 0 ? "task " : "datatype ") + str, paramdTY.b(localdTY, this.aIn) ? 3 : 1);
      }

      this.aIn.d(" +Datatype " + str + " " + paramdTY.getClassName(), 4);
      this.fdu.put(str, paramdTY);
    }
  }

  public void hA(String paramString)
  {
    this.fdB = paramString;
    this.fdA.push(paramString);
  }

  public String bnn()
  {
    return this.fdB;
  }

  public void bno()
  {
    this.fdA.pop();
    this.fdB = (this.fdA.size() == 0 ? null : (String)this.fdA.peek());
  }

  private void bnp()
  {
    ClassLoader localClassLoader = c(null);
    Properties localProperties = et(false);
    Enumeration localEnumeration = localProperties.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = localProperties.getProperty(str1);
      dTY localdTY = new dTY();
      localdTY.setName(str1);
      localdTY.setClassName(str2);
      localdTY.setClassLoader(localClassLoader);
      localdTY.T(aGK.class);
      localdTY.S(dTR.class);
      this.fdu.put(str1, localdTY);
    }
  }

  private ClassLoader c(ClassLoader paramClassLoader) {
    String str = this.aIn.getProperty("build.sysclasspath");
    if ((this.aIn.Pw() != null) && (!"only".equals(str)))
    {
      paramClassLoader = this.aIn.Pw();
    }
    return paramClassLoader;
  }

  private static synchronized Properties et(boolean paramBoolean)
  {
    int i = paramBoolean ? 1 : 0;
    if (fdI[i] == null) {
      String str1 = paramBoolean ? "/org/apache/tools/ant/types/defaults.properties" : "/org/apache/tools/ant/taskdefs/defaults.properties";

      String str2 = paramBoolean ? "Can't load default type list" : "Can't load default task list";
      InputStream localInputStream = null;
      try {
        localInputStream = aXW.class.getResourceAsStream(str1);
        if (localInputStream == null) {
          throw new cJ(str2);
        }
        Properties localProperties = new Properties();
        localProperties.load(localInputStream);
        fdI[i] = localProperties;
      } catch (IOException localIOException) {
        throw new cJ(str2, localIOException);
      } finally {
        wh.c(localInputStream);
      }
    }
    return fdI[i];
  }

  private void bnq()
  {
    ClassLoader localClassLoader = c(null);
    Properties localProperties = et(true);
    Enumeration localEnumeration = localProperties.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = localProperties.getProperty(str1);
      dTY localdTY = new dTY();
      localdTY.setName(str1);
      localdTY.setClassName(str2);
      localdTY.setClassLoader(localClassLoader);
      this.fdu.put(str1, localdTY);
    }
  }

  private synchronized void hB(String paramString)
  {
    String str = dhB.pd(paramString);
    if ("".equals(str)) {
      str = "antlib:org.apache.tools.ant";
    }
    if (!str.startsWith("antlib:")) {
      return;
    }
    if (this.fdz.contains(str)) {
      return;
    }
    this.fdz.add(str);

    if (this.fdu.size() == 0)
    {
      bnl();
    }
    qI localqI = new qI();
    localqI.b(this.aIn);
    localqI.init();
    localqI.setURI(str);

    localqI.dt(str);

    localqI.fP(cNX.nO(str));

    localqI.a(new Rz("ignore"));
    localqI.execute();
  }

  public String P(String paramString1, String paramString2)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    localPrintWriter.println("Problem: failed to create " + paramString2 + " " + paramString1);

    int i = 0;
    int j = 0;
    int k = 0;

    String str1 = System.getProperty("user.home");
    File localFile = new File(str1, aKB.enZ);

    int m = 0;
    String str3 = System.getProperty("ant.home");
    String str2;
    if (str3 != null) {
      localObject = new File(str3, "lib");
      str2 = ((File)localObject).getAbsolutePath();
    }
    else {
      m = 1;
      str2 = "ANT_HOME" + File.separatorChar + "lib";
    }
    Object localObject = new StringBuffer();
    String str4 = "        -";
    ((StringBuffer)localObject).append("        -");
    ((StringBuffer)localObject).append(str2);
    ((StringBuffer)localObject).append('\n');
    if (m != 0) {
      ((StringBuffer)localObject).append("        -");
      ((StringBuffer)localObject).append("the IDE Ant configuration dialogs");
    } else {
      ((StringBuffer)localObject).append("        -");
      ((StringBuffer)localObject).append(localFile);
      ((StringBuffer)localObject).append('\n');
      ((StringBuffer)localObject).append("        -");
      ((StringBuffer)localObject).append("a directory added on the command line with the -lib argument");
    }
    String str5 = ((StringBuffer)localObject).toString();

    dTY localdTY = hx(paramString1);
    if (localdTY == null)
    {
      a(localPrintWriter, paramString1, str5);
      k = 1;
    }
    else {
      String str6 = localdTY.getClassName();
      boolean bool1 = str6.startsWith("org.apache.tools.ant.");
      boolean bool2 = str6.startsWith("org.apache.tools.ant.taskdefs.optional");
      bool2 |= str6.startsWith("org.apache.tools.ant.types.optional");

      Class localClass = null;
      try {
        localClass = localdTY.duc();
      } catch (ClassNotFoundException localClassNotFoundException) {
        j = 1;
        if (!bool2) {
          k = 1;
        }
        a(localPrintWriter, str6, bool2, str5);
      } catch (NoClassDefFoundError localNoClassDefFoundError1) {
        j = 1;
        a(localPrintWriter, bool2, localNoClassDefFoundError1, str5);
      }

      if (localClass != null) {
        try
        {
          localdTY.b(localClass, this.aIn);

          localPrintWriter.println("The component could be instantiated.");
        } catch (NoSuchMethodException localNoSuchMethodException) {
          i = 1;
          localPrintWriter.println("Cause: The class " + str6 + " has no compatible constructor.");
        }
        catch (InstantiationException localInstantiationException)
        {
          i = 1;
          localPrintWriter.println("Cause: The class " + str6 + " is abstract and cannot be instantiated.");
        }
        catch (IllegalAccessException localIllegalAccessException) {
          i = 1;
          localPrintWriter.println("Cause: The constructor for " + str6 + " is private and cannot be invoked.");
        }
        catch (InvocationTargetException localInvocationTargetException) {
          i = 1;
          Throwable localThrowable = localInvocationTargetException.getTargetException();
          localPrintWriter.println("Cause: The constructor threw the exception");
          localPrintWriter.println(localThrowable.toString());
          localThrowable.printStackTrace(localPrintWriter);
        } catch (NoClassDefFoundError localNoClassDefFoundError2) {
          j = 1;
          localPrintWriter.println("Cause:  A class needed by class " + str6 + " cannot be found: ");

          localPrintWriter.println("       " + localNoClassDefFoundError2.getMessage());
          localPrintWriter.println("Action: Determine what extra JAR files are needed, and place them in:");

          localPrintWriter.println(str5);
        }
      }
      localPrintWriter.println();
      localPrintWriter.println("Do not panic, this is a common problem.");
      if (k != 0) {
        localPrintWriter.println("It may just be a typographical error in the build file or the task/type declaration.");
      }

      if (j != 0) {
        localPrintWriter.println("The commonest cause is a missing JAR.");
      }
      if (i != 0) {
        localPrintWriter.println("This is quite a low level problem, which may need consultation with the author of the task.");

        if (bool1) {
          localPrintWriter.println("This may be the Ant team. Please file a defect or contact the developer team.");
        }
        else {
          localPrintWriter.println("This does not appear to be a task bundled with Ant.");
          localPrintWriter.println("Please take it up with the supplier of the third-party " + paramString2 + ".");

          localPrintWriter.println("If you have written it yourself, you probably have a bug to fix.");
        }
      } else {
        localPrintWriter.println();
        localPrintWriter.println("This is not a bug; it is a configuration problem");
      }
    }
    localPrintWriter.flush();
    localPrintWriter.close();
    return localStringWriter.toString();
  }

  private void a(PrintWriter paramPrintWriter, String paramString1, String paramString2)
  {
    int i = paramString1.indexOf("antlib:") == 0 ? 1 : 0;
    String str1 = dhB.pd(paramString1);
    paramPrintWriter.println("Cause: The name is undefined.");
    paramPrintWriter.println("Action: Check the spelling.");
    paramPrintWriter.println("Action: Check that any custom tasks/types have been declared.");
    paramPrintWriter.println("Action: Check that any <presetdef>/<macrodef> declarations have taken place.");

    if (str1.length() > 0) {
      List localList = hC(str1);
      if (localList.size() > 0) {
        paramPrintWriter.println();
        paramPrintWriter.println("The definitions in the namespace " + str1 + " are:");
        for (dTY localdTY : localList) {
          String str2 = dhB.pe(localdTY.getName());
          paramPrintWriter.println("    " + str2);
        }
      } else {
        paramPrintWriter.println("No types or tasks have been defined in this namespace yet");
        if (i != 0) {
          paramPrintWriter.println();
          paramPrintWriter.println("This appears to be an antlib declaration. ");
          paramPrintWriter.println("Action: Check that the implementing library exists in one of:");
          paramPrintWriter.println(paramString2);
        }
      }
    }
  }

  private void a(PrintWriter paramPrintWriter, String paramString1, boolean paramBoolean, String paramString2)
  {
    paramPrintWriter.println("Cause: the class " + paramString1 + " was not found.");
    if (paramBoolean) {
      paramPrintWriter.println("        This looks like one of Ant's optional components.");
      paramPrintWriter.println("Action: Check that the appropriate optional JAR exists in");
      paramPrintWriter.println(paramString2);
    } else {
      paramPrintWriter.println("Action: Check that the component has been correctly declared");
      paramPrintWriter.println("        and that the implementing JAR is in one of:");
      paramPrintWriter.println(paramString2);
    }
  }

  private void a(PrintWriter paramPrintWriter, boolean paramBoolean, NoClassDefFoundError paramNoClassDefFoundError, String paramString)
  {
    paramPrintWriter.println("Cause: Could not load a dependent class " + paramNoClassDefFoundError.getMessage());

    if (paramBoolean) {
      paramPrintWriter.println("       It is not enough to have Ant's optional JARs");
      paramPrintWriter.println("       you need the JAR files that the optional tasks depend upon.");
      paramPrintWriter.println("       Ant's optional task dependencies are listed in the manual.");
    } else {
      paramPrintWriter.println("       This class may be in a separate JAR that is not installed.");
    }
    paramPrintWriter.println("Action: Determine what extra JAR files are needed, and place them in one of:");

    paramPrintWriter.println(paramString);
  }

  private List hC(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (this.fdu) {
      for (dTY localdTY : this.fdu.values()) {
        if (localdTY.getName().startsWith(paramString)) {
          localArrayList.add(localdTY);
        }
      }
    }
    return localArrayList;
  }
}