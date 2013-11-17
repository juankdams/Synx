import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class beC extends bLe
{
  private final List frC = new ArrayList();
  private final List dzr = new ArrayList();
  private final List frD = new ArrayList();

  public beC(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void kO()
  {
  }

  protected void kN()
  {
    ckT localckT = mD();
    if (localckT == null) {
      return;
    }

    for (Su localSu : localckT.bgG()) {
      localSu.adK();
      localSu.aeK();
      if (((this.frC.contains(Long.valueOf(localSu.getId()))) || (localSu.isDead())) && 
        (!localSu.c(cfY.hBl)) && (!this.dzr.contains(Long.valueOf(localSu.getId()))) && 
        ((localSu instanceof byo)))
      {
        ((byo)localSu).bFy();
      }

    }

    localckT.aDE();

    bso();

    if ((localckT instanceof czN)) {
      ayg.aJQ().c((czN)localckT);
    }

    cjS.clP().h(localckT);
    bnc.bxw().qm(localckT.getId());
  }

  private void bso() {
    ckT localckT = mD();
    dLf.djM().j(new cNC(this, localckT));
  }

  public void l(Collection paramCollection)
  {
    if (paramCollection != null)
      this.frC.addAll(paramCollection);
  }

  public void m(Collection paramCollection)
  {
    if (paramCollection != null)
      this.dzr.addAll(paramCollection);
  }

  public void n(Collection paramCollection)
  {
    if (paramCollection != null)
      this.frD.addAll(paramCollection);
  }
}