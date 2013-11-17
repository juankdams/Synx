import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class dBn
  implements ddh
{
  protected final float bvL;
  protected final float bvM;

  public dBn(float paramFloat1, float paramFloat2)
  {
    this.bvL = paramFloat1;
    this.bvM = paramFloat2;
  }

  public final boolean a(FA paramFA, Particle paramParticle1, Particle paramParticle2, float paramFloat, ParticleSystem paramParticleSystem) {
    float f1 = paramParticle2.gFI;
    if (f1 < this.bvL)
      return false;
    float f2 = this.bvM - f1;
    if (f2 < 0.0F)
      return true;
    paramFA.a(f2 < paramFloat ? f2 : paramFloat, paramParticle1, paramParticle2, paramParticleSystem);
    return false;
  }
}