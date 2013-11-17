import com.sun.jna.Native;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

public class cvp extends axA
{
  public static final int ifZ = 256;
  public static final int iga = 0;
  public static final int igb = 1;
  private static final int igc = 3;
  public static final int igd = 4;
  static final Integer ige = new Integer(-1);
  static final Integer igf = new Integer(0);
  private bMB igg;
  private final String igh;
  int gQj;
  final Map aPd;
  static final String igi = "invoking-method";
  static Class bZS;
  static Class fyI;
  static Class igj;
  static Class cvP;
  static Class cvG;
  static Class cvH;
  static Class cvI;
  static Class cvJ;
  static Class cvK;
  static Class cvL;
  static Class cvM;
  static Class cvN;
  static Class bRr;
  static Class bRs;
  static Class bZT;
  static Class bRq;
  static Class cvO;
  static Class cvB;
  static Class fqS;
  static Class igk;
  static Class igl;
  static Class ibQ;
  static Class igm;
  static Class cvF;

  public static cvp aB(String paramString1, String paramString2)
  {
    return bMB.jU(paramString1).jV(paramString2);
  }

  public static cvp d(String paramString1, String paramString2, int paramInt)
  {
    return bMB.jU(paramString1).C(paramString2, paramInt);
  }

  public static cvp e(axA paramaxA)
  {
    return b(paramaxA, 0);
  }

  public static cvp b(axA paramaxA, int paramInt)
  {
    return new cvp(paramaxA, paramInt);
  }

  cvp(bMB parambMB, String paramString, int paramInt)
  {
    wV(paramInt & 0x3);
    if (paramString == null)
      throw new NullPointerException("Function name must not be null");
    this.igg = parambMB;
    this.igh = paramString;
    this.gQj = paramInt;
    this.aPd = parambMB.aPd;
    try {
      this.dMH = parambMB.jX(paramString);
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
      throw new UnsatisfiedLinkError("Error looking up function '" + paramString + "': " + localUnsatisfiedLinkError.getMessage());
    }
  }

  cvp(axA paramaxA, int paramInt)
  {
    wV(paramInt & 0x3);
    if ((paramaxA == null) || (paramaxA.dMH == 0L))
    {
      throw new NullPointerException("Function address may not be null");
    }
    this.igh = paramaxA.toString();
    this.gQj = paramInt;
    this.dMH = paramaxA.dMH;
    this.aPd = Collections.EMPTY_MAP;
  }

  private void wV(int paramInt)
  {
    switch (paramInt) {
    case 0:
    case 1:
      break;
    default:
      throw new IllegalArgumentException("Unrecognized calling convention: " + paramInt);
    }
  }

  public String getName()
  {
    return this.igh;
  }

  public int ctg()
  {
    return this.gQj & 0x3;
  }

  public Object a(Class paramClass, Object[] paramArrayOfObject)
  {
    return a(paramClass, paramArrayOfObject, this.aPd);
  }

  public Object a(Class paramClass, Object[] paramArrayOfObject, Map paramMap)
  {
    Object[] arrayOfObject = new Object[0];
    if (paramArrayOfObject != null) {
      if (paramArrayOfObject.length > 256) {
        throw new UnsupportedOperationException("Maximum argument count is 256");
      }
      arrayOfObject = new Object[paramArrayOfObject.length];
      System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, arrayOfObject.length);
    }

    bXj localbXj = (bXj)paramMap.get("type-mapper");

    Method localMethod = (Method)paramMap.get("invoking-method");
    boolean bool = Boolean.TRUE.equals(paramMap.get("allow-objects"));
    for (int i = 0; i < arrayOfObject.length; i++) {
      arrayOfObject[i] = a(arrayOfObject, i, localMethod, localbXj, bool);
    }

    Class localClass1 = paramClass;
    Object localObject1 = null;
    if ((bZS == null ? (cvp.bZS = cd("arr")) : bZS).isAssignableFrom(paramClass)) {
      localObject2 = MK.k(paramClass);
      localObject1 = localObject2;
      localClass1 = ((MK)localObject2).WJ();
    }
    else if (localbXj != null) {
      localObject1 = localbXj.W(paramClass);
      if (localObject1 != null) {
        localClass1 = ((bYH)localObject1).WJ();
      }
    }

