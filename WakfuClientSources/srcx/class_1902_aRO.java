import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;

public class aRO
  implements cvW
{
  public static final aRO eOP = new aRO();

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 109:
      tC localtC = (tC)paramcWG;
      int i = localtC.BM();

      switch (i) {
      case 110:
        g(localtC);
        break;
      case 111:
        f(localtC);
        break;
      case 112:
        e(localtC);
        break;
      case 113:
        d(localtC);
        break;
      case 114:
        c(localtC);
        break;
      case 140:
        a(localtC);
        break;
      case 39:
      case 136:
      case 137:
      case 138:
      case 163:
      case 164:
      case 165:
        b(localtC);
      }

      return false;
    }

    return true;
  }

  private void a(tC paramtC) {
    long l = paramtC.BR();
    WakfuClientInstance.awy().awZ().fZ(l).ns(paramtC.BN());
  }

  private void b(tC paramtC) {
    String str = paramtC.BN();
    cth.cqP().log(str);
  }

  private void c(tC paramtC) {
    boolean bool = paramtC.BQ() == 1;
    int i = paramtC.BQ();

    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++) {
      long l1 = paramtC.BR();
      long l2 = paramtC.BR();
      String str = paramtC.BN();
      vf localvf = new vf(l1, l2, str);
      localArrayList.add(localvf);
    }

    WakfuClientInstance.awy().awZ().bAF().a(bool, localArrayList);
  }

  private void d(tC paramtC) {
    long l = paramtC.BR();
    WakfuClientInstance.awy().awZ().fZ(l).cDd();
  }

  private void e(tC paramtC) {
    bkh.fAz.clear();

    int i = paramtC.BS();
    for (int j = 0; j < i; j++) {
      int k = paramtC.BO();
      String str = paramtC.BN();
      bkh.fAz.c(k, str);
    }

    WakfuClientInstance.awy().awZ().bAE();
  }

  private void f(tC paramtC) {
    long l = paramtC.BR();
    boolean bool = paramtC.BP();

    WakfuClientInstance.awy().awZ().fZ(l).ii(bool);
  }

  private void g(tC paramtC) {
    long l1 = paramtC.BR();
    long l2 = paramtC.BR();
    String str1 = paramtC.BN();
    short s1 = paramtC.BS();
    int i = paramtC.BO();
    String str2 = paramtC.BN();
    int j = paramtC.BO();
    int k = paramtC.BO();
    short s2 = paramtC.BS();
    int m = paramtC.BO();
    int n = paramtC.BO();
    short s3 = paramtC.BS();
    boolean bool = paramtC.BP();

    WakfuClientInstance.awy().awZ().fZ(l1).b(l1, l2, str1, s1, i, str2, j, k, s2, m, n, s3, bool);
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    aIG localaIG = new aIG();
    localaIG.bf((short)112);
    localaIG.bM((byte)1);
    WakfuClientInstance.awy().awz().aJK().d(localaIG);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}