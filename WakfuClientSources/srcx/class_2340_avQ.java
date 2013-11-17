import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class avQ extends FA
{
  public final float dKK;

  public avQ(float paramFloat)
  {
    this.dKK = paramFloat;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f = 1.0F - this.dKK * paramFloat;
    paramParticle2.gFE *= f;
    paramParticle2.gFF *= f;
    paramParticle2.gFG *= f;
  }
}