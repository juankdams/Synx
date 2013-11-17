import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class gy extends bXI
{
  public final int aEG;
  public final cYk aEH;
  public final boolean aEI;
  public final bBr aEJ;
  public final boolean aEK;
  public FreeParticleSystem aEL;
  public cew aEM;
  dwv aEN;
  public boolean aEO = false;

  gy(dpI paramdpI, int paramInt, cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2, bBr parambBr, dwv paramdwv)
  {
    super(paramdpI);
    this.aEG = paramInt;
    this.aEH = paramcYk;
    this.aEI = paramBoolean1;
    this.aEN = paramdwv;
    this.aEJ = parambBr;
    this.aEK = paramBoolean2;
  }

  private gy(gy paramgy) {
    super(paramgy.cwt);
    this.aEG = paramgy.aEG;
    this.aEH = paramgy.aEH;
    this.aEI = paramgy.aEI;
    this.aEN = null;
    this.aEJ = paramgy.aEJ;
    this.aEK = paramgy.aEK;
  }

  public void a(cew paramcew) {
    this.aEM = paramcew;
    this.aEN.f(this);
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI)) {
      return false;
    }
    if ((!bB) && (!(parambXI instanceof gy))) throw new AssertionError();
    gy localgy = (gy)parambXI;
    return (localgy.aEG == this.aEG) && (localgy.aEI == this.aEI) && (localgy.aEJ == this.aEJ) && (localgy.aEK == this.aEK) && (localgy.aEH == null ? this.aEH == null : localgy.aEH.equals(this.aEH));
  }

  public gy nE()
  {
    return new gy(this);
  }
}