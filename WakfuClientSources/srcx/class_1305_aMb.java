import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class aMb extends dKc
{
  private static final Logger K = Logger.getLogger(aMb.class);
  private bjj eqS;
  private final bKm eqT;
  private int eqU;

  public aMb(bKm parambKm)
  {
    this.eqT = parambKm;
  }

  public short fU() {
    return 4;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("[DEATH] Lancement de l'occupation pour le joueur " + this.eqT);

    this.eqT.q(false, true);

    if ((!bB) && (this.eqS != null)) throw new AssertionError();
    this.eqS = new bjj(null);
    this.eqS.i(this.eqT);

    if (this.eqT == this.bSY)
    {
      this.bSY.fD(false);

      dF(false);

      byv localbyv = byv.bFN();
      localbyv.a(bAE.gpN);
      if ((!localbyv.c(aPh.bgd())) && (!localbyv.c(buI.bCs()))) {
        bdr();
      }

      bOU.gUc.b(new sk());

      this.eqU = bFq.bNa();
    }

    this.eqT.fz(true);

    this.eqT.a(this);
  }

  private void dF(boolean paramBoolean) {
    dLE.doY().t("isAlive", Boolean.valueOf(paramBoolean));
  }

  public void bdr() {
    bAE.gpN.bdr();
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("[DEATH] Annulation l'occupation pour le joueur " + this.eqT + " (fromServer=" + paramBoolean1 + ", sendMessage=" + paramBoolean2 + ")");
    return false;
  }

  public boolean fW()
  {
    K.info("[DEATH] Fin de l'occupation pour le joueur " + this.eqT);

    if ((this.eqT == this.bSY) && (bAE.gpN.bIQ()))
      bdt();
    else {
      bds();
    }
    this.eqT.aeL().eq("AnimTombe-Fin");

    if (this.eqT == this.bSY)
    {
      this.bSY.fD(true);

      dF(true);

      byv.bFN().b(bAE.gpN);

      bFq.sB(this.eqU);
    }

    this.eqT.fz(false);

    return true;
  }

  private void bds() {
    this.eqT.aeL().a(new dxV(this));
  }

  private void bdt()
  {
    IH.Sd().a(new dxU(this));
  }

  private void bdu()
  {
    cew localcew = this.eqT.aeL();
    localcew.setVisible(true);
    localcew.eq("AnimResurection");
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(this.eqT.afr());
    localFreeParticleSystem.b(localcew);
    cWS.cKD().b(localFreeParticleSystem);
  }
}