package com.ankamagames.framework.graphics.engine.opengl.text;

import MD;
import P;
import Sw;
import aYE;
import bNa;
import bSr;
import bsB;
import com.ankamagames.framework.graphics.engine.text.GeometryText;
import dbP;
import hf;
import java.util.ArrayList;

public class GLGeometryText extends GeometryText
{
  public static final GLGeometryText.ObjectFactory lBa = new GLGeometryText.ObjectFactory();
  private P gKX;

  public int f(String paramString)
  {
    return this.gKX.f(paramString);
  }

  public int g(String paramString)
  {
    return this.gKX.g(paramString);
  }

  public MD oz(String paramString)
  {
    return new MD(f(paramString), g(paramString));
  }

  public void a(hf paramhf)
  {
    if (paramhf == this.iIg)
      return;
    Object localObject;
    if (paramhf.getClass() == aYE.class) {
      localObject = (aYE)paramhf;
      if (!Sw.afx().b((aYE)localObject)) {
        Sw.afx().c((aYE)localObject);
      }
      this.gKX = Sw.afx().a((aYE)paramhf);
    } else {
      localObject = bsB.b(paramhf);
      if ((localObject == null) && 
        (!bB)) throw new AssertionError("Currently not implemented");

      this.gKX = ((P)localObject);
    }

    super.a(paramhf);
  }

  public void M(float paramFloat)
  {
  }

  public void a(bSr parambSr)
  {
    if (this.gKX == null) {
      return;
    }
    int i = this.hqr.size();
    if (i == 0) {
      return;
    }
    dbP.cNw().c(this);

    this.gKX.setColor(this.bPo.QC(), this.bPo.QD(), this.bPo.QE(), this.bPo.getAlpha());

    float f1 = this.kGb * this.cas + this.aZs;
    float f2 = (this.kGc + i * this.dQo) * this.cas + this.aZt;

    this.gKX.beginRendering(0, 0);
    for (int j = 0; j < i; j++) {
      char[] arrayOfChar = (char[])this.hqr.get(j);
      f2 -= this.dQo * this.cas;
      this.gKX.a(arrayOfChar, f1, f2, this.cas);
    }
    this.gKX.endRendering();
  }

  protected void gM()
  {
  }
}