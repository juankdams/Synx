import org.apache.log4j.Logger;

public class bXt extends cGt
{
  private static final Logger K = Logger.getLogger(bXt.class);

  public dmh Kt()
  {
    return dmh.ljS;
  }

  protected void P(int paramInt1, int paramInt2)
  {
    bcQ localbcQ = this.hpP.getGroundUnderMouse(paramInt1, paramInt2);

    if (localbcQ != null) {
      this.hpP.c(localbcQ);
      this.aLp = new dfV(localbcQ);
    }
  }
}