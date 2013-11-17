public class act
  implements dUd
{
  private int aKS;
  private long aPT;
  private final int cSh;
  private final int cSi;
  private final String aCm;

  public act(int paramInt1, int paramInt2, String paramString)
  {
    this.cSh = paramInt1;
    this.cSi = paramInt2;
    this.aCm = paramString;
  }

  public String MK() {
    return this.aCm;
  }

  public void hF(int paramInt) {
    stop();
    setDuration(paramInt);
    this.aPT = cAo.cxf().a(this, 1000L, 0, paramInt);
  }

  public void stop() {
    setDuration(0);
    cAo.cxf().ia(this.aPT);
  }

  protected byte hG(int paramInt) {
    if (paramInt > this.cSh)
      return 0;
    if (paramInt > this.cSi) {
      return 1;
    }
    return 2;
  }

  protected void setDuration(int paramInt)
  {
    this.aKS = Math.max(paramInt, 0);

    if (this.aCm != null) {
      dLE.doY().a("countdown", Integer.valueOf(this.aKS), this.aCm);
      dLE.doY().a("countdownState", Byte.valueOf(hG(paramInt)), this.aCm);
    } else {
      dLE.doY().t("countdown", Integer.valueOf(this.aKS));
      dLE.doY().t("countdownState", Byte.valueOf(hG(paramInt)));
    }
  }

  protected final int getDuration() {
    return this.aKS;
  }

  public boolean a(cWG paramcWG) {
    setDuration(this.aKS - 1);
    if (this.aKS == 0) {
      stop();
    }
    return false;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}