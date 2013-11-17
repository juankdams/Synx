import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import org.apache.log4j.Logger;

final class aop extends dcW
{
  private static Logger K = Logger.getLogger(aop.class);
  private CellParticleSystem dtr;

  public boolean a(aGl paramaGl)
  {
    cYk localcYk = paramaGl.aSs();

    if ((this.dtr != null) && 
      (cWS.cKD().a(this.dtr))) {
      this.dtr.ciX();
      cWS.cKD().zk(this.dtr.getId());
    }

    CellParticleSystem localCellParticleSystem = cof.cop().vZ(78900);
    localCellParticleSystem.f(localcYk.getX(), localcYk.getY(), localcYk.IB());
    localCellParticleSystem.setDuration(2000);
    cWS.cKD().b(localCellParticleSystem);
    this.dtr = localCellParticleSystem;

    Long localLong = paramaGl.aSt();
    if (localLong != null) {
      if (localLong.longValue() == byv.bFN().bFO().getId()) {
        K.info("<text color=\"" + cPU.kAA + "\">" + bU.fH().getString("fight.reportCell", new Object[] { Integer.valueOf(paramaGl.aSs().getX()), Integer.valueOf(paramaGl.aSs().getY()) }) + "</text>");
      }
      else
      {
        Su localSu = (Su)((arl)this.kLP).eu(paramaGl.aSt().longValue());
        String str = "reporterId=" + paramaGl.aSt();
        K.info(bU.fH().getString("fight.hasReceivedCellReport", new Object[] { "<b color=\"" + cPU.kAA + "\">" + str + "</b>", Integer.valueOf(paramaGl.aSs().getX()), Integer.valueOf(paramaGl.aSs().getY()) }));
      }

    }

    return false;
  }
}