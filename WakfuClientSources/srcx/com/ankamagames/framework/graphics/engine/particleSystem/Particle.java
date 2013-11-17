package com.ankamagames.framework.graphics.engine.particleSystem;

import akA;
import akE;
import bIQ;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.sun.opengl.util.texture.TextureCoords;
import cqf;
import dmN;
import java.util.ArrayList;
import qU;

public class Particle extends akE
{
  public static final Particle.ObjectFactory gFA = new Particle.ObjectFactory();
  public float aOR;
  public float aOS;
  public float aOT;
  public float gFB;
  public float gFC;
  public float gFD;
  public float gFE;
  public float gFF;
  public float gFG;
  public float gFH;
  public float gFI;
  public float gFJ;
  public float cAH;
  public float aYg;
  public float aYh;
  public float bOZ;
  public float bPa;
  public float bPb;
  public float bPc;
  public float aYC;
  public float aYD;
  public float aYe;
  public float aYf;
  public float aYy;
  public float aYz;
  public float aYA;
  public float aYB;
  public int gFK;
  public qU gFL;
  public Particle cRr;
  public Emitter gFM;
  public boolean gFN;
  public Emitter[] gFO;

  Particle()
  {
    initialize();
  }

  public void reset() {
    if (this.gFO != null) {
      Emitter[] arrayOfEmitter = this.gFO;
      int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
        Emitter localEmitter = arrayOfEmitter[i];
        localEmitter.clear();
        localEmitter.axl();
      }
      this.gFO = null;
    }
    this.gFL = null;
  }

  public void a(ParticleSystem paramParticleSystem, ArrayList paramArrayList) {
    int i = paramArrayList.size();
    if (this.gFO == null) {
      this.gFO = new Emitter[i];
    }

    if (paramParticleSystem.isEditable()) {
      cqf localcqf = paramParticleSystem.cjl();
      for (int k = 0; k < i; k++) {
        Emitter localEmitter2 = ((dmN)paramArrayList.get(k)).cUn();
        localEmitter2.cRr = this;
        this.gFO[k] = localEmitter2;
        localcqf.a(localEmitter2);
      }
    } else {
      for (int j = 0; j < i; j++) {
        Emitter localEmitter1 = ((dmN)paramArrayList.get(j)).cUn();
        localEmitter1.cRr = this;
        this.gFO[j] = localEmitter1;
      }
    }
  }

  public void a(ParticleSystem paramParticleSystem, float paramFloat)
  {
    this.gFI += paramFloat;

    this.aOR += this.gFE * paramFloat;
    this.aOS += this.gFF * paramFloat;
    this.aOT += this.gFG * paramFloat;

    if ((this.gFL != null) && (this.gFL.isSequence())) {
      localObject = (akA)this.gFL;
      TextureCoords localTextureCoords = ((akA)localObject).iZ((int)(1000.0F * paramFloat));

      this.aYy = localTextureCoords.top();
      this.aYz = localTextureCoords.left();
      this.aYA = localTextureCoords.bottom();
      this.aYB = localTextureCoords.right();
    }

    if (this.gFO == null) {
      return;
    }

    Object localObject = this.gFO;
    int i = 0; for (int j = localObject.length; i < j; i++)
      localObject[i].a(paramParticleSystem, paramFloat);
  }

  public boolean isAlive()
  {
    if ((this.gFI <= this.gFJ) && (this.gFJ != 3.4028235E+38F)) {
      return true;
    }

    if ((this.gFO != null) && 
      (this.cRr == null)) {
      Emitter[] arrayOfEmitter = this.gFO;
      int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
        if (arrayOfEmitter[i].isAlive()) {
          return true;
        }
      }
    }

    return false;
  }

  public void e(ParticleSystem paramParticleSystem) {
    if (this.gFO == null) {
      return;
    }

    Emitter[] arrayOfEmitter = this.gFO;
    int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
      Emitter localEmitter = arrayOfEmitter[i];

      localEmitter.aow();
      int m;
      if (localEmitter.cRp != null) {
        int k = localEmitter.cRp.size();
        for (m = 0; m < k; m++) {
          GeometryMesh localGeometryMesh = (GeometryMesh)localEmitter.cRp.get(m);
          paramParticleSystem.b(localGeometryMesh);
        }
        localEmitter.cRp.clear();
      }

      bIQ localbIQ = localEmitter.cRq;
      if (localbIQ != null) {
        m = 0; for (int n = localbIQ.size(); m < n; m++) {
          localbIQ.tb(m).e(paramParticleSystem);
        }
      }

      localEmitter.axl();
    }
    this.gFO = null;
  }

  public final boolean bIX() {
    return this.gFO != null;
  }

  public float getX() {
    if ((this.gFN) || (this.cRr == null) || (this.cRr.gFN))
      return this.aOR;
    return this.cRr.gFN ? this.cRr.getX() : 0.0F;
  }

  public float getY() {
    if ((this.gFN) || (this.cRr == null) || (this.cRr.gFN))
      return this.aOS;
    return this.cRr.gFN ? this.cRr.getY() : 0.0F;
  }

  public float aCv() {
    if ((this.gFN) || (this.cRr == null) || (this.cRr.gFN))
      return this.aOT;
    return this.cRr.gFN ? this.cRr.aCv() : 0.0F;
  }

  protected void gL()
  {
    initialize();
  }

  protected void gM()
  {
    reset();

    this.cRr = null;
    this.gFM = null;
  }

  private void initialize() {
    this.gFB = (0.0F / 0.0F);
    this.gFC = (0.0F / 0.0F);
    this.gFD = (0.0F / 0.0F);

    this.gFH = 0.0F;
  }
}