public final class baM extends csl
{
  public baM bpm()
  {
    return new baM();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();
    cAK localcAK = (cAK)this.dvI;
    return (localcAK.y(localbyz)) && (super.isEnabled());
  }

  public String getLabel()
  {
    String str1 = super.getLabel();
    cAK localcAK1 = (cAK)this.dvI;
    String str2 = localcAK1.cxp();
    byz localbyz = byv.bFN().bFO();
    if ((str2 == null) || (str2.length() == 0)) {
      return str1;
    }
    lZ locallZ = new lZ().a(str1);
    dOy localdOy = bDk.bLI().cr(localcAK1.boC()).mrY;
    if (dOy.mgi != localdOy) {
      locallZ.tH().a(bU.fH().getString("desc.cost", new Object[] { str2 }));
    }
    cAK localcAK2 = (cAK)this.dvI;
    cQa localcQa = ccm.a(localcAK2.chE());
    dwZ localdwZ = localcQa.b(localbyz, localcAK2, -1L);
    if (localdwZ == dwZ.lDg) {
      locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed"));
    }
    return locallZ.tP();
  }
}