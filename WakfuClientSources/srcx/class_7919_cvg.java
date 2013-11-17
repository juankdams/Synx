import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;

public class cvg extends bxG
{
  private static ddt ehE = new ddt();

  private static long ifQ = 1000L;
  private final long[] ifR;
  private final cYk ifS;

  public cvg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long[] paramArrayOfLong, cYk paramcYk)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.ifR = paramArrayOfLong;
    this.ifS = paramcYk;
  }

  public long mC()
  {
    Su localSu1 = dX(gA());

    if (localSu1 != null)
    {
      if (Ij())
      {
        if (localSu1 != byv.bFN().bFO())
        {
          localObject = bU.fH().getString("fight.invisible.detected.by", new Object[] { localSu1.cQF() });
          for (int i = 0; i < this.ifR.length; i = (byte)(i + 1)) {
            Su localSu2 = dX(this.ifR[i]);
            if (localSu2 != null) {
              if (i > 0) {
                localObject = (String)localObject + ",";
              }
              localObject = (String)localObject + localSu2.cQF();
            }
          }
          ehE.info(localObject);
        } else {
          localObject = bU.fH().getString("fight.invisible.detected", new Object[] { localSu1.cQF() });
          ehE.info(localObject);
        }

        Object localObject = cof.cop().vY(78900);
        ((FreeParticleSystem)localObject).f(this.ifS.getX(), this.ifS.getY(), this.ifS.IB());
        ((FreeParticleSystem)localObject).setDuration(2000);
        ((FreeParticleSystem)localObject).cS(a());
        cWS.cKD().b((IsoParticleSystem)localObject);
      }

      return ifQ;
    }

    return 0L;
  }
}