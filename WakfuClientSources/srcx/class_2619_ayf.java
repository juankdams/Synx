import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class ayf extends FA
{
  public final float dNO;

  public ayf(float paramFloat)
  {
    this.dNO = paramFloat;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    paramParticle2.aYg += this.dNO * (int)(33333.0F * paramFloat) / 1000.0F;
  }
}