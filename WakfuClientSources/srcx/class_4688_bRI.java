import org.apache.log4j.Logger;

public final class bRI extends dQi
{
  private static final aee bx = new bOO(new Kz());

  private static final qM hbq = new dzQ(new ec[] { new dLx("Utilise le niveau d'un état pour calculer la proba d'exécution du groupe d'effet", new dmb[] { new dmb("nb maximum d'effect à executer", dnN.lnR), new dmb("avec réussite (1 : oui, 0 : non = standard", dnN.lnS), new dmb("0 = cellule, 1 = cibles (default)", dnN.lnS), new dmb("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", dnN.lnS), new dmb("Transmission de la cible originale aux effets du groupe : oui = 1 (défaut), non = 0 ", dnN.lnS), new dmb("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (défaut)", dnN.lnS), new dmb("Id de l'état à consulter pour le niveau du groupe", dnN.lnS), new dmb("Target = 0 (defaut), Caster = 1", dnN.lnS), new dmb("% de proba de base", dnN.lnS), new dmb("% de proba par niveau d'état", dnN.lnS) }) });

  private int hbr = 0;
  private boolean hbs = false;
  private float hbt = 0.0F;
  private float hbu = 0.0F;

  public qM aF() {
    return hbq;
  }

  public bRI() {
    aH();
  }

  public bRI bYN()
  {
    bRI localbRI;
    try {
      localbRI = (bRI)bx.Mm();
      localbRI.aOr = bx;
    } catch (Exception localException) {
      localbRI = new bRI();
      localbRI.aOr = null;
      localbRI.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RunningEffectGroupLevelFuntionState : " + localException.getMessage());
    }
    return localbRI;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    super.a(paramaVc);
    this.hbr = ((dpI)this.eWL).a(6, cVC(), dNF.meh);
    this.hbs = (1 == ((dpI)this.eWL).a(7, cVC(), dNF.meh));
    this.hbt = ((dpI)this.eWL).o(8, cVC());
    this.hbu = ((dpI)this.eWL).o(9, cVC());
  }

  public boolean Cu() {
    if (!super.Cu()) {
      return false;
    }

    if (!bkt()) {
      return true;
    }
    dle localdle = this.hbs ? this.evo : this.evp;
    if (localdle == null) {
      return false;
    }
    int i = 0;
    dDN localdDN = localdle.atO();
    for (aVc localaVc : localdDN) {
      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == this.hbr)
        {
          i = localbJC.nU();
        }
      }
    }
    int j = bMr.ax(this.hbt + this.hbu * i);
    if (j <= 0)
      return false;
    if (j >= 100)
      return true;
    return dpe.AX(100) <= j;
  }
}