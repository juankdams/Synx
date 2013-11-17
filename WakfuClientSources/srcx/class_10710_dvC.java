import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Point;

public class dvC extends dCb
  implements cRz
{
  private final Su lAR;

  private dvC(long paramLong, int paramInt1, int paramInt2, short paramShort, Su paramSu)
  {
    super(paramLong, paramInt1, paramInt2, paramShort);
    this.lAR = paramSu;
  }

  public final Su daX() {
    return this.lAR;
  }

  public csx[] adN() {
    if (this.lAR == null)
      return csx.icw;
    return this.lAR.adN();
  }

  public boolean adO() {
    return true;
  }

  public Point adP() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    cYm localcYm = up.c(localdSz, getWorldX(), getWorldY(), getAltitude() + ats());
    return new Point((int)localcYm.aOR, (int)localcYm.aOS);
  }

  public short OL() {
    return (short)(int)(ats() * 10.0F);
  }

  public boolean isVisible()
  {
    try {
      byz localbyz = byv.bFN().bFO();
      if (localbyz == null)
        return true;
      return localbyz.bGv() == null; } catch (Exception localException) {
    }
    return super.isVisible();
  }
}