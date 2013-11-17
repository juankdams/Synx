package com.ankamagames.framework.graphics.engine.material;

import Yr;
import akE;

public final class Material extends akE
{
  private static final int mwt = 0;
  private static final int mwu = 4;
  private static final int mwv = 4;
  private static final int mww = 3;
  private static final int mwx = 7;
  public static final Material mwy;
  public static final Material mwz;
  public static final Material mwA;
  private static final float[] mwB = { 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F };

  private static final Yr mwC = new Yr(15000);
  private static float[] dMd = new float[7 * mwC.getSize()];

  public static final Material.ObjectFactory mwD = new Material.ObjectFactory();
  private final Object dGD = new Object();
  private int m_index;
  private final float[] mwE = new float[4];

  private final float[] mwF = new float[3];

  public float[] dvD()
  {
    S(this.mwE);
    return this.mwE;
  }

  public float[] dvE()
  {
    X(this.mwF);
    return this.mwF;
  }

  public void e(Material paramMaterial)
  {
    System.arraycopy(dMd, paramMaterial.m_index, dMd, this.m_index, 7);
  }

  public void S(float[] paramArrayOfFloat) {
    System.arraycopy(dMd, 0 + this.m_index, paramArrayOfFloat, 0, 4);
  }

  public boolean T(float[] paramArrayOfFloat) {
    int i = 0 + this.m_index;
    return (dMd[i] == paramArrayOfFloat[0]) && (dMd[(i + 1)] == paramArrayOfFloat[1]) && (dMd[(i + 2)] == paramArrayOfFloat[2]) && (dMd[(i + 3)] == paramArrayOfFloat[3]);
  }

  public void U(float[] paramArrayOfFloat)
  {
    System.arraycopy(dMd, 0 + this.m_index, paramArrayOfFloat, 0, 4);
  }

  public void V(float[] paramArrayOfFloat) {
    System.arraycopy(paramArrayOfFloat, 0, dMd, 0 + this.m_index, 4);
  }

  public void W(float[] paramArrayOfFloat) {
    System.arraycopy(paramArrayOfFloat, 0, dMd, 0 + this.m_index, 3);
  }

  public void x(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    int i = 0 + this.m_index;
    dMd[i] = paramFloat1;
    dMd[(i + 1)] = paramFloat2;
    dMd[(i + 2)] = paramFloat3;
    dMd[(i + 3)] = paramFloat4;
  }

  public void E(float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = 0 + this.m_index;
    dMd[i] *= paramFloat1;
    dMd[(i + 1)] *= paramFloat2;
    dMd[(i + 2)] *= paramFloat3;
  }

  public void X(float[] paramArrayOfFloat) {
    System.arraycopy(dMd, 4 + this.m_index, paramArrayOfFloat, 0, 3);
  }

  public boolean Y(float[] paramArrayOfFloat) {
    int i = 4 + this.m_index;
    return (dMd[i] == paramArrayOfFloat[0]) && (dMd[(i + 1)] == paramArrayOfFloat[1]) && (dMd[(i + 2)] == paramArrayOfFloat[2]);
  }

  public void Z(float[] paramArrayOfFloat) {
    System.arraycopy(dMd, 4 + this.m_index, paramArrayOfFloat, 0, 3);
  }

  public void aa(float[] paramArrayOfFloat) {
    System.arraycopy(paramArrayOfFloat, 0, dMd, 4 + this.m_index, 3);
  }

  public void F(float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = 4 + this.m_index;
    dMd[i] = paramFloat1;
    dMd[(i + 1)] = paramFloat2;
    dMd[(i + 2)] = paramFloat3;
  }

  public boolean f(Material paramMaterial) {
    if (paramMaterial.m_index == this.m_index) {
      return true;
    }
    int i = this.m_index;
    int j = paramMaterial.m_index;
    for (int k = 0; k < 7; k++)
      if (dMd[(k + i)] != dMd[(k + j)])
        return false;
    return true;
  }

  protected void gL()
  {
    synchronized (this.dGD) {
      int i = mwC.ajZ();
      if (i == -1) {
        resize();
        i = mwC.ajZ();
      }
      this.m_index = (i * 7);
      System.arraycopy(mwB, 0, dMd, this.m_index, 7);
    }
  }

  protected void gM()
  {
    synchronized (this.dGD) {
      mwC.hq(this.m_index / 7);
    }
  }

  private static void resize() {
    mwC.resize(mwC.getSize() + 1000);
    float[] arrayOfFloat = dMd;
    dMd = new float[7 * mwC.getSize()];
    System.arraycopy(arrayOfFloat, 0, dMd, 0, arrayOfFloat.length);
  }

  static
  {
    mwy = (Material)mwD.bQx();
    mwy.x(1.0F, 1.0F, 1.0F, 1.0F);
    mwy.F(1.0F, 1.0F, 1.0F);

    mwz = (Material)mwD.bQx();
    mwz.x(1.0F, 1.0F, 1.0F, 1.0F);
    mwz.F(0.0F, 0.0F, 0.0F);

    mwA = (Material)mwD.bQx();
    mwA.x(0.0F, 0.0F, 0.0F, 1.0F);
    mwA.F(0.0F, 0.0F, 0.0F);
  }
}