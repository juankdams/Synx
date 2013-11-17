import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class bPQ extends cJs
{
  private final short cZu;

  public bPQ(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Dk paramDk, boolean paramBoolean1, boolean paramBoolean2, long paramLong, int paramInt5, int paramInt6, short paramShort1, int paramInt7, short paramShort2, apX paramapX)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2, paramLong, paramInt5, paramInt6, paramShort1);
    this.cZu = paramShort2;

    if ((paramapX != null) && (paramapX.bsL() != null))
      ko(((dSR)paramapX.bsL()).uN());
    else
      ko(paramDk.uN());
  }

  public short nU()
  {
    return this.cZu;
  }

  public long mC()
  {
    Su localSu = dX(bwv());
    if ((localSu == null) || (!Ij())) {
      return super.mC();
    }
    if (localSu.aeQ() != null) {
      localSu.aeQ().b((short)1, localSu);
    }

    if (Iy()) {
      aB(localSu);
      bMU();
    }
    aG(localSu);
    return super.mC();
  }

  private void aG(Su paramSu) {
    lZ locallZ = new lZ().a(bU.fH().getString("fight.closeCombat", new Object[] { new lZ().am(cPU.kAA).a(paramSu.cQF()).tP() }));

    if (Iy()) {
      locallZ.tz().am(cPU.kAC).a(" (").a(bU.fH().getString("critical")).a(")").tA();
    }
    if (Iz()) {
      locallZ.tz().am(cPU.kAC).a(" (").a(bU.fH().getString("critical.miss")).a(")").tA();
    }
    ehE.info(locallZ.tP());
  }

  private void aB(Su paramSu) {
    a(paramSu, 800017);
  }

  private void a(Su paramSu, int paramInt) {
    if ((byv.bFN().bFO().aeQ() == null) || (byv.bFN().bFO().aeR() == mD().getId()))
    {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(paramInt);
      if (localFreeParticleSystem != null) {
        if (mD() != null) {
          localFreeParticleSystem.cS(mD().getId());
        }
        localFreeParticleSystem.b(paramSu.aeL());
        cWS.cKD().b(localFreeParticleSystem);
      }
    }
  }

  private void bMU() {
    if (byv.bFN().bFO().aeR() == mD().getId())
      aWc.blo().eO(600122L);
  }
}