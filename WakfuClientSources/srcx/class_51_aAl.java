import org.apache.log4j.Logger;

final class aAl extends Mo
{
  private final aNE dSM;

  private aAl(byo parambyo, aNE paramaNE)
  {
    this.dSM = paramaNE;
    this.dSM.ao().a(this);
  }

  public void aS() {
    byo.asu().error("L'apparence du NPC ne devrait pas être sérialisée par le client");
  }

  public void aT() {
    this.iK.aeL().setVisible(this.dSM.etH);
    this.iK.aek();
  }
}