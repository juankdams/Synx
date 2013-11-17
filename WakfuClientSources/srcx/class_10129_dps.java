import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class dps extends daU
{
  private static final dps lqi = new dps();
  protected final ConcurrentHashMap lqj;
  protected final List lqk;

  public dps()
  {
    this.lqj = new ConcurrentHashMap();
    this.lqk = new ArrayList();
  }

  public static dps cXa() {
    return lqi;
  }

  public void k(ahm paramahm)
  {
    this.lqj.put(Long.valueOf(paramahm.getId()), paramahm);
    a(paramahm, paramahm.fa(), paramahm.fb(), (int)paramahm.getAltitude());
  }

  public ahm jQ(long paramLong) {
    ahm localahm = (ahm)this.lqj.remove(Long.valueOf(paramLong));
    if (localahm != null)
      this.lqk.add(localahm);
    return localahm;
  }

  public ahm l(ahm paramahm) {
    return jQ(paramahm.getId());
  }

  public void cXb() {
    this.lqk.addAll(this.lqj.values());
    this.lqj.clear();
  }

  public ahm jR(long paramLong) {
    return (ahm)this.lqj.get(Long.valueOf(paramLong));
  }

  public void a(cXf paramcXf, int paramInt)
  {
    cXc();

    for (ahm localahm : this.lqj.values())
      localahm.b(paramcXf, paramInt);
  }

  private void cXc()
  {
    int i = 0; for (int j = this.lqk.size(); i < j; i++) {
      ahm localahm = (ahm)this.lqk.get(i);
      localahm.setSelected(false);
      this.kSP.remove(localahm);
      localahm.dispose();
    }

    this.lqk.clear();
  }

  public void a(cXf paramcXf, float paramFloat1, float paramFloat2)
  {
    this.kSP.clear();
    for (ahm localahm : this.lqj.values())
      if (localahm.a(paramcXf)) {
        localahm.ch(false);
        a(localahm, paramcXf);
        this.kSP.add(localahm);
      } else {
        localahm.ch(true);
      }
  }

  private static void a(ahm paramahm, cXf paramcXf)
  {
    if (!paramahm.atE()) {
      return;
    }
    int i = up.a(paramcXf, paramahm.ats());

    cYm localcYm = up.b(paramcXf, paramahm);
    int j = bCO.bC(localcYm.aOR);
    int k = bCO.bC(localcYm.aOS);

    if ((j != paramahm.getScreenX()) || (k != paramahm.getScreenY()) || (i != paramahm.eY())) {
      paramahm.setScreenX(j);
      paramahm.setScreenY(k);
      paramahm.T(i);
      paramahm.atF();
    }
  }

  public void clear() {
    for (ahm localahm : this.lqj.values()) {
      localahm.dispose();
    }
    this.lqj.clear();
    this.kSP.clear();
  }

  public void ape()
  {
    for (ahm localahm : this.lqj.values())
      bdB.b(localahm);
  }
}