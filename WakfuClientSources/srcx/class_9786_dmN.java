import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter.ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

public class dmN extends dAU
{
  public int aw;
  public ArrayList lkO;
  public final ArrayList lkP;
  public dGG cRt;
  public final float lkQ;
  public final float lkR;
  public final int lkS;
  public final int lkT;
  public final float aVV;
  public final float lkU;
  public final float cxr;
  public final float lkV;
  public final float lkW;
  public final float lkX;
  public final float lkY;
  public final float lkZ;
  public final float lla;
  public final float llb;
  public final float llc;
  public final float lld;
  public final float lle;
  public final float llf;
  public final float llg;
  public final float llh;
  public boolean gFN;

  public dmN(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16, float paramFloat17, float paramFloat18, boolean paramBoolean)
  {
    this.lkP = new ArrayList();
    this.lkQ = paramFloat1;
    this.lkR = paramFloat2;
    this.lkS = paramInt1;
    this.lkT = paramInt2;
    this.aVV = paramFloat3;
    this.lkU = paramFloat4;
    this.cxr = paramFloat5;
    this.lkV = paramFloat6;
    this.lkW = paramFloat7;
    this.lkX = paramFloat8;
    this.lkY = paramFloat9;
    this.lkZ = paramFloat10;
    this.lla = paramFloat11;
    this.llb = paramFloat12;
    this.llc = paramFloat13;
    this.lld = paramFloat14;
    this.lle = paramFloat15;
    this.llf = paramFloat16;
    this.llg = paramFloat17;
    this.llh = paramFloat18;
    this.gFN = paramBoolean;
  }

  public void reset()
  {
    this.lkP.clear();
    der();
    this.cRt = null;
    this.gFN = false;
  }

  public void a(qU paramqU) {
    this.lkP.add(paramqU);
  }

  public void a(ParticleSystem paramParticleSystem, Particle paramParticle1, Particle paramParticle2) {
    a(paramParticle1, paramParticle2);

    if (!paramParticle1.gFN) {
      paramParticle2.aOR += paramParticle1.getX();
      paramParticle2.aOS += paramParticle1.getY();
      paramParticle2.aOT += paramParticle1.aCv();
    }

    if (this.lkO != null)
      paramParticle2.a(paramParticleSystem, this.lkO);
  }

  public void a(Particle paramParticle1, Particle paramParticle2)
  {
    float f1 = this.lkW;
    float f2 = this.lkX;
    float f3 = this.lkY;
    float f4 = this.llc;
    float f5 = this.lld;
    float f6 = this.lle;

    if (this.lkZ != 0.0F) {
      f1 += (bCO.bLk() - 0.5F) * this.lkZ;
    }

    if (this.lla != 0.0F) {
      f2 += (bCO.bLk() - 0.5F) * this.lla;
    }

    if (this.llb != 0.0F) {
      f3 += (bCO.bLk() - 0.5F) * this.llb;
    }

    if (this.llf != 0.0F) {
      f4 += (bCO.bLk() - 0.5F) * this.llf;
    }

    if (this.llg != 0.0F) {
      f5 += (bCO.bLk() - 0.5F) * this.llg;
    }

    if (this.llh != 0.0F) {
      f6 += (bCO.bLk() - 0.5F) * this.llh;
    }

    paramParticle2.aOR = f1;
    paramParticle2.aOS = f2;
    paramParticle2.aOT = f3;

    paramParticle2.gFE = f4;
    paramParticle2.gFF = f5;
    paramParticle2.gFG = f6;

    paramParticle2.gFJ = (this.cxr + bCO.bLk() * this.lkV);
    paramParticle2.gFI = 0.0F;
    paramParticle2.gFN = this.gFN;
    paramParticle2.cRr = paramParticle1;
  }

  public void b(dmN paramdmN) {
    if (paramdmN == null)
      return;
    if (this.lkO == null) {
      this.lkO = new ArrayList();
    }
    this.lkO.add(paramdmN);
  }

  public int cUm() {
    int i = this.lkP.size();
    if (i == 0) {
      return -1;
    }
    return bCO.sf(i);
  }

  public void a(dGG paramdGG) {
    this.cRt = paramdGG;
  }

  public Emitter cUn() {
    Emitter localEmitter = (Emitter)Emitter.cRl.bQy();
    localEmitter.a(this);
    return localEmitter;
  }
}