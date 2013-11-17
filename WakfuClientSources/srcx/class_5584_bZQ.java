import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

public class bZQ extends FA
{
  public static final long gSe = 1000000L;
  private static final Logger K = Logger.getLogger(bZQ.class);
  private final bmC hqB;

  public bZQ(bmC parambmC)
  {
    this.hqB = parambmC;
  }

  public void a(float paramFloat, Particle paramParticle1, Particle paramParticle2, ParticleSystem paramParticleSystem)
  {
    long l = ()(1000000.0F * (paramParticle2.gFI / paramParticle2.gFJ));

    cEi localcEi = this.hqB.cp(l);
    if (paramParticle1.gFN) {
      paramParticle2.aOR = (localcEi.aOR + paramParticleSystem.getX());
      paramParticle2.aOS = (localcEi.aOS + paramParticleSystem.getY());
      paramParticle2.aOT = (localcEi.aOT + paramParticleSystem.aCv());
    } else {
      paramParticle2.aOR = (localcEi.aOR + paramParticle1.aOR);
      paramParticle2.aOS = (localcEi.aOS + paramParticle1.aOS);
      paramParticle2.aOT = (localcEi.aOT + paramParticle1.aOT);
    }
  }

  public cEi ceq() {
    return this.hqB.akj();
  }

  public cEi cer() {
    return this.hqB.akk();
  }

  public cEi ces() {
    return this.hqB.akl();
  }

  public cEi cet() {
    return this.hqB.akm();
  }
}