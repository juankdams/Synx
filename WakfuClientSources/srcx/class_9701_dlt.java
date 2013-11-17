import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class dlt extends bGB
{
  private dlt(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramFloat1, paramFloat2, paramFloat3);
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    paramParticle2.aOR += this.aOR * paramFloat;
    paramParticle2.aOS += this.aOS * paramFloat;
    paramParticle2.aOT += this.aOT * paramFloat;
  }
}