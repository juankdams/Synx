import java.util.LinkedList;

class dvV
  implements ddy
{
  dvV(bMK parambMK, boolean paramBoolean)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (dvU.iS[parambyN.ordinal()]) {
    case 1:
      paramcKq.b(this);
      if (this.iaR) {
        dka.cSF().a(new cAa(this), 10000L, 1);
      }
      else if (bMK.a(this.lBl).size() > 0) {
        dka.cSF().a(new cAb(this), 1000L, 1);
      }
      else
      {
        if (bMK.b(this.lBl) != null) {
          bMK.c(this.lBl).getAppearance().c(bMK.b(this.lBl));
          bMK.a(this.lBl, null);
        }
        bMK.b(this.lBl, null);
        dLE.doY().t("unlockedAchievement", null);
      }
      break;
    }
  }
}