package com.ankamagames.baseImpl.graphics.alea.display;

import Ul;
import aEU;
import ajQ;
import akE;
import bSr;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import dsZ;
import java.util.ArrayList;
import java.util.HashSet;
import javax.media.opengl.GL;
import org.apache.log4j.Logger;
import xn;

public class RenderTreeStencil extends akE
  implements xn
{
  public static final RenderTreeStencil.ObjectFactory fjI = new RenderTreeStencil.ObjectFactory();

  protected static final Logger K = Logger.getLogger(RenderTreeStencil.class);
  private Entity fjJ;
  private final ArrayList fjK = new ArrayList(1);
  private final ArrayList fjL = new ArrayList(1);
  private final ArrayList fjM = new ArrayList(1);
  private final ArrayList fjN = new ArrayList();
  private static short fjO = 1;
  private RenderTreeStencil fjP;
  private final ArrayList cUn = new ArrayList();

  public void clear() {
    this.cUn.clear();
    bpJ();
  }

  public void a(Entity paramEntity, int paramInt) {
    if (this.fjJ == null) {
      this.fjJ = paramEntity;
      return;
    }

    RenderTreeStencil localRenderTreeStencil = (RenderTreeStencil)fjI.bQy();
    localRenderTreeStencil.fjJ = paramEntity;
    b(localRenderTreeStencil);
  }

  public void b(Entity paramEntity) {
    this.cUn.add(paramEntity);
  }

  public void a(bSr parambSr)
  {
    dsZ.cZe().kt(false);
    parambSr.aJJ();

    r(parambSr);

    int i = this.cUn.size();
    for (int j = 0; j < i; j++)
      parambSr.a((Ul)this.cUn.get(j));
  }

  public void a(HashSet paramHashSet)
  {
    paramHashSet.addAll(this.fjN);
    paramHashSet.addAll(this.cUn);
    if (this.fjP != null) {
      this.fjP.a(paramHashSet);
    }
    if (this.fjJ != null)
      paramHashSet.add(this.fjJ);
  }

  protected void gL()
  {
  }

  protected void gM()
  {
    clear();
  }

  private void bpJ()
  {
    this.fjK.clear();
    this.fjL.clear();
    this.fjM.clear();
    this.fjN.clear();
    this.fjJ = null;
    this.cUn.clear();
    if (this.fjP != null) {
      this.fjP.bpJ();
      this.fjP.axl();
      this.fjP = null;
    }
    fjO = 254;
  }

  private void r(bSr parambSr) {
    if (this.fjJ == null) {
      return;
    }

    GL localGL = (GL)parambSr.bZk();

    int i = this.fjK.size();
    ajQ localajQ = ajQ.axf();
    Object localObject;
    int m;
    int n;
    RenderTreeStencil localRenderTreeStencil2;
    if (i != 0)
    {
      aEU localaEU = new aEU();
      localaEU.setMask(-2);
      localaEU.dm(true);
      localaEU.mn(7681);
      localaEU.u(512, 2, -1);
      localaEU.dn(false);
      localajQ.a(localGL, localaEU);

      for (k = 0; k < i; k++) {
        localObject = (RenderTreeStencil)this.fjK.get(k);
        parambSr.a(((RenderTreeStencil)localObject).fjJ);

        m = ((RenderTreeStencil)localObject).fjM.size();
        for (n = 0; n < m; n++) {
          localRenderTreeStencil2 = (RenderTreeStencil)((RenderTreeStencil)localObject).fjM.get(n);
          parambSr.a(localRenderTreeStencil2.fjJ);
        }

      }

      localaEU = new aEU();
      localaEU.dm(true);
      localaEU.setMask(0);
      localaEU.u(517, 2, -1);
      localaEU.mn(7680);
      localaEU.dn(true);
      localajQ.a(localGL, localaEU);

      parambSr.a(this.fjJ);

      localajQ.a(localGL, 2);
    } else {
      j = this.fjL.size();
      if (j != 0)
      {
        parambSr.a(this.fjJ);

        k = this.fjM.size();

        localObject = new aEU();
        ((aEU)localObject).dm(true);
        ((aEU)localObject).setMask(-2);
        ((aEU)localObject).mn(7681);
        ((aEU)localObject).u(512, fjO, -1);
        ((aEU)localObject).dn(false);
        localajQ.a(localGL, (aEU)localObject);

        parambSr.a(this.fjJ);

        for (m = 0; m < k; m++) {
          parambSr.a(((RenderTreeStencil)this.fjM.get(m)).fjJ);
        }

        localObject = new aEU();
        ((aEU)localObject).dm(false);
        ((aEU)localObject).setMask(-2);
        ((aEU)localObject).mn(7681);
        ((aEU)localObject).u(512, 0, -1);
        ((aEU)localObject).dn(false);
        localajQ.a(localGL, (aEU)localObject);

        for (m = 0; m < j; m++) {
          n = -1;
          localRenderTreeStencil2 = (RenderTreeStencil)this.fjL.get(m);
          int i1 = localRenderTreeStencil2.fjK.size();
          for (int i2 = 0; i2 < i1; i2++) {
            if (localRenderTreeStencil2.fjK.get(i2) == this) {
              n = i2 + 1;
              break;
            }
          }
          if (n != -1) {
            for (i2 = n; i2 < i1; i2++) {
              RenderTreeStencil localRenderTreeStencil3 = (RenderTreeStencil)localRenderTreeStencil2.fjK.get(i2);
              parambSr.a(localRenderTreeStencil3.fjJ);
              int i3 = localRenderTreeStencil3.fjM.size();
              for (int i4 = 0; i4 < i3; i4++) {
                parambSr.a(((RenderTreeStencil)localRenderTreeStencil3.fjM.get(i4)).fjJ);
              }
            }
          }

        }

        localObject = new aEU();
        ((aEU)localObject).dm(true);
        ((aEU)localObject).setMask(0);
        ((aEU)localObject).mn(7680);
        ((aEU)localObject).u(514, fjO, -2);
        ((aEU)localObject).dn(true);
        localajQ.a(localGL, (aEU)localObject);

        for (m = 0; m < j; m++) {
          RenderTreeStencil localRenderTreeStencil1 = (RenderTreeStencil)this.fjL.get(m);
          parambSr.a(localRenderTreeStencil1.fjJ);
        }

        fjO = (short)(fjO - 2);
        if (fjO <= 2) {
          fjO = 254;
        }

        localajQ.a(localGL, 3);
      } else {
        parambSr.a(this.fjJ);
      }

    }

    int j = this.fjN.size();
    for (int k = 0; k < j; k++) {
      ((Entity)this.fjN.get(k)).a(parambSr);
    }

    if (this.fjP != null)
      this.fjP.r(parambSr);
  }

  private void b(RenderTreeStencil paramRenderTreeStencil)
  {
    Entity localEntity = paramRenderTreeStencil.fjJ;
    if ((this.fjJ.cat > 1.0F) && 
      (localEntity.cat <= 1.0F))
    {
      if ((a(localEntity, this.fjJ, this.fjJ.cat)) && 
        (b(localEntity, this.fjJ))) {
        int i = this.fjK.size();
        for (int j = 0; j < i; j++) {
          RenderTreeStencil localRenderTreeStencil = (RenderTreeStencil)this.fjK.get(j);
          if (localRenderTreeStencil.fjJ.mnQ == localEntity.mnQ)
          {
            if (localRenderTreeStencil.fjJ.mnR == localEntity.mnR)
            {
              paramRenderTreeStencil.fjM.addAll(localRenderTreeStencil.fjM);
              paramRenderTreeStencil.fjM.add(localRenderTreeStencil);
              localRenderTreeStencil.fjM.clear();
              localRenderTreeStencil.fjL.remove(this);
              this.fjK.remove(j);
              break;
            }
          }
        }
        paramRenderTreeStencil.fjL.add(this);
        this.fjK.add(paramRenderTreeStencil);
      }

    }

    if (this.fjP == null) {
      if ((localEntity.cat > 1.0F) || (paramRenderTreeStencil.fjK.size() != 0) || (paramRenderTreeStencil.fjL.size() != 0)) {
        this.fjP = paramRenderTreeStencil;
      } else {
        this.fjN.add(localEntity);
        paramRenderTreeStencil.axl();
      }
    }
    else this.fjP.b(paramRenderTreeStencil);
  }

  private static boolean a(Entity paramEntity1, Entity paramEntity2, float paramFloat)
  {
    if (Math.abs(paramEntity1.mnQ - paramEntity2.mnQ) >= paramFloat) {
      return false;
    }
    if (Math.abs(paramEntity1.mnR - paramEntity2.mnR) >= paramFloat) {
      return false;
    }
    return true;
  }

  private static boolean b(Entity paramEntity1, Entity paramEntity2)
  {
    if ((paramEntity1.mnQ == paramEntity2.mnQ) && (paramEntity1.mnR == paramEntity2.mnR)) {
      return paramEntity1.mnS < paramEntity2.mnS + paramEntity2.hYO;
    }
    return paramEntity1.mnS + paramEntity1.hYO <= paramEntity2.mnS;
  }

  public Entity getEntity() {
    return this.fjJ;
  }

  public RenderTreeStencil bpK() {
    return this.fjP;
  }

  public ArrayList bpL() {
    return this.fjM;
  }

  public ArrayList bpM() {
    return this.fjL;
  }

  public ArrayList bpN() {
    return this.fjK;
  }

  public ArrayList bpO() {
    return this.fjN;
  }
}