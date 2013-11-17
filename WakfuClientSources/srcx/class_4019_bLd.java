import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class bLd
  implements InvocationHandler
{
  static final Method gOM;
  static final Method gON;
  static final Method gOO;
  private final bMB gOP;
  private final Class gOQ;
  private final Map aPd;
  private vN gOR;
  private final LI gOS;
  private final Map gOT = new WeakHashMap();

  public bLd(String paramString, Class paramClass, Map paramMap) {
    if ((paramString != null) && ("".equals(paramString.trim()))) {
      throw new IllegalArgumentException("Invalid library name \"" + paramString + "\"");
    }

    this.gOQ = paramClass;
    paramMap = new HashMap(paramMap);
    int i = (crY.ibR == null ? (crY.ibR = crY.cd("aKr")) : crY.ibR).isAssignableFrom(paramClass) ? 1 : 0;

    if (paramMap.get("calling-convention") == null) {
      paramMap.put("calling-convention", new Integer(i));
    }

    this.aPd = paramMap;
    this.gOP = bMB.c(paramString, paramMap);
    this.gOR = ((vN)paramMap.get("function-mapper"));
    if (this.gOR == null)
    {
      this.gOR = new cHn(paramMap);
    }
    this.gOS = ((LI)paramMap.get("invocation-mapper"));
  }

  public bMB bTi() {
    return this.gOP;
  }

  public String bTj() {
    return this.gOP.getName();
  }

  public Class bTk() {
    return this.gOQ;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (gOM.equals(paramMethod)) {
      return "Proxy interface to " + this.gOP;
    }
    if (gON.equals(paramMethod)) {
      return new Integer(hashCode());
    }
    if (gOO.equals(paramMethod)) {
      localObject1 = paramArrayOfObject[0];
      if ((localObject1 != null) && (Proxy.isProxyClass(localObject1.getClass()))) {
        return cvp.valueOf(Proxy.getInvocationHandler(localObject1) == this);
      }
      return Boolean.FALSE;
    }

    Object localObject1 = null;
    synchronized (this.gOT) {
      localObject1 = (cEg)this.gOT.get(paramMethod);
      if (localObject1 == null) {
        localObject1 = new cEg(null);
        ((cEg)localObject1).ixD = cvp.b(paramMethod);
        if (this.gOS != null) {
          ((cEg)localObject1).ixC = this.gOS.b(this.gOP, paramMethod);
        }
        if (((cEg)localObject1).ixC == null)
        {
          String str = this.gOR.a(this.gOP, paramMethod);

          if (str == null)
          {
            str = paramMethod.getName();
          }
          ((cEg)localObject1).aPc = this.gOP.a(str, paramMethod);
          ((cEg)localObject1).aPd = new HashMap(this.aPd);
          ((cEg)localObject1).aPd.put("invoking-method", paramMethod);
        }
        this.gOT.put(paramMethod, localObject1);
      }
    }
    if (((cEg)localObject1).ixD) {
      paramArrayOfObject = cvp.A(paramArrayOfObject);
    }
    if (((cEg)localObject1).ixC != null) {
      return ((cEg)localObject1).ixC.invoke(paramObject, paramMethod, paramArrayOfObject);
    }
    return ((cEg)localObject1).aPc.a(paramMethod.getReturnType(), paramArrayOfObject, ((cEg)localObject1).aPd);
  }

  static
  {
    try
    {
      gOM = (crY.ibQ == null ? (crY.ibQ = crY.cd("java.lang.Object")) : crY.ibQ).getMethod("toString", new Class[0]);
      gON = (crY.ibQ == null ? (crY.ibQ = crY.cd("java.lang.Object")) : crY.ibQ).getMethod("hashCode", new Class[0]);
      gOO = (crY.ibQ == null ? (crY.ibQ = crY.cd("java.lang.Object")) : crY.ibQ).getMethod("equals", new Class[] { crY.ibQ == null ? (crY.ibQ = crY.cd("java.lang.Object")) : crY.ibQ });
    }
    catch (Exception localException) {
      throw new Error("Error retrieving Object.toString() method");
    }
  }
}