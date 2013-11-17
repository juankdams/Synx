import org.apache.log4j.Logger;

abstract class rh
{
  protected static final Logger K = Logger.getLogger(rh.class);
  protected boolean aYY = false;
  protected boolean aYZ = true;

  protected final bEV aZa = new bEV(0.0F);
  private bDt aZb;

  public void a(bDt parambDt)
  {
    this.aZb = parambDt;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }

  boolean isRunning() {
    return this.aYY;
  }

  void A(float paramFloat) {
    this.aZa.set(paramFloat);
  }

  float xP() {
    return this.aZa.bMS();
  }

  void a(float paramFloat, int paramInt, long paramLong) {
    this.aZa.a(paramFloat, paramInt, paramLong);
  }

  void Y(long paramLong) {
    this.aZa.K(paramLong);
  }

  void a(adG paramadG) {
    if ((this.aZb != null) && (!this.aYY))
      this.aZb.axZ();
  }

  void stop()
  {
    if ((this.aZb != null) && (this.aYY))
      this.aZb.nv();
  }

  abstract void a(adG paramadG, float paramFloat1, float paramFloat2);
}