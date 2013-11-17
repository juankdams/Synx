import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;

public class dRD extends dDv
{
  private FreeParticleSystem aEL;
  private int crL = 2147483647;

  public void stop(int paramInt)
  {
    super.stop(paramInt);
    adg();
  }

  public void clear()
  {
    adg();
  }

  public void reset()
  {
    super.reset();
    adg();
  }

  private void adg() {
    if (this.aEL != null) {
      cWS.cKD().zk(this.aEL.getId());
      this.aEL = null;
    }
    this.crL = 2147483647;
  }

  public void update(int paramInt)
  {
    super.update(paramInt);
    int i = bCO.J((int)xP() * 100, 0, 100);
    if (this.crL != i) {
      adg();
      this.crL = i;
      gB(i);
    }

    if (this.aEL != null) {
      this.aEL.cS(byv.bFN().bFO().bGw());
      this.aEL.setVisible(bz.kt.eF());
    }
  }

  private void gB(int paramInt) {
    FreeParticleSystem localFreeParticleSystem = cyY.cop().dC(7000074, paramInt);

    cuA localcuA = WakfuClientInstance.awy().Dg().apE();
    localFreeParticleSystem.b(localcuA.csV());
    cWS.cKD().b(localFreeParticleSystem);
    this.aEL = localFreeParticleSystem;
  }

  public void a(bSr parambSr)
  {
  }
}