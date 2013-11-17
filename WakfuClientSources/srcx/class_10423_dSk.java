import org.apache.log4j.Logger;

final class dSk extends Mo
{
  private final PC mon;

  private dSk(byo parambyo, PC paramPC)
  {
    this.mon = paramPC;
    this.mon.ao().a(this);
  }

  public void aS() {
    byo.asA().error("Le client ne devrait pas sérialiser les données spécifiques templates NPC");
  }

  public void aT() {
    byo.b(this.iK, this.mon.cia);
    byo.c(this.iK, this.mon.cib);
  }
}