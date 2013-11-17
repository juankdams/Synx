import org.apache.log4j.Logger;

final class hL extends Mo
{
  private final le aHp;

  hL(bKm parambKm, le paramle)
  {
    this.aHp = paramle;
    this.aHp.ao().a(this);
  }

  public void aS() {
    bKm.bSE().error("[NATION] Pas de sérialization de la nation ID dans le client pour l'instant", new UnsupportedOperationException());
  }

  public void aT()
  {
    if (this.aHq.cJf().bP() != this.aHp.bL) {
      aYr localaYr = dsh.luB.BA(this.aHp.bL);
      if (localaYr != null)
        localaYr.d(this.aHq);
      else
        bKm.asz().error("[NATION] On essaye d'ajouter le joueur " + this.aHq.getId() + " à une nation inconnue du manager, nationId : " + this.aHp.bL);
    }
  }
}