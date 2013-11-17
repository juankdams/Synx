import org.apache.log4j.Logger;

final class Tc extends Mo
{
  private final bri cvU;

  Tc(bKm parambKm, bri parambri)
  {
    this.cvU = parambri;
    this.cvU.ao().a(this);
  }

  public void aS() {
    bKm.asB().error("[NATION] Pas de sérialization de la nation PUBLIC dans le client pour l'instant", new UnsupportedOperationException());
  }

  public void aT() {
    ctE localctE = (ctE)this.aHq.cJf();
    localctE.b(Yp.cj(this.cvU.fMO));
    localctE.g(dLC.kI(this.cvU.aFO));
    localctE.D(cYq.jq(this.cvU.aFP));
    localctE.a(asK.bq(this.cvU.aFQ));
    localctE.hy(this.cvU.fMP);
  }
}