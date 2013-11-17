import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

class bjj
{
  static final aNA fzH = new afE();
  int bFx;

  void i(bKm parambKm)
  {
    cew localcew = parambKm.aeL();
    localcew.c(CG.bFG);
    localcew.a(fzH);
    localcew.eq("AnimDesincarnation");
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(parambKm.afq());

    this.bFx = localFreeParticleSystem.getId();
    localFreeParticleSystem.b(localcew);
    cWS.cKD().b(localFreeParticleSystem);
  }

  void j(bKm parambKm) {
    if ((!bB) && (this.bFx == 0)) throw new AssertionError();
    cWS.cKD().zk(this.bFx);
    parambKm.aeL().b(fzH);
    this.bFx = 0;
  }
}