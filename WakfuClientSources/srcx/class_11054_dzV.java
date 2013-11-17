public final class dzV
  implements bxA
{
  private final Su feT;

  public dzV(Su paramSu)
  {
    this.feT = paramSu;
  }

  public void k(aVc paramaVc) {
    if ((paramaVc.bkf() != null) && ((paramaVc.bkf() instanceof Su)))
      ((Su)paramaVc.bkf()).aeL().d((doA)paramaVc, false);
    else if ((paramaVc.bke() != null) && ((paramaVc.bke() instanceof Su))) {
      ((Su)paramaVc.bke()).aeL().d((doA)paramaVc, true);
    }
    if ((!((doA)paramaVc).cVP()) && 
      (paramaVc.bkf() != null)) {
      if ((paramaVc.bkf().atO() != null) && (!paramaVc.aug()) && (paramaVc.bkM()))
      {
        paramaVc.bkf().atO().F(paramaVc);
      }
      if ((paramaVc.bkf() instanceof Su))
        ((Su)paramaVc.bkf()).a(new cpl((doA)paramaVc));
    }
  }

  public void n(aVc paramaVc)
  {
    this.feT.aeL().c((doA)paramaVc, false);
    if ((!((doA)paramaVc).cVP()) && 
      (paramaVc.bkM())) {
      Su localSu = (Su)paramaVc.bkf();
      if (localSu != null)
        localSu.a(new ayh((doA)paramaVc));
    }
  }

  public void l(aVc paramaVc)
  {
  }

  public void m(aVc paramaVc) {
    this.feT.aeL().b((doA)paramaVc, false);
    if ((!((doA)paramaVc).cVP()) && 
      (paramaVc.bkM()))
      ((Su)paramaVc.bkf()).a(new cpl((doA)paramaVc));
  }
}