    Object localObject2 = a(arrayOfObject, localClass1, bool);

    if (localObject1 != null)
    {
      Object localObject3;
      if (localMethod != null)
        localObject3 = new bRr(paramClass, this, paramArrayOfObject, localMethod);
      else {
        localObject3 = new czA(paramClass, this, paramArrayOfObject);
      }
      localObject2 = ((bYH)localObject1).a(localObject2, (hT)localObject3);
    }

    if (paramArrayOfObject != null) {
      for (int j = 0; j < paramArrayOfObject.length; j++) {
        Object localObject4 = paramArrayOfObject[j];
        if (localObject4 != null)
        {
          if ((localObject4 instanceof bik)) {
            if (!(localObject4 instanceof qR)) {
              ((bik)localObject4).bus();
            }
          }
          else if ((arrayOfObject[j] instanceof df)) {
            ((df)arrayOfObject[j]).hb();
            if ((arrayOfObject[j] instanceof cuT)) {
              cuT localcuT = (cuT)arrayOfObject[j];
              if ((fyI == null ? (cvp.fyI = cd("[LckM;")) : fyI).isAssignableFrom(localObject4.getClass())) {
                Class localClass2 = localObject4.getClass().getComponentType();
                bik[] arrayOfbik = (bik[])localObject4;
                for (int k = 0; k < arrayOfbik.length; k++) {
                  axA localaxA = localcuT.bX(axA.SIZE * k);
                  arrayOfbik[k] = bik.a(localClass2, arrayOfbik[k], localaxA);
                }
              }
            }
          }
          else if ((igj == null ? (cvp.igj = cd("[Lbik;")) : igj).isAssignableFrom(localObject4.getClass())) {
            bik.c((bik[])localObject4);
          }
        }
      }
    }
    return localObject2;
  }

  Object a(Object[] paramArrayOfObject, Class paramClass, boolean paramBoolean)
  {
    Object localObject1 = null;
    if ((paramClass != null) && (paramClass != Void.TYPE)) { if (paramClass != (cvP == null ? (cvp.cvP = cd("java.lang.Void")) : cvP)); } else {
      Native.invokeVoid(this.dMH, this.gQj, paramArrayOfObject);
      localObject1 = null; break label1146;
    }
    if (paramClass != Boolean.TYPE) { if (paramClass != (cvG == null ? (cvp.cvG = cd("java.lang.Boolean")) : cvG)); } else {
      localObject1 = valueOf(Native.invokeInt(this.dMH, this.gQj, paramArrayOfObject) != 0); break label1146;
    }
    if (paramClass != Byte.TYPE) { if (paramClass != (cvH == null ? (cvp.cvH = cd("java.lang.Byte")) : cvH)); } else {
      localObject1 = new Byte((byte)Native.invokeInt(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Short.TYPE) { if (paramClass != (cvI == null ? (cvp.cvI = cd("java.lang.Short")) : cvI)); } else {
      localObject1 = new Short((short)Native.invokeInt(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Character.TYPE) { if (paramClass != (cvJ == null ? (cvp.cvJ = cd("java.lang.Character")) : cvJ)); } else {
      localObject1 = new Character((char)Native.invokeInt(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Integer.TYPE) { if (paramClass != (cvK == null ? (cvp.cvK = cd("java.lang.Integer")) : cvK)); } else {
      localObject1 = new Integer(Native.invokeInt(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Long.TYPE) { if (paramClass != (cvL == null ? (cvp.cvL = cd("java.lang.Long")) : cvL)); } else {
      localObject1 = new Long(Native.invokeLong(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Float.TYPE) { if (paramClass != (cvM == null ? (cvp.cvM = cd("java.lang.Float")) : cvM)); } else {
      localObject1 = new Float(Native.invokeFloat(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass != Double.TYPE) { if (paramClass != (cvN == null ? (cvp.cvN = cd("java.lang.Double")) : cvN)); } else {
      localObject1 = new Double(Native.invokeDouble(this.dMH, this.gQj, paramArrayOfObject)); break label1146;
    }
    if (paramClass == (bRr == null ? (cvp.bRr = cd("java.lang.String")) : bRr)) {
      localObject1 = a(this.gQj, paramArrayOfObject, false);
    }
    else
    {
      Object localObject2;
      if (paramClass == (bRs == null ? (cvp.bRs = cd("cFg")) : bRs)) {
        localObject2 = a(this.gQj, paramArrayOfObject, true);
        if (localObject2 != null)
          localObject1 = new cFg((String)localObject2);
      }
      else {
        if ((bZT == null ? (cvp.bZT = cd("axA")) : bZT).isAssignableFrom(paramClass)) {
          return c(this.gQj, paramArrayOfObject);
        }
        if ((bRq == null ? (cvp.bRq = cd("bik")) : bRq).isAssignableFrom(paramClass)) {
          if ((cvO == null ? (cvp.cvO = cd("qR")) : cvO).isAssignableFrom(paramClass)) {
            localObject2 = Native.a(this.dMH, this.gQj, paramArrayOfObject, bik.P(paramClass));

            ((bik)localObject2).bus();
            localObject1 = localObject2;
          }
          else {
            localObject1 = c(this.gQj, paramArrayOfObject);
            if (localObject1 != null) {
              localObject2 = bik.a(paramClass, (axA)localObject1);
              ((bik)localObject2).buj();
              localObject1 = localObject2;
            }
          }
        }
        else if ((cvB == null ? (cvp.cvB = cd("dBN")) : cvB).isAssignableFrom(paramClass)) {
          localObject1 = c(this.gQj, paramArrayOfObject);
          if (localObject1 != null) {
            localObject1 = dLb.b(paramClass, (axA)localObject1);
          }
        }
        else if (paramClass == (fqS == null ? (cvp.fqS = cd("[Ljava.lang.String;")) : fqS)) {
          localObject2 = c(this.gQj, paramArrayOfObject);
          if (localObject2 != null) {
            localObject1 = ((axA)localObject2).dt(0L);
          }
        }
        else if (paramClass == (igk == null ? (cvp.igk = cd("[LcFg;")) : igk)) {
          localObject2 = c(this.gQj, paramArrayOfObject);
          if (localObject2 != null) {
            String[] arrayOfString = ((axA)localObject2).e(0L, true);
            cFg[] arrayOfcFg = new cFg[arrayOfString.length];
            for (int i = 0; i < arrayOfString.length; i++) {
              arrayOfcFg[i] = new cFg(arrayOfString[i]);
            }
            localObject1 = arrayOfcFg;
          }
        }
        else if (paramClass == (igl == null ? (cvp.igl = cd("[LaxA;")) : igl)) {
          localObject2 = c(this.gQj, paramArrayOfObject);
          if (localObject2 != null) {
            localObject1 = ((axA)localObject2).ds(0L);
          }
        }
        else if (paramBoolean) {
          localObject1 = Native.invokeObject(this.dMH, this.gQj, paramArrayOfObject);
          if ((localObject1 != null) && (!paramClass.isAssignableFrom(localObject1.getClass())))
          {
            throw new ClassCastException("Return type " + paramClass + " does not match result " + localObject1.getClass());
          }

        }
        else
        {
          throw new IllegalArgumentException("Unsupported return type " + paramClass + " in function " + getName());
        }
      }
    }
    label1146: return localObject1;
  }

  private axA c(int paramInt, Object[] paramArrayOfObject) {
    long l = Native.invokePointer(this.dMH, paramInt, paramArrayOfObject);
    return l == 0L ? null : new axA(l);
  }

  private Object a(Object[] paramArrayOfObject, int paramInt, Method paramMethod, bXj parambXj, boolean paramBoolean)
  {
    Object localObject1 = paramArrayOfObject[paramInt];
    Object localObject2;
    Object localObject3;
    if (localObject1 != null) {
      localClass = localObject1.getClass();
      localObject2 = null;
      if ((bZS == null ? (cvp.bZS = cd("arr")) : bZS).isAssignableFrom(localClass)) {
        localObject2 = MK.k(localClass);
      }
      else if (parambXj != null) {
        localObject2 = parambXj.X(localClass);
      }
      if (localObject2 != null)
      {
        if (paramMethod != null) {
          localObject3 = new aPt(this, paramArrayOfObject, paramInt, paramMethod);
        }
        else {
          localObject3 = new ddc(this, paramArrayOfObject, paramInt);
        }
        localObject1 = ((aEQ)localObject2).a(localObject1, (qd)localObject3);
      }
    }
    if ((localObject1 == null) || (ah(localObject1.getClass()))) {
      return localObject1;
    }
    Class localClass = localObject1.getClass();
    Object localObject4;
    if ((localObject1 instanceof bik)) {
      localObject2 = (bik)localObject1;
      ((bik)localObject2).but();
      if ((localObject2 instanceof qR))
      {
        localObject3 = localObject2.getClass();
        if (paramMethod != null) {
          Class[] arrayOfClass = paramMethod.getParameterTypes();
          if (b(paramMethod)) {
            if (paramInt < arrayOfClass.length - 1) {
              localObject3 = arrayOfClass[paramInt];
            }
            else {
              localObject4 = arrayOfClass[(arrayOfClass.length - 1)].getComponentType();
              if (localObject4 != (ibQ == null ? (cvp.ibQ = cd("java.lang.Object")) : ibQ)) {
                localObject3 = localObject4;
              }
            }
          }
          else {
            localObject3 = arrayOfClass[paramInt];
          }
        }
        if ((cvO == null ? (cvp.cvO = cd("qR")) : cvO).isAssignableFrom((Class)localObject3)) {
          return localObject2;
        }
      }
      return ((bik)localObject2).sF();
    }

    if ((localObject1 instanceof dBN)) {
      return dLb.g((dBN)localObject1);
    }

    if ((localObject1 instanceof String)) {
      return new cpn((String)localObject1, false).sF();
    }

    if ((localObject1 instanceof cFg)) {
      return new cpn(localObject1.toString(), true).sF();
    }

    if ((localObject1 instanceof Boolean)) {
      return Boolean.TRUE.equals(localObject1) ? ige : igf;
    }
    if ((fqS == null ? (cvp.fqS = cd("[Ljava.lang.String;")) : fqS) == localClass) {
      return new ayN((String[])localObject1);
    }
    if ((igk == null ? (cvp.igk = cd("[LcFg;")) : igk) == localClass) {
      return new ayN((cFg[])localObject1);
    }
    if ((igl == null ? (cvp.igl = cd("[LaxA;")) : igl) == localClass) {
      return new cuT((axA[])localObject1);
    }
    if ((igm == null ? (cvp.igm = cd("[Larr;")) : igm).isAssignableFrom(localClass)) {
      return new sJ((arr[])localObject1);
    }
    if ((igj == null ? (cvp.igj = cd("[Lbik;")) : igj).isAssignableFrom(localClass)) {
      localObject2 = (bik[])localObject1;
      localObject3 = localClass.getComponentType();
      boolean bool = (cvF == null ? (cvp.cvF = cd("ckM")) : cvF).isAssignableFrom((Class)localObject3);
      if (bool) {
        bik.d((bik[])localObject2);
        localObject4 = new axA[localObject2.length + 1];
        for (int i = 0; i < localObject2.length; i++) {
          localObject4[i] = (localObject2[i] != null ? localObject2[i].sF() : null);
        }
        return new cuT((axA[])localObject4);
      }
      if (localObject2.length == 0) {
        throw new IllegalArgumentException("Structure array must have non-zero length");
      }
      if (localObject2[0] == null) {
        bik.P((Class)localObject3).a((bik[])localObject2);
        return localObject2[0].sF();
      }

      bik.d((bik[])localObject2);
      return localObject2[0].sF();
    }

    if (localClass.isArray()) {
      throw new IllegalArgumentException("Unsupported array argument type: " + localClass.getComponentType());
    }

    if (paramBoolean) {
      return localObject1;
    }
    if (!Native.t(localObject1.getClass())) {
      throw new IllegalArgumentException("Unsupported argument type " + localObject1.getClass().getName() + " at parameter " + paramInt + " of function " + getName());
    }

    return localObject1;
  }

  private boolean ah(Class paramClass) {
    return (paramClass.isArray()) && (paramClass.getComponentType().isPrimitive());
  }

  public void s(Object[] paramArrayOfObject)
  {
    a(cvP == null ? (cvp.cvP = cd("java.lang.Void")) : cvP, paramArrayOfObject);
  }

  private String a(int paramInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    axA localaxA = c(paramInt, paramArrayOfObject);
    String str = null;
    if (localaxA != null) {
      if (paramBoolean)
        str = localaxA.getString(0L, paramBoolean);
      else
        str = localaxA.getString(0L);
    }
    return str;
  }

  public String toString()
  {
    if (this.igg != null) {
      return "native function " + this.igh + "(" + this.igg.getName() + ")@0x" + Long.toHexString(this.dMH);
    }

    return "native function@0x" + Long.toHexString(this.dMH);
  }

  public Object t(Object[] paramArrayOfObject)
  {
    return a(ibQ == null ? (cvp.ibQ = cd("java.lang.Object")) : ibQ, paramArrayOfObject);
  }

  public axA u(Object[] paramArrayOfObject)
  {
    return (axA)a(bZT == null ? (cvp.bZT = cd("axA")) : bZT, paramArrayOfObject);
  }

  public String a(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    Object localObject = a(bRr == null ? (cvp.bRr = cd("java.lang.String")) : paramBoolean ? bRs : bRs == null ? (cvp.bRs = cd("cFg")) : bRr, paramArrayOfObject);
    return localObject != null ? localObject.toString() : null;
  }

  public int v(Object[] paramArrayOfObject)
  {
    return ((Integer)a(cvK == null ? (cvp.cvK = cd("java.lang.Integer")) : cvK, paramArrayOfObject)).intValue();
  }

  public long w(Object[] paramArrayOfObject)
  {
    return ((Long)a(cvL == null ? (cvp.cvL = cd("java.lang.Long")) : cvL, paramArrayOfObject)).longValue();
  }

  public float x(Object[] paramArrayOfObject)
  {
    return ((Float)a(cvM == null ? (cvp.cvM = cd("java.lang.Float")) : cvM, paramArrayOfObject)).floatValue();
  }

  public double y(Object[] paramArrayOfObject)
  {
    return ((Double)a(cvN == null ? (cvp.cvN = cd("java.lang.Double")) : cvN, paramArrayOfObject)).doubleValue();
  }

  public void z(Object[] paramArrayOfObject)
  {
    a(cvP == null ? (cvp.cvP = cd("java.lang.Void")) : cvP, paramArrayOfObject);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) return true;
    if (paramObject == null) return false;
    if (paramObject.getClass() == getClass()) {
      cvp localcvp = (cvp)paramObject;
      return (localcvp.gQj == this.gQj) && (localcvp.aPd.equals(this.aPd)) && (localcvp.dMH == this.dMH);
    }

    return false;
  }

  public int hashCode()
  {
    return this.gQj + this.aPd.hashCode() + super.hashCode();
  }

  static Object[] A(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0)) {
      Object localObject1 = paramArrayOfObject[(paramArrayOfObject.length - 1)];
      Object localObject2 = localObject1 != null ? localObject1.getClass() : null;
      if ((localObject2 != null) && (localObject2.isArray())) {
        Object[] arrayOfObject1 = (Object[])localObject1;
        Object[] arrayOfObject2 = new Object[paramArrayOfObject.length + arrayOfObject1.length];
        System.arraycopy(paramArrayOfObject, 0, arrayOfObject2, 0, paramArrayOfObject.length - 1);
        System.arraycopy(arrayOfObject1, 0, arrayOfObject2, paramArrayOfObject.length - 1, arrayOfObject1.length);

        arrayOfObject2[(arrayOfObject2.length - 1)] = null;
        paramArrayOfObject = arrayOfObject2;
      }
    }
    return paramArrayOfObject;
  }

  static boolean b(Method paramMethod)
  {
    try {
      Method localMethod = paramMethod.getClass().getMethod("isVarArgs", new Class[0]);
      return Boolean.TRUE.equals(localMethod.invoke(paramMethod, new Object[0]));
    }
    catch (SecurityException localSecurityException) {
    }
    catch (NoSuchMethodException localNoSuchMethodException) {
    }
    catch (IllegalArgumentException localIllegalArgumentException) {
    }
    catch (IllegalAccessException localIllegalAccessException) {
    }
    catch (InvocationTargetException localInvocationTargetException) {
    }
    return false;
  }

  static Boolean valueOf(boolean paramBoolean)
  {
    return paramBoolean ? Boolean.TRUE : Boolean.FALSE;
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}