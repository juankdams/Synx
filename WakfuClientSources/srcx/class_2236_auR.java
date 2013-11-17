import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class auR
  implements bSl, bjr
{
  private ahm dJp;
  private float dJq;
  private int TR;

  public auR(ahm paramahm, float paramFloat, int paramInt)
  {
    this.dJp = paramahm;
    this.dJq = paramFloat;
    this.TR = paramInt;
  }

  public void x(float paramFloat1, float paramFloat2) {
    this.dJp.x(paramFloat1, paramFloat2);
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.dJp.k(paramFloat1, paramFloat2, paramFloat3);
  }

  public float atu() {
    return this.dJp.atu();
  }

  public float getWorldX() {
    return this.dJp.getWorldX();
  }

  public float getWorldY() {
    return this.dJp.getWorldY();
  }

  public float getAltitude() {
    return this.dJp.getAltitude() + getOffset();
  }

  public int fa() {
    return this.dJp.fa();
  }

  public int fb() {
    return this.dJp.fb();
  }

  public short fc() {
    return (short)(int)(this.dJp.fc() + getOffset());
  }

  public bSl Gu() {
    return this.dJp;
  }

  public void setTarget(ahm paramahm) {
    this.dJp = paramahm;
  }

  public boolean isVisible() {
    return this.dJp.isVisible();
  }

  public void a(FreeParticleSystem paramFreeParticleSystem) {
    this.dJp.a(paramFreeParticleSystem);
  }

  public void b(FreeParticleSystem paramFreeParticleSystem) {
    this.dJp.b(paramFreeParticleSystem);
  }

  public void atI() {
  }

  private float getOffset() {
    return this.dJp.ats() * this.dJq + this.TR;
  }
}