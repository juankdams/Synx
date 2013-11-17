import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class cVK extends FA
{
  public final float bOZ;
  public final float bPa;
  public final float bPb;
  public final float bPc;
  public final float buM;

  public cVK(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.bOZ = paramFloat1;
    this.bPa = paramFloat2;
    this.bPb = paramFloat3;
    this.bPc = paramFloat4;
    this.buM = paramFloat5;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f = this.buM * paramFloat;

    paramParticle2.bOZ -= (paramParticle2.bOZ - this.bOZ) * f;
    paramParticle2.bPa -= (paramParticle2.bPa - this.bPa) * f;
    paramParticle2.bPb -= (paramParticle2.bPb - this.bPb) * f;
    paramParticle2.bPc -= (paramParticle2.bPc - this.bPc) * f;
  }
}