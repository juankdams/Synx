import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle.ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public abstract class qU
{
  public final float aYe;
  public final float aYf;
  public final float aYg;
  public final float aYh;
  public final boolean aYi;
  public final float aYj;
  public final float aYk;
  public final float aYl;
  public final float aYm;
  protected boolean aYn;
  public int aYo;
  public final float aYp;
  public final float aYq;
  public final float aYr;
  public final float aYs;
  public final float aYt;
  public final float aYu;
  public final float aYv;
  public final float aYw;
  private int aYx;
  public float aYy;
  public float aYz;
  public float aYA;
  public float aYB;
  public float aYC;
  public float aYD;

  public qU(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    this.aYe = paramFloat1;
    this.aYf = paramFloat2;

    this.aYg = paramFloat3;
    this.aYh = paramFloat4;
    this.aYi = paramBoolean;
    this.aYj = paramFloat5;
    this.aYk = paramFloat6;

    this.aYl = paramFloat7;
    this.aYm = paramFloat8;
    this.aYo = paramInt;

    this.aYp = paramFloat9;
    this.aYq = paramFloat10;
    this.aYr = paramFloat11;
    this.aYs = paramFloat12;
    this.aYt = paramFloat13;
    this.aYu = paramFloat14;
    this.aYv = paramFloat15;
    this.aYw = paramFloat16;
    this.aYn = true;
  }

  public Particle a(ParticleSystem paramParticleSystem)
  {
    Particle localParticle = (Particle)Particle.gFA.bQy();
    localParticle.gFL = this;
    return localParticle;
  }

  public void a(Particle paramParticle)
  {
    float f1 = this.aYg;
    float f2 = this.aYh;
    float f3 = this.aYl;

    if (this.aYi) {
      float f4 = bCO.bLk() * this.aYj;

      f1 += f4;
      f2 += f4;
    } else {
      if (this.aYj != 0.0F) {
        f1 += bCO.bLk() * this.aYj;
      }

      if (this.aYk != 0.0F) {
        f2 += bCO.bLk() * this.aYk;
      }
    }

    if (this.aYm != 0.0F) {
      f3 += (bCO.bLk() - 0.5F) * this.aYm;
    }

    paramParticle.aYe = this.aYe;
    paramParticle.aYf = this.aYf;
    paramParticle.bPc = (this.aYs + bCO.bLk() * this.aYw);
    paramParticle.bOZ = (this.aYp + bCO.bLk() * this.aYt);
    paramParticle.bPa = (this.aYq + bCO.bLk() * this.aYu);
    paramParticle.bPb = (this.aYr + bCO.bLk() * this.aYv);
    paramParticle.aYg = f1;
    paramParticle.aYh = f2;
    paramParticle.cAH = (f3 * 0.01745329F);
    paramParticle.aYC = this.aYC;
    paramParticle.aYD = this.aYD;
    paramParticle.aYy = this.aYy;
    paramParticle.aYz = this.aYz;
    paramParticle.aYA = this.aYA;
    paramParticle.aYB = this.aYB;
  }

  public void b(Particle paramParticle) {
  }

  public abstract boolean isSequence();

  public final int xF() {
    return this.aYx;
  }

  public final void setTextureIndex(int paramInt) {
    this.aYx = paramInt;
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.aYy = paramFloat1;
    this.aYz = paramFloat2;
    this.aYA = paramFloat3;
    this.aYB = paramFloat4;
  }

  public void f(float paramFloat1, float paramFloat2) {
    this.aYC = paramFloat1;
    this.aYD = paramFloat2;
  }

  public int xG() {
    return this.aYo;
  }

  public void cv(int paramInt) {
    this.aYo = paramInt;
    this.aYn = true;
  }
}