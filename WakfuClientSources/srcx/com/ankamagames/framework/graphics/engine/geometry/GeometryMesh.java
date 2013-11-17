package com.ankamagames.framework.graphics.engine.geometry;

import bSr;
import cSb;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.material.Material;
import dUU;
import java.nio.FloatBuffer;
import java.util.Arrays;

public abstract class GeometryMesh extends Geometry
{
  protected dUU UJ;
  protected VertexBufferPCT aVY;
  protected cSb gnB;
  protected float[] dMd;
  protected int gnC;
  private static final float[] gnD = new float[4];

  protected GeometryMesh()
  {
    this.gnB = cSb.kEl;
  }

  public void a(cSb paramcSb, int paramInt, dUU paramdUU)
  {
    this.gnB = paramcSb;

    if (this.aVY != null) {
      this.aVY.axl();
    }

    if ((!bB) && (paramInt > paramdUU.dvg())) throw new AssertionError();
    this.UJ = paramdUU;
    this.aVY = VertexBufferPCT.gNI.zN(paramInt);

    b(this.aVY);
  }

  public void a(cSb paramcSb, VertexBufferPCT paramVertexBufferPCT, dUU paramdUU) {
    this.gnB = paramcSb;

    paramVertexBufferPCT.gQ();

    if (this.aVY != null) {
      this.aVY.axl();
    }
    this.aVY = paramVertexBufferPCT;
    this.UJ = paramdUU;

    b(this.aVY);
  }

  public void a(cSb paramcSb, VertexBufferPCT paramVertexBufferPCT, dUU paramdUU, float[] paramArrayOfFloat) {
    this.gnB = paramcSb;

    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    if ((!bB) && (this.UJ != null)) throw new AssertionError();

    this.aVY = paramVertexBufferPCT;
    this.UJ = paramdUU;

    this.aVY.gQ();

    bIn();
    int i = paramVertexBufferPCT.bSV();
    if (i != 0)
      c(paramArrayOfFloat, i);
  }

  public final VertexBufferPCT bIl()
  {
    return this.aVY;
  }

  public final cSb bIm() {
    return this.gnB;
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (this.aVY == null) {
      return;
    }
    if (this.aVY.bSQ() == null) {
      return;
    }
    gnD[0] = paramFloat1;
    gnD[1] = paramFloat2;
    gnD[2] = paramFloat3;
    gnD[3] = paramFloat4;
    for (int i = 0; i < this.aVY.bSV(); i++) {
      this.aVY.f(i, gnD);
    }

    b(this.aVY);
  }

  public void b(Material paramMaterial)
  {
    int i = this.aVY.bSV();

    if (this.gnC != i) {
      return;
    }
    float[] arrayOfFloat1 = paramMaterial.dvD();
    float[] arrayOfFloat2 = paramMaterial.dvE();
    this.aVY.bST();
    for (int j = 0; j < i; j++) {
      gnD[0] = (this.dMd[(j * 4)] * arrayOfFloat1[0] + arrayOfFloat2[0]);
      gnD[1] = (this.dMd[(j * 4 + 1)] * arrayOfFloat1[1] + arrayOfFloat2[1]);
      gnD[2] = (this.dMd[(j * 4 + 2)] * arrayOfFloat1[2] + arrayOfFloat2[2]);
      gnD[3] = (this.dMd[(j * 4 + 3)] * arrayOfFloat1[3]);

      this.aVY.D(gnD);
    }
  }

  public void M(float paramFloat)
  {
  }

  public abstract void a(bSr parambSr);

  public static int a(cSb paramcSb, int paramInt)
  {
    switch (aVX.eey[paramcSb.ordinal()]) {
    case 1:
      return paramInt * 2;
    case 2:
      return 2 + (paramInt - 1);
    case 3:
      return paramInt;
    case 4:
      return paramInt * 4;
    case 5:
      return paramInt * 3;
    case 6:
    case 7:
      return 3 + (paramInt - 1);
    }
    return 0;
  }

  protected void gL()
  {
    super.gL();
    this.gnB = cSb.kEl;
  }

  protected void gM()
  {
    if (this.aVY != null) {
      this.aVY.axl();
      this.aVY = null;
    }

    this.UJ = null;

    bIn();
    this.dMd = null;
  }

  private void b(VertexBufferPCT paramVertexBufferPCT)
  {
    int i = paramVertexBufferPCT.bSV();
    if (i == 0) {
      bIn();
      return;
    }

    bIn();

    FloatBuffer localFloatBuffer = paramVertexBufferPCT.bSQ();
    rO(i);
    localFloatBuffer.get(this.dMd);
  }

  private void bIn() {
    this.gnC = 0;
  }

  protected void rO(int paramInt) {
    int i = paramInt * 4;
    if ((this.dMd == null) || (this.dMd.length != i)) {
      float[] arrayOfFloat = new float[i];
      if (this.dMd != null) {
        System.arraycopy(this.dMd, 0, arrayOfFloat, 0, Math.min(this.dMd.length, arrayOfFloat.length));
        for (int j = this.dMd.length; j < i; j++)
          arrayOfFloat[j] = 0.0F;
      }
      else {
        Arrays.fill(arrayOfFloat, 0.0F);
      }
      this.dMd = arrayOfFloat;
    }
    this.gnC = paramInt;
  }

  public final void c(float[] paramArrayOfFloat, int paramInt) {
    rO(paramInt);
    System.arraycopy(paramArrayOfFloat, 0, this.dMd, 0, paramInt * 4);
  }
}