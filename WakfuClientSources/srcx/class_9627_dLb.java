import com.sun.jna.Native;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class dLb extends WeakReference
{
  static final Map lZu = new WeakHashMap();
  static final Map lZv = new WeakHashMap();
  private static final Method lZw;
  private static final Map lZx = new WeakHashMap();
  axA lZy;
  duM lZz;
  Method method;
  static Class lZA;
  static Class lZB;
  static Class ibR;
  static Class bRq;
  static Class cvO;
  static Class bZT;
  static Class bZS;
  static Class bRr;
  static Class bRs;
  static Class fqS;
  static Class igk;
  static Class cvB;
  static Class cvG;
  static Class cvP;
  static Class cvH;
  static Class cvI;
  static Class cvJ;
  static Class cvK;
  static Class cvL;
  static Class cvM;
  static Class cvN;

  public static void a(dBN paramdBN, cTs paramcTs)
  {
    synchronized (lZu) {
      if (paramcTs != null) {
        lZx.put(paramdBN, paramcTs);
      }
      else
        lZx.remove(paramdBN);
    }
  }

  private static ThreadGroup a(dBN paramdBN, agS paramagS)
  {
    cTs localcTs = null;
    if ((paramdBN instanceof QL)) {
      paramdBN = ((QL)paramdBN).act();
    }
    synchronized (lZx) {
      localcTs = (cTs)lZx.get(paramdBN);
    }
    ??? = null;
    if (localcTs != null) {
      ??? = localcTs.b(paramdBN);
      paramagS.name = localcTs.a(paramdBN);
      paramagS.daO = localcTs.c(paramdBN);
      paramagS.daP = localcTs.d(paramdBN);
      paramagS.write();
    }
    return ???;
  }

  public static dBN b(Class paramClass, axA paramaxA)
  {
    return a(paramClass, paramaxA, false);
  }

  private static dBN a(Class paramClass, axA paramaxA, boolean paramBoolean) {
    if (paramaxA == null) {
      return null;
    }

    if (!paramClass.isInterface())
      throw new IllegalArgumentException("Callback type must be an interface");
    Map localMap = lZu;
    synchronized (localMap) {
      for (Iterator localIterator = localMap.keySet().iterator(); localIterator.hasNext(); ) {
        localObject1 = (dBN)localIterator.next();
        if (paramClass.isAssignableFrom(localObject1.getClass())) {
          localObject2 = (dLb)localMap.get(localObject1);
          localObject3 = localObject2 != null ? ((dLb)localObject2).djJ() : f((dBN)localObject1);

          if (paramaxA.equals(localObject3)) {
            return localObject1;
          }
        }
      }
      int i = (ibR == null ? (dLb.ibR = cd("aKr")) : ibR).isAssignableFrom(paramClass) ? 1 : 0;

      Object localObject1 = new HashMap();
      Object localObject2 = Native.p(paramClass);
      if (localObject2 != null) {
        ((Map)localObject1).putAll((Map)localObject2);
      }
      ((Map)localObject1).put("invoking-method", av(paramClass));
      Object localObject3 = new lg(paramaxA, i, (Map)localObject1);
      dBN localdBN = (dBN)Proxy.newProxyInstance(paramClass.getClassLoader(), new Class[] { paramClass }, (InvocationHandler)localObject3);
      localMap.put(localdBN, null);
      return localdBN;
    }
  }

  private dLb(dBN paramdBN, int paramInt, boolean paramBoolean)
  {
    super(paramdBN);
    bXj localbXj = Native.q(paramdBN.getClass());

    String str1 = System.getProperty("os.arch").toLowerCase();
    int i = ("ppc".equals(str1)) || ("powerpc".equals(str1)) ? 1 : 0;
    if (paramBoolean) {
      Method localMethod = e(paramdBN);
      Class[] arrayOfClass2 = localMethod.getParameterTypes();
      for (int n = 0; n < arrayOfClass2.length; n++)
      {
        if ((i != 0) && ((arrayOfClass2[n] == Float.TYPE) || (arrayOfClass2[n] == Double.TYPE)))
        {
          paramBoolean = false;
          break;
        }

        if ((localbXj != null) && (localbXj.W(arrayOfClass2[n]) != null))
        {
          paramBoolean = false;
          break;
        }
      }
      if ((localbXj != null) && (localbXj.X(localMethod.getReturnType()) != null))
      {
        paramBoolean = false;
      }
    }
    Class[] arrayOfClass1;
    Class localClass;
    int j;
    if (paramBoolean) {
      this.method = e(paramdBN);
      arrayOfClass1 = this.method.getParameterTypes();
      localClass = this.method.getReturnType();
      j = 1;
      if ((paramdBN instanceof Am)) {
        j |= 2;
      }
      long l1 = Native.createNativeCallback(paramdBN, this.method, arrayOfClass1, localClass, paramInt, j);

      this.lZy = (l1 != 0L ? new axA(l1) : null);
    }
    else {
      if ((paramdBN instanceof duM)) {
        this.lZz = ((duM)paramdBN);
      }
      else {
        this.lZz = new QL(this, e(paramdBN), localbXj);
      }
      arrayOfClass1 = this.lZz.getParameterTypes();
      localClass = this.lZz.getReturnType();
      Object localObject;
      if (localbXj != null) {
        for (j = 0; j < arrayOfClass1.length; j++) {
          localObject = localbXj.W(arrayOfClass1[j]);
          if (localObject != null) {
            arrayOfClass1[j] = ((bYH)localObject).WJ();
          }
        }
        aEQ localaEQ = localbXj.X(localClass);
        if (localaEQ != null) {
          localClass = localaEQ.WJ();
        }
      }
      for (int k = 0; k < arrayOfClass1.length; k++) {
        arrayOfClass1[k] = at(arrayOfClass1[k]);
        if (!aw(arrayOfClass1[k])) {
          localObject = "Callback argument " + arrayOfClass1[k] + " requires custom type conversion";

          throw new IllegalArgumentException((String)localObject);
        }
      }
      localClass = at(localClass);
      if (!aw(localClass)) {
        String str2 = "Callback return type " + localClass + " requires custom type conversion";

        throw new IllegalArgumentException(str2);
      }
      int m = (paramdBN instanceof Am) ? 2 : 0;

      long l2 = Native.createNativeCallback(this.lZz, lZw, arrayOfClass1, localClass, paramInt, m);

      this.lZy = (l2 != 0L ? new axA(l2) : null);
    }
  }

  private Class at(Class paramClass) {
    if ((bRq == null ? (dLb.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass))
    {
      bik.Q(paramClass);
      if (!(cvO == null ? (dLb.cvO = cd("qR")) : cvO).isAssignableFrom(paramClass))
        return bZT == null ? (dLb.bZT = cd("axA")) : bZT;
    } else {
      if ((bZS == null ? (dLb.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
        return MK.k(paramClass).WJ();
      }
      if (paramClass != (bRr == null ? (dLb.bRr = cd("java.lang.String")) : bRr)) if (paramClass != (bRs == null ? (dLb.bRs = cd("cFg")) : bRs)) if (paramClass != (fqS == null ? (dLb.fqS = cd("[Ljava.lang.String;")) : fqS)) if (paramClass != (igk == null ? (dLb.igk = cd("[LcFg;")) : igk)) if (!(cvB == null ? (dLb.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass))
              {
                break label268;
              }

      return bZT == null ? (dLb.bZT = cd("axA")) : bZT;
    }
    label268: return paramClass;
  }

  private static Method c(Method paramMethod) {
    if (paramMethod.getParameterTypes().length > 256) {
      String str = "Method signature exceeds the maximum parameter count: " + paramMethod;

      throw new UnsupportedOperationException(str);
    }
    return paramMethod;
  }

  public static Class au(Class paramClass)
  {
    if (!(cvB == null ? (dLb.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) {
      throw new IllegalArgumentException(paramClass.getName() + " is not derived from com.sun.jna.Callback");
    }
    if (paramClass.isInterface()) {
      return paramClass;
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    for (int i = 0; i < arrayOfClass.length; i++) {
      if ((cvB == null ? (dLb.cvB = cd("dBN")) : cvB).isAssignableFrom(arrayOfClass[i])) {
        try
        {
          av(arrayOfClass[i]);
          return arrayOfClass[i];
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
        }
      }
    }
    if ((cvB == null ? (dLb.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass.getSuperclass())) {
      return au(paramClass.getSuperclass());
    }
    return paramClass;
  }

  private static Method e(dBN paramdBN) {
    return av(au(paramdBN.getClass()));
  }

  private static Method av(Class paramClass)
  {
    Method[] arrayOfMethod1 = paramClass.getDeclaredMethods();
    Method[] arrayOfMethod2 = paramClass.getMethods();
    HashSet localHashSet = new HashSet(Arrays.asList(arrayOfMethod1));
    localHashSet.retainAll(Arrays.asList(arrayOfMethod2));

    for (Object localObject = localHashSet.iterator(); ((Iterator)localObject).hasNext(); ) {
      Method localMethod1 = (Method)((Iterator)localObject).next();
      if (dBN.lJq.contains(localMethod1.getName())) {
        ((Iterator)localObject).remove();
      }
    }
    localObject = (Method[])localHashSet.toArray(new Method[localHashSet.size()]);
    if (localObject.length == 1) {
      return c(localObject[0]);
    }
    for (int i = 0; i < localObject.length; i++) {
      Method localMethod2 = localObject[i];
      if ("callback".equals(localMethod2.getName())) {
        return c(localMethod2);
      }
    }
    String str = "Callback must implement a single public method, or one public method named 'callback'";

    throw new IllegalArgumentException(str);
  }

  private void CQ(int paramInt)
  {
    this.lZy.setInt(axA.SIZE, paramInt);
  }

  public axA djJ()
  {
    return this.lZy.bX(0L);
  }

  protected void finalize()
  {
    dispose();
  }

  protected synchronized void dispose()
  {
    if (this.lZy != null) {
      Native.freeNativeCallback(this.lZy.dMH);
      this.lZy.dMH = 0L;
      this.lZy = null;
    }
  }

  private dBN act() {
    return (dBN)get();
  }

  private static axA f(dBN paramdBN)
  {
    if (Proxy.isProxyClass(paramdBN.getClass())) {
      InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(paramdBN);
      if ((localInvocationHandler instanceof lg)) {
        return ((lg)localInvocationHandler).sF();
      }
    }
    return null;
  }

  public static axA g(dBN paramdBN)
  {
    return a(paramdBN, false);
  }

  private static axA a(dBN paramdBN, boolean paramBoolean)
  {
    axA localaxA = null;
    if (paramdBN == null) {
      return null;
    }
    if ((localaxA = f(paramdBN)) != null) {
      return localaxA;
    }
    int i = (paramdBN instanceof aKr) ? 1 : 0;

    Map localMap = lZu;
    synchronized (localMap) {
      dLb localdLb = (dLb)localMap.get(paramdBN);
      if (localdLb == null) {
        localdLb = new dLb(paramdBN, i, paramBoolean);
        localMap.put(paramdBN, localdLb);
        if (lZx.containsKey(paramdBN)) {
          localdLb.CQ(1);
        }
      }
      return localdLb.djJ();
    }
  }

  private static boolean aw(Class paramClass)
  {
    if (paramClass != Void.TYPE) if (paramClass != (cvP == null ? (dLb.cvP = cd("java.lang.Void")) : cvP)) if (paramClass != Boolean.TYPE) if (paramClass != (cvG == null ? (dLb.cvG = cd("java.lang.Boolean")) : cvG)) if (paramClass != Byte.TYPE) if (paramClass != (cvH == null ? (dLb.cvH = cd("java.lang.Byte")) : cvH)) if (paramClass != Short.TYPE) if (paramClass != (cvI == null ? (dLb.cvI = cd("java.lang.Short")) : cvI)) if (paramClass != Character.TYPE) if (paramClass != (cvJ == null ? (dLb.cvJ = cd("java.lang.Character")) : cvJ)) if (paramClass != Integer.TYPE) if (paramClass != (cvK == null ? (dLb.cvK = cd("java.lang.Integer")) : cvK)) if (paramClass != Long.TYPE) if (paramClass != (cvL == null ? (dLb.cvL = cd("java.lang.Long")) : cvL)) if (paramClass != Float.TYPE) if (paramClass != (cvM == null ? (dLb.cvM = cd("java.lang.Float")) : cvM)) if (paramClass != Double.TYPE) if (paramClass != (cvN == null ? (dLb.cvN = cd("java.lang.Double")) : cvN)) if ((cvO == null ? (dLb.cvO = cd("qR")) : cvO).isAssignableFrom(paramClass)) if ((bRq == null ? (dLb.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass))
                                            break label372;  
    label372: return (bZT == null ? (dLb.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass);
  }

  private static axA e(Object paramObject, boolean paramBoolean)
  {
    if (paramObject != null) {
      cpn localcpn = new cpn(paramObject.toString(), paramBoolean);

      lZv.put(paramObject, localcpn);
      return localcpn.sF();
    }
    return null;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }

  static dBN a(dLb paramdLb)
  {
    return paramdLb.act(); } 
  static axA f(Object paramObject, boolean paramBoolean) { return e(paramObject, paramBoolean); }


  static
  {
    try
    {
      lZw = (lZB == null ? (dLb.lZB = cd("duM")) : lZB).getMethod("callback", new Class[] { lZA == null ? (dLb.lZA = cd("[Ljava.lang.Object;")) : lZA });
    }
    catch (Exception localException) {
      throw new Error("Error looking up CallbackProxy.callback() method");
    }
  }
}