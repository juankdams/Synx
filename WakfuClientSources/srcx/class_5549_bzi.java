import org.apache.log4j.Logger;

public class bzi extends cGt
{
  private static final Logger K = Logger.getLogger(bzi.class);

  public dmh Kt()
  {
    return dmh.ljT;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    cbR localcbR = this.hpP.getBuildingUnderMouse(paramInt1, paramInt2);
    this.hpP.c(localcbR);
    if (localcbR == null) {
      return;
    }
    this.aLp = new dFK((cbR)localcbR);
  }
}