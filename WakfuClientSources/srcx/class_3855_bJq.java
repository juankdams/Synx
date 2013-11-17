import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

abstract class bJq
  implements cjE
{
  public static final Logger K = Logger.getLogger(bJq.class);
  protected final short gKo;
  private final HashMap gKp = new HashMap();
  private final dxQ gKq = new dxQ();

  protected bJq(List paramList)
  {
    byz localbyz = byv.bFN().bFO();
    this.gKo = localbyz.nU();

    for (bTI localbTI : paramList) {
      this.gKp.put(localbTI, a(localbyz.aii(), localbTI));
      this.gKq.c(localbTI, 0L);
    }
  }

  private List a(bhh parambhh, bTI parambTI)
  {
    Zp localZp = aQC.bhe().nx(parambhh.uO());
    if (localZp == null) {
      K.error("Unable to find a valid breedInfo for breed " + parambhh);
      return Collections.emptyList();
    }

    fg[] arrayOffg1 = localZp.e(parambTI);
    ArrayList localArrayList = new ArrayList(arrayOffg1.length);
    for (fg localfg : arrayOffg1) {
      localArrayList.add(new apX(localfg.mf(), (short)0, 0L));
    }

    Collections.sort(localArrayList, new aw(this));

    return localArrayList;
  }

  public boolean i(bTI parambTI) {
    return this.gKp.containsKey(parambTI);
  }

  public void reset() {
    this.gKq.a(new ax(this));

    for (bTI localbTI : this.gKp.keySet()) {
      List localList = (List)this.gKp.get(localbTI);
      for (apX localapX : localList)
        localapX.e((short)0, 0L);
    }
  }

  public abstract long aIJ();

  public abstract long f(bTI parambTI);

  public long aIN()
  {
    long l = 0L;

    for (bkc localbkc = this.gKq.dcF(); localbkc.hasNext(); ) {
      localbkc.fl();
      l += localbkc.bid();
    }
    return l;
  }

  public long h(bTI parambTI) {
    if (parambTI == null) {
      return aIN();
    }
    return this.gKq.get(parambTI);
  }

  public long aIM() {
    return aIJ() - aIN();
  }

  public long g(bTI parambTI) {
    return f(parambTI) - h(parambTI);
  }

  public boolean h(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    return (localapX != null) && (e(parambTI, localapX));
  }

  protected boolean e(bTI parambTI, apX paramapX) {
    return a(paramapX, (Iterable)this.gKp.get(parambTI));
  }

  private static boolean a(apX paramapX, Iterable paramIterable) {
    bZA localbZA = ((dSR)paramapX.bsL()).bHW();
    if (localbZA == null) {
      return true;
    }
    int i = localbZA.a(paramIterable, null, null, null);
    return i == 0;
  }

  public boolean g(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    return (localapX != null) && (b(parambTI, localapX));
  }

  protected boolean b(bTI parambTI, apX paramapX) {
    if (g(parambTI) <= 0L) {
      return false;
    }

    int i = paramapX.nU();
    if (i >= this.gKo) {
      return false;
    }

    if (i >= paramapX.ble().nV()) {
      return false;
    }

    if (!e(parambTI, paramapX)) {
      return false;
    }

    return true;
  }

  public boolean f(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    return (localapX != null) && (d(parambTI, localapX));
  }

  public boolean d(bTI parambTI, apX paramapX) {
    int i = paramapX.ble().Qb();
    if (paramapX.nU() < i) {
      return false;
    }

    if ((paramapX.nU() == i) && 
      (paramapX.ayX() == 0L)) {
      return false;
    }

    if (!e(parambTI, paramapX)) {
      return false;
    }

    if (bCO.bE(paramapX.ayY())) {
      List localList = (List)this.gKp.get(parambTI);
      int j = ((dSR)paramapX.bsL()).vp();

      boolean[] arrayOfBoolean = new boolean[5];
      short[] arrayOfShort = new short[5];
      long[] arrayOfLong = new long[5];
      for (int k = 0; k < localList.size(); k++) {
        apX localapX1 = (apX)localList.get(k);
        arrayOfShort[k] = localapX1.nU();
        arrayOfLong[k] = localapX1.ayX();
        arrayOfBoolean[k] = ((((dSR)localapX1.bsL()).vp() > j) && (localapX1.ayX() > 0L) ? 1 : false);

        if (localapX1 == paramapX) {
          paramapX.d((short)(paramapX.nU() - 1), false);
        }
      }

      k = 1;

      for (int m = 4; m > 0; m--) {
        ((apX)localList.get(m)).d((short)0, false);
        if (arrayOfBoolean[m] != 0)
        {
          if (!a((apX)localList.get(m), localList))
          {
            k = 0;
            break;
          }
        }
      }
      for (m = 0; m < localList.size(); m++) {
        apX localapX2 = (apX)localList.get(m);
        localapX2.e(arrayOfShort[m], arrayOfLong[m]);
      }

      if (k == 0) {
        return false;
      }
    }

    return true;
  }

  public boolean aIL()
  {
    return aIM() <= 1L;
  }

  public boolean aIK() {
    if (!aIL()) {
      return false;
    }

    IX localIX = new IX();

    for (bTI localbTI : this.gKp.keySet()) {
      List localList = (List)this.gKp.get(localbTI);
      for (int i = 0; i < localList.size(); i++) {
        apX localapX = (apX)localList.get(i);
        if (localapX.ayX() != 0L)
        {
          localIX.a(localapX.ok(), localapX.ayX());
        }
      }
    }
    byv.bFN().aJK().d(localIX);
    return true;
  }

  public apX e(bTI parambTI, int paramInt)
  {
    List localList = (List)this.gKp.get(parambTI);
    if (localList == null) {
      K.error("Unable to find spell " + paramInt + " with element " + parambTI + " : element is unknown");
      return null;
    }
    for (int i = localList.size() - 1; i >= 0; i--) {
      if (((apX)localList.get(i)).ok() == paramInt) {
        return (apX)localList.get(i);
      }
    }
    K.error("Unable to find spell " + paramInt + " in element " + parambTI + " : spell is unknown");
    return null;
  }

  protected void a(bTI parambTI, apX paramapX, long paramLong1, long paramLong2) {
    long l = paramapX.ayX() + paramLong1;
    short s = dMu.abu().cF(l);
    uP localuP = paramapX.e(s, l);
    if (localuP.DP() != paramLong1) {
      K.error("Unconsistant result. Tried to add " + paramLong1 + ", but " + localuP.DP() + " added");
    }
    this.gKq.e(parambTI, paramLong2);
  }
}