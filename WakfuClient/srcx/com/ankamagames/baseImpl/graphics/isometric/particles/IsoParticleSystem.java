package com.ankamagames.baseImpl.graphics.isometric.particles;

import aVn;
import adG;
import bCO;
import bIQ;
import bdB;
import beV;
import bgL;
import cYm;
import cbI;
import cix;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import dLw;
import dQx;
import dmN;
import rp;
import up;

public abstract class IsoParticleSystem extends ParticleSystem
  implements aVn, bgL, cbI
{
  public static final dQx bMI = new dQx(-512, 512, -512, 512);
  private short bMJ;
  private int bMK;
  private byte bML;
  private final dQx bMM = new dQx(bMI);

  protected IsoParticleSystem(boolean paramBoolean)
  {
    super(paramBoolean);
    bdB.b(this);
  }

  public void b(adG paramadG) {
    int i = bvg();
    if (i == 0) {
      return;
    }

    K(paramadG.apF().a(this));
    if (this.hFk[3] < 0.004F) {
      return;
    }

    paramadG.b(this, this.cat > 0.0F);

    for (int j = 0; j < i; j++) {
      GeometryMesh localGeometryMesh = (GeometryMesh)pW(j);
      localGeometryMesh.bIl().clear();
    }

    float f1 = getX();
    float f2 = getY();
    float f3 = aCv();
    this.mnQ = f1;
    this.mnR = f2;
    this.mnS = f3;
    this.hYO = 0.0F;

    this.aEf = 2147483647;
    this.aEg = 2147483647;
    this.aEh = -2147483648;
    this.aEi = -2147483648;
    float f4;
    float f5;
    float f6;
    if (this.gFN) {
      f4 = f1;
      f5 = f2;
      f6 = f3;
    } else {
      f4 = f5 = f6 = 0.0F;
    }

    a(this.hFc, f4, f5, f6, paramadG, 0);

    cjf();
    this.hFn = null;
  }

  public final int OU() {
    return c(this.hFc);
  }

  private int c(Particle paramParticle) {
    int i = 0;
    if (paramParticle == null) {
      return i;
    }
    if ((paramParticle != this.hFc) && (paramParticle.bPc > 0.004F)) {
      i++;
    }
    Emitter[] arrayOfEmitter = paramParticle.gFO;
    if (arrayOfEmitter == null) {
      return i;
    }
    int j = 0; for (int k = arrayOfEmitter.length; j < k; j++) {
      bIQ localbIQ = arrayOfEmitter[j].cRq;
      if (localbIQ != null)
      {
        int m = localbIQ.size();
        for (int n = 0; n < m; n++) {
          Particle localParticle = localbIQ.tb(n);
          i += c(localParticle);
        }
      }
    }
    return i;
  }

  private void a(Particle paramParticle, float paramFloat1, float paramFloat2, float paramFloat3, adG paramadG, int paramInt) {
    if (paramParticle == null) {
      return;
    }
    if (cje())
      return;
    Object localObject;
    if ((paramParticle != this.hFc) && (paramParticle.bPc > 0.004F)) {
      float f1 = paramParticle.aOR + paramFloat1;
      float f2 = paramParticle.aOS + paramFloat2;
      float f3 = paramParticle.aOT + paramFloat3;

      localObject = up.a(paramadG, f1, f2, f3);
      a(paramParticle, ((cYm)localObject).aOR, ((cYm)localObject).aOS);
    }
    Emitter[] arrayOfEmitter = paramParticle.gFO;
    if (arrayOfEmitter == null) {
      return;
    }

    int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
      localObject = arrayOfEmitter[i];
      bIQ localbIQ = ((Emitter)localObject).cRq;
      if (localbIQ != null)
      {
        float f4;
        float f5;
        float f6;
        if (!((Emitter)localObject).cRs.gFN) {
          f4 = paramFloat1;
          f5 = paramFloat2;
          f6 = paramFloat3;
        } else {
          f4 = paramFloat1 + paramParticle.aOR;
          f5 = paramFloat2 + paramParticle.aOS;
          f6 = paramFloat3 + paramParticle.aOT;
        }
        int k = localbIQ.size();
        for (int m = 0; m < k; m++) {
          Particle localParticle = localbIQ.tb(m);
          a(localParticle, f4, f5, f6, paramadG, paramInt + 1);
        }
      }
    }
  }

  public final int OV() { return this.bMK; }

  public final short OW()
  {
    return this.bMJ;
  }

  public final void j(int paramInt, short paramShort) {
    this.bMK = paramInt;
    this.bMJ = paramShort;
  }

  public final byte OX() {
    return this.bML;
  }

  public final void S(byte paramByte) {
    this.bML = paramByte;
  }

  public void OY()
  {
    super.OY();
    beV.fsh.d(this);
  }

  public float OZ() {
    return getX() - getY();
  }

  public float Pa() {
    return -(getX() + getY());
  }

  public float Pb() {
    return aCv() / 4.8F;
  }

  public boolean Pc() {
    return false;
  }

  public int ca() {
    return OV();
  }

  protected void gL()
  {
    super.gL();
    bdB.b(this);
    dsK();
  }

  public boolean Pd() {
    return bdB.c(this);
  }

  public int Pe() {
    return this.hEZ ? dLw.mbi.asR() : dLw.mbo.asR();
  }

  public boolean c(adG paramadG) {
    return paramadG.a(this, this, fa(), fb(), fc(), Pe(), true);
  }

  public int fa() {
    return bCO.bC(getX());
  }

  public int fb() {
    return bCO.bC(getY());
  }

  public short fc() {
    return (short)bCO.bD(aCv());
  }

  public void d(float[] paramArrayOfFloat) {
    this.hFo.k(paramArrayOfFloat);
  }

  public dQx Pf()
  {
    return this.bMM;
  }
}