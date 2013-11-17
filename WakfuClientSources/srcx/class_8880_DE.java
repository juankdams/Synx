import org.apache.log4j.Logger;

final class DE extends Mo
{
  private final bWr bIy;

  private DE(byz parambyz, bWr parambWr)
  {
    this.bIy = parambWr;
    this.bIy.ao().a(this);
  }

  public void aS() {
    byz.aUf().error("Le sac dimensionnel ne devrait pas être sérialisé par le client");
  }

  public void aT() {
    if (byz.f(this.iZ) != null) {
      byz.f(this.iZ).release();
    }
    byz.a(this.iZ, new dwN());
    if (!byz.f(this.iZ).a(this.bIy.hiA))
      byz.bHt().error("Erreur durant la récupération des données du sac dimensionel du joueur.");
  }
}