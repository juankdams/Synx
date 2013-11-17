import org.apache.log4j.Logger;

public final class bis extends bIL
{
  private static final aee bx = new bOO(new duX());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("id de la zone", dnN.lnQ), new dmb("Id du sort pour le level", dnN.lnS), new dmb("La zone reste apres la fin de cet effet (1 = Oui, 0 = Non)", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public bis()
  {
    aH();
  }

  public bis bux()
  {
    bis localbis;
    try {
      localbis = (bis)bx.Mm();
      localbis.aOr = bx;
    } catch (Exception localException) {
      localbis = new bis();
      localbis.aOr = null;
      localbis.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetEffectAreaFunctionSpellLevel : " + localException.getMessage());
    }
    return localbis;
  }

  public void a(aVc paramaVc) {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
    this.aDR = this.ejP.LD().P((byte)2);
    bO(s);

    this.gIZ = (((dpI)this.eWL).a(2, s, dNF.meh) == 1);
  }

  private void bO(short paramShort) {
    int i = (short)((dpI)this.eWL).a(1, paramShort, dNF.meh);

    if ((this.evo == null) || (!(this.evo instanceof dhJ))) {
      this.gIY = 0;
      return;
    }

    dCi localdCi = ((dhJ)this.evo).auK();
    if (localdCi == null) {
      this.gIY = 0;
      return;
    }

    bfE localbfE = (bfE)localdCi.hh(i);
    if (localbfE == null) {
      this.gIY = 0;
      return;
    }

    this.gIY = localbfE.nU();
  }

  public void bc() {
    super.bc();
  }
}