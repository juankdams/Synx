import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class aMi extends bxG
{
  private static ddt ehE = new ddt();

  public aMi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public long mC()
  {
    Su localSu = dX(gA());
    if (localSu == null) {
      return 0L;
    }
    cew localcew = localSu.aeL();
    localcew.chh();

    if (Ij())
    {
      str = bU.fH().getString("fight.tackled", new Object[] { new lZ().am(cPU.kAA).a(localSu.cQF()).tP() });

      ehE.info(str);
    }
    String str = localcew.cgZ().cfE();
    localcew.eq(str);
    byz localbyz = byv.bFN().bFO();
    if ((localbyz.aeQ() == null) || (localbyz.aeR() == a())) {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800021);
      if (localFreeParticleSystem != null) {
        localFreeParticleSystem.b(localcew);
        localFreeParticleSystem.cS(a());
        cWS.cKD().b(localFreeParticleSystem);
      }
      if (localbyz == localSu) {
        bOU.gUc.b(new dck());
      }
    }
    if (localSu.b(eu.ayO)) {
      localSu.d(eu.ayO).cpy();
    }
    return localcew.H(str);
  }
}