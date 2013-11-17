import org.apache.log4j.Logger;

public final class bIo extends dqZ
{
  private static final aee bx = new bOO(new cGD());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur + élément", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Element", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public bIo() {
    aH();
  }

  public bIo(dSc paramdSc) {
    super(paramdSc);
  }

  public bIo bPC()
  {
    bIo localbIo;
    try {
      localbIo = (bIo)bx.Mm();
      localbIo.aOr = bx;
    } catch (Exception localException) {
      localbIo = new bIo();
      localbIo.aOr = null;
      localbIo.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ElementalCharacGain : " + localException.getMessage());
    }
    localbIo.aOF = this.aOF;
    return localbIo;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    int i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    bTI localbTI = bTI.dx((byte)i);
    if (localbTI == null) {
      K.error("Mauvais param element inconnu " + i);
      return;
    }

    eu localeu = localbTI.bZS();
    int j = 0;
    if (this.evo.b(localeu))
      j += this.evo.e(localeu);
    if (this.evo.b(eu.azc)) {
      j += this.evo.e(eu.azc);
    }
    this.cxl += j * this.cxl / 100;
  }

  public void bc()
  {
    super.bc();
  }
}