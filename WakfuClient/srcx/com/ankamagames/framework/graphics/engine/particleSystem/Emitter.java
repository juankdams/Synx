package com.ankamagames.framework.graphics.engine.particleSystem;

import FA;
import akE;
import auA;
import bCO;
import bIQ;
import dGG;
import dmN;
import java.util.ArrayList;
import qU;

public class Emitter extends akE
{
  public static final Emitter.ObjectFactory cRl = new Emitter.ObjectFactory();
  public float aWl;
  public float cRm;
  public float cRn;
  public boolean bG;
  public boolean cRo;
  public ArrayList cRp;
  public bIQ cRq;
  public Particle cRr;
  public dmN cRs;
  public dGG cRt;
  public Particle cRu;
  private auA cRv;
  private float cRw = 0.0F;

  private Emitter()
  {
    clear();
  }

  public void a(dmN paramdmN) {
    this.cRs = paramdmN;
    a(paramdmN.cRt);
  }

  public void a(ParticleSystem paramParticleSystem, float paramFloat)
  {
    this.aWl += paramFloat;
    int j;
    Object localObject1;
    if (this.cRq != null)
    {
      i = 0; for (j = this.cRq.size(); i < j; i++) {
        localObject1 = this.cRq.tb(i);
        if (!((Particle)localObject1).isAlive()) {
          ((Particle)localObject1).e(paramParticleSystem);
          ((Particle)localObject1).axl();
          this.cRq.remove(i);
        }
      }
      this.cRq.compact();
    }

    if (aov()) {
      b(paramParticleSystem, paramFloat);
    }

    if (this.cRt != null)
    {
      if (this.cRt.dep()) {
        i = this.cRt.deq();
        for (j = 0; j < i; j++) {
          localObject1 = this.cRt.Cn(j);
          ((FA)localObject1).b(paramFloat, this.cRr, this.cRu, paramParticleSystem);
        }
      }

      if (this.cRt.den()) {
        i = this.cRt.deo();
        for (j = 0; j < i; j++) {
          localObject1 = this.cRt.Cm(j);
          ((FA)localObject1).b(0.03F, this.cRr, this.cRu, paramParticleSystem);
        }
      }

      this.cRv.a(paramFloat, this, paramParticleSystem);
    }

    if (this.cRq == null) {
      return;
    }

    int i = this.cRq.size();
    int k;
    Object localObject2;
    if (this.cRs.den()) {
      if (i != 0) {
        this.cRm += paramFloat;
      }
      j = this.cRs.deo();

      while (this.cRm >= 0.03F) {
        for (k = 0; k < i; k++) {
          localObject2 = this.cRq.tb(k);
          float f = ((Particle)localObject2).gFI;
          ((Particle)localObject2).gFI = ((Particle)localObject2).gFH;
          if (((Particle)localObject2).gFH <= ((Particle)localObject2).gFJ) {
            for (int n = 0; n < j; n++) {
              FA localFA = this.cRs.Cm(n);
              localFA.b(0.03F, this.cRr, (Particle)localObject2, paramParticleSystem);
            }
          }
          localObject2.gFH += 0.03F;
          ((Particle)localObject2).gFI = f;
        }

        this.cRm -= 0.03F;
      }
    }
    if (this.cRs.dep()) {
      j = this.cRs.deq();
      for (k = 0; k < j; k++)
      {
        localObject2 = this.cRs.Cn(k);
        for (int m = i - 1; (m >= 0) && 
          (!((FA)localObject2).b(paramFloat, this.cRr, this.cRq.tb(m), paramParticleSystem)); m--);
      }

      for (k = 0; k < i; k++)
        this.cRq.tb(k).a(paramParticleSystem, paramFloat);
    }
    else
    {
      for (j = 0; j < i; j++)
        this.cRq.tb(j).a(paramParticleSystem, paramFloat);
    }
  }

