final class axh extends Mo
{
  private final aqM dMy;

  axh(bKm parambKm, aqM paramaqM)
  {
    this.dMy = paramaqM;
    this.dMy.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de serialisation de part ici.");
  }

  public void aT() {
    bGW localbGW = (bGW)bKm.p(this.aHq);
    localbGW.eC(this.dMy.ayv);
    localbGW.dI(this.dMy.dyt);
    localbGW.setName(this.dMy.dyu);
    localbGW.aQ(this.dMy.bUp);
  }
}