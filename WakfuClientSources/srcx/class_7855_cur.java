import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class cur extends FA
{
  public final float ghT;

  public cur(float paramFloat)
  {
    this.ghT = paramFloat;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f = this.ghT * paramFloat;
    Particle localParticle = paramParticle1.cRr == null ? paramParticle1 : paramParticle1.cRr;

    paramParticle2.aOR += (paramParticle2.aOS - localParticle.getY()) * f;
    paramParticle2.aOS -= (paramParticle2.aOR - localParticle.getX()) * f;
  }
}