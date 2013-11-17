import org.apache.log4j.Logger;

public class acZ extends cGt
{
  private static final Logger K = Logger.getLogger(acZ.class);
  private final cDs cTk;

  public acZ(cDs paramcDs)
  {
    super(new cxX(true, true));
    this.cTk = paramcDs;
  }

  public dmh Kt()
  {
    return dmh.ljS;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    MD localMD = this.hpP.getPatchCoordFromMouse(paramInt1, paramInt2);

    cqs localcqs = new cqs(this.hpP.getWorkingHavenWorld(), cyF.inc);
    short s = aR(paramInt1, paramInt2);

    bcQ localbcQ = this.hpP.b(this.cTk, localMD.getX(), localMD.getY());
    this.aLp = new ie((bcQ)localbcQ, s);

    localcqs.d(this.cTk.bqQ(), localMD.getX(), localMD.getY());
    this.aLp.al(localcqs.aIy());
  }

  private short aR(int paramInt1, int paramInt2)
  {
    bcQ localbcQ = this.hpP.getGroundUnderMouse(paramInt1, paramInt2);
    if (localbcQ != null) {
      this.hpP.b(localbcQ);
      return localbcQ.bqQ();
    }
    return bnp.fGg;
  }
}