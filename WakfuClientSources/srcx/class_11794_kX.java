import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class kX extends FA
{
  public final float aOR;
  public final float aOS;
  public final float aOT;

  public kX(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    paramParticle2.gFE += this.aOR;
    paramParticle2.gFF += this.aOS;
    paramParticle2.gFG += this.aOT;
  }
}