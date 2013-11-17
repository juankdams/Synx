import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class czl extends qU
{
  public czl(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    super(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean, paramFloat7, paramFloat8, paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16);
  }

  public Particle a(ParticleSystem paramParticleSystem)
  {
    if ((paramParticleSystem.isEditable()) && (this.aYn) && 
      (!b(paramParticleSystem))) {
      return null;
    }
    return super.a(paramParticleSystem);
  }

  public boolean isSequence()
  {
    return false;
  }

  public boolean b(ParticleSystem paramParticleSystem) {
    if ((!bB) && (!this.aYn)) throw new AssertionError("Texture is already up to date");
    if ((!bB) && (!paramParticleSystem.isEditable())) throw new AssertionError();

    bsn localbsn = paramParticleSystem.cjl().wf(xG());
    if (localbsn == null) {
      return false;
    }
    int i = localbsn.getWidth();
    int j = localbsn.getHeight();
    int k = bCO.sj(i);
    int m = bCO.sj(j);

    this.aYC = (i * 0.5F);
    this.aYD = (j * 0.5F);
    this.aYA = (j / m);
    this.aYB = (i / k);
    this.aYn = false;

    return true;
  }
}