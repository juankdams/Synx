import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.sun.opengl.util.texture.TextureCoords;

public class akA extends qU
{
  public float buM = 1.0F;
  public int dls = -1;
  public final dzZ dlt;
  private float dlu;

  public akA(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16, dzZ paramdzZ, float paramFloat17, int paramInt2)
  {
    super(paramInt1, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramBoolean, paramFloat7, paramFloat8, paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16);

    this.dlt = paramdzZ;
    this.buM = paramFloat17;
    this.dls = paramInt2;
  }

  public Particle a(ParticleSystem paramParticleSystem)
  {
    if ((paramParticleSystem.isEditable()) && 
      (!b(paramParticleSystem))) {
      return null;
    }

    return super.a(paramParticleSystem);
  }

  public boolean isSequence()
  {
    return true;
  }

  public boolean b(ParticleSystem paramParticleSystem) {
    if ((!bB) && (!this.aYn)) throw new AssertionError("Texture is already up to date");
    if ((!bB) && (!paramParticleSystem.isEditable())) throw new AssertionError();

    bsn localbsn = paramParticleSystem.cjl().wf(xG());
    if (localbsn == null) {
      return false;
    }
    this.aYn = false;

    return true;
  }

  public final TextureCoords iZ(int paramInt)
  {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();

    this.dlu += this.buM * paramInt;
    int i = this.dlt.ddh();
    if (this.dlu >= i) {
      this.dlu -= i;
      if (this.dls > 0) {
        this.dls -= 1;
      }
    }
    if (this.dls == 0)
      return this.dlt.br((short)i);
    return this.dlt.br((short)(int)this.dlu);
  }
}