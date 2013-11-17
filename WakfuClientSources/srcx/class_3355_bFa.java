import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class bFa extends cJs
{
  protected static final Logger K = Logger.getLogger(bFa.class);
  private short gAb;
  private final aiZ gAc;

  public bFa(int paramInt1, int paramInt2, int paramInt3, int paramInt4, aiZ paramaiZ, boolean paramBoolean1, boolean paramBoolean2, long paramLong, int paramInt5, int paramInt6, short paramShort)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2, paramLong, paramInt5, paramInt6, paramShort);

    this.gAc = paramaiZ;
  }

  public long mC()
  {
    Su localSu = dX(bwv());
    if (localSu == null) {
      return 0L;
    }

    cew localcew = localSu.aeL();
    localcew.chh();
    if ((localcew.cgZ() == null) || (localcew.cgZ().getType() != 2)) {
      localcew.c(new bgY(localSu));
    }
    apX localapX = a(localSu, this.gAc);
    if (localapX == null) {
      return 0L;
    }

    dSR localdSR = (dSR)localapX.bsL();
    this.gAb = localapX.nU();
    if (!localdSR.vC()) {
      ko(localdSR.uN());
    }
    if (Ij()) {
      arl localarl = localSu.aeQ();
      if (localarl != null) {
        localarl.a(localapX, localSu);
        localarl.b(localSu, localdSR);
      }

      if (Iy()) {
        aB(localSu);
        bMU();
      }
    }

    if (byv.bFN().bFO() == localSu) {
      bOU.gUc.b(new dhs(localdSR.getId()));
    }

    if (!localSu.afk()) {
      return super.mC();
    }
    bZw();

    return -1L;
  }

  public static apX a(Su paramSu, aiZ paramaiZ)
  {
    dCi localdCi = paramSu.auK();
    apX localapX;
    if ((localdCi != null) && (localdCi.ajw() != null)) {
      localapX = (apX)localdCi.ajw().o(paramaiZ);
    } else {
      diM localdiM = new diM(paramSu);
      localapX = localdiM.e(paramaiZ);
    }
    return localapX;
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

  public short nU()
  {
    return this.gAb;
  }
}