public final class aKe
{
  public void execute()
  {
    if (!byv.bFN().bFO().bHh()) {
      return;
    }
    arl localarl = byv.bFN().bFO().bHg();
    byv.bFN().bFO().i(null);

    byv.bFN().b(aMN.bdO());
    aMN.bdO().f(null);
    byv.bFN().b(aKj.bbx());

    byv.bFN().a(dME.dpt());

    dLE.doY().t("fight", null);
    dLE.doY().t("fight.timeline", null);
    dLE.doY().t("isInFightCreationOrPlacement", Boolean.valueOf(false));
    dLE.doY().t("isFightSpectator", Boolean.valueOf(false));

    aWc.blo().blL();

    byv.bFN().b(aKj.bbx());

    ckT localckT = cjS.clP().vz(dmM.cUe().cUf());
    dmM.cUe().AL(-1);
    if ((localckT != null) && (localckT.aEu() != dzm.lFM)) {
      dmM.cUe(); dmM.m(localckT);
      new cyT(localarl).cvR();
    }
    if (localckT != null)
      byv.bFN().aJK().d(new RW(localckT.getId()));
    dmM.cUe().cUl();
  }
}