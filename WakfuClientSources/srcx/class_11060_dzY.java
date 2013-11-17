import java.util.Collection;
import java.util.Iterator;

final class dzY
  implements cvW
{
  private ckT lGG;

  public void p(ckT paramckT)
  {
    this.lGG = paramckT;
  }

  public boolean a(cWG paramcWG) {
    if ((paramcWG instanceof dKQ)) {
      ddg();
      return false;
    }
    return true;
  }

  private void ddg() {
    if (this.lGG == null)
      return;
    Collection localCollection = this.lGG.bgG();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      Su localSu = (Su)localIterator.next();
      localSu.aeL().dI(localSu.Fx());
    }
  }

  void dcx() {
    cAo.cxf().b(this);
    if (this.lGG == null)
      return;
    arl localarl = byv.bFN().bFO().bGv();
    if ((localarl != null) && (this.lGG.getId() == localarl.getId()))
      return;
    Collection localCollection = this.lGG.bgG();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      Su localSu = (Su)localIterator.next();
      localSu.aeL().chm();
    }
  }

  public long getId()
  {
    return 176L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }
}