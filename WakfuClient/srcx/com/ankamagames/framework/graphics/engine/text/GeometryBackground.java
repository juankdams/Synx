package com.ankamagames.framework.graphics.engine.text;

import aYQ;
import bNa;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import dSw;
import dUU;

public abstract class GeometryBackground extends Geometry
{
  protected float gqr;
  protected float gqs;
  protected short[] gqt;
  protected short[] gqu;
  protected VertexBufferPCT aVY;
  protected dUU UJ;
  protected VertexBufferPCT gqv;
  protected dUU gqw;
  private int ia;
  private int ib;
  private final bNa bPo = new bNa(1.0F, 1.0F, 1.0F, 0.7F);
  private float gqx;
  private float gqy;
  private float gqz;
  private float gqA;
  private float aDg;
  private final bNa aDj = new bNa(0.06F, 0.04F, 0.03F, 0.4F);
  private float gqB;
  private float gqC;
  private float[][] gqD;
  private float[][] gqE;
  private boolean gqF;

  public void b(dSw paramdSw)
  {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public void d(aYQ paramaYQ)
  {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public void M(float paramFloat)
  {
  }

  public final int getWidth() { return this.ia; }

  public final void setWidth(int paramInt)
  {
    if (paramInt == this.ia) {
      return;
    }
    this.ia = paramInt;
    bJh();
  }

  public final int getHeight() {
    return this.ib;
  }

  public final void setHeight(int paramInt) {
    if (paramInt == this.ib) {
      return;
    }
    this.ib = paramInt;
    bJh();
  }

  public float bJb() {
    return this.gqB;
  }

  public void bz(float paramFloat) {
    if (this.gqB == paramFloat) {
      return;
    }
    this.gqB = paramFloat;
    bJh();
  }

  public float bJc() {
    return this.gqC;
  }

  public void bA(float paramFloat) {
    if (this.gqC == paramFloat) {
      return;
    }
    this.gqC = paramFloat;
    bJh();
  }

  public final float getBorderWidth() {
    return this.aDg;
  }

  public final void setBorderWidth(float paramFloat) {
    if (this.aDg == paramFloat) {
      return;
    }
    this.aDg = paramFloat;
    bJh();
  }

  public final bNa getColor() {
    return this.bPo;
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.bPo.k(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    bJh();
  }

  public final bNa getBorderColor() {
    return this.aDj;
  }

  public final void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.aDj.k(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    bJh();
  }

  public final void T(float paramFloat1, float paramFloat2) {
    this.gqr = paramFloat1;
    this.gqs = paramFloat2;
    bJh();
  }

  public final void a(float[][] paramArrayOfFloat1, float[][] paramArrayOfFloat2) {
    if ((!bB) && (paramArrayOfFloat1 == null)) throw new AssertionError("positionOffsets can't be null");
    if ((!bB) && (paramArrayOfFloat2 == null)) throw new AssertionError("sizeMultipliers can't be null");
    if ((!bB) && (paramArrayOfFloat1.length != paramArrayOfFloat2.length)) throw new AssertionError("positionOffsets and sizeMultipliers must have the same size");
    if ((!bB) && (paramArrayOfFloat1.length <= 0)) throw new AssertionError("positionOffsets must be greater than zero");

    if ((!bB) && (paramArrayOfFloat2.length <= 0)) throw new AssertionError("sizeMultipliers must be greater than zero");

    this.gqD = paramArrayOfFloat1;
    this.gqE = paramArrayOfFloat2;
    bJh();
  }

  public final void a(dUU paramdUU) {
    this.gqw = paramdUU;
    bJh();
  }

  public final void b(dUU paramdUU) {
    this.UJ = paramdUU;
    bJh();
  }

  public final void j(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((this.gqx == paramFloat1) && (this.gqy == paramFloat2) && (this.gqz == paramFloat3) && (this.gqA == paramFloat4)) {
      return;
    }
    this.gqx = paramFloat1;
    this.gqy = paramFloat2;
    this.gqz = paramFloat3;
    this.gqA = paramFloat4;
    bJh();
  }

  public final float bJd() {
    return this.gqx;
  }

  public final float bJe() {
    return this.gqy;
  }

  public final float bJf() {
    return this.gqz;
  }

  public final float bJg() {
    return this.gqA;
  }

  protected final void bJh()
  {
    this.gqF = true;
  }

  protected void bJi() {
    if (!this.gqF) {
      return;
    }
    this.gqF = false;

    bJj();

    float f1 = this.ia / this.gqr;
    float f2 = this.ib / this.gqs;

    float f3 = f1 + this.gqx + this.gqy;
    float f4 = f2 + this.gqz + this.gqA;

    float f5 = this.bPo.QC();
    float f6 = this.bPo.QD();
    float f7 = this.bPo.QE();
    float f8 = this.bPo.getAlpha();

    float f9 = this.bPo.QC();
    float f10 = this.bPo.QD();
    float f11 = this.bPo.QE();
    float f12 = this.bPo.getAlpha();

    this.aVY.begin();
    this.gqv.begin();
    for (int i = 0; i < this.gqD.length; i++) {
      float f13 = this.gqD[i][0] + this.gqE[i][0] * f3 + this.gqB;
      float f14 = this.gqD[i][1] + this.gqE[i][1] * f4 + this.gqC;

      this.aVY.a(f13, f14, 0.0F, 0.0F, f5, f6, f7, f8);
      this.gqv.a(f13, f14, 0.0F, 0.0F, f9, f10, f11, f12);
    }

    this.aVY.end();
    this.gqv.end();
  }

  private void bJj() {
    this.aVY = c(this.aVY, this.gqD.length);
    this.gqv = c(this.gqv, this.gqD.length);
  }

  private static VertexBufferPCT c(VertexBufferPCT paramVertexBufferPCT, int paramInt) {
    if (paramVertexBufferPCT == null) {
      return VertexBufferPCT.gNI.zN(paramInt);
    }
    if (paramVertexBufferPCT.bSW() < paramInt) {
      paramVertexBufferPCT.axl();
      return VertexBufferPCT.gNI.zN(paramInt);
    }
    return paramVertexBufferPCT;
  }

  protected void gL()
  {
    super.gL();

    if (this.bPo != null)
      this.bPo.k(1.0F, 1.0F, 1.0F, 0.7F);
    if (this.aDj != null) {
      this.aDj.k(0.06F, 0.04F, 0.03F, 0.4F);
    }
    this.gqx = 0.0F;
    this.gqy = 0.0F;
    this.gqz = 0.0F;
    this.gqA = 0.0F;

    this.gqr = 1.0F;
    this.gqs = 1.0F;
    this.aDg = 1.0F;

    bJh();
  }

  protected void gM()
  {
    bJk();

    this.gqD = ((float[][])null);
    this.gqE = ((float[][])null);

    this.gqt = null;
    this.gqu = null;
  }

  private void bJk()
  {
    if (this.aVY != null) {
      this.aVY.axl();
      this.aVY = null;
    }

    this.UJ = null;

    if (this.gqv != null) {
      this.gqv.axl();
      this.gqv = null;
    }
    this.gqw = null;
  }
}