import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class bWN
{
  private static final Logger K = Logger.getLogger(bWN.class);

  public static final bWN hjg = new bWN();
  private static final int hjh = 2357;
  private CellParticleSystem hji;

  public void a(boolean paramBoolean, axQ paramaxQ)
  {
    if (paramaxQ.aJp().uO() != 2357) {
      return;
    }
    Su localSu = null;
    dDN localdDN = paramaxQ.atO();
    for (Iterator localIterator = localdDN.iterator(); localIterator.hasNext(); ) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.bkc().eo() == bsj.fVk.getId()) {
        KS localKS = (KS)localaVc;
        dle localdle = localKS.bkf();
        if ((localdle instanceof Su))
        {
          localSu = (Su)localdle;
          break;
        }
      }
    }
    if (localSu == null) {
      K.warn("On ne trouve pas de target au totem");
    }

    cbL();
    if ((paramBoolean) && (localSu != null)) {
      this.hji = cof.cop().vZ(78900);
      this.hji.f(localSu.fa(), localSu.fb(), localSu.fc());
      cWS.cKD().b(this.hji);
    }
  }

  public void cbL() {
    if (this.hji != null) {
      if (cWS.cKD().a(this.hji)) {
        this.hji.ciX();
        cWS.cKD().zk(this.hji.getId());
      }
      this.hji = null;
    }
  }
}