  public boolean isAlive()
  {
    if (aou()) {
      return true;
    }

    if (aov()) {
      return true;
    }

    if (this.cRq == null) {
      return false;
    }

    int i = this.cRq.size();
    for (int j = 0; j < i; j++) {
      Particle localParticle = this.cRq.tb(j);
      if (localParticle.gFI < localParticle.gFJ) {
        return true;
      }
      if (localParticle.bIX()) {
        Emitter[] arrayOfEmitter = localParticle.gFO;
        int k = 0; for (int m = arrayOfEmitter.length; k < m; k++) {
          if (arrayOfEmitter[k].isAlive()) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean aou() {
    return this.aWl < this.cRs.lkQ;
  }

  public boolean aov()
  {
    if ((this.cRr != null) && (this.cRr.gFI <= 0.0F)) {
      return false;
    }

    if (this.cRo) {
      return false;
    }
    if (!this.bG) {
      return false;
    }

    if (this.aWl < this.cRs.lkQ) {
      return false;
    }
    if ((this.cRs.lkR != 0.0F) && (this.aWl > this.cRs.lkR)) {
      return false;
    }
    return true;
  }

  public void b(ParticleSystem paramParticleSystem, float paramFloat) {
    if (this.cRs.aVV == 0.0F) {
      return;
    }

    this.cRn += paramFloat;
    float f = this.cRs.aVV + this.cRw;
    if (this.cRq == null) {
      this.cRq = new bIQ(this.cRs.lkS);
    } else {
      if (this.cRn < f) {
        return;
      }

      if (this.cRq.isFull()) {
        return;
      }
      this.cRn -= f;
    }

    this.cRw = (this.cRs.lkU * bCO.bLk());

    for (int i = 0; i < this.cRs.lkT; i++) {
      int j = this.cRs.cUm();
      if (j >= 0)
      {
        qU localqU = (qU)this.cRs.lkP.get(j);
        if (localqU != null)
        {
          Particle localParticle = localqU.a(paramParticleSystem);
          if (localParticle != null)
          {
            this.cRq.d(localParticle);
            localParticle.gFK = j;
            localParticle.gFM = this;
            this.cRs.a(paramParticleSystem, this.cRr, localParticle);
            localqU.a(localParticle);

            if (localParticle.bIX()) {
              Emitter[] arrayOfEmitter = localParticle.gFO;
              int k = 0; for (int m = arrayOfEmitter.length; k < m; k++) {
                Emitter localEmitter = arrayOfEmitter[k];
                if (localEmitter.aov()) {
                  localEmitter.b(paramParticleSystem, paramFloat);
                }
              }
            }
            if (this.cRq.isFull()) break; 
          }
        }
      }
    }
  }

  public void bM(boolean paramBoolean) { this.cRo = paramBoolean;

    if (this.cRq == null) {
      return;
    }

    int i = this.cRq.size();
    for (int j = 0; j < i; j++) {
      Particle localParticle = this.cRq.tb(j);
      if (localParticle.bIX())
      {
        int k = 0; for (int m = localParticle.gFO.length; k < m; k++) {
          Emitter localEmitter = localParticle.gFO[k];
          localEmitter.bM(paramBoolean);
        }
      }
    } }

  public void reset() {
    if (this.cRq != null) {
      int i = this.cRq.size();
      for (int j = 0; j < i; j++) {
        Particle localParticle = this.cRq.tb(j);
        if (localParticle.bIX()) {
          Emitter[] arrayOfEmitter = localParticle.gFO;
          int k = 0; for (int m = arrayOfEmitter.length; k < m; k++) {
            arrayOfEmitter[k].reset();
          }
        }
        localParticle.axl();
      }
      this.cRq.clear();
    }

    if (this.cRu != null) {
      this.cRu.aOR = 0.0F;
      this.cRu.aOS = 0.0F;
      this.cRu.aOT = 0.0F;
      this.cRu.gFE = 0.0F;
      this.cRu.gFF = 0.0F;
      this.cRu.gFG = 0.0F;
      this.cRu.gFI = 0.0F;
      this.cRu.gFJ = 0.0F;
    }

    this.aWl = 0.0F;
    this.bG = true;
    this.cRo = false;
    this.cRn = 0.0F;
  }

  public void clear() {
    if (this.cRq != null) {
      int i = this.cRq.size();
      for (int j = 0; j < i; j++) {
        Particle localParticle = this.cRq.tb(j);
        if (localParticle.bIX()) {
          Emitter[] arrayOfEmitter = localParticle.gFO;
          int k = 0; for (int m = arrayOfEmitter.length; k < m; k++) {
            arrayOfEmitter[k].clear();
          }
        }

        localParticle.axl();
      }
      this.cRq.clear();
      this.cRq = null;
    }

    if (this.cRp != null) {
      this.cRp.clear();
      this.cRp = null;
    }
    a(null);

    this.aWl = 0.0F;
    this.cRm = 0.0F;
    this.bG = true;
    this.cRo = false;
    this.cRn = 0.0F;
    this.cRw = 0.0F;
    this.cRr = null;
    this.cRs = null;
  }

  public void aow() {
    if ((this.cRt == null) || (this.cRv == null)) {
      return;
    }
    this.cRv.unregister();
    this.cRv = null;
  }

  public void a(dGG paramdGG) {
    if (paramdGG == this.cRt) {
      return;
    }

    if (this.cRv != null) {
      this.cRv.unregister();
      this.cRv = null;
      this.cRu.reset();
      this.cRu.axl();
      this.cRu = null;
    }
    this.cRt = paramdGG;
    if (this.cRt != null) {
      this.cRv = this.cRt.dhz();
      this.cRv.register();
      this.cRu = this.cRt.dhA();
      this.cRs.a(this.cRr, this.cRu);

      this.cRu.gFJ -= 0.1F;
      this.cRu.cRr = this.cRr;
    }
  }

  protected void gL()
  {
  }

  protected void gM()
  {
    clear();
  }
}