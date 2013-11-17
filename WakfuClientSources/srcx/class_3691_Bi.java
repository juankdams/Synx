import org.apache.log4j.Logger;

public class Bi extends cGt
{
  private static final Logger K = Logger.getLogger(Bi.class);
  private final cbR bxe;
  private final int bxf;
  private final int bxg;

  public Bi(cbR paramcbR)
  {
    super(new cxX(false, true));
    this.bxe = paramcbR;
    this.bxf = this.bxe.Qx().getX();
    this.bxg = this.bxe.Qx().getY();
  }

  public dmh Kt()
  {
    return dmh.ljT;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    if (this.bxe == null) {
      K.error("pas de batiment a déplacer");
      return;
    }
    cUh localcUh = this.bxe.cfy().adj();
    MD localMD1 = this.hpP.getCellCoordFromMouse(paramInt1, paramInt2);
    MD localMD2 = this.hpP.getHavenWorldImages().nB(localcUh.bcY());
    int i = localMD1.getX() + localMD2.getX();
    int j = localMD1.getY() + localMD2.getY();

    cOG localcOG = new cOG(this.hpP.getWorkingHavenWorld(), cyF.inc);
    bFA localbFA = new bFA(this.bxe.EN(), localcUh.nc(), this.bxe.cfy().gw(), (short)i, (short)j);
    localcOG.h(localbFA);

    cbR localcbR = this.hpP.g(localbFA);
    this.aLp = new ckt(localcbR, (short)this.bxf, (short)this.bxg);
    this.aLp.al(localcOG.aIy());
  }

  protected void Ku()
  {
    super.Ku();
  }
}