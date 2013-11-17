import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

public abstract class FA
{
  private static final Logger K = Logger.getLogger(FA.class);

  private static final ddh bMR = new ckB();
  ddh bMS;

  public void a(ddh paramddh)
  {
    this.bMS = paramddh;
  }

  public void a(brc[] paramArrayOfbrc)
  {
    if (paramArrayOfbrc == null) {
      this.bMS = bMR;
    } else {
      this.bMS = null;
      float f1 = 0.0F; float f2 = (1.0F / 1.0F);
      bJR localbJR = null;
      for (int i = 0; i < paramArrayOfbrc.length; i++) {
        if ((paramArrayOfbrc[i] instanceof bJR)) {
          if (localbJR != null)
            K.error("pas cool");
          localbJR = (bJR)paramArrayOfbrc[i];
        } else {
          An localAn = (An)paramArrayOfbrc[i];
          f1 = localAn.bvL;
          f2 = localAn.bvM;

          if (f2 <= f1) {
            f2 = (1.0F / 1.0F);
          }
        }

      }

      if (localbJR != null) {
        this.bMS = new YE(f1, f2, new bJR[] { localbJR });
      }
      else if (f2 != (1.0F / 1.0F))
        this.bMS = new dBn(f1, f2);
      else
        this.bMS = bMR;
    }
  }

  public final boolean b(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    return this.bMS.a(this, paramParticle1, paramParticle2, paramFloat, paramParticleSystem);
  }

  public boolean Po() {
    return false;
  }

  public abstract void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem);
}