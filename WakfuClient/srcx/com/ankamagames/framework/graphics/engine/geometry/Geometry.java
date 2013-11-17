package com.ankamagames.framework.graphics.engine.geometry;

import akE;
import bSr;
import cnQ;
import com.ankamagames.framework.graphics.engine.material.Material;

public abstract class Geometry extends akE
{
  protected cnQ krq;
  protected cnQ krr;

  public final void a(cnQ paramcnQ1, cnQ paramcnQ2)
  {
    this.krq = paramcnQ1;
    this.krr = paramcnQ2;
  }

  public final cnQ cFi() {
    return this.krq;
  }

  public final cnQ cFj() {
    return this.krr;
  }

  public abstract void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);

  public void b(Material paramMaterial)
  {
  }

  public abstract void M(float paramFloat);

  public abstract void a(bSr parambSr);

  public void gL()
  {
    a(cnQ.hUX, cnQ.hUY);
  }
}