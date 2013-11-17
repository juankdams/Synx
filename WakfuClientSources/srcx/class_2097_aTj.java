import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.List;

public class aTj
  implements bcG
{
  final cbQ eQD;
  private final int eQE;
  private final int level;

  public aTj(int paramInt1, int paramInt2, cbQ paramcbQ)
  {
    this.eQE = paramInt1;
    this.eQD = paramcbQ;
    this.level = paramInt2;
  }

  public void a(dMM paramdMM, cfb paramcfb1, cfb paramcfb2) {
    byz localbyz = byv.bFN().bFO();

    List localList = ayg.aJQ().bjr();

    int i = 0; for (int j = localList.size(); i < j; i++) {
      cfb localcfb = (cfb)localList.get(i);
      long l = bCO.cM(localcfb.getX(), localcfb.getY());
      if (!this.eQD.N(l)) {
        this.eQD.add(l);
        int k = localcfb.getX() * 18;
        int m = localcfb.getY() * 18;

        FreeParticleSystem localFreeParticleSystem = cof.cop().dC(this.eQE, this.level);
        localFreeParticleSystem.f(k, m, cwO.V(k, m, localbyz.ML().IB()));
        cWS.cKD().b(localFreeParticleSystem);
      }
    }
  }
}