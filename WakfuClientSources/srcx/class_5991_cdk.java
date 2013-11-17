import java.util.BitSet;
import org.apache.log4j.Logger;

public class cdk extends aWl
{
  private static final aee bx = new bOO(new doL());

  private static final qM by = new dzQ(new ec[] { new dLx("gain de PV", new dmb[] { new dmb("% de la valeur max ou de l'effet declencheur", dnN.lnR) }), new dLx("Basé sur la valeur de l'effet declencheur ou non", new dmb[] { new dmb("% de la valeur max", dnN.lnR), new dmb("Valeur de l'effet declencheur (0:non, 1:oui(defaut))", dnN.lnS) }), new dLx("Soin en fonction du caster", new dmb[] { new dmb("% de la valeur max", dnN.lnR), new dmb("Valeur de l'effet declencheur (0:non, 1:oui(defaut))", dnN.lnS), new dmb("Fonction du caster (0:non (defaut), 1:oui)", dnN.lnS) }), new dLx("Prend en compte les pv virtuels", new dmb[] { new dmb("% de la valeur max", dnN.lnR), new dmb("Valeur de l'effet declencheur (0:non, 1:oui(defaut))", dnN.lnS), new dmb("Fonction du caster (0:non (defaut), 1:oui)", dnN.lnS), new dmb("Prend en compte les pv virtuels (0:non (defaut), 1:oui)", dnN.lnS) }) });
  private boolean hwz;
  private float gDZ;

  public qM aF()
  {
    return by;
  }

  public cdk() {
    aH();
  }

  public cdk cgj()
  {
    cdk localcdk;
    try
    {
      localcdk = (cdk)bx.Mm();
      localcdk.aOr = bx;
    } catch (Exception localException) {
      localcdk = new cdk();
      localcdk.aOr = null;
      localcdk.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGain : " + localException.getMessage());
    }
    return localcdk;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(1);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl = ((int)(this.cxl + this.cxl * paramFloat / 100.0F)); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else
        this.cxl = ((int)(this.cxl + paramFloat));
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && (this.hwz)) {
      this.cxl = Math.max(1, Math.round(paramaVc.getValue() * this.gDZ / 100.0F));
    }
    super.a(paramaVc, paramBoolean);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL == null) {
      this.cxl = 0;
      return;
    }
    if (((dpI)this.eWL).bep() >= 1)
      this.gDZ = ((dpI)this.eWL).a(0, s, dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.hwz = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
    else
      this.hwz = true;
    int i = 0;
    if (((dpI)this.eWL).bep() >= 3) {
      i = ((dpI)this.eWL).a(2, s, dNF.meh) == 1 ? 1 : 0;
    }
    int j = 0;
    if (((dpI)this.eWL).bep() >= 4) {
      j = ((dpI)this.eWL).a(3, s, dNF.meh) == 1 ? 1 : 0;
    }
    dle localdle = i != 0 ? this.evo : this.evp;
    if ((localdle != null) && (localdle.b(eu.ayM))) {
      int k = localdle.a(eu.ayM).max();
      if (j != 0)
        k += localdle.a(eu.aAj).max();
      this.cxl = bMr.ax(k * this.gDZ / 100.0F);
    }
  }
}