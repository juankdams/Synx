import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class dku extends FA
{
  public final float dNO;
  public final float lhE;
  public final float cAH;
  public final float lhF;
  public final float lhG;
  public final float lhH;

  public dku(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.dNO = paramFloat1;
    this.lhE = paramFloat2;
    this.cAH = paramFloat3;

    this.lhF = paramFloat4;
    this.lhG = paramFloat5;
    this.lhH = paramFloat6;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f = (int)(33333.0F * paramFloat) / 1000.0F;
    paramParticle2.aYg += this.dNO * f;
    paramParticle2.aYh += this.lhE * f;
    paramParticle2.cAH += this.cAH * f;
  }
}