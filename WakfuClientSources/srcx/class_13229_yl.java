import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class yl extends FA
{
  public final float Vf;
  public final float Vh;
  public final float brE;
  public final float Vg;
  public final float Vi;
  public final float brF;
  public final float brG;
  public final float brH;
  public final float brI;
  public final float brJ;
  public final float brK;
  public final float brL;
  private final boolean brM;

  public yl(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12)
  {
    this.Vf = paramFloat1;
    this.Vh = paramFloat2;
    this.brE = paramFloat3;
    this.Vg = paramFloat4;
    this.Vi = paramFloat5;
    this.brF = paramFloat6;
    this.brG = paramFloat7;
    this.brH = paramFloat8;
    this.brI = paramFloat9;
    this.brJ = paramFloat10;
    this.brK = paramFloat11;
    this.brL = paramFloat12;
    this.brM = ((this.brG != 0.0F) || (this.brH != 0.0F) || (this.brL != 0.0F));
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    float f1 = paramParticle1.getX() + this.Vf;
    float f2 = paramParticle1.getY() + this.Vh;
    float f3 = paramParticle1.aCv() + this.brE;

    float f4 = paramParticle1.getX() + this.Vg;
    float f5 = paramParticle1.getY() + this.Vi;
    float f6 = paramParticle1.aCv() + this.brF;

    int i = 0;
    if ((paramParticle2.aOR < f1) && (paramParticle2.gFB >= f1)) {
      i = 1;
      paramParticle2.aOR = f1;
      paramParticle2.gFE = (-paramParticle2.gFE);
    }
    if ((paramParticle2.aOR > f4) && (paramParticle2.gFB <= f4)) {
      i = 1;
      paramParticle2.aOR = f4;
      paramParticle2.gFE = (-paramParticle2.gFE);
    }

    if ((paramParticle2.aOS < f2) && (paramParticle2.gFC >= f2)) {
      i = 1;
      paramParticle2.aOS = f2;
      paramParticle2.gFF = (-paramParticle2.gFF);
    }
    if ((paramParticle2.aOS > f5) && (paramParticle2.gFC <= f5)) {
      i = 1;
      paramParticle2.aOS = f5;
      paramParticle2.gFF = (-paramParticle2.gFF);
    }

    if ((paramParticle2.aOT < f3) && (paramParticle2.gFD >= f3)) {
      i = 1;
      paramParticle2.aOT = f3;
      paramParticle2.gFG = (-paramParticle2.gFG);
    }
    if ((paramParticle2.aOT > f6) && (paramParticle2.gFD <= f6)) {
      i = 1;
      paramParticle2.aOT = f6;
      paramParticle2.gFG = (-paramParticle2.gFG);
    }

    if (i != 0) {
      if (this.brM) {
        paramParticle2.gFE *= (this.brG + bCO.bLk() * this.brJ);
        paramParticle2.gFF *= (this.brH + bCO.bLk() * this.brK);
        paramParticle2.gFG *= (this.brI + bCO.bLk() * this.brL);
      } else {
        paramParticle2.gFE *= this.brG;
        paramParticle2.gFF *= this.brH;
        paramParticle2.gFG *= this.brI;
      }
    }

    paramParticle2.gFB = paramParticle2.aOR;
    paramParticle2.gFC = paramParticle2.aOS;
    paramParticle2.gFD = paramParticle2.aOT;
  }
}