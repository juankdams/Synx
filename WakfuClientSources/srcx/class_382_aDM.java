import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class aDM
{
  private static final int dYN = 256;
  private static final Logger K = Logger.getLogger(aDM.class);
  private static final aDM dYO = new aDM();
  private final dFu dYP;
  private final cSR cpk;
  private final cSR dYQ;
  private static final cYR dYR = new cYR();

  private aDM()
  {
    this.dYQ = new cSR();
    this.cpk = new cSR();
    this.dYP = new dFu();
  }

  aum a(int paramInt, Class paramClass) {
    aum localaum = (aum)this.cpk.get(paramInt);
    if (localaum == null)
    {
      int i = this.dYP.get(paramInt);
      if (i == 0) {
        i = 256;
      }

      localaum = a(paramInt, paramClass, i);
    }
    return localaum;
  }

  private aum a(int paramInt1, Class paramClass, int paramInt2) {
    bJv localbJv = (bJv)this.dYQ.get(paramInt1);
    if (localbJv == null) {
      localbJv = g(null, paramClass);
      this.dYQ.put(paramInt1, localbJv);
    }
    return new aum(paramInt2, paramClass, localbJv);
  }

  public final aum[] aPY() {
    aum[] arrayOfaum = new aum[this.cpk.size()];
    return (aum[])this.cpk.d(arrayOfaum);
  }

  private static bJv L(String paramString1, String paramString2) {
    if (dzp.qF(paramString1)) {
      paramString1 = paramString2 + "$ObjectFactory";
    }
    return (bJv)Class.forName(paramString1).newInstance();
  }

  private static bJv g(String paramString, Class paramClass) {
    try {
      return L(paramString, paramClass.getName());
    } catch (Exception localException) {
      K.error(localException);
    }return aum.D(paramClass);
  }

  public final void a(bwZ parambwZ)
  {
    K localK1 = parambwZ.bEx().b("memoryObjectPools");
    if (localK1 == null) {
      K.warn("No pools configuration found");
      return;
    }
    ArrayList localArrayList = localK1.c("pool");
    if (localArrayList == null) {
      K.warn("No pools configuration found");
      return;
    }
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      K localK2 = (K)localArrayList.get(j);
      K localK3 = localK2.e("class");
      K localK4 = localK2.e("size");
      String str1 = localK3.getStringValue();
      int k = localK4.getIntValue();
      int m = akE.eJ(str1);
      bA(m, k);

      K localK5 = localK2.e("factory_class");
      String str2 = localK5 != null ? localK5.getStringValue() : null;
      try
      {
        this.dYQ.put(m, L(str2, str1));
      } catch (Exception localException) {
        K.error("problème avec la factory pour la classe " + str1 + "\n" + localException.getMessage());
      }
    }
  }

  public final void gm(String paramString)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();
    try
    {
      localbpA.iy(paramString);
      localbpA.a(localbwZ, new cdJ[0]);
      localbpA.close();
    } catch (Exception localException) {
      K.error("Exception", localException);
    }

    a(localbwZ);
  }

  public static aDM aPZ() {
    return dYO;
  }

  final void a(aum paramaum)
  {
    this.cpk.put(paramaum.aGx(), paramaum);
    dbP.cNw().b(paramaum);
  }

  private void bA(int paramInt1, int paramInt2) {
    this.dYP.fg(paramInt1, paramInt2);
  }

  public static void dump()
  {
    StringBuilder localStringBuilder = new StringBuilder("**** dump MemoryObjectPools ***\n");
    dmn localdmn = aPZ().cpk.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      aum localaum = (aum)localdmn.value();
      int i = dYR.get(localaum);
      localStringBuilder.append(localaum.aGy() + " active=" + localaum.akc() + " idle=" + localaum.akb() + " poolSize=" + localaum.getSize());
      localStringBuilder.append("  ").append(localaum.akc() - i);
      dYR.i(localaum, localaum.akc());
      localStringBuilder.append("\n");
    }

    K.info(localStringBuilder.toString());
  }
}