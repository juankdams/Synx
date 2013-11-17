package com.ankamagames.framework.kernel.core.maths;

import aIn;
import aYQ;
import akE;
import cEh;
import dSw;
import org.apache.log4j.Logger;

public final class Matrix44 extends akE
{
  public static final Matrix44.ObjectFactory bFc;
  private static final Logger K;
  private static final float[] bFd;
  public static final Matrix44 bFe;
  private final float[] bFf = new float[16];
  private boolean bFg;

  private Matrix44()
  {
  }

  public Matrix44(Matrix44 paramMatrix44)
  {
    a(paramMatrix44);
  }

  public Matrix44(float[] paramArrayOfFloat)
  {
    f(paramArrayOfFloat);
  }

  public Matrix44(aIn paramaIn)
  {
    a(paramaIn);
  }

  public Matrix44(aIn paramaIn, cEh paramcEh)
  {
    a(paramaIn, paramcEh);
  }

  public Matrix44(cEh paramcEh1, cEh paramcEh2, cEh paramcEh3, cEh paramcEh4)
  {
    a(paramcEh1, paramcEh2, paramcEh3, paramcEh4);
  }

  public static Matrix44 Lr()
  {
    Matrix44 localMatrix44 = new Matrix44();
    localMatrix44.Ls();
    return localMatrix44;
  }

  public void d(aYQ paramaYQ) {
    for (int i = 0; i < this.bFf.length; i++) {
      this.bFf[i] = paramaYQ.readFloat();
    }
    this.bFg = false;
  }

  public void b(dSw paramdSw) {
    for (int i = 0; i < this.bFf.length; i++)
      paramdSw.writeFloat(this.bFf[i]);
  }

  public void a(Matrix44 paramMatrix44)
  {
    this.bFg = paramMatrix44.bFg;
    System.arraycopy(paramMatrix44.bFf, 0, this.bFf, 0, this.bFf.length);
  }

  public void f(float[] paramArrayOfFloat)
  {
    if ((!bB) && (paramArrayOfFloat.length < 16)) throw new AssertionError("Buffer length must be at least of 16 float");
    System.arraycopy(paramArrayOfFloat, 0, this.bFf, 0, 16);
    this.bFg = false;
  }

  public void a(aIn paramaIn)
  {
    float f1 = paramaIn.getX() + paramaIn.getX();
    float f2 = paramaIn.getY() + paramaIn.getY();
    float f3 = paramaIn.aCv() + paramaIn.aCv();
    float f4 = paramaIn.getX() * f1;
    float f5 = paramaIn.getX() * f2;
    float f6 = paramaIn.getX() * f3;
    float f7 = paramaIn.getY() * f2;
    float f8 = paramaIn.getY() * f3;
    float f9 = paramaIn.aCv() * f3;
    float f10 = paramaIn.aPI() * f1;
    float f11 = paramaIn.aPI() * f2;
    float f12 = paramaIn.aPI() * f3;

    this.bFf[0] = (1.0F - (f7 + f9));
    this.bFf[1] = (f5 + f12);
    this.bFf[2] = (f6 - f11);
    this.bFf[3] = 0.0F;
    this.bFf[4] = (f5 - f12);
    this.bFf[5] = (1.0F - (f4 + f9));
    this.bFf[6] = (f8 + f10);
    this.bFf[7] = 0.0F;
    this.bFf[8] = (f6 + f11);
    this.bFf[9] = (f8 - f10);
    this.bFf[10] = (1.0F - (f4 + f7));
    this.bFf[11] = 0.0F;
    this.bFf[12] = 0.0F;
    this.bFf[13] = 0.0F;
    this.bFf[14] = 0.0F;
    this.bFf[15] = 1.0F;
    this.bFg = false;
  }

  public void a(aIn paramaIn, cEh paramcEh)
  {
    a(paramaIn);
    d(paramcEh);
    Lu();
    this.bFg = false;
  }

