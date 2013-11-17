import com.ankamagames.framework.graphics.engine.entity.Entity;

public class wk
  implements aCF
{
  private int aWH;
  public final int blX = -1;
  private int aKS = -1;
  private int blY = 0;
  private int aw;
  private float blZ = 1.0F;

  private wk(dxn paramdxn) {
  }

  public cqz Fr() {
    return this.bma.af;
  }

  public void a(cqz paramcqz)
  {
  }

  public int getXOffset() {
    return this.bma.getXOffset();
  }

  public void setXOffset(int paramInt) {
    dxn.a(this.bma, paramInt);
  }

  public int getYOffset() {
    return this.bma.getYOffset();
  }

  public void setYOffset(int paramInt) {
    dxn.b(this.bma, paramInt);
  }

  public float getWorldX()
  {
    return this.bma.getWorldX();
  }

  public float getWorldY()
  {
    return this.bma.getWorldY();
  }

  public float getAltitude()
  {
    if (this.bma.af != null) {
      return this.bma.af.getAltitude();
    }
    return 0.0F;
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.bma.a(null, this.bma.af.getScreenX(), this.bma.af.getScreenY(), 0);
  }

  public int getDuration() {
    return this.aKS;
  }

  public boolean isAlive()
  {
    if (this.aKS == -1) {
      return true;
    }
    return this.blY <= this.aKS;
  }

  public void a(cXf paramcXf, int paramInt) {
    this.blZ = paramcXf.cKV().getZoomFactor();
    cz(paramInt);
    this.bma.k(paramInt, this.blZ);
  }

  public void cz(int paramInt) {
    this.blY += paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public int xj() {
    return this.aWH;
  }

  public void dl(int paramInt) {
    this.aWH = paramInt;
  }

  public Entity getEntity() {
    return null;
  }

  public void cleanUp() {
    this.bma.cxB();
  }

  public boolean Fs() {
    return false;
  }

  public void dm(int paramInt) {
    this.blY = paramInt;
  }

  public int Ft() {
    return this.blY;
  }

  public void setDuration(int paramInt) {
    this.aKS = paramInt;
  }

  public float getZoomFactor() {
    return this.blZ;
  }
}