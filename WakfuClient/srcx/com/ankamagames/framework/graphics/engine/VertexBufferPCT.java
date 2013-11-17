package com.ankamagames.framework.graphics.engine;

import Jh;
import akE;
import cJX;
import dUU;
import java.nio.FloatBuffer;

public final class VertexBufferPCT extends akE
{
  public static final int gNE = 2;
  public static final int gNF = 4;
  public static final int gNG = 2;
  public static final int gNH = 8;
  public static final VertexBufferPCT.ObjectFactory gNI = new VertexBufferPCT.ObjectFactory();
  private Jh gNJ;
  private Jh gNK;
  private Jh gNL;
  private FloatBuffer gNM;
  private FloatBuffer gNN;
  private FloatBuffer gNO;
  private int gNP;
  private int gNQ;
  private float[] gNR;
  private float[] gNS;
  private float[] gNT;
  private int p;
  private int c;
  private int gNU;

  private void init(int paramInt)
  {
    this.gNQ = 0;
    this.gNP = 0;
    setSize(paramInt);
    if ((!bB) && (paramInt > dUU.mtc.dvg())) throw new AssertionError(); 
  }

  private void setSize(int paramInt)
  {
    if (this.gNJ != null)
      this.gNJ.release();
    if (this.gNK != null)
      this.gNK.release();
    if (this.gNL != null) {
      this.gNL.release();
    }
    this.gNQ = paramInt;

    cJX localcJX = cJX.cDN();
    int i = 4 * this.gNQ;
    this.gNJ = localcJX.yb(i * 2);
    this.gNK = localcJX.yb(i * 4);
    this.gNL = localcJX.yb(i * 2);

    this.gNM = ((FloatBuffer)this.gNJ.getBuffer());
    this.gNN = ((FloatBuffer)this.gNK.getBuffer());
    this.gNO = ((FloatBuffer)this.gNL.getBuffer());
  }

  public final void clear() {
    this.gNP = 0;
  }

  public final FloatBuffer bSP() {
    this.gNM.rewind();
    return this.gNM;
  }

  public final FloatBuffer bSQ() {
    this.gNN.rewind();
    return this.gNN;
  }

  public final FloatBuffer bSR() {
    this.gNO.rewind();
    return this.gNO;
  }

  public final void bSS() {
    this.gNM.rewind();
  }

  public final void z(float[] paramArrayOfFloat) {
    this.gNM.put(paramArrayOfFloat);
  }

  public final void A(float[] paramArrayOfFloat) {
    this.gNM.rewind();
    this.gNM.put(paramArrayOfFloat);
  }

  public final void B(float[] paramArrayOfFloat) {
    this.gNM.position(this.gNP * 2);
    this.gNM.put(paramArrayOfFloat);
  }

