package com.ankamagames.xulor2.graphics;

import bIQ;
import cdi;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import dmN;

public final class XulorParticleSystem extends ParticleSystem
{
  public XulorParticleSystem()
  {
    super(false);
  }

  public void a(EntityGroup paramEntityGroup)
  {
    double d1 = getX();
    double d2 = getY();

    float f1 = 0.0F;
    float f2 = 0.0F;

    if (this.gFN) {
      f1 = (float)(f1 + d1);
      f2 = (float)(f2 + d2);
    }

    if (bvg() == 0) {
      return;
    }
    paramEntityGroup.d(this);

    for (int i = 0; i < bvg(); i++) {
      GeometryMesh localGeometryMesh = (GeometryMesh)pW(i);
      localGeometryMesh.bIl().clear();
    }

    a(this.hFc, f1, f2, 0);
    cjf();
    this.hFn = null;
  }

  private void a(Particle paramParticle, float paramFloat1, float paramFloat2, int paramInt) {
    if (cje()) {
      return;
    }
    if ((paramParticle != this.hFc) && (paramParticle.bPc > 0.004F)) {
      a(paramParticle, paramParticle.aOR + paramFloat1, paramParticle.aOS + paramFloat2);
    }
    if (paramParticle.gFO == null) {
      return;
    }
    Emitter[] arrayOfEmitter = paramParticle.gFO;
    int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
      Emitter localEmitter = arrayOfEmitter[i];
      bIQ localbIQ = localEmitter.cRq;
      if (localbIQ != null)
      {
        int k = localbIQ.size();
        int m;
        Particle localParticle;
        if (localEmitter.cRs.gFN)
          for (m = 0; m < k; m++) {
            localParticle = localbIQ.tb(m);
            a(localParticle, paramParticle.aOR + paramFloat1, paramParticle.aOS + paramFloat2, paramInt + 1);
          }
        else
          for (m = 0; m < k; m++) {
            localParticle = localbIQ.tb(m);
            a(localParticle, paramFloat1, paramFloat2, paramInt + 1);
          }
      }
    }
  }

  public void de(boolean paramBoolean)
  {
    this.hFo = cdi.cgh();
  }
}