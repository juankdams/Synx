import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class aZB extends dku
{
  public aZB(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    paramParticle2.aYg += this.dNO + bCO.bLk() * this.lhF;
    paramParticle2.aYh += this.lhE + bCO.bLk() * this.lhG;
    paramParticle2.cAH += this.cAH + bCO.bLk() * this.lhH;
  }
}