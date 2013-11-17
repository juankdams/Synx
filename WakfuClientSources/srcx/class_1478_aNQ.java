import org.apache.log4j.Logger;

final class aNQ extends Mo
{
  private final aQB eue;

  aNQ(bKm parambKm, aQB paramaQB)
  {
    this.eue = paramaQB;
    this.eue.ao().a(this);
  }

  public void aS() {
    bKm.gV().error("L'xp ne devrait pas être sérialisée par le client.");
  }

  public void aT() {
    this.aHq.eK(this.eue.aGh);
    this.aHq.bSx().b(this.eue.eNo);
    this.aHq.rA(this.eue.eNp);
  }
}