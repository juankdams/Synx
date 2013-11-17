public final class axz extends csl
{
  public axz aIY()
  {
    return new axz();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();
    cAK localcAK = (cAK)this.dvI;
    return (localcAK.y(localbyz)) && (super.isEnabled());
  }

  protected int qc() {
    return coH.hXe.aw;
  }

  public String getLabel()
  {
    String str1 = super.getLabel();
    cAK localcAK = (cAK)this.dvI;
    String str2 = localcAK.cxp();
    byz localbyz = byv.bFN().bFO();
    if ((str2 == null) || (str2.length() == 0)) {
      return str1;
    }
    lZ locallZ = new lZ().a(str1);
    dUx localdUx = bDk.bLI().cr(localcAK.boC());
    dOy localdOy;
    if (localdUx == null)
      localdOy = dOy.mgi;
    else {
      localdOy = localdUx.mrY;
    }
    if (dOy.mgi != localdOy) {
      locallZ.tH().a(bU.fH().getString("desc.cost", new Object[] { str2 }));
    }

    if (!bGP.gDx.a(new aGH[] { localbyz })) {
      locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed"));
    }
    return locallZ.tP();
  }
}