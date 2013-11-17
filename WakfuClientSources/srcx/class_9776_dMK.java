import org.apache.log4j.Logger;

public class dMK extends cGt
{
  private static final Logger K = Logger.getLogger(dMK.class);
  private final bOB mcQ;
  private static long mcR = -1L;

  public dMK(bOB parambOB)
  {
    super(new cxX(true, true));
    this.mcQ = parambOB;
  }

  public dmh Kt()
  {
    return dmh.ljT;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    cUh localcUh = aDF.e(this.mcQ);

    MD localMD1 = this.hpP.getCellCoordFromMouse(paramInt1, paramInt2);
    MD localMD2 = this.hpP.getHavenWorldImages().nB(localcUh.bcY());
    int i = localMD1.getX() + localMD2.getX();
    int j = localMD1.getY() + localMD2.getY();

    cOG localcOG = new cOG(this.hpP.getWorkingHavenWorld(), cyF.inc);
    bFA localbFA = new bFA(mcR, localcUh.nc(), 0, (short)i, (short)j);
    localcOG.h(localbFA);

    cbR localcbR = this.hpP.a(localbFA);

    this.aLp = new jZ(localcbR);
    this.aLp.al(localcOG.aIy());
  }

  protected void Ku()
  {
    mcR -= 1L;
  }
}