import org.apache.log4j.Logger;

final class adH
  implements bxA
{
  private static final Logger K = Logger.getLogger(adH.class);
  private final arl cUs;

  adH(arl paramarl)
  {
    this.cUs = paramarl;
  }

  public void k(aVc paramaVc) {
    doA localdoA = (doA)paramaVc;
    if (paramaVc.bkf() != null) {
      if ((paramaVc.bkf().atO() != null) && (!paramaVc.aug()) && (paramaVc.bkM()) && (!paramaVc.atX())) {
        paramaVc.bkf().atO().F(paramaVc);
      }
      if ((paramaVc.bkf() instanceof Su))
        ((Su)paramaVc.bkf()).a(new cpl(localdoA));
    }
    dle localdle;
    if ((paramaVc.atX()) || ((paramaVc.aN()) && (!paramaVc.aM())))
      localdle = paramaVc.bke();
    else
      localdle = paramaVc.bkf();
    if (localdle == null)
      K.warn("Pas de cible sur laquelle appliqué les HMI pour l'effet " + paramaVc.getId());
    if ((localdle != null) && ((localdle instanceof Su)))
      ((Su)localdle).aeL().d((doA)paramaVc, paramaVc.aN());
  }

  public void l(aVc paramaVc)
  {
    doA localdoA = (doA)paramaVc;
    dle localdle = paramaVc.bkf();
    if ((localdle != null) && ((localdle instanceof Su)))
      ((Su)localdle).aeL().d(localdoA, false);
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su))) {
      ((Su)paramaVc.bke()).aeL().d(localdoA, true);
    }
    if (localdoA.cVP()) {
      return;
    }
    if ((localdle != null) && ((localdle instanceof Su)))
      ((Su)localdle).a(new cpl(localdoA));
  }

  public void m(aVc paramaVc)
  {
    dle localdle = paramaVc.bkf();
    if ((localdle != null) && ((localdle instanceof Su)))
      ((Su)localdle).aeL().b((doA)paramaVc, false);
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su))) {
      ((Su)paramaVc.bke()).aeL().b((doA)paramaVc, true);
    }

    if (((doA)paramaVc).cVP()) {
      return;
    }
    if (localdle == null) {
      return;
    }
    if (((localdle instanceof Su)) && 
      (paramaVc.bkM()))
      ((Su)localdle).a(new cpl((doA)paramaVc));
  }

  public void n(aVc paramaVc)
  {
    if (!paramaVc.bkM()) {
      return;
    }
    dle localdle = paramaVc.bkq() == null ? null : paramaVc.bkq().axG();
    if ((localdle != null) && ((localdle instanceof Su))) {
      ((Su)localdle).aeL().c((doA)paramaVc, false);
    }

    if ((paramaVc.bkf() != null) && 
      ((paramaVc.bkf() instanceof Su)) && 
      (paramaVc.bkM()))
      ((Su)paramaVc.bkf()).a(new ayh((doA)paramaVc));
  }
}