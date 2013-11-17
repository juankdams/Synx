import org.apache.log4j.Logger;

public class apq extends dKc
{
  protected static final Logger K = Logger.getLogger(apq.class);
  private final bNK dvm;
  private final cGx dvn;
  private final long ctZ;
  private static final Runnable dvo = new dpY();

  public apq(bNK parambNK, cGx paramcGx, long paramLong)
  {
    this.dvm = parambNK;
    this.dvn = paramcGx;
    this.ctZ = paramLong;
  }

  public short fU() {
    return 8;
  }

  public boolean fV() {
    if ((this.bSY.isDead()) || (this.bSY.adF())) {
      K.warn("Le joueur " + this.bSY + " est mort ou en combat et ne peut utiliser de machine de craft");

      return false;
    }

    if (!this.bSY.aTn().contains(this.dvm.axX())) {
      K.warn("Le joueur " + this.bSY + " essaye d'utiliser la recette " + this.dvn + " du métier " + this.dvm.axX() + " sur la machine " + this.dvm + " alors qu'il ne connais pas le métier");

      return false;
    }

    if (!this.dvm.x(this.dvn.getId(), this.dvn.getType())) {
      K.warn("Le joueur " + this.bSY + " essaye d'utiliser la recette " + this.dvn + " du métier " + this.dvm.axX() + " sur la machine " + this.dvm + " alors qu'elle n'est pas autorisée");

      return false;
    }

    if (!this.dvn.aQ(this.bSY)) {
      K.warn("Le joueur " + this.bSY + " essaye d'utiliser la recette " + this.dvn + " du métier " + this.dvm.axX() + " sur la machine " + this.dvm + " alors qu'elle ne valide pas le critère");

      return false;
    }

    aCH localaCH = clR.cni().vL(this.dvm.gC());
    if (!e(localaCH)) {
      K.warn("Le joueur " + this.bSY + " essaye d'utiliser la recette " + this.dvn + " du métier " + this.dvm.axX() + " sur la machine " + this.dvm + " alors qu'il n'a pas l'objet requis dans le visuel");

      return false;
    }

    bMD localbMD = this.bSY.bGP();
    if (!this.bSY.a(this.dvn))
    {
      return false;
    }

    return true;
  }

  public void begin() {
    K.error("[CRAFTOCC] Craft START");

    aCH localaCH = clR.cni().vL(this.dvm.gC());
    gA localgA = (gA)this.bSY.ayJ().dB((short)azO.dRO.hV);
    this.bSY.aeL().v(localaCH.gC(), false);

    duO.dax().ko(this.ctZ);
    dka.cSF().a(dvo, this.ctZ, 1);
  }

  public boolean fW() {
    K.error("[CRAFTOCC] Craft FINISHED");

    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS((short)8);
    byv.bFN().aJK().d(localayC);

    aCH localaCH = clR.cni().vL(this.dvm.gC());
    gA localgA = (gA)this.bSY.ayJ().dB((short)azO.dRO.hV);
    this.bSY.aeL().v(localaCH.gC(), true);

    return true;
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.error("[CRAFTOCC] Craft CANCELED");

    dka.cSF().j(dvo);

    aCH localaCH = clR.cni().vL(this.dvm.gC());
    gA localgA = (gA)this.bSY.ayJ().dB((short)azO.dRO.hV);
    this.bSY.aeL().v(localaCH.gC(), true);

    duO.dax().daH();
    if (paramBoolean2)
      aBx();
    return true;
  }

  public void aBx() {
    K.error("[CRAFTOCC] Craft CANCEL request");

    ayC localayC = new ayC();
    localayC.bt((byte)3);
    localayC.aS((short)8);
    byv.bFN().aJK().d(localayC);
  }
}