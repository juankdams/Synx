import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aDF
{
  private static final Logger K = Logger.getLogger(aDF.class);

  private static final bPu dYF = new bPu();
  private static final bPu dYG = new bPu();
  private static boolean dbt;

  public static void aPK()
  {
    dbt = true;
  }

  public static void aPL() {
    if (!dbt) {
      return;
    }

    ars.dzL.w(new cEw());

    ars.dzL.y(new cEs());

    dbt = false;
  }

  private static bOB b(cUh paramcUh) {
    return ba(paramcUh.nc());
  }

  public static bOB ba(short paramShort) {
    aPL();
    return (bOB)dYG.cx(paramShort);
  }

  private static ArrayList c(bOB parambOB) {
    ArrayList localArrayList1 = ars.dzL.b(parambOB);
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    if (!localArrayList1.isEmpty()) {
      localArrayList2.add(ars.dzL.aM(((dAi)localArrayList1.get(0)).ddw()));
      for (dAi localdAi : localArrayList1) {
        cUh localcUh = ars.dzL.aM(localdAi.ddx());
        if ((localcUh != null) && (localcUh.bVJ() == parambOB.nc()))
          localArrayList2.add(localcUh);
      }
    }
    else {
      ars.dzL.w(new cEB(parambOB, localArrayList2));
    }

    return localArrayList2;
  }

  public static cds c(cUh paramcUh) {
    kb localkb = kb.I(0L);
    bOB localbOB = b(paramcUh);
    ArrayList localArrayList = ars.dzL.b(localbOB);
    if (!localArrayList.isEmpty()) {
      for (dAi localdAi : localArrayList) {
        if (!localdAi.ddz()) {
          localkb.e(localdAi.ddy());
        }
      }
    }
    return localkb;
  }

  public static cds d(cUh paramcUh) {
    dAi localdAi = ars.dzL.aN(paramcUh.nc());
    return localdAi != null ? localdAi.ddy() : kb.hwQ;
  }

  public static cUh e(cUh paramcUh)
  {
    if (paramcUh == null) {
      return null;
    }
    if (paramcUh.aTC()) {
      return paramcUh;
    }
    bOB localbOB = b(paramcUh);
    if (localbOB == null) {
      return null;
    }
    return d(localbOB);
  }

  public static cUh d(bOB parambOB)
  {
    aPL();
    ArrayList localArrayList = (ArrayList)dYF.cx(parambOB.nc());
    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return null;
    }
    return (cUh)localArrayList.get(localArrayList.size() - 1);
  }

  public static cUh e(bOB parambOB)
  {
    aPL();
    ArrayList localArrayList = (ArrayList)dYF.cx(parambOB.nc());
    if (localArrayList == null) {
      return null;
    }
    return (cUh)localArrayList.get(0);
  }

  public static cUh f(cUh paramcUh)
  {
    if (paramcUh == null) {
      return null;
    }
    bOB localbOB = b(paramcUh);
    if (localbOB == null) {
      return null;
    }
    return e(localbOB);
  }

  public static aAb g(cUh paramcUh) {
    if (paramcUh.aTC()) {
      return aAb.dSs;
    }

    cUh localcUh1 = f(paramcUh);
    if (localcUh1 == paramcUh) {
      return aAb.dSq;
    }

    cUh localcUh2 = e(paramcUh);
    if (localcUh2 == paramcUh) {
      return aAb.dSs;
    }
    return aAb.dSr;
  }

  public static boolean s(short paramShort1, short paramShort2) {
    dAi localdAi = ars.dzL.aN(paramShort1);
    while (localdAi != null) {
      localdAi = ars.dzL.aN(localdAi.ddx());
      if ((localdAi != null) && (localdAi.ddx() == paramShort2)) {
        return true;
      }
    }
    return false;
  }

  public static ArrayList h(cUh paramcUh) {
    if (paramcUh == null) {
      return null;
    }
    if (!paramcUh.cBI()) {
      return null;
    }

    ArrayList localArrayList = new ArrayList();
    ((dde)paramcUh).W(new cEA(localArrayList));

    if ((!bB) && (localArrayList.isEmpty())) throw new AssertionError();
    return cxo.a(new cJH(localArrayList, 0, (short)0, true, cMx.krQ, 0));
  }
}