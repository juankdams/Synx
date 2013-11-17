import com.sun.jna.Native;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class deP extends bik
{
  private static Map kYK = new WeakHashMap();
  private static final int kYL = 13;
  public Kg kYM;
  public short kYN;
  public short type = 13;
  public axA kYO;

  private deP(bik parambik)
  {
    bik.a(parambik, true);
    axA[] arrayOfaxA;
    int i;
    Iterator localIterator;
    if ((parambik instanceof Iy)) {
      bJW localbJW1 = ((Iy)parambik).bRp;
      arrayOfaxA = new axA[] { c(parambik.a(localbJW1.field), localbJW1.type), null };
    }
    else
    {
      arrayOfaxA = new axA[parambik.buc().size() + 1];
      i = 0;
      for (localIterator = parambik.buc().values().iterator(); localIterator.hasNext(); ) {
        bJW localbJW2 = (bJW)localIterator.next();
        arrayOfaxA[(i++)] = parambik.c(localbJW2);
      }
    }
    a(arrayOfaxA);
  }

  private deP(Object paramObject, Class paramClass) {
    int i = Array.getLength(paramObject);
    axA[] arrayOfaxA = new axA[i + 1];
    axA localaxA = c(null, paramClass.getComponentType());
    for (int j = 0; j < i; j++) {
      arrayOfaxA[j] = localaxA;
    }
    a(arrayOfaxA);
  }
  protected List aR() {
    return Arrays.asList(new String[] { "size", "alignment", "type", "elements" });
  }
  private void a(axA[] paramArrayOfaxA) {
    this.kYO = new dcj(axA.SIZE * paramArrayOfaxA.length);
    this.kYO.b(0L, paramArrayOfaxA, 0, paramArrayOfaxA.length);
    write();
  }

  public static axA bi(Object paramObject) {
    if (paramObject == null)
      return JM.Um();
    if ((paramObject instanceof Class))
      return c(null, (Class)paramObject);
    return c(paramObject, paramObject.getClass());
  }

  private static axA c(Object paramObject, Class paramClass) {
    bXj localbXj = Native.q(paramClass);
    if (localbXj != null) {
      aEQ localaEQ = localbXj.X(paramClass);
      if (localaEQ != null) {
        paramClass = localaEQ.WJ();
      }
    }
    synchronized (kYK) {
      Object localObject1 = kYK.get(paramClass);
      if ((localObject1 instanceof axA)) {
        return (axA)localObject1;
      }
      if ((localObject1 instanceof deP)) {
        return ((deP)localObject1).sF();
      }
      if (bIG.gIh) { if ((bik.cvT == null ? (bik.cvT = bik.cd("java.nio.Buffer")) : bik.cvT).isAssignableFrom(paramClass)); } else if (!(bik.cvB == null ? (bik.cvB = bik.cd("dBN")) : bik.cvB).isAssignableFrom(paramClass))
          break label161;
      kYK.put(paramClass, JM.Um());
      return JM.Um();
      label161: Object localObject2;
      if ((bik.bRq == null ? (bik.bRq = bik.cd("bik")) : bik.bRq).isAssignableFrom(paramClass)) {
        if (paramObject == null) paramObject = a(paramClass, bik.buu());
        if ((bik.cvF == null ? (bik.cvF = bik.cd("ckM")) : bik.cvF).isAssignableFrom(paramClass)) {
          kYK.put(paramClass, JM.Um());
          return JM.Um();
        }
        localObject2 = new deP((bik)paramObject);
        kYK.put(paramClass, localObject2);
        return ((deP)localObject2).sF();
      }
      if ((bik.bZS == null ? (bik.bZS = bik.cd("arr")) : bik.bZS).isAssignableFrom(paramClass)) {
        localObject2 = MK.k(paramClass);
        return c(((MK)localObject2).a(paramObject, new qd()), ((MK)localObject2).WJ());
      }
      if (paramClass.isArray()) {
        localObject2 = new deP(paramObject, paramClass);

        kYK.put(paramObject, localObject2);
        return ((deP)localObject2).sF();
      }
      throw new IllegalArgumentException("Unsupported Structure field type " + paramClass);
    }
  }

  static axA d(Object paramObject, Class paramClass)
  {
    return c(paramObject, paramClass);
  }

  static
  {
    if (Native.cuK == 0)
      throw new Error("Native library not initialized");
    if (JM.Ud() == null)
      throw new Error("FFI types not initialized");
    kYK.put(Void.TYPE, JM.Ud());
    kYK.put(bik.cvP == null ? (bik.cvP = bik.cd("java.lang.Void")) : bik.cvP, JM.Ud());
    kYK.put(Float.TYPE, JM.Ue());
    kYK.put(bik.cvM == null ? (bik.cvM = bik.cd("java.lang.Float")) : bik.cvM, JM.Ue());
    kYK.put(Double.TYPE, JM.Uf());
    kYK.put(bik.cvN == null ? (bik.cvN = bik.cd("java.lang.Double")) : bik.cvN, JM.Uf());
    kYK.put(Long.TYPE, JM.Ug());
    kYK.put(bik.cvL == null ? (bik.cvL = bik.cd("java.lang.Long")) : bik.cvL, JM.Ug());
    kYK.put(Integer.TYPE, JM.Uh());
    kYK.put(bik.cvK == null ? (bik.cvK = bik.cd("java.lang.Integer")) : bik.cvK, JM.Uh());
    kYK.put(Short.TYPE, JM.Ui());
    kYK.put(bik.cvI == null ? (bik.cvI = bik.cd("java.lang.Short")) : bik.cvI, JM.Ui());
    axA localaxA = Native.cuL == 2 ? JM.Uj() : JM.Uk();

    kYK.put(Character.TYPE, localaxA);
    kYK.put(bik.cvJ == null ? (bik.cvJ = bik.cd("java.lang.Character")) : bik.cvJ, localaxA);
    kYK.put(Byte.TYPE, JM.Ul());
    kYK.put(bik.cvH == null ? (bik.cvH = bik.cd("java.lang.Byte")) : bik.cvH, JM.Ul());
    kYK.put(bik.bZT == null ? (bik.bZT = bik.cd("axA")) : bik.bZT, JM.Um());
    kYK.put(bik.bRr == null ? (bik.bRr = bik.cd("java.lang.String")) : bik.bRr, JM.Um());
    kYK.put(bik.bRs == null ? (bik.bRs = bik.cd("cFg")) : bik.bRs, JM.Um());
    kYK.put(Boolean.TYPE, JM.Uk());
    kYK.put(bik.cvG == null ? (bik.cvG = bik.cd("java.lang.Boolean")) : bik.cvG, JM.Uk());
  }
}