import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class bJR
  implements brc
{
  public final int cxl;
  public final bXZ gLI;
  public final boolean gLJ;

  public bJR(int paramInt, bXZ parambXZ, boolean paramBoolean)
  {
    this.cxl = paramInt;
    this.gLI = parambXZ;
    this.gLJ = paramBoolean;
  }

  public boolean a(Particle paramParticle1, Particle paramParticle2, float paramFloat, ParticleSystem paramParticleSystem)
  {
    switch (zy.buh[this.gLI.ordinal()]) {
    case 1:
      return paramParticle2.aOR >= this.cxl + (this.gLJ ? paramParticleSystem.mnQ : paramParticle1.aOR);
    case 2:
      return paramParticle2.aOR <= this.cxl + (this.gLJ ? paramParticleSystem.mnQ : paramParticle1.aOR);
    case 3:
      return paramParticle2.aOS >= this.cxl + (this.gLJ ? paramParticleSystem.mnR : paramParticle1.aOS);
    case 4:
      return paramParticle2.aOS <= this.cxl + (this.gLJ ? paramParticleSystem.mnR : paramParticle1.aOS);
    case 5:
      return paramParticle2.aOT >= this.cxl + (this.gLJ ? paramParticleSystem.mnS : paramParticle1.aOT);
    case 6:
      return paramParticle2.aOT <= this.cxl + (this.gLJ ? paramParticleSystem.mnS : paramParticle1.aOT);
    }
    return true;
  }
}