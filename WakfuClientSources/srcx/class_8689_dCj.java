import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class dCj extends FA
{
  private static final float lKB = 1.0F;
  private static final float lKC = 0.5F;
  private static final float lKD = 0.1162791F;
  private final bKB lKE = new bKB();

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    if (!paramParticle2.gFN)
      return;
    float f1 = paramParticle2.aOR + paramParticle1.getX();
    float f2 = paramParticle2.aOS + paramParticle1.getY();
    float f3 = paramParticle2.aOT + paramParticle1.aCv();

    f1 += paramParticleSystem.getX();
    f2 += paramParticleSystem.getY();
    f3 += paramParticleSystem.aCv();

    if (!Float.isNaN(paramParticle2.gFB)) {
      float f4 = f1 - paramParticle2.gFB;
      float f5 = f2 - paramParticle2.gFC;
      float f6 = f3 - paramParticle2.gFD;
      if ((f4 == 0.0F) && (f5 == 0.0F) && (f6 == 0.0F)) {
        return;
      }

      float f7 = (f4 - f5) / 4.0F;
      float f8 = (f4 + f5) * 0.5F + f6 * 0.1162791F;

      if (Math.abs(f7) > 1.0E-005F) {
        float f9 = (float)Math.atan(f8 / f7);

        float f10 = this.lKE.aM(paramParticle2);
        paramParticle2.cAH += f9 - f10;
        this.lKE.b(paramParticle2, f9);
      }
    }
    paramParticle2.gFB = f1;
    paramParticle2.gFC = f2;
    paramParticle2.gFD = f3;
  }
}