  public final void d(float[] paramArrayOfFloat, int paramInt) {
    if ((!bB) && (paramInt > paramArrayOfFloat.length)) throw new AssertionError();
    this.gNM.position(this.gNP * 2);
    this.gNM.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void e(float[] paramArrayOfFloat, int paramInt) {
    this.gNM.rewind();
    this.gNM.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void C(float[] paramArrayOfFloat) {
    this.gNN.position(this.gNP * 4);
    this.gNN.put(paramArrayOfFloat);
  }

  public final void f(float[] paramArrayOfFloat, int paramInt) {
    if ((!bB) && (paramInt > paramArrayOfFloat.length)) throw new AssertionError();
    this.gNN.position(this.gNP * 4);
    this.gNN.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void bST() {
    this.gNN.rewind();
  }

  public final void D(float[] paramArrayOfFloat) {
    this.gNN.put(paramArrayOfFloat);
  }

  public final void E(float[] paramArrayOfFloat) {
    this.gNN.rewind();
    this.gNN.put(paramArrayOfFloat);
  }

  public final void g(float[] paramArrayOfFloat, int paramInt) {
    this.gNN.rewind();
    this.gNN.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void F(float[] paramArrayOfFloat) {
    this.gNO.position(this.gNP * 2);
    this.gNO.put(paramArrayOfFloat);
  }

  public final void h(float[] paramArrayOfFloat, int paramInt) {
    if ((!bB) && (paramInt > paramArrayOfFloat.length)) throw new AssertionError();
    this.gNO.position(this.gNP * 2);
    this.gNO.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void G(float[] paramArrayOfFloat) {
    this.gNO.rewind();
    this.gNO.put(paramArrayOfFloat);
  }

  public final void i(float[] paramArrayOfFloat, int paramInt) {
    this.gNO.rewind();
    this.gNO.put(paramArrayOfFloat, 0, paramInt);
  }

  public final void a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.gNN.position(paramInt * 4);
    this.gNN.put(paramFloat1);
    this.gNN.put(paramFloat2);
    this.gNN.put(paramFloat3);
    this.gNN.put(paramFloat4);
  }

  public final void f(int paramInt, float[] paramArrayOfFloat) {
    this.gNN.position(paramInt * 4);
    this.gNN.put(paramArrayOfFloat);
  }

  public final void H(float[] paramArrayOfFloat) {
    this.gNN.rewind();
    this.gNN.put(paramArrayOfFloat);
  }

  public final void bSU() {
    this.gNO.rewind();
  }

  public final void I(float[] paramArrayOfFloat) {
    this.gNO.put(paramArrayOfFloat);
  }

  public final void c(int paramInt, float paramFloat1, float paramFloat2) {
    this.gNO.position(paramInt * 2);
    this.gNO.put(paramFloat1);
    this.gNO.put(paramFloat2);
  }

  public final void d(int paramInt, float paramFloat1, float paramFloat2) {
    this.gNM.position(paramInt * 2);
    this.gNM.put(paramFloat1);
    this.gNM.put(paramFloat2);
  }

  public final void g(int paramInt, float[] paramArrayOfFloat) {
    this.gNM.position(paramInt * 2);
    this.gNM.put(paramArrayOfFloat);
  }

  public final void Dv() {
    this.gNM.limit(this.gNP * 2);
    this.gNN.limit(this.gNP * 4);
    this.gNO.limit(this.gNP * 2);

    this.gNQ = this.gNP;
  }

  public final void tg(int paramInt) {
    if ((!bB) && (this.gNP > this.gNQ)) throw new AssertionError();
    this.gNP = paramInt;
  }

  public final int bSV() {
    return this.gNP;
  }

  public final int bSW() {
    return this.gNQ;
  }

  protected void gL()
  {
    this.gNQ = 0;
    this.gNP = 0;
  }

  protected void gM() {
    if (this.gNJ != null) {
      this.gNJ.release();
      this.gNJ = null;
    }

    if (this.gNK != null) {
      this.gNK.release();
      this.gNK = null;
    }

    if (this.gNL != null) {
      this.gNL.release();
      this.gNL = null;
    }

    this.gNN = null;
    this.gNM = null;
    this.gNO = null;

    this.p = 0;
    this.c = 0;
    this.gNU = 0;
    this.gNR = null;
    this.gNS = null;
    this.gNT = null;
  }

  public final void begin()
  {
    if (this.gNR == null) {
      if ((!bB) && (this.gNS != null)) throw new AssertionError();
      if ((!bB) && (this.gNT != null)) throw new AssertionError();

      this.gNR = new float[this.gNQ * 2];
      this.gNS = new float[this.gNQ * 4];
      this.gNT = new float[this.gNQ * 2];
    }
    this.gNP = 0;
    this.gNM.rewind();
    this.gNN.rewind();
    this.gNO.rewind();

    this.p = 0;
    this.c = 0;
    this.gNU = 0;
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat) {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8) {
    this.gNR[(this.p++)] = paramFloat1;
    this.gNR[(this.p++)] = paramFloat2;

    this.gNS[(this.c++)] = paramFloat5;
    this.gNS[(this.c++)] = paramFloat6;
    this.gNS[(this.c++)] = paramFloat7;
    this.gNS[(this.c++)] = paramFloat8;

    this.gNT[(this.gNU++)] = paramFloat3;
    this.gNT[(this.gNU++)] = paramFloat4;
    this.gNP += 1;
    if ((!bB) && (this.gNP > this.gNQ)) throw new AssertionError(); 
  }

  public final void end()
  {
    this.gNM.put(this.gNR, 0, this.p);
    this.gNN.put(this.gNS, 0, this.c);
    this.gNO.put(this.gNT, 0, this.gNU);

    if ((!bB) && (this.gNM.position() % 2 != 0)) throw new AssertionError();
    if ((!bB) && (this.gNM.position() / 2 != this.gNP)) throw new AssertionError();

    if ((!bB) && (this.gNN.position() % 4 != 0)) throw new AssertionError();
    if ((!bB) && (this.gNN.position() / 4 != this.gNP)) throw new AssertionError();

    if ((!bB) && (this.gNO.position() % 2 != 0)) throw new AssertionError();
    if ((!bB) && (this.gNO.position() / 2 != this.gNP)) throw new AssertionError();
  }

  public final void rewind()
  {
    this.gNM.rewind();
    this.gNN.rewind();
    this.gNO.rewind();
    this.gNP = 0;
  }

  public void c(VertexBufferPCT paramVertexBufferPCT) {
    int i = paramVertexBufferPCT.bSV();
    if ((!bB) && (this.gNP + i > this.gNQ)) throw new AssertionError();

    paramVertexBufferPCT.gNM.flip();
    this.gNM.put(paramVertexBufferPCT.gNM);

    paramVertexBufferPCT.gNN.flip();
    this.gNN.put(paramVertexBufferPCT.gNN);

    paramVertexBufferPCT.gNO.flip();
    this.gNO.put(paramVertexBufferPCT.gNO);

    this.gNP += i;
  }
}