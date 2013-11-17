import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class dWk extends FA
{
  public final float mvt;
  public float mvu;

  public dWk(float paramFloat)
  {
    this.mvt = paramFloat;
    this.mvu = 180.0F;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    this.mvu += this.mvt * paramFloat;

    if (this.mvu >= 360.0F) {
      this.mvu -= 360.0F;
    }

    paramParticle2.aOR = (paramParticle1.getX() + bCO.bI(this.mvu) * paramParticle2.gFE + 0.4F);
    paramParticle2.aOS = (paramParticle1.getY() + bCO.bH(this.mvu) * paramParticle2.gFF - 0.7F);
  }
}