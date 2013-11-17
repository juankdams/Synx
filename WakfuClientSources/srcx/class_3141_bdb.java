import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class bdb extends bGB
{
  private bdb(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramFloat1, paramFloat2, paramFloat3);
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    paramParticle2.gFE += this.aOR * paramFloat;
    paramParticle2.gFF += this.aOS * paramFloat;
    paramParticle2.gFG += this.aOT * paramFloat;
  }
}