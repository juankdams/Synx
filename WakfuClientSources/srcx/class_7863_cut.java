final class cut extends Mo
{
  private final bmT ifa;

  private cut(byz parambyz, bmT parambmT)
  {
    this.ifa = parambmT;
    this.ifa.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Les informations de compte de sont pas sérialisés par le client");
  }

  public void aT() {
    this.iZ.bSu().b(this.ifa);
    dLE.doY().t("subscribedAccount", Boolean.valueOf(bGP.gDv.a(new aGH[] { this.iZ })));

    dLE.doY().t("subscribedZoneAccount", Boolean.valueOf(bGP.gDx.a(new aGH[] { this.iZ })));

    dLE.doY().a(this.iZ, new String[] { "isInSubscriberZone" });
  }
}