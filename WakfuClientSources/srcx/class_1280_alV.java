import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

final class alV
{
  private static final Logger K = Logger.getLogger(alV.class);
  private final dhJ dnJ;
  private final bsS dnK = new bsS().qK(14);

  private final bsS dnL = new bsS().qK(31);

  alV(dhJ paramdhJ)
  {
    this.dnJ = paramdhJ;
  }

  public void ayD() {
    if (this.dnJ.ayJ() == null) {
      return;
    }

    this.dnJ.cRl();
    ayH();
    try
    {
      ayF();
      ayG();
      ayE();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    } finally {
      ayI();
    }

    this.dnJ.cRm();
  }

  private void ayE() {
    ayK().px(31);
    cKT localcKT = this.dnJ.bHr();
    cHu localcHu = localcKT.cEg();
    while (localcHu.hasNext()) {
      localcHu.fl();
      cRs localcRs = (cRs)localcHu.value();
      c(localcRs);
    }
  }

  private void c(cRs paramcRs) {
    bBn localbBn = Hh.QM().dh(paramcRs.ok());
    if (localbBn == null) {
      return;
    }

    Iterator localIterator = localbBn.bKh();
    cOE localcOE = ayL();
    int i = this.dnJ.fa();
    int j = this.dnJ.fb();
    short s = this.dnJ.fc();

    while (localIterator.hasNext()) {
      dpI localdpI = (dpI)localIterator.next();
      if ((localdpI.aMG() == 0) && (!localdpI.bev()))
        localdpI.a(this.dnL.bAZ(), this.dnJ, localcOE, bsj.bAv(), i, j, s, this.dnJ, null);
    }
  }

  private void ayF()
  {
    bcm localbcm = new bcm();

    for (Iterator localIterator = ayJ().iterator(); localIterator.hasNext(); ) { localObject = (gA)localIterator.next();
      try {
        if (((gA)localObject).isActive())
        {
          if (((gA)localObject).oi().bKk() != 0) {
            ctU localctU = this.dnJ.afu().cn(((gA)localObject).oi().bKk());
            localbcm.add(localctU);
          }
          s((gA)localObject);
          u((gA)localObject);
        }
      } catch (ConcurrentModificationException localConcurrentModificationException) { K.error("ConcurrentModificationException while applyingItemAndSetEffects for item " + ((gA)localObject).toString() + " on breed " + this.dnJ.uO());
        throw localConcurrentModificationException;
      }
    }
    Object localObject;
    for (localIterator = localbcm.iterator(); localIterator.hasNext(); ) { localObject = (ctU)localIterator.next();
      a((ctU)localObject); }
  }

  private void ayG()
  {
    cOE localcOE = ayL();
    HashSet localHashSet = new HashSet();
    int i;
    do
    {
      i = 0;

      for (gA localgA : ayJ())
        if ((localgA.isActive()) && 
          (!localHashSet.contains(localgA)))
        {
          if (!cVY.cKs().a(localgA, this.dnJ, localcOE)) {
            i = 1;
            localHashSet.add(localgA);
            s(localgA);
            break;
          }
        }
    }
    while (i != 0);
  }

  void s(gA paramgA) {
    ayK().a(paramgA, true);
  }

  boolean t(gA paramgA) {
    cOE localcOE = ayL();

    if (!cVY.cKs().a(paramgA, this.dnJ, localcOE)) {
      return false;
    }

    return u(paramgA);
  }

  boolean u(gA paramgA) {
    if (!paramgA.isActive()) {
      return false;
    }
    if ((paramgA.or()) && (paramgA.oq().FC())) {
      return false;
    }

    cOE localcOE = ayL();
    int i = this.dnJ.fa();
    int j = this.dnJ.fb();
    short s = this.dnJ.fc();

    for (dpI localdpI : paramgA)
    {
      if ((localdpI.aMG() == 0) && (!localdpI.bev())) {
        localdpI.a(paramgA, this.dnJ, localcOE, bsj.bAv(), i, j, s, this.dnJ, null);
      }
    }

    return true;
  }

  void a(gA paramgA, ctU paramctU) {
    ayK().a(paramgA, true);
    a(paramctU);
  }

  private void a(ctU paramctU)
  {
    bqk localbqk = this.dnK.ga(paramctU.nc()).bAZ();

    ayK().a(localbqk, true);

    int i = b(paramctU);
    ArrayList localArrayList = paramctU.wL(i);
    if (localArrayList.isEmpty()) {
      return;
    }
    int j = 0; for (int k = localArrayList.size(); j < k; j++)
      a((bog)localArrayList.get(j), this.dnJ.ayL());
  }

  private short b(ctU paramctU)
  {
    bZH localbZH = ayJ();
    if (localbZH == null) {
      return 0;
    }

    short s = 0;
    for (bBn localbBn : paramctU) {
      gA localgA = (gA)localbZH.hh(localbBn.getId());
      if ((localgA != null) && (cVY.cKs().a(localgA, this.dnJ, ayL()))) {
        s = (short)(s + 1);
      }
    }
    return s;
  }

  private void a(bog parambog, cOE paramcOE) {
    int i = this.dnJ.fa();
    int j = this.dnJ.fb();
    short s = this.dnJ.fc();
    for (dpI localdpI : parambog)
      localdpI.a(parambog, this.dnJ, paramcOE, bsj.bAv(), i, j, s, this.dnJ, null);
  }

  private void ayH()
  {
    e(d(eu.ayN));
    e(d(eu.ayO));
    e(d(eu.ayP));
    e(d(eu.ayM));
  }

  private void e(Rx paramRx) {
    if (paramRx != null)
      paramRx.acZ();
  }

  private void ayI()
  {
    f(d(eu.ayN));
    f(d(eu.ayO));
    f(d(eu.ayP));
    f(d(eu.ayM));
  }

  private void f(Rx paramRx) {
    if (paramRx != null)
      paramRx.ada();
  }

  private bZH ayJ()
  {
    return this.dnJ.ayJ();
  }

  public bgJ ayK() {
    return this.dnJ.ayK();
  }

  public cOE ayL() {
    return this.dnJ.ayL();
  }

  public Rx d(dSc paramdSc) {
    return this.dnJ.d(paramdSc);
  }
}