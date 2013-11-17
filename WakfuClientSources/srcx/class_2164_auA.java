import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class auA
{
  public static final int dGT = 100;
  private final bxu dGU;

  public auA()
  {
    this.dGU = bSj.hcO.y();
    this.dGU.setEnabled(false);
    if ((!bB) && (this.dGU == null)) throw new AssertionError(); 
  }

  public void a(float paramFloat, Emitter paramEmitter, ParticleSystem paramParticleSystem)
  {
    Particle localParticle = paramEmitter.cRu;

    localParticle.cRr = paramEmitter.cRr;
    float f1 = localParticle.gFI - paramEmitter.cRs.lkQ;
    this.dGU.setEnabled(f1 > 0.0F);
    localParticle.a(paramParticleSystem, paramFloat);

    this.dGU.bDo().m(localParticle.getX() + paramParticleSystem.getX(), localParticle.getY() + paramParticleSystem.getY(), localParticle.aCv() + paramParticleSystem.aCv());

    float f2 = localParticle.bPc;
    this.dGU.p(localParticle.bOZ * f2, localParticle.bPa * f2, localParticle.bPb * f2);
    this.dGU.q(localParticle.bOZ * f2, localParticle.bPa * f2, localParticle.bPb * f2);
    this.dGU.aG(bCO.t(localParticle.aYC * localParticle.aYg, 0.0F, 5.0F));
    if ((f1 >= localParticle.gFJ) && (localParticle.gFJ != 3.4028235E+38F))
      unregister();
  }

  public void l(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.dGU.q(paramFloat1, paramFloat2, paramFloat3);
  }

  public void aG(float paramFloat) {
    this.dGU.aG(paramFloat);
  }

  public void register() {
    bSj.hcO.a(this.dGU);
  }

  public void unregister() {
    this.dGU.shutdown(100);
  }
}