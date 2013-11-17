import java.util.Calendar;
import java.util.TimeZone;

class diS extends cho
{
  private static final aee aOr = new bOO(new bfc());

  final TimeZone lfb = Calendar.getInstance().getTimeZone();
  private long lfc;

  public long ck(long paramLong)
  {
    long l1 = this.lfb.getOffset(paramLong);

    long l2 = (paramLong + l1) / this.lfc;

    this.hFE = ((1L + l2) * this.lfc - l1);
    return this.hFE;
  }

  protected aee Bq() {
    return aOr;
  }

  static diS a(dmr paramdmr, long paramLong) {
    diS localdiS;
    try {
      localdiS = (diS)aOr.Mm();
      localdiS.gkh = true;
    }
    catch (Exception localException) {
      localdiS = new diS();
      localdiS.gkh = false;
    }
    localdiS.lfc = paramdmr.toMillis(paramLong);
    return localdiS;
  }
}