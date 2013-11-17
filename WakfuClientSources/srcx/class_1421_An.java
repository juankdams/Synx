import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class An
  implements brc
{
  public final float bvL;
  public final float bvM;

  public An(float paramFloat1, float paramFloat2)
  {
    this.bvL = paramFloat1;
    this.bvM = paramFloat2;
  }

  public boolean a(Particle paramParticle1, Particle paramParticle2, float paramFloat, ParticleSystem paramParticleSystem)
  {
    float f = paramParticle2.gFI;
    if ((f > this.bvM) && (f - paramFloat < this.bvL)) {
      return true;
    }
    return (f >= this.bvL) && (f <= this.bvM);
  }
}