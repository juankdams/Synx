import java.lang.ref.WeakReference;

public class UH
  implements dUd
{
  private final cdt cyR;
  private WeakReference cyS;
  private final cAo cyT;
  private Long cyU;
  private long cyV;

  public UH(cdt paramcdt, cAo paramcAo)
  {
    this.cyR = paramcdt;
    this.cyT = paramcAo;
  }

  public void aB(int paramInt1, int paramInt2) {
    ahZ();
    this.cyU = Long.valueOf(this.cyT.a(this, paramInt1, paramInt2, 1));
    this.cyV = (this.cyR.bMO() + paramInt1);
  }

  private void ahZ() {
    if (this.cyU != null)
      this.cyT.ia(this.cyU.longValue());
    this.cyU = null;
  }

  public boolean aia() {
    return this.cyU != null;
  }

  public void aib() {
    ahZ();
  }

  public int aic() {
    return Math.max(0, (int)(aid() / 1000L));
  }

  public long aid() {
    return this.cyV - this.cyR.bMO();
  }

  public void a(daG paramdaG) {
    this.cyS = new WeakReference(paramdaG);
  }

  public boolean a(cWG paramcWG)
  {
    if (!(paramcWG instanceof dKQ)) {
      return true;
    }
    daG localdaG = (daG)this.cyS.get();
    if (localdaG == null) {
      this.cyT.b(this);
      return true;
    }

    return a((dKQ)paramcWG, localdaG);
  }

  private boolean a(dKQ paramdKQ, daG paramdaG) {
    if ((this.cyU != null) && (this.cyU.longValue() == paramdKQ.czk())) {
      this.cyU = null;
      paramdaG.sO(paramdKQ.czj());
    }
    return false;
  }

  public final long getId() {
    return 1L;
  }

  public final void a(long paramLong)
  {
  }
}