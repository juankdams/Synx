import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class djO
  implements bXj
{
  private List lgT = new ArrayList();
  private List lgU = new ArrayList();
  static Class cvG;
  static Class cvH;
  static Class cvJ;
  static Class cvI;
  static Class cvK;
  static Class cvL;
  static Class cvM;
  static Class cvN;

  private Class am(Class paramClass)
  {
    if (paramClass == (cvG == null ? (djO.cvG = cd("java.lang.Boolean")) : cvG)) {
      return Boolean.TYPE;
    }
    if (paramClass == Boolean.TYPE) {
      return cvG == null ? (djO.cvG = cd("java.lang.Boolean")) : cvG;
    }
    if (paramClass == (cvH == null ? (djO.cvH = cd("java.lang.Byte")) : cvH)) {
      return Byte.TYPE;
    }
    if (paramClass == Byte.TYPE) {
      return cvH == null ? (djO.cvH = cd("java.lang.Byte")) : cvH;
    }
    if (paramClass == (cvJ == null ? (djO.cvJ = cd("java.lang.Character")) : cvJ)) {
      return Character.TYPE;
    }
    if (paramClass == Character.TYPE) {
      return cvJ == null ? (djO.cvJ = cd("java.lang.Character")) : cvJ;
    }
    if (paramClass == (cvI == null ? (djO.cvI = cd("java.lang.Short")) : cvI)) {
      return Short.TYPE;
    }
    if (paramClass == Short.TYPE) {
      return cvI == null ? (djO.cvI = cd("java.lang.Short")) : cvI;
    }
    if (paramClass == (cvK == null ? (djO.cvK = cd("java.lang.Integer")) : cvK)) {
      return Integer.TYPE;
    }
    if (paramClass == Integer.TYPE) {
      return cvK == null ? (djO.cvK = cd("java.lang.Integer")) : cvK;
    }
    if (paramClass == (cvL == null ? (djO.cvL = cd("java.lang.Long")) : cvL)) {
      return Long.TYPE;
    }
    if (paramClass == Long.TYPE) {
      return cvL == null ? (djO.cvL = cd("java.lang.Long")) : cvL;
    }
    if (paramClass == (cvM == null ? (djO.cvM = cd("java.lang.Float")) : cvM)) {
      return Float.TYPE;
    }
    if (paramClass == Float.TYPE) {
      return cvM == null ? (djO.cvM = cd("java.lang.Float")) : cvM;
    }
    if (paramClass == (cvN == null ? (djO.cvN = cd("java.lang.Double")) : cvN)) {
      return Double.TYPE;
    }
    if (paramClass == Double.TYPE) {
      return cvN == null ? (djO.cvN = cd("java.lang.Double")) : cvN;
    }
    return null;
  }

  public void a(Class paramClass, aEQ paramaEQ)
  {
    this.lgT.add(new cxP(paramClass, paramaEQ));
    Class localClass = am(paramClass);
    if (localClass != null)
      this.lgT.add(new cxP(localClass, paramaEQ));
  }

  public void a(Class paramClass, bYH parambYH)
  {
    this.lgU.add(new cxP(paramClass, parambYH));
    Class localClass = am(paramClass);
    if (localClass != null)
      this.lgU.add(new cxP(localClass, parambYH));
  }

  protected void a(Class paramClass, dsn paramdsn)
  {
    a(paramClass, paramdsn);
    a(paramClass, paramdsn);
  }

  private Object b(Class paramClass, List paramList) {
    for (Iterator localIterator = paramList.iterator(); localIterator.hasNext(); ) {
      cxP localcxP = (cxP)localIterator.next();
      if (localcxP.type.isAssignableFrom(paramClass)) {
        return localcxP.ilQ;
      }
    }
    return null;
  }

  public bYH W(Class paramClass)
  {
    return (bYH)b(paramClass, this.lgU);
  }

  public aEQ X(Class paramClass)
  {
    return (aEQ)b(paramClass, this.lgT);
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}