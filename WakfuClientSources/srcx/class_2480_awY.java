import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class awY extends bJq
{
  public static final Logger K = Logger.getLogger(awY.class);
  protected final long dMo;
  protected final long dMp;
  protected final long dMq;

  public awY()
  {
    super(aIH());

    byz localbyz = byv.bFN().bFO();
    this.dMo = localbyz.blf();
    this.dMp = dyc.ks(this.dMo);
    this.dMq = (this.dMp / 3L);
  }

  public void aIG() {
    byz localbyz = byv.bFN().bFO();
    if ((localbyz == null) || (localbyz.auK() == null)) {
      return;
    }

    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localbyz.auK().iterator(); localIterator.hasNext(); ) { localapX = (apX)localIterator.next();
      localArrayList.add(localapX);
    }
    apX localapX;
    Collections.sort(localArrayList, new dsy(this));

    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localapX = (apX)localIterator.next();
      if (aIM() <= 0L) {
        return;
      }
      if (!((dSR)localapX.bsL()).bHY())
      {
        bTI localbTI = localapX.Cz();
        int i = localapX.ok();
        int j = localapX.bsN();
        for (int k = 0; k < j; k++) {
          b(localbTI, i);
        }
      }
    }

    Collections.sort(localArrayList, new dsz(this));

    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localapX = (apX)localIterator.next();
      if (aIM() > 0L)
        b(localapX.Cz(), localapX.ok());
    }
  }

  private static List aIH()
  {
    byz localbyz = byv.bFN().bFO();
    SB localSB = localbyz.aii();
    ArrayList localArrayList = new ArrayList();
    localSB.l(new dsA(localArrayList));

    return localArrayList;
  }

  public aIt aII() {
    return aIt.eha;
  }

  public long aIJ() {
    return this.dMp;
  }

  public long f(bTI parambTI) {
    return this.dMp;
  }

  public long a(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return -1L;
    }
    return a(parambTI, localapX);
  }

  protected long a(bTI parambTI, apX paramapX) {
    cOB localcOB = paramapX.ble();
    if (paramapX.nU() >= localcOB.nV()) {
      return -1L;
    }
    long l1 = localcOB.cH(paramapX.ayX());
    long l2 = localcOB.aq(paramapX.nU());
    long l3 = l2 - l1;

    long l4 = h(parambTI);
    long l5 = dyc.h(l4, l3, this.dMq);

    return l5;
  }

  protected boolean b(bTI parambTI, apX paramapX)
  {
    if (!super.b(parambTI, paramapX)) {
      return false;
    }

    long l = aIM();

    if (l < 1L) {
      return false;
    }

    if (l > 1L) {
      return true;
    }

    return h(parambTI) < this.dMq;
  }

  public boolean b(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return false;
    }

    if (!b(parambTI, localapX)) {
      return false;
    }

    long l1 = a(parambTI, localapX);
    if (l1 <= 0L) {
      return false;
    }

    long l2 = Math.min(l1, aIM());
    if (l2 <= 0L) {
      return false;
    }

    long l3 = h(parambTI);
    double d = dyc.i(l3, l2, this.dMq);

    long l4 = ()Math.floor(d);
    long l5;
    if (bCO.g(l4, d, 1.E-005D))
      l5 = l2;
    else {
      l5 = dyc.h(l3, l4, this.dMq);
    }

    a(parambTI, localapX, l4, l5);

    return true;
  }

  public long c(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return -1L;
    }
    return c(parambTI, localapX);
  }

  protected long c(bTI parambTI, apX paramapX)
  {
    cOB localcOB = paramapX.ble();
    if (paramapX.nU() < localcOB.Qb()) {
      return -1L;
    }

    long l2 = localcOB.cH(paramapX.ayX());
    long l1;
    if (l2 != 0L) {
      l1 = l2;
    }
    else
    {
      if (paramapX.nU() == localcOB.Qb()) {
        return -1L;
      }
      l1 = localcOB.aq((short)(paramapX.nU() - 1));
    }

    long l3 = h(parambTI);

    long l4 = -dyc.h(l3, -l1, this.dMq);

    return l4;
  }

  public boolean d(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return false;
    }

    if (!d(parambTI, localapX)) {
      return false;
    }

    long l1 = c(parambTI, localapX);
    if (l1 <= 0L) {
      return false;
    }

    long l2 = h(parambTI);
    double d = -dyc.i(l2, -l1, this.dMq);

    long l3 = ()Math.floor(d);
    long l4;
    if (bCO.g(l3, d, 1.E-005D))
      l4 = l1;
    else {
      l4 = -dyc.h(l2, -l3, this.dMq);
    }

    a(parambTI, localapX, -l3, -l4);

    return true;
  }
}