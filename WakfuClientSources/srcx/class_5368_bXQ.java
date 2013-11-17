public class bXQ extends csl
{
  public static final int ENABLED = 0;
  public static final int hnL = 1;
  public static final int hnM = 2;
  public static final int cRz = 3;
  private int cRA;

  public bXQ cdh()
  {
    return new bXQ();
  }

  public boolean isEnabled() {
    byz localbyz1 = byv.bFN().bFO();

    if (!bGP.gDx.a(new aGH[] { localbyz1 })) {
      this.cRA = 3;
      return false;
    }
    ape localape = (ape)this.dvI;
    byz localbyz2 = byv.bFN().bFO();
    am localam = localbyz2.bGG();
    if (localam.isSelected((int)localape.getId())) {
      this.cRA = 1;
      return false;
    }
    if (localbyz2.cJf().HL()) {
      this.cRA = 2;
      return false;
    }
    this.cRA = 0;
    return true;
  }

  public String getLabel()
  {
    String str = super.getLabel();
    if (isEnabled()) {
      return str;
    }
    lZ locallZ = new lZ().a(str).tH();

    locallZ.am(ict);
    switch (this.cRA) {
    case 3:
      locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
      break;
    case 1:
      locallZ.a(bU.fH().getString("desc.mru.phoenixAlreadyBound"));
      break;
    case 2:
      locallZ.a(bU.fH().getString("phoenix.forbidden.on.enemy.territory"));
    }

    return locallZ.tP();
  }
}