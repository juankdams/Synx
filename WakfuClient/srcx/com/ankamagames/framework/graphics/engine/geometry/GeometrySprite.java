package com.ankamagames.framework.graphics.engine.geometry;

import bOo;
import bSr;
import cSb;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.material.Material;
import dUU;
import java.util.Arrays;
import oB;

public abstract class GeometrySprite extends GeometryMesh
{
  private static final float[] eVD = new float[16];
  private static final float[] eVE = new float[8];

  private static final float[] eVF = new float[8];
  private int ia;
  private int ib;
  private float eVG;
  private float eVH;
  private boolean eVI;

  public GeometrySprite()
  {
    this.UJ = dUU.mtb;
    this.gnB = cSb.kEm;

    rO(4);
  }

  public final void i(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, bOo.gTu);
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, bOo parambOo) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.aVY.bSU();
    a(this.aVY, paramFloat1, paramFloat2, paramFloat3, paramFloat4, parambOo);
  }

  public static void a(VertexBufferPCT paramVertexBufferPCT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, bOo parambOo)
  {
    switch (cvA.ihc[parambOo.ordinal()]) {
    case 1:
      eVE[0] = paramFloat2;
      eVE[1] = paramFloat3;
      eVE[2] = paramFloat2;
      eVE[3] = paramFloat1;
      eVE[4] = paramFloat4;
      eVE[5] = paramFloat1;
      eVE[6] = paramFloat4;
      eVE[7] = paramFloat3;
      break;
    case 2:
      eVE[0] = paramFloat4;
      eVE[1] = paramFloat3;
      eVE[2] = paramFloat2;
      eVE[3] = paramFloat3;
      eVE[4] = paramFloat2;
      eVE[5] = paramFloat1;
      eVE[6] = paramFloat4;
      eVE[7] = paramFloat1;
      break;
    case 3:
      eVE[0] = paramFloat4;
      eVE[1] = paramFloat1;
      eVE[2] = paramFloat4;
      eVE[3] = paramFloat3;
      eVE[4] = paramFloat2;
      eVE[5] = paramFloat3;
      eVE[6] = paramFloat2;
      eVE[7] = paramFloat1;
      break;
    case 4:
      eVE[0] = paramFloat2;
      eVE[1] = paramFloat1;
      eVE[2] = paramFloat4;
      eVE[3] = paramFloat1;
      eVE[4] = paramFloat4;
      eVE[5] = paramFloat3;
      eVE[6] = paramFloat2;
      eVE[7] = paramFloat3;
    }

    paramVertexBufferPCT.I(eVE);
  }

  public final void M(float paramFloat1, float paramFloat2) {
    if ((this.eVG != paramFloat1) || (this.eVH != paramFloat2)) {
      this.eVG = paramFloat1;
      this.eVH = paramFloat2;
      bjP();
    }
  }

  public final void setSize(int paramInt1, int paramInt2) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if ((this.ia != paramInt1) || (this.ib != paramInt2)) {
      this.ia = paramInt1;
      this.ib = paramInt2;
      bjP();
    }
  }

  public final void c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if ((this.eVG != paramFloat1) || (this.eVH != paramFloat2) || (this.ia != paramInt1) || (this.ib != paramInt2)) {
      this.eVG = paramFloat1;
      this.eVH = paramFloat2;
      this.ia = paramInt1;
      this.ib = paramInt2;
      bjP();
    }
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");

    for (int i = 0; i < 4; i++) {
      this.dMd[(i * 4)] = paramFloat1;
      this.dMd[(i * 4 + 1)] = paramFloat2;
      this.dMd[(i * 4 + 2)] = paramFloat3;
      this.dMd[(i * 4 + 3)] = paramFloat4;
    }

    this.aVY.bST();
    a(this.aVY, paramFloat1, paramFloat2, paramFloat3, paramFloat4);

    this.eVI = true;
  }

  public static void a(VertexBufferPCT paramVertexBufferPCT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float tmp23_22 = (eVD[8] = eVD[12] = paramFloat1); eVD[4] = tmp23_22; eVD[0] = tmp23_22;
    float tmp49_48 = (eVD[9] = eVD[13] = paramFloat2); eVD[5] = tmp49_48; eVD[1] = tmp49_48;
    float tmp76_75 = (eVD[10] = eVD[14] = paramFloat3); eVD[6] = tmp76_75; eVD[2] = tmp76_75;
    float tmp104_103 = (eVD[11] = eVD[15] = paramFloat4); eVD[7] = tmp104_103; eVD[3] = tmp104_103;

    paramVertexBufferPCT.D(eVD);
  }

  public final void a(oB paramoB, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    int i = paramoB.ordinal();
    this.dMd[(i * 4)] = paramFloat1;
    this.dMd[(i * 4 + 1)] = paramFloat2;
    this.dMd[(i * 4 + 2)] = paramFloat3;
    this.dMd[(i * 4 + 3)] = paramFloat4;
    this.aVY.a(paramoB.ordinal(), paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    this.eVI = false;
  }

  public final void b(Material paramMaterial)
  {
    if (!this.eVI) {
      a(oB.aTO, paramMaterial);
      a(oB.aTN, paramMaterial);
      a(oB.aTQ, paramMaterial);
      a(oB.aTP, paramMaterial);
    } else {
      c(paramMaterial);
    }
  }

  private void c(Material paramMaterial) {
    float[] arrayOfFloat1 = paramMaterial.dvD();
    float[] arrayOfFloat2 = paramMaterial.dvE();
    float f1 = this.dMd[0] * arrayOfFloat1[0] + arrayOfFloat2[0];
    float f2 = this.dMd[1] * arrayOfFloat1[1] + arrayOfFloat2[1];
    float f3 = this.dMd[2] * arrayOfFloat1[2] + arrayOfFloat2[2];
    float f4 = this.dMd[3] * arrayOfFloat1[3];
    float tmp94_93 = (eVD[8] = eVD[12] = f1); eVD[4] = tmp94_93; eVD[0] = tmp94_93;
    float tmp121_120 = (eVD[9] = eVD[13] = f2); eVD[5] = tmp121_120; eVD[1] = tmp121_120;
    float tmp149_148 = (eVD[10] = eVD[14] = f3); eVD[6] = tmp149_148; eVD[2] = tmp149_148;
    float tmp177_176 = (eVD[11] = eVD[15] = f4); eVD[7] = tmp177_176; eVD[3] = tmp177_176;

    this.aVY.H(eVD);
  }

  public void a(oB paramoB, Material paramMaterial) {
    int i = paramoB.ordinal();
    float[] arrayOfFloat1 = paramMaterial.dvD();
    float[] arrayOfFloat2 = paramMaterial.dvE();
    float f1 = this.dMd[(i * 4)] * arrayOfFloat1[0] + arrayOfFloat2[0];
    float f2 = this.dMd[(i * 4 + 1)] * arrayOfFloat1[1] + arrayOfFloat2[1];
    float f3 = this.dMd[(i * 4 + 2)] * arrayOfFloat1[2] + arrayOfFloat2[2];
    float f4 = this.dMd[(i * 4 + 3)] * arrayOfFloat1[3];

    this.aVY.a(i, f1, f2, f3, f4);
  }

  public final float bjH() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVH + this.ia * 0.5F;
  }

  public final float bjI() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVG - this.ib * 0.5F;
  }

  public final float bjJ() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVH;
  }

  public final float bjK() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVH + this.ia;
  }

  public final float bjL() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVG;
  }

  public final float bjM() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.eVG - this.ib;
  }

  public final float bjN() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.ia * 0.5F;
  }

  public final float bjO() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.ib * 0.5F;
  }

  public final int getWidth() {
    return this.ia;
  }

  public final int getHeight() {
    return this.ib;
  }

  public abstract void a(bSr parambSr);

  protected void gL()
  {
    super.gL();

    this.ia = (this.ib = 0);
    this.eVG = (this.eVH = 0.0F);

    if (this.dMd != null)
      Arrays.fill(this.dMd, 1.0F);
    this.eVI = true;

    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    this.aVY = VertexBufferPCT.gNI.zN(4);
  }

  protected void gM()
  {
    this.aVY.axl();
    this.aVY = null;
  }

  private void bjP()
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.aVY.bSS();
    b(this.aVY, this.eVG, this.eVH, this.ia, this.ib);
  }

  public static void b(VertexBufferPCT paramVertexBufferPCT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    float f1 = paramFloat1 - paramFloat4;
    float f2 = paramFloat2 + paramFloat3;

    eVF[0] = paramFloat2;
    eVF[1] = f1;

    eVF[2] = paramFloat2;
    eVF[3] = paramFloat1;

    eVF[4] = f2;
    eVF[5] = paramFloat1;

    eVF[6] = f2;
    eVF[7] = f1;

    paramVertexBufferPCT.z(eVF);
  }
}