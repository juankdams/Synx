package com.ankamagames.framework.graphics.engine.geometry;

public abstract class GeometryMeshLine extends GeometryMesh
{
  protected float cfH;
  protected boolean cfI;

  public GeometryMeshLine()
  {
    this.cfH = 1.0F;
  }

  public float getLineWidth()
  {
    return this.cfH;
  }

  public void setLineWidth(float paramFloat) {
    this.cfH = paramFloat;
  }

  public boolean aaI() {
    return this.cfI;
  }

  public void be(boolean paramBoolean) {
    this.cfI = paramBoolean;
  }

  protected void gL() {
    super.gL();
    this.cfH = 1.0F;
    this.cfI = false;
  }
}