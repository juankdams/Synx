import org.apache.log4j.Logger;

public class boK
  implements Tr
{
  private static final Logger K = Logger.getLogger(boK.class);
  private WA fIk;
  private int dyx;
  private int dyy;
  private float fIl = 0.25F;
  private boolean fIm;
  private boolean fIn;
  private final int fIo;
  private final int fIp;
  private final float fIq;
  private final float fIr;

  public boK(aWe paramaWe, int paramInt1, int paramInt2)
  {
    this.fIq = paramaWe.yf();
    this.fIr = paramaWe.yg();
    this.fIo = paramInt1;
    this.fIp = paramInt2;
    setLocation(paramInt1, paramInt2);
  }

  public void a(WA paramWA) {
    this.fIk = paramWA;
  }

  public void setLocation(int paramInt1, int paramInt2) {
    this.dyx = paramInt1;
    this.dyy = paramInt2;
  }

  public boolean agw() {
    return true;
  }

  public cYm a(adG paramadG, rp paramrp) {
    float f1 = this.fIl / paramrp.getZoomFactor();
    f1 = 1.0F / paramrp.getZoomFactor();

    cYm localcYm = bs(f1);
    if (this.fIk != null) {
      this.fIk.a(this.fIq, this.fIr, localcYm);
    }
    bSl localbSl = paramrp.xZ();
    if (localbSl != null);
    float f2 = 1000.0F;
    localcYm.aOR = bCO.t(localcYm.aOR, -1000.0F, 1000.0F);
    localcYm.aOS = bCO.t(localcYm.aOS, -1000.0F, 1000.0F);

    localcYm.aOR += this.fIq;
    localcYm.aOS += this.fIr;
    return localcYm;
  }

  private cYm bs(float paramFloat) {
    float f1 = this.dyx - this.fIo;
    float f2 = -(this.dyy - this.fIp);
    if (this.fIm)
      f1 = -f1;
    if (this.fIn)
      f2 = -f2;
    f1 *= paramFloat;
    f2 *= paramFloat;
    return new cYm(f1, f2);
  }
}