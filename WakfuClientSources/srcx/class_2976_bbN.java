import java.util.ArrayList;
import java.util.Locale;

public class bbN extends cqy
{
  private final Object aNy = new Object();

  public static final bbN fls = new bbN();

  private final ArrayList aBf = new ArrayList();

  private bbN() {
    super(new dFU[] { new cpJ() });
  }

  public void a(Ft paramFt) {
    synchronized (this.aNy) {
      this.aBf.add(paramFt);
      if (!byv.bFN().c(this)) {
        byv.bFN().a(this);
      }
      bqp();
    }
  }

  void hT(String paramString) {
    synchronized (this.aNy) {
      int i = 0; for (int j = this.aBf.size(); i < j; i++) {
        Ft localFt = (Ft)this.aBf.get(i);
        localFt.bG(paramString);
      }

      this.aBf.clear();
    }
  }

  private static void bqp() {
    long l = awn.B(byv.bFN().aJL());
    String str = bU.fH().ajJ().cAZ().getLanguage();
    byv.bFN().aJK().d(new Pn(l, str));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
      T(new RZ(this));
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      synchronized (this.aNy) {
        this.aBf.clear();
      }
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public String toString()
  {
    return "ICEAuthFrame{}";
  }
}