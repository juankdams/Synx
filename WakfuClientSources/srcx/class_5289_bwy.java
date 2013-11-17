import java.util.List;
import org.apache.log4j.Logger;

public class bwy extends bJq
{
  public static final Logger K = Logger.getLogger(bwy.class);

  private dxQ ggR = new dxQ();

  public bwy(List paramList) {
    super(paramList);
  }

  public aIt aII() {
    return aIt.ehb;
  }

  public void a(bTI parambTI, long paramLong) {
    this.ggR.c(parambTI, paramLong);
  }

  public long aIJ() {
    long l = 0L;
    bkc localbkc = this.ggR.dcF();
    while (localbkc.hasNext()) {
      localbkc.fl();
      l += localbkc.bid();
    }
    return l;
  }

  public long f(bTI parambTI) {
    return this.ggR.get(parambTI);
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
    return l3;
  }

  protected boolean b(bTI parambTI, apX paramapX)
  {
    if (!super.b(parambTI, paramapX)) {
      return false;
    }

    long l = aIM();

    return l > 0L;
  }

  public boolean b(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return false;
    }

    if (!b(parambTI, localapX)) {
      return false;
    }

    long l = Math.min(g(parambTI), a(parambTI, localapX));
    if (l <= 0L) {
      return false;
    }

    a(parambTI, localapX, l, l);
    return true;
  }

  public long c(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return -1L;
    }
    return c(parambTI, localapX);
  }

  protected long c(bTI parambTI, apX paramapX) {
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
    return l1;
  }

  public boolean d(bTI parambTI, int paramInt) {
    apX localapX = e(parambTI, paramInt);
    if (localapX == null) {
      return false;
    }

    if (!d(parambTI, localapX)) {
      return false;
    }

    long l = c(parambTI, localapX);
    if (l <= 0L) {
      return false;
    }
    a(parambTI, localapX, -l, -l);
    return true;
  }
}