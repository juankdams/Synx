import org.apache.log4j.Logger;

final class bbr extends Mo
{
  private final dlO fkB;

  bbr(bKm parambKm, dlO paramdlO)
  {
    this.fkB = paramdlO;
    this.fkB.ao().a(this);
  }

  public void aS() {
    bKm.bFH().error("L'occupation en cours ne devrait pas être envoyée par le client");
  }

  public void aT() {
    if (this.fkB.kEC != null) {
      int i = this.fkB.kEC.hfA;
      switch (i) {
      case 4:
        aMb localaMb = new aMb(this.aHq);
        localaMb.begin();
        break;
      case 20:
        cg localcg = new cg(this.aHq);
        localcg.b(this.fkB.kEC.hfB);
        localcg.begin();
        break;
      case 1:
        ddk localddk = new ddk(this.aHq);
        localddk.begin();
        break;
      case 16:
        aYR localaYR = new aYR(this.aHq);
        localaYR.b(this.fkB.kEC.hfB);
        this.aHq.a(localaYR);
        break;
      default:
        bKm.asx().error("Occupation inconnue : id=" + i);
      }
    }
  }
}