import com.sun.jna.Native;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

class QL
  implements duM
{
  private final Method cpR;
  private aEQ cpS;
  private final bYH[] cpT;
  private final dLb cpU;

  public QL(dLb paramdLb, Method paramMethod, bXj parambXj)
  {
    this.cpR = paramMethod;
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    Class localClass = paramMethod.getReturnType();
    this.cpT = new bYH[arrayOfClass.length];
    if ((dLb.bZS == null ? (dLb.bZS = dLb.cd("arr")) : dLb.bZS).isAssignableFrom(localClass)) {
      this.cpS = MK.k(localClass);
    }
    else if (parambXj != null) {
      this.cpS = parambXj.X(localClass);
    }
    for (int i = 0; i < this.cpT.length; i++) {
      if ((dLb.bZS == null ? (dLb.bZS = dLb.cd("arr")) : dLb.bZS).isAssignableFrom(arrayOfClass[i])) {
        this.cpT[i] = new MK(arrayOfClass[i]);
      }
      else if (parambXj != null) {
        this.cpT[i] = parambXj.W(arrayOfClass[i]);
      }
    }
    if (!paramMethod.isAccessible())
      try {
        paramMethod.setAccessible(true);
      }
      catch (SecurityException localSecurityException) {
        throw new IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: " + paramMethod);
      }
  }

  public dBN act()
  {
    return dLb.a(this.cpU);
  }

  private Object b(Object[] paramArrayOfObject) {
    Class[] arrayOfClass = this.cpR.getParameterTypes();
    Object[] arrayOfObject = new Object[paramArrayOfObject.length];

    for (int i = 0; i < paramArrayOfObject.length; i++) {
      localObject2 = arrayOfClass[i];
      Object localObject3 = paramArrayOfObject[i];
      if (this.cpT[i] != null) {
        bCQ localbCQ = new bCQ((Class)localObject2, this.cpR, paramArrayOfObject, i);

        arrayOfObject[i] = this.cpT[i].a(localObject3, localbCQ);
      }
      else {
        arrayOfObject[i] = a(localObject3, (Class)localObject2);
      }
    }

    Object localObject1 = null;
    Object localObject2 = act();
    if (localObject2 != null) {
      try {
        localObject1 = N(this.cpR.invoke(localObject2, arrayOfObject));
      }
      catch (IllegalArgumentException localIllegalArgumentException) {
        Native.agn().a((dBN)localObject2, localIllegalArgumentException);
      }
      catch (IllegalAccessException localIllegalAccessException) {
        Native.agn().a((dBN)localObject2, localIllegalAccessException);
      }
      catch (InvocationTargetException localInvocationTargetException) {
        Native.agn().a((dBN)localObject2, localInvocationTargetException.getTargetException());
      }
    }

    for (int j = 0; j < arrayOfObject.length; j++) {
      if (((arrayOfObject[j] instanceof bik)) && (!(arrayOfObject[j] instanceof qR)))
      {
        ((bik)arrayOfObject[j]).but();
      }
    }

    return localObject1;
  }

  public Object c(Object[] paramArrayOfObject)
  {
    try
    {
      return b(paramArrayOfObject);
    }
    catch (Throwable localThrowable) {
      Native.agn().a(act(), localThrowable);
    }return null;
  }

  private Object a(Object paramObject, Class paramClass)
  {
    if ((paramObject instanceof axA)) {
      if (paramClass == (dLb.bRr == null ? (dLb.bRr = dLb.cd("java.lang.String")) : dLb.bRr)) {
        paramObject = ((axA)paramObject).getString(0L);
      }
      else if (paramClass == (dLb.bRs == null ? (dLb.bRs = dLb.cd("cFg")) : dLb.bRs)) {
        paramObject = new cFg(((axA)paramObject).getString(0L, true));
      } else {
        if (paramClass != (dLb.fqS == null ? (dLb.fqS = dLb.cd("[Ljava.lang.String;")) : dLb.fqS)) { if (paramClass != (dLb.igk == null ? (dLb.igk = dLb.cd("[LcFg;")) : dLb.igk));
        } else {
          paramObject = ((axA)paramObject).e(0L, paramClass == (dLb.igk == null ? (dLb.igk = dLb.cd("[LcFg;")) : dLb.igk)); break label408;
        }
        if ((dLb.cvB == null ? (dLb.cvB = dLb.cd("dBN")) : dLb.cvB).isAssignableFrom(paramClass)) {
          paramObject = dLb.b(paramClass, (axA)paramObject);
        }
        else if ((dLb.bRq == null ? (dLb.bRq = dLb.cd("bik")) : dLb.bRq).isAssignableFrom(paramClass))
        {
          bik localbik;
          if ((dLb.cvO == null ? (dLb.cvO = dLb.cd("qR")) : dLb.cvO).isAssignableFrom(paramClass)) {
            localbik = bik.P(paramClass);
            byte[] arrayOfByte = new byte[localbik.size()];
            ((axA)paramObject).read(0L, arrayOfByte, 0, arrayOfByte.length);
            localbik.sF().write(0L, arrayOfByte, 0, arrayOfByte.length);
            localbik.hb();
            paramObject = localbik;
          }
          else {
            localbik = bik.a(paramClass, (axA)paramObject);
            localbik.buj();
            paramObject = localbik;
          }
        }
      }
    } else if (Boolean.TYPE != paramClass) { if ((dLb.cvG == null ? (dLb.cvG = dLb.cd("java.lang.Boolean")) : dLb.cvG) != paramClass); } else if ((paramObject instanceof Number))
    {
      paramObject = cvp.valueOf(((Number)paramObject).intValue() != 0);
    }
    label408: return paramObject;
  }

  private Object N(Object paramObject) {
    if (this.cpS != null) {
      paramObject = this.cpS.a(paramObject, new Us(this.cpR));
    }
    if (paramObject == null)
      return null;
    Class localClass = paramObject.getClass();
    if ((dLb.bRq == null ? (dLb.bRq = dLb.cd("bik")) : dLb.bRq).isAssignableFrom(localClass)) {
      if ((dLb.cvO == null ? (dLb.cvO = dLb.cd("qR")) : dLb.cvO).isAssignableFrom(localClass)) {
        return paramObject;
      }
      return ((bik)paramObject).sF();
    }
    if (localClass != Boolean.TYPE) { if (localClass != (dLb.cvG == null ? (dLb.cvG = dLb.cd("java.lang.Boolean")) : dLb.cvG));
    } else return Boolean.TRUE.equals(paramObject) ? cvp.ige : cvp.igf;

    if (localClass != (dLb.bRr == null ? (dLb.bRr = dLb.cd("java.lang.String")) : dLb.bRr)) { if (localClass != (dLb.bRs == null ? (dLb.bRs = dLb.cd("cFg")) : dLb.bRs));
    } else return dLb.f(paramObject, localClass == (dLb.bRs == null ? (dLb.bRs = dLb.cd("cFg")) : dLb.bRs));

    if (localClass != (dLb.fqS == null ? (dLb.fqS = dLb.cd("[Ljava.lang.String;")) : dLb.fqS)) { if (localClass != (dLb.bRs == null ? (dLb.bRs = dLb.cd("cFg")) : dLb.bRs)); } else {
      ayN localayN = localClass == (dLb.fqS == null ? (dLb.fqS = dLb.cd("[Ljava.lang.String;")) : dLb.fqS) ? new ayN((String[])paramObject) : new ayN((cFg[])paramObject);

      dLb.lZv.put(paramObject, localayN);
      return localayN;
    }
    if ((dLb.cvB == null ? (dLb.cvB = dLb.cd("dBN")) : dLb.cvB).isAssignableFrom(localClass)) {
      return dLb.g((dBN)paramObject);
    }
    return paramObject;
  }
  public Class[] getParameterTypes() {
    return this.cpR.getParameterTypes();
  }
  public Class getReturnType() {
    return this.cpR.getReturnType();
  }
}