  public void a(aIn paramaIn, cEh paramcEh1, cEh paramcEh2) {
    a(paramaIn);
    d(paramcEh1);
    Lu();

    float f1 = paramcEh2.getX();
    float f2 = paramcEh2.getY();
    float f3 = paramcEh2.aCv();
    if ((f1 != 1.0F) || (f2 != 1.0F) || (f3 != 1.0F)) {
      this.bFf[0] *= f1;
      this.bFf[1] *= f1;
      this.bFf[2] *= f1;
      this.bFf[4] *= f2;
      this.bFf[5] *= f2;
      this.bFf[6] *= f2;
      this.bFf[8] *= f3;
      this.bFf[9] *= f3;
      this.bFf[10] *= f3;
    }
    this.bFg = false;
  }

  public void a(cEh paramcEh1, cEh paramcEh2, cEh paramcEh3, cEh paramcEh4)
  {
    a(paramcEh1);
    b(paramcEh2);
    c(paramcEh3);
    d(paramcEh4);
    this.bFg = false;
  }

  public void a(cEh paramcEh) {
    this.bFf[0] = paramcEh.getX();
    this.bFf[1] = paramcEh.getY();
    this.bFf[2] = paramcEh.aCv();
    this.bFg = false;
  }

  public void b(cEh paramcEh) {
    this.bFf[4] = paramcEh.getX();
    this.bFf[5] = paramcEh.getY();
    this.bFf[6] = paramcEh.aCv();
    this.bFg = false;
  }

  public void c(cEh paramcEh) {
    this.bFf[8] = paramcEh.getX();
    this.bFf[9] = paramcEh.getY();
    this.bFf[10] = paramcEh.aCv();
    this.bFg = false;
  }

  public void d(cEh paramcEh) {
    this.bFf[12] = paramcEh.getX();
    this.bFf[13] = paramcEh.getY();
    this.bFf[14] = paramcEh.aCv();
    this.bFg = false;
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bFf[12] = paramFloat1;
    this.bFf[13] = paramFloat2;
    this.bFf[14] = paramFloat3;
    this.bFg = false;
  }

  public void e(cEh paramcEh) {
    this.bFf[12] += paramcEh.getX();
    this.bFf[13] += paramcEh.getY();
    this.bFf[14] += paramcEh.aCv();
    this.bFg = false;
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3) {
    Lu();

    if ((paramFloat1 != 1.0F) || (paramFloat2 != 1.0F) || (paramFloat3 != 1.0F)) {
      this.bFf[0] *= paramFloat1;
      this.bFf[1] *= paramFloat1;
      this.bFf[2] *= paramFloat1;
      this.bFf[4] *= paramFloat2;
      this.bFf[5] *= paramFloat2;
      this.bFf[6] *= paramFloat2;
      this.bFf[8] *= paramFloat3;
      this.bFf[9] *= paramFloat3;
      this.bFf[10] *= paramFloat3;
    }
  }

  public void f(cEh paramcEh) {
    c(paramcEh.getX(), paramcEh.getY(), paramcEh.aCv());
  }

