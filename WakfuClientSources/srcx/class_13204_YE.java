import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class YE
  implements ddh
{
  protected final float bvL;
  protected final float bvM;
  private final bJR[] cJL;

  public YE(float paramFloat1, float paramFloat2, bJR[] paramArrayOfbJR)
  {
    this.bvL = paramFloat1;
    this.bvM = paramFloat2;
    this.cJL = paramArrayOfbJR;
  }

  public final boolean a(FA paramFA, Particle paramParticle1, Particle paramParticle2, float paramFloat, ParticleSystem paramParticleSystem) {
    float f1 = paramParticle2.gFI;
    if (f1 < this.bvL)
      return false;
    float f2 = this.bvM - f1;
    if (f2 < 0.0F)
      return true;
    for (int i = 0; i < this.cJL.length; i++) {
      if (!this.cJL[i].a(paramParticle1, paramParticle2, paramFloat, paramParticleSystem))
        return false;
    }
    paramFA.a(f2 < paramFloat ? f2 : paramFloat, paramParticle1, paramParticle2, paramParticleSystem);
    return false;
  }
}