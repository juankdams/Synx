import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle.ObjectFactory;

public class dGG extends dAU
{
  public final float bOZ;
  public final float bPa;
  public final float bPb;
  public final float ghT;
  public final float duj;

  public dGG(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.bOZ = paramFloat1;
    this.bPa = paramFloat2;
    this.bPb = paramFloat3;
    this.ghT = paramFloat4;

    this.duj = paramFloat5;
  }

  public auA dhz() {
    auA localauA = new auA();
    localauA.l(this.bOZ * this.ghT, this.bPa * this.ghT, this.bPb * this.ghT);
    localauA.aG(this.duj);
    return localauA;
  }

  public Particle dhA() {
    Particle localParticle = (Particle)Particle.gFA.bQy();
    localParticle.bOZ = this.bOZ;
    localParticle.bPa = this.bPa;
    localParticle.bPb = this.bPb;
    localParticle.bPc = this.ghT;
    localParticle.aYC = this.duj;
    localParticle.aYD = this.duj;
    localParticle.aYg = 1.0F;
    return localParticle;
  }
}