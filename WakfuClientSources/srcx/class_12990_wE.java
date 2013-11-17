import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class wE
{
  private static final Map bmw = new Hashtable();

  private static final Map bmx = new HashMap(8);
  private static final int bmy = 20;
  private static final String bmz = "...";
  private final Hashtable bmA = new Hashtable();

  private final Hashtable bmB = new Hashtable();

  private final Hashtable bmC = new Hashtable();

  private final Hashtable bmD = new Hashtable();

  private final List bmE = new ArrayList();
  private final Method bmF;
  private final Class bmG;
  protected static final String bmH = " doesn't support the nested \"";
  protected static final String bmI = "\" element.";

  private wE(Class paramClass)
  {
    this.bmG = paramClass;
    Method[] arrayOfMethod = paramClass.getMethods();
    Method localMethod1 = null;
    for (int i = 0; i < arrayOfMethod.length; i++) {
      Method localMethod2 = arrayOfMethod[i];
      String str1 = localMethod2.getName();
      Class localClass = localMethod2.getReturnType();
      Class[] arrayOfClass = localMethod2.getParameterTypes();

      if ((arrayOfClass.length == 1) && (Void.TYPE.equals(localClass)) && (("add".equals(str1)) || ("addConfigured".equals(str1))))
      {
        a(localMethod2);
      }
      else if ((!dwE.class.isAssignableFrom(paramClass)) || (arrayOfClass.length != 1) || (!a(str1, arrayOfClass[0])))
      {
        if ((!FE()) || (arrayOfClass.length != 1) || (!"addTask".equals(str1)) || (!aGK.class.equals(arrayOfClass[0])))
        {
          if (("addText".equals(str1)) && (Void.TYPE.equals(localClass)) && (arrayOfClass.length == 1) && (String.class.equals(arrayOfClass[0])))
          {
            localMethod1 = arrayOfMethod[i];
          }
          else
          {
            Object localObject;
            if ((str1.startsWith("set")) && (Void.TYPE.equals(localClass)) && (arrayOfClass.length == 1) && (!arrayOfClass[0].isArray()))
            {
              localObject = m(str1, "set");
              bKj localbKj = (bKj)this.bmB.get(localObject);
              if (localbKj != null) {
                if (!String.class.equals(arrayOfClass[0]))
                {
                  if ((File.class.equals(arrayOfClass[0])) && (
                    (bFe.class.equals(bKj.a(localbKj))) || (dmo.class.equals(bKj.a(localbKj)))));
                }

              }
              else
              {
                localbKj = a(localMethod2, arrayOfClass[0], (String)localObject);
                if (localbKj != null) {
                  this.bmA.put(localObject, arrayOfClass[0]);
                  this.bmB.put(localObject, localbKj);
                }
              } } else if ((str1.startsWith("create")) && (!localClass.isArray()) && (!localClass.isPrimitive()) && (arrayOfClass.length == 0))
            {
              localObject = m(str1, "create");

              if (this.bmD.get(localObject) == null) {
                this.bmC.put(localObject, localClass);
                this.bmD.put(localObject, new cpI(localMethod2));
              }
            } else if ((str1.startsWith("addConfigured")) && (Void.TYPE.equals(localClass)) && (arrayOfClass.length == 1) && (!String.class.equals(arrayOfClass[0])) && (!arrayOfClass[0].isArray()) && (!arrayOfClass[0].isPrimitive()))
            {
              try
              {
                localObject = null;
                try {
                  localObject = arrayOfClass[0].getConstructor(new Class[0]);
                } catch (NoSuchMethodException localNoSuchMethodException3) {
                  localObject = arrayOfClass[0].getConstructor(new Class[] { FF.class });
                }
                String str2 = m(str1, "addConfigured");
                this.bmC.put(str2, arrayOfClass[0]);
                this.bmD.put(str2, new dUH(localMethod2, (Constructor)localObject, 2));
              }
              catch (NoSuchMethodException localNoSuchMethodException1) {
              }
            }
            else if ((str1.startsWith("add")) && (Void.TYPE.equals(localClass)) && (arrayOfClass.length == 1) && (!String.class.equals(arrayOfClass[0])) && (!arrayOfClass[0].isArray()) && (!arrayOfClass[0].isPrimitive()))
            {
              try
              {
                Constructor localConstructor = null;
                try {
                  localConstructor = arrayOfClass[0].getConstructor(new Class[0]);
                } catch (NoSuchMethodException localNoSuchMethodException4) {
                  localConstructor = arrayOfClass[0].getConstructor(new Class[] { FF.class });
                }
                String str3 = m(str1, "add");
                if (this.bmC.get(str3) == null)
                {
                  this.bmC.put(str3, arrayOfClass[0]);
                  this.bmD.put(str3, new dUH(localMethod2, localConstructor, 1));
                } } catch (NoSuchMethodException localNoSuchMethodException2) {  }

            }
          }
        }
      }
    }
    this.bmF = localMethod1;
  }

  private boolean a(String paramString, Class paramClass)
  {
    if (("setLocation".equals(paramString)) && (aaA.class.equals(paramClass))) {
      return true;
    }
    if (("setTaskType".equals(paramString)) && (String.class.equals(paramClass))) {
      return true;
    }
    return false;
  }

  public static synchronized wE d(Class paramClass)
  {
    return a(null, paramClass);
  }

  public static wE a(FF paramFF, Class paramClass)
  {
    wE localwE = (wE)bmw.get(paramClass.getName());

    if ((localwE == null) || (localwE.bmG != paramClass)) {
      localwE = new wE(paramClass);
      if (paramFF != null)
      {
        bmw.put(paramClass.getName(), localwE);
      }
    }
    return localwE;
  }

  public void a(FF paramFF, Object paramObject1, String paramString, Object paramObject2)
  {
    bKj localbKj = (bKj)this.bmB.get(paramString.toLowerCase(Locale.ENGLISH));

    if ((localbKj == null) && (paramObject2 != null)) {
      if ((paramObject1 instanceof cLB)) {
        localObject = (cLB)paramObject1;
        String str1 = dhB.pd(paramString);
        String str2 = dhB.pd(str1);
        String str3 = dhB.pe(paramString);
        String str4 = str2 + ":" + str3;
        ((cLB)localObject).f(str2, str3, str4, paramObject2.toString());
        return;
      }
      if ((paramObject1 instanceof oH)) {
        localObject = (oH)paramObject1;
        ((oH)localObject).d(paramString.toLowerCase(Locale.ENGLISH), paramObject2);
        return;
      }
      if ((paramObject1 instanceof aSL)) {
        localObject = (aSL)paramObject1;
        ((aSL)localObject).O(paramString.toLowerCase(Locale.ENGLISH), paramObject2.toString());
        return;
      }
      if (paramString.indexOf(':') >= 0) {
        return;
      }
      Object localObject = b(paramFF, paramObject1) + " doesn't support the \"" + paramString + "\" attribute.";

      throw new EG((String)localObject, paramString);
    }
    try {
      localbKj.a(paramFF, paramObject1, paramObject2);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw a(localInvocationTargetException);
    }
  }

  public void a(FF paramFF, Object paramObject, String paramString1, String paramString2)
  {
    a(paramFF, paramObject, paramString1, paramString2);
  }

  public void a(FF paramFF, Object paramObject, String paramString)
  {
    if (this.bmF == null) {
      paramString = paramString.trim();

      if (paramString.length() == 0)
      {
        return;
      }

      throw new cJ(paramFF.F(paramObject) + " doesn't support nested text data (\"" + bd(paramString) + "\").");
    }
    try
    {
      this.bmF.invoke(paramObject, new Object[] { paramString });
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw a(localInvocationTargetException);
    }
  }

  public void b(FF paramFF, Object paramObject, String paramString)
  {
    String str = paramFF.F(paramObject) + " doesn't support the nested \"" + paramString + "\" element.";

    throw new dVt(str, paramString);
  }

  private cqV a(FF paramFF, String paramString1, Object paramObject, String paramString2, aQS paramaQS)
  {
    String str1 = dhB.pd(paramString2);
    String str2 = dhB.pe(paramString2);

    if (str1.equals("antlib:org.apache.tools.ant")) {
      str1 = "";
    }
    if (paramString1.equals("antlib:org.apache.tools.ant")) {
      paramString1 = "";
    }
    Object localObject1 = null;
    if ((str1.equals(paramString1)) || (str1.length() == 0)) {
      localObject1 = (cqV)this.bmD.get(str2.toLowerCase(Locale.ENGLISH));
    }
    if (localObject1 == null) {
      localObject1 = d(paramFF, paramObject, paramString2);
    }
    if ((localObject1 == null) && (((paramObject instanceof bDq)) || ((paramObject instanceof pr))))
    {
      String str3 = paramaQS == null ? str2 : paramaQS.getQName();
      Object localObject2 = a(paramObject, paramaQS == null ? "" : paramaQS.getNamespace(), str2, str3);

      if (localObject2 != null) {
        localObject1 = new cuc(this, null, localObject2);
      }

    }

    if (localObject1 == null) {
      b(paramFF, paramObject, paramString2);
    }
    return localObject1;
  }

  private Object a(Object paramObject, String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    Object localObject2;
    if ((paramObject instanceof bDq)) {
      localObject2 = (bDq)paramObject;
      localObject1 = ((bDq)localObject2).f(paramString1, paramString2, paramString3);
    }
    if ((localObject1 == null) && ((paramObject instanceof pr))) {
      localObject2 = (pr)paramObject;
      localObject1 = ((pr)localObject2).at(paramString2.toLowerCase(Locale.ENGLISH));
    }

    return localObject1;
  }

  public Object c(FF paramFF, Object paramObject, String paramString)
  {
    cqV localcqV = a(paramFF, "", paramObject, paramString, null);
    try {
      Object localObject = localcqV.b(paramFF, paramObject, null);
      if (paramFF != null) {
        paramFF.G(localObject);
      }
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw a(localInvocationTargetException);
    }
  }

  public aAK b(FF paramFF, String paramString1, Object paramObject, String paramString2, aQS paramaQS)
  {
    cqV localcqV = a(paramFF, paramString1, paramObject, paramString2, paramaQS);
    return new aAK(paramFF, paramObject, localcqV, null);
  }

  public boolean isDynamic()
  {
    return (pr.class.isAssignableFrom(this.bmG)) || (bDq.class.isAssignableFrom(this.bmG));
  }

  public boolean FE()
  {
    return aFO.class.isAssignableFrom(this.bmG);
  }

  public boolean aY(String paramString)
  {
    return k("", paramString);
  }

  public boolean k(String paramString1, String paramString2)
  {
    if ((isDynamic()) || (this.bmE.size() > 0)) {
      return true;
    }
    return l(paramString1, paramString2);
  }

  public boolean a(String paramString1, String paramString2, FF paramFF, Object paramObject)
  {
    if ((this.bmE.size() > 0) && (d(paramFF, paramObject, paramString2) != null))
    {
      return true;
    }
    return (isDynamic()) || (l(paramString1, paramString2));
  }

  public boolean l(String paramString1, String paramString2)
  {
    String str1 = dhB.pe(paramString2);
    if (!this.bmD.containsKey(str1.toLowerCase(Locale.ENGLISH))) {
      return false;
    }
    String str2 = dhB.pd(paramString2);
    if (str2.equals("antlib:org.apache.tools.ant")) {
      str2 = "";
    }
    if ("".equals(str2)) {
      return true;
    }
    if (paramString1.equals("antlib:org.apache.tools.ant")) {
      paramString1 = "";
    }
    return str2.equals(paramString1);
  }

  public void a(FF paramFF, Object paramObject1, Object paramObject2, String paramString)
  {
    if (paramString == null) {
      return;
    }
    cqV localcqV = (cqV)this.bmD.get(paramString.toLowerCase(Locale.ENGLISH));
    if (localcqV == null)
      return;
    try
    {
      localcqV.p(paramObject1, paramObject2);
    }
    catch (IllegalAccessException localIllegalAccessException) {
      throw new cJ(localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    } catch (InvocationTargetException localInvocationTargetException) {
      throw a(localInvocationTargetException);
    }
  }

  private static cJ a(InvocationTargetException paramInvocationTargetException)
  {
    Throwable localThrowable = paramInvocationTargetException.getTargetException();
    if ((localThrowable instanceof cJ)) {
      return (cJ)localThrowable;
    }
    return new cJ(localThrowable);
  }

  public Class aZ(String paramString)
  {
    Class localClass = (Class)this.bmC.get(paramString);
    if (localClass == null) {
      throw new dVt("Class " + this.bmG.getName() + " doesn't support the nested \"" + paramString + "\" element.", paramString);
    }

    return localClass;
  }

  public Class ba(String paramString)
  {
    Class localClass = (Class)this.bmA.get(paramString);
    if (localClass == null) {
      throw new EG("Class " + this.bmG.getName() + " doesn't support the \"" + paramString + "\" attribute.", paramString);
    }

    return localClass;
  }

  public Method FF()
  {
    if (!FG()) {
      throw new cJ("Class " + this.bmG.getName() + " doesn't support nested text data.");
    }

    return this.bmF;
  }

  public Method bb(String paramString)
  {
    Object localObject = this.bmD.get(paramString);
    if (localObject == null) {
      throw new dVt("Class " + this.bmG.getName() + " doesn't support the nested \"" + paramString + "\" element.", paramString);
    }

    return cqV.a((cqV)localObject);
  }

  public Method bc(String paramString)
  {
    Object localObject = this.bmB.get(paramString);
    if (localObject == null) {
      throw new EG("Class " + this.bmG.getName() + " doesn't support the \"" + paramString + "\" attribute.", paramString);
    }

    return bKj.b((bKj)localObject);
  }

  public boolean FG()
  {
    return this.bmF != null;
  }

  public Enumeration FH()
  {
    return this.bmB.keys();
  }

  public Map FI()
  {
    return this.bmA.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.bmA);
  }

  public Enumeration FJ()
  {
    return this.bmC.keys();
  }

  public Map FK()
  {
    return this.bmC.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.bmC);
  }

  public List FL()
  {
    return this.bmE.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(this.bmE);
  }

  private bKj a(Method paramMethod, Class paramClass, String paramString)
  {
    Class localClass = bmx.containsKey(paramClass) ? (Class)bmx.get(paramClass) : paramClass;

    if (Object.class == localClass) {
      return new cue(this, paramMethod, paramClass);
    }

    if (String.class.equals(localClass)) {
      return new ctZ(this, paramMethod, paramClass, paramMethod);
    }

    if (Character.class.equals(localClass)) {
      return new cua(this, paramMethod, paramClass, paramString, paramMethod);
    }

    if (Boolean.class.equals(localClass)) {
      return new ctX(this, paramMethod, paramClass, paramMethod);
    }

    if (Class.class.equals(localClass)) {
      return new ctY(this, paramMethod, paramClass, paramMethod);
    }

    if (File.class.equals(localClass)) {
      return new ctT(this, paramMethod, paramClass, paramMethod);
    }

    if ((bFe.class.equals(localClass)) || (dmo.class.equals(localClass))) {
      return new ctV(this, paramMethod, paramClass, paramMethod);
    }

    if (bxd.class.isAssignableFrom(localClass)) {
      return new ctP(this, paramMethod, paramClass, localClass, paramMethod);
    }

    bKj localbKj = a(localClass, paramMethod, paramClass);
    if (localbKj != null) {
      return localbKj;
    }

    if (Long.class.equals(localClass)) {
      return new dim(this, paramMethod, paramClass, paramMethod, paramString);
    }

    Constructor localConstructor1;
    NoSuchMethodException localNoSuchMethodException1;
    try
    {
      localConstructor1 = localClass.getConstructor(new Class[] { FF.class, String.class });
      localNoSuchMethodException1 = 1;
    }
    catch (NoSuchMethodException localNoSuchMethodException2) {
      try {
        localConstructor1 = localClass.getConstructor(new Class[] { String.class });
        localNoSuchMethodException1 = 0;
      }
      catch (NoSuchMethodException localNoSuchMethodException3) {
        return null;
      }
    }
    localNoSuchMethodException2 = localNoSuchMethodException1;
    Constructor localConstructor2 = localConstructor1;

    return new din(this, paramMethod, paramClass, localNoSuchMethodException2, localConstructor2, paramMethod, paramString);
  }

  private bKj a(Class paramClass1, Method paramMethod, Class paramClass2)
  {
    if (paramClass1.isEnum()) {
      return new dio(this, paramMethod, paramClass2, paramClass1, paramMethod);
    }

    return null;
  }

  private String b(FF paramFF, Object paramObject)
  {
    return paramFF.F(paramObject);
  }

  private static String m(String paramString1, String paramString2)
  {
    return paramString1.substring(paramString2.length()).toLowerCase(Locale.ENGLISH);
  }

  public static void clearCache()
  {
    bmw.clear();
  }

  private cqV d(FF paramFF, Object paramObject, String paramString)
  {
    if (this.bmE.size() == 0) {
      return null;
    }
    aXW localaXW = aXW.v(paramFF);

    dQE localdQE1 = b(localaXW, paramString, this.bmE);

    dQE localdQE2 = c(localaXW, paramString, this.bmE);

    if ((localdQE1 == null) && (localdQE2 == null)) {
      return null;
    }

    if ((localdQE1 != null) && (localdQE2 != null)) {
      throw new cJ("ambiguous: type and component definitions for " + paramString);
    }

    dQE localdQE3 = localdQE1 != null ? localdQE1 : localdQE2;

    Object localObject1 = dQE.a(localdQE3);
    if ((dQE.a(localdQE3) instanceof bBD)) {
      localObject1 = ((bBD)dQE.a(localdQE3)).M(paramFF);
    }

    Object localObject2 = dQE.a(localdQE3);
    Object localObject3 = localObject1;

    return new dir(this, dQE.b(localdQE3), localObject3, localObject2);
  }

  private void a(Method paramMethod)
  {
    Class localClass = paramMethod.getParameterTypes()[0];
    int i = this.bmE.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)this.bmE.get(j);
      if (localMethod.getParameterTypes()[0].equals(localClass)) {
        if (paramMethod.getName().equals("addConfigured"))
        {
          this.bmE.set(j, paramMethod);
        }
        return;
      }
      if (localMethod.getParameterTypes()[0].isAssignableFrom(localClass)) {
        this.bmE.add(j, paramMethod);
        return;
      }
    }
    this.bmE.add(paramMethod);
  }

  private Method a(Class paramClass, List paramList)
  {
    if (paramClass == null) {
      return null;
    }
    Object localObject1 = null;
    Object localObject2 = null;

    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      Method localMethod = (Method)paramList.get(j);
      Class localClass = localMethod.getParameterTypes()[0];
      if (localClass.isAssignableFrom(paramClass)) {
        if (localObject1 == null) {
          localObject1 = localClass;
          localObject2 = localMethod;
        } else if (!localClass.isAssignableFrom(localObject1)) {
          throw new cJ("ambiguous: types " + localObject1.getName() + " and " + localClass.getName() + " match " + paramClass.getName());
        }
      }
    }

    return localObject2;
  }

  private String bd(String paramString) {
    if (paramString.length() <= 20) {
      return paramString;
    }
    int i = (20 - "...".length()) / 2;
    return new StringBuffer(paramString).replace(i, paramString.length() - i, "...").toString();
  }

  private dTY a(aXW paramaXW, String paramString, List paramList)
  {
    Object localObject1 = null;
    Object localObject2 = null;

    List localList = paramaXW.hy(paramString);
    if (localList == null) {
      return null;
    }
    synchronized (localList) {
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        dTY localdTY = (dTY)localList.get(j);
        Class localClass = localdTY.J(paramaXW.Ga());
        if (localClass != null)
        {
          Method localMethod = a(localClass, paramList);
          if (localMethod != null)
          {
            if (localObject2 != null) {
              throw new cJ("ambiguous: restricted definitions for " + paramString + " " + localObject2 + " and " + localClass);
            }

            localObject2 = localClass;
            localObject1 = localdTY;
          }
        }
      }
    }
    return localObject1;
  }

  private dQE b(aXW paramaXW, String paramString, List paramList)
  {
    FF localFF = paramaXW.Ga();

    dTY localdTY = a(paramaXW, paramString, paramList);

    if (localdTY == null) {
      return null;
    }

    Method localMethod = a(localdTY.J(localFF), paramList);

    if (localMethod == null) {
      throw new cJ("Ant Internal Error - contract mismatch for " + paramString);
    }

    Object localObject = localdTY.w(localFF);
    if (localObject == null) {
      throw new cJ("Failed to create object " + paramString + " of type " + localdTY.K(localFF));
    }

    return new dQE(localMethod, localObject);
  }

  private dQE c(aXW paramaXW, String paramString, List paramList)
  {
    Class localClass = paramaXW.hw(paramString);
    if (localClass == null) {
      return null;
    }
    Method localMethod = a(localClass, this.bmE);
    if (localMethod == null) {
      return null;
    }
    Object localObject = paramaXW.hv(paramString);
    return new dQE(localMethod, localObject);
  }

  static
  {
    Class[] arrayOfClass1 = { Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE };

    Class[] arrayOfClass2 = { Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class };

    for (int i = 0; i < arrayOfClass1.length; i++)
      bmx.put(arrayOfClass1[i], arrayOfClass2[i]);
  }
}