  public void Ls() {
    try {
      System.arraycopy(bFd, 0, this.bFf, 0, 16);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    float tmp54_53 = (this.bFf[10] = this.bFf[15] = 1.0F); this.bFf[5] = tmp54_53; this.bFf[0] = tmp54_53;
    this.bFg = true;
  }

  public void a(cEh paramcEh1, cEh paramcEh2)
  {
    paramcEh2.h(paramcEh1.getX() * this.bFf[0] + paramcEh1.getY() * this.bFf[4] + paramcEh1.aCv() * this.bFf[8], paramcEh1.getX() * this.bFf[1] + paramcEh1.getY() * this.bFf[5] + paramcEh1.aCv() * this.bFf[9], paramcEh1.getX() * this.bFf[2] + paramcEh1.getY() * this.bFf[6] + paramcEh1.aCv() * this.bFf[10], 0.0F);
  }

  public void b(cEh paramcEh1, cEh paramcEh2)
  {
    paramcEh2.h(paramcEh1.getX() * this.bFf[0] + paramcEh1.getY() * this.bFf[4] + paramcEh1.aCv() * this.bFf[8] + paramcEh1.aPI() * this.bFf[12], paramcEh1.getX() * this.bFf[1] + paramcEh1.getY() * this.bFf[5] + paramcEh1.aCv() * this.bFf[9] + paramcEh1.aPI() * this.bFf[13], paramcEh1.getX() * this.bFf[2] + paramcEh1.getY() * this.bFf[6] + paramcEh1.aCv() * this.bFf[10] + paramcEh1.aPI() * this.bFf[14], paramcEh1.getX() * this.bFf[3] + paramcEh1.getY() * this.bFf[7] + paramcEh1.aCv() * this.bFf[11] + paramcEh1.aPI() * this.bFf[15]);
  }

  public void P(float paramFloat)
  {
    this.bFg = false;
    this.bFf[0] *= paramFloat;
    this.bFf[1] *= paramFloat;
    this.bFf[2] *= paramFloat;
    this.bFf[3] *= paramFloat;
    this.bFf[4] *= paramFloat;
    this.bFf[5] *= paramFloat;
    this.bFf[6] *= paramFloat;
    this.bFf[7] *= paramFloat;
    this.bFf[8] *= paramFloat;
    this.bFf[9] *= paramFloat;
    this.bFf[10] *= paramFloat;
    this.bFf[11] *= paramFloat;
    this.bFf[12] *= paramFloat;
    this.bFf[13] *= paramFloat;
    this.bFf[14] *= paramFloat;
    this.bFf[15] *= paramFloat;
  }

  public void b(Matrix44 paramMatrix44)
  {
    if (this.bFg) {
      paramMatrix44.a(this);
    } else {
      paramMatrix44.bFf[0] = this.bFf[0];
      paramMatrix44.bFf[1] = this.bFf[4];
      paramMatrix44.bFf[2] = this.bFf[8];
      paramMatrix44.bFf[3] = this.bFf[12];
      paramMatrix44.bFf[4] = this.bFf[1];
      paramMatrix44.bFf[5] = this.bFf[5];
      paramMatrix44.bFf[6] = this.bFf[9];
      paramMatrix44.bFf[7] = this.bFf[13];
      paramMatrix44.bFf[8] = this.bFf[2];
      paramMatrix44.bFf[9] = this.bFf[6];
      paramMatrix44.bFf[10] = this.bFf[10];
      paramMatrix44.bFf[11] = this.bFf[14];
      paramMatrix44.bFf[12] = this.bFf[3];
      paramMatrix44.bFf[13] = this.bFf[7];
      paramMatrix44.bFf[14] = this.bFf[11];
      paramMatrix44.bFf[15] = this.bFf[15];
      paramMatrix44.bFg = false;
    }
  }

  public void c(Matrix44 paramMatrix44) {
    this.bFg = false;
    float f1 = this.bFf[0] * paramMatrix44.bFf[0] + this.bFf[1] * paramMatrix44.bFf[4] + this.bFf[2] * paramMatrix44.bFf[8] + this.bFf[3] * paramMatrix44.bFf[12];
    float f2 = this.bFf[0] * paramMatrix44.bFf[1] + this.bFf[1] * paramMatrix44.bFf[5] + this.bFf[2] * paramMatrix44.bFf[9] + this.bFf[3] * paramMatrix44.bFf[13];
    float f3 = this.bFf[0] * paramMatrix44.bFf[2] + this.bFf[1] * paramMatrix44.bFf[6] + this.bFf[2] * paramMatrix44.bFf[10] + this.bFf[3] * paramMatrix44.bFf[14];
    float f4 = this.bFf[0] * paramMatrix44.bFf[3] + this.bFf[1] * paramMatrix44.bFf[7] + this.bFf[2] * paramMatrix44.bFf[11] + this.bFf[3] * paramMatrix44.bFf[15];
    float f5 = this.bFf[4] * paramMatrix44.bFf[0] + this.bFf[5] * paramMatrix44.bFf[4] + this.bFf[6] * paramMatrix44.bFf[8] + this.bFf[7] * paramMatrix44.bFf[12];
    float f6 = this.bFf[4] * paramMatrix44.bFf[1] + this.bFf[5] * paramMatrix44.bFf[5] + this.bFf[6] * paramMatrix44.bFf[9] + this.bFf[7] * paramMatrix44.bFf[13];
    float f7 = this.bFf[4] * paramMatrix44.bFf[2] + this.bFf[5] * paramMatrix44.bFf[6] + this.bFf[6] * paramMatrix44.bFf[10] + this.bFf[7] * paramMatrix44.bFf[14];
    float f8 = this.bFf[4] * paramMatrix44.bFf[3] + this.bFf[5] * paramMatrix44.bFf[7] + this.bFf[6] * paramMatrix44.bFf[11] + this.bFf[7] * paramMatrix44.bFf[15];
    float f9 = this.bFf[8] * paramMatrix44.bFf[0] + this.bFf[9] * paramMatrix44.bFf[4] + this.bFf[10] * paramMatrix44.bFf[8] + this.bFf[11] * paramMatrix44.bFf[12];
    float f10 = this.bFf[8] * paramMatrix44.bFf[1] + this.bFf[9] * paramMatrix44.bFf[5] + this.bFf[10] * paramMatrix44.bFf[9] + this.bFf[11] * paramMatrix44.bFf[13];
    float f11 = this.bFf[8] * paramMatrix44.bFf[2] + this.bFf[9] * paramMatrix44.bFf[6] + this.bFf[10] * paramMatrix44.bFf[10] + this.bFf[11] * paramMatrix44.bFf[14];
    float f12 = this.bFf[8] * paramMatrix44.bFf[3] + this.bFf[9] * paramMatrix44.bFf[7] + this.bFf[10] * paramMatrix44.bFf[11] + this.bFf[11] * paramMatrix44.bFf[15];
    float f13 = this.bFf[12] * paramMatrix44.bFf[0] + this.bFf[13] * paramMatrix44.bFf[4] + this.bFf[14] * paramMatrix44.bFf[8] + this.bFf[15] * paramMatrix44.bFf[12];
    float f14 = this.bFf[12] * paramMatrix44.bFf[1] + this.bFf[13] * paramMatrix44.bFf[5] + this.bFf[14] * paramMatrix44.bFf[9] + this.bFf[15] * paramMatrix44.bFf[13];
    float f15 = this.bFf[12] * paramMatrix44.bFf[2] + this.bFf[13] * paramMatrix44.bFf[6] + this.bFf[14] * paramMatrix44.bFf[10] + this.bFf[15] * paramMatrix44.bFf[14];
    float f16 = this.bFf[12] * paramMatrix44.bFf[3] + this.bFf[13] * paramMatrix44.bFf[7] + this.bFf[14] * paramMatrix44.bFf[11] + this.bFf[15] * paramMatrix44.bFf[15];

    this.bFf[0] = f1;
    this.bFf[1] = f2;
    this.bFf[2] = f3;
    this.bFf[3] = f4;
    this.bFf[4] = f5;
    this.bFf[5] = f6;
    this.bFf[6] = f7;
    this.bFf[7] = f8;
    this.bFf[8] = f9;
    this.bFf[9] = f10;
    this.bFf[10] = f11;
    this.bFf[11] = f12;
    this.bFf[12] = f13;
    this.bFf[13] = f14;
    this.bFf[14] = f15;
    this.bFf[15] = f16;
  }

  public void a(Matrix44 paramMatrix441, Matrix44 paramMatrix442)
  {
    this.bFg = false;
    this.bFf[0] = (paramMatrix441.bFf[0] * paramMatrix442.bFf[0] + paramMatrix441.bFf[1] * paramMatrix442.bFf[4] + paramMatrix441.bFf[2] * paramMatrix442.bFf[8] + paramMatrix441.bFf[3] * paramMatrix442.bFf[12]);
    this.bFf[1] = (paramMatrix441.bFf[0] * paramMatrix442.bFf[1] + paramMatrix441.bFf[1] * paramMatrix442.bFf[5] + paramMatrix441.bFf[2] * paramMatrix442.bFf[9] + paramMatrix441.bFf[3] * paramMatrix442.bFf[13]);
    this.bFf[2] = (paramMatrix441.bFf[0] * paramMatrix442.bFf[2] + paramMatrix441.bFf[1] * paramMatrix442.bFf[6] + paramMatrix441.bFf[2] * paramMatrix442.bFf[10] + paramMatrix441.bFf[3] * paramMatrix442.bFf[14]);
    this.bFf[3] = (paramMatrix441.bFf[0] * paramMatrix442.bFf[3] + paramMatrix441.bFf[1] * paramMatrix442.bFf[7] + paramMatrix441.bFf[2] * paramMatrix442.bFf[11] + paramMatrix441.bFf[3] * paramMatrix442.bFf[15]);
    this.bFf[4] = (paramMatrix441.bFf[4] * paramMatrix442.bFf[0] + paramMatrix441.bFf[5] * paramMatrix442.bFf[4] + paramMatrix441.bFf[6] * paramMatrix442.bFf[8] + paramMatrix441.bFf[7] * paramMatrix442.bFf[12]);
    this.bFf[5] = (paramMatrix441.bFf[4] * paramMatrix442.bFf[1] + paramMatrix441.bFf[5] * paramMatrix442.bFf[5] + paramMatrix441.bFf[6] * paramMatrix442.bFf[9] + paramMatrix441.bFf[7] * paramMatrix442.bFf[13]);
    this.bFf[6] = (paramMatrix441.bFf[4] * paramMatrix442.bFf[2] + paramMatrix441.bFf[5] * paramMatrix442.bFf[6] + paramMatrix441.bFf[6] * paramMatrix442.bFf[10] + paramMatrix441.bFf[7] * paramMatrix442.bFf[14]);
    this.bFf[7] = (paramMatrix441.bFf[4] * paramMatrix442.bFf[3] + paramMatrix441.bFf[5] * paramMatrix442.bFf[7] + paramMatrix441.bFf[6] * paramMatrix442.bFf[11] + paramMatrix441.bFf[7] * paramMatrix442.bFf[15]);
    this.bFf[8] = (paramMatrix441.bFf[8] * paramMatrix442.bFf[0] + paramMatrix441.bFf[9] * paramMatrix442.bFf[4] + paramMatrix441.bFf[10] * paramMatrix442.bFf[8] + paramMatrix441.bFf[11] * paramMatrix442.bFf[12]);
    this.bFf[9] = (paramMatrix441.bFf[8] * paramMatrix442.bFf[1] + paramMatrix441.bFf[9] * paramMatrix442.bFf[5] + paramMatrix441.bFf[10] * paramMatrix442.bFf[9] + paramMatrix441.bFf[11] * paramMatrix442.bFf[13]);
    this.bFf[10] = (paramMatrix441.bFf[8] * paramMatrix442.bFf[2] + paramMatrix441.bFf[9] * paramMatrix442.bFf[6] + paramMatrix441.bFf[10] * paramMatrix442.bFf[10] + paramMatrix441.bFf[11] * paramMatrix442.bFf[14]);
    this.bFf[11] = (paramMatrix441.bFf[8] * paramMatrix442.bFf[3] + paramMatrix441.bFf[9] * paramMatrix442.bFf[7] + paramMatrix441.bFf[10] * paramMatrix442.bFf[11] + paramMatrix441.bFf[11] * paramMatrix442.bFf[15]);
    this.bFf[12] = (paramMatrix441.bFf[12] * paramMatrix442.bFf[0] + paramMatrix441.bFf[13] * paramMatrix442.bFf[4] + paramMatrix441.bFf[14] * paramMatrix442.bFf[8] + paramMatrix441.bFf[15] * paramMatrix442.bFf[12]);
    this.bFf[13] = (paramMatrix441.bFf[12] * paramMatrix442.bFf[1] + paramMatrix441.bFf[13] * paramMatrix442.bFf[5] + paramMatrix441.bFf[14] * paramMatrix442.bFf[9] + paramMatrix441.bFf[15] * paramMatrix442.bFf[13]);
    this.bFf[14] = (paramMatrix441.bFf[12] * paramMatrix442.bFf[2] + paramMatrix441.bFf[13] * paramMatrix442.bFf[6] + paramMatrix441.bFf[14] * paramMatrix442.bFf[10] + paramMatrix441.bFf[15] * paramMatrix442.bFf[14]);
    this.bFf[15] = (paramMatrix441.bFf[12] * paramMatrix442.bFf[3] + paramMatrix441.bFf[13] * paramMatrix442.bFf[7] + paramMatrix441.bFf[14] * paramMatrix442.bFf[11] + paramMatrix441.bFf[15] * paramMatrix442.bFf[15]);
  }

  public void a(Matrix44 paramMatrix441, Matrix44 paramMatrix442, Matrix44 paramMatrix443)
  {
    Matrix44 localMatrix44 = new Matrix44();
    localMatrix44.a(paramMatrix442, paramMatrix443);
    a(paramMatrix441, localMatrix44);
    this.bFg = false;
  }

  public void a(Matrix44 paramMatrix441, Matrix44 paramMatrix442, Matrix44 paramMatrix443, Matrix44 paramMatrix444)
  {
    Matrix44 localMatrix44 = new Matrix44();
    localMatrix44.a(paramMatrix442, paramMatrix443, paramMatrix444);
    a(paramMatrix441, localMatrix44);
    this.bFg = false;
  }

  public float Lt()
  {
    if (this.bFg) {
      return 1.0F;
    }
    float f1 = this.bFf[0] * this.bFf[5] - this.bFf[1] * this.bFf[4];
    float f2 = this.bFf[0] * this.bFf[6] - this.bFf[2] * this.bFf[4];
    float f3 = this.bFf[0] * this.bFf[7] - this.bFf[3] * this.bFf[4];
    float f4 = this.bFf[1] * this.bFf[6] - this.bFf[2] * this.bFf[5];
    float f5 = this.bFf[1] * this.bFf[7] - this.bFf[3] * this.bFf[5];
    float f6 = this.bFf[2] * this.bFf[7] - this.bFf[3] * this.bFf[6];

    float f7 = this.bFf[8] * this.bFf[13] - this.bFf[9] * this.bFf[12];
    float f8 = this.bFf[8] * this.bFf[14] - this.bFf[10] * this.bFf[12];
    float f9 = this.bFf[8] * this.bFf[15] - this.bFf[11] * this.bFf[12];
    float f10 = this.bFf[9] * this.bFf[14] - this.bFf[10] * this.bFf[13];
    float f11 = this.bFf[9] * this.bFf[15] - this.bFf[11] * this.bFf[13];
    float f12 = this.bFf[10] * this.bFf[15] - this.bFf[11] * this.bFf[14];

    return f1 * f12 - f2 * f11 + f3 * f10 + f4 * f9 - f5 * f8 + f6 * f7;
  }

  public boolean d(Matrix44 paramMatrix44)
  {
    if (this.bFg) {
      paramMatrix44.Ls();
      return true;
    }

    float f1 = this.bFf[0] * this.bFf[5] - this.bFf[1] * this.bFf[4];
    float f2 = this.bFf[0] * this.bFf[6] - this.bFf[2] * this.bFf[4];
    float f3 = this.bFf[0] * this.bFf[7] - this.bFf[3] * this.bFf[4];
    float f4 = this.bFf[1] * this.bFf[6] - this.bFf[2] * this.bFf[5];
    float f5 = this.bFf[1] * this.bFf[7] - this.bFf[3] * this.bFf[5];
    float f6 = this.bFf[2] * this.bFf[7] - this.bFf[3] * this.bFf[6];

    float f7 = this.bFf[8] * this.bFf[13] - this.bFf[9] * this.bFf[12];
    float f8 = this.bFf[8] * this.bFf[14] - this.bFf[10] * this.bFf[12];
    float f9 = this.bFf[8] * this.bFf[15] - this.bFf[11] * this.bFf[12];
    float f10 = this.bFf[9] * this.bFf[14] - this.bFf[10] * this.bFf[13];
    float f11 = this.bFf[9] * this.bFf[15] - this.bFf[11] * this.bFf[13];
    float f12 = this.bFf[10] * this.bFf[15] - this.bFf[11] * this.bFf[14];

    float f13 = f1 * f12 - f2 * f11 + f3 * f10 + f4 * f9 - f5 * f8 + f6 * f7;
    if (Math.abs(f13) < 1.0E-005F) {
      return false;
    }
    paramMatrix44.bFf[0] = (this.bFf[5] * f12 - this.bFf[6] * f11 + this.bFf[7] * f10);
    paramMatrix44.bFf[4] = (-this.bFf[4] * f12 + this.bFf[6] * f9 - this.bFf[7] * f8);
    paramMatrix44.bFf[8] = (this.bFf[4] * f11 - this.bFf[5] * f9 + this.bFf[7] * f7);
    paramMatrix44.bFf[12] = (-this.bFf[4] * f10 + this.bFf[5] * f8 - this.bFf[6] * f7);

    paramMatrix44.bFf[1] = (-this.bFf[1] * f12 + this.bFf[2] * f11 - this.bFf[3] * f10);
    paramMatrix44.bFf[5] = (this.bFf[0] * f12 - this.bFf[2] * f9 + this.bFf[3] * f8);
    paramMatrix44.bFf[9] = (-this.bFf[0] * f11 + this.bFf[1] * f9 - this.bFf[3] * f7);
    paramMatrix44.bFf[13] = (this.bFf[0] * f10 - this.bFf[1] * f8 + this.bFf[2] * f7);

    paramMatrix44.bFf[2] = (this.bFf[13] * f6 - this.bFf[14] * f5 + this.bFf[15] * f4);
    paramMatrix44.bFf[6] = (-this.bFf[12] * f6 + this.bFf[14] * f3 - this.bFf[15] * f2);
    paramMatrix44.bFf[10] = (this.bFf[12] * f5 - this.bFf[13] * f3 + this.bFf[15] * f1);
    paramMatrix44.bFf[14] = (-this.bFf[12] * f4 + this.bFf[13] * f2 - this.bFf[14] * f1);

    paramMatrix44.bFf[3] = (-this.bFf[9] * f6 + this.bFf[10] * f5 - this.bFf[11] * f4);
    paramMatrix44.bFf[7] = (this.bFf[8] * f6 - this.bFf[10] * f3 + this.bFf[11] * f2);
    paramMatrix44.bFf[11] = (-this.bFf[8] * f5 + this.bFf[9] * f3 - this.bFf[11] * f1);
    paramMatrix44.bFf[15] = (this.bFf[8] * f4 - this.bFf[9] * f2 + this.bFf[10] * f1);

    paramMatrix44.P(1.0F / f13);

    return true;
  }

  public float[] Fj()
  {
    return this.bFf;
  }

  public void c(int paramInt, float paramFloat) {
    this.bFg = false;
    this.bFf[paramInt] = paramFloat;
  }

  public boolean isIdentity() {
    return this.bFg;
  }

  public boolean e(Matrix44 paramMatrix44) {
    if (paramMatrix44 == this) {
      return true;
    }
    for (int i = 0; i < this.bFf.length; i++) {
      if (this.bFf[i] != paramMatrix44.bFf[i])
        return false;
    }
    return true;
  }

  protected void gL()
  {
    this.bFg = false;
  }

  protected void gM()
  {
  }

  private void Lu()
  {
    this.bFf[3] = 0.0F;
    this.bFf[7] = 0.0F;
    this.bFf[11] = 0.0F;
    this.bFf[15] = 1.0F;
  }

  static
  {
    bFc = new Matrix44.ObjectFactory();

    K = Logger.getLogger(Matrix44.class);

    bFd = new float[16];

    bFe = Lr();

    for (int i = 0; i < 16; i++)
      bFd[i] = 0.0F;
  }
}