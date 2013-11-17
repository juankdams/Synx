import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class deR extends FA
{
  public final float ghT;
  public final bgW kYP;
  public final float aZs;
  public final float aZt;
  public final float kYQ;

  public deR(float paramFloat1, bgW parambgW, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.ghT = paramFloat1;
    this.kYP = parambgW;
    this.aZs = paramFloat2;
    this.aZt = paramFloat3;
    this.kYQ = paramFloat4;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f1 = this.ghT * paramFloat;
    float f2 = this.aZs - paramParticle2.aOR;
    float f3 = this.aZt - paramParticle2.aOS;
    float f4 = this.kYQ - paramParticle2.aOT;
    if (!paramParticle1.gFN) {
      f2 += paramParticle1.getX();
      f3 += paramParticle1.getY();
      f4 += paramParticle1.aCv();
    }
    float f5 = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);

    f2 /= f5;
    f3 /= f5;
    f4 /= f5;

    switch (dTy.mqz[this.kYP.ordinal()]) {
    case 1:
      paramParticle2.aOS += f3 * f1;
      paramParticle2.aOT += f4 * f1;
      break;
    case 2:
      paramParticle2.aOR += f2 * f1;
      paramParticle2.aOT += f4 * f1;
      break;
    case 3:
      paramParticle2.aOR += f2 * f1;
      paramParticle2.aOS += f3 * f1;
      break;
    case 4:
      paramParticle2.aOR += f2 * f1;
      paramParticle2.aOS += f3 * f1;
      paramParticle2.aOT += f4 * f1;
      break;
    default:
      if (!bB) throw new AssertionError("Unknown attractor axis"); break;
    }
  }

  public boolean Po()
  {
    return true;
  }
}