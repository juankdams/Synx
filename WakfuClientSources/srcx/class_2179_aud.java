import java.util.ArrayList;

final class aud extends Mo
{
  private final awo dGo;

  private aud(byo parambyo, awo paramawo)
  {
    this.dGo = paramawo;
    this.dGo.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Le client ne devrait pas sérialiser les données spécifiques de collect du NPC");
  }

  public void aT() {
    int i = 0; for (int j = this.dGo.dLB.size(); i < j; i++) {
      aGM localaGM = (aGM)this.dGo.dLB.get(i);
      byo.l(this.iK).hL(localaGM.edZ);
    }
  }
}