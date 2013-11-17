package com.ankamagames.framework.graphics.engine.particleSystem;

class ParticleSystem$1 extends Particle
{
  ParticleSystem$1(ParticleSystem paramParticleSystem)
  {
  }

  public float getX()
  {
    return this.gFN ? 0.0F : this.dxU.getX();
  }

  public float getY()
  {
    return this.gFN ? 0.0F : this.dxU.getY();
  }

  public float aCv()
  {
    return this.gFN ? 0.0F : this.dxU.aCv();
  }
}