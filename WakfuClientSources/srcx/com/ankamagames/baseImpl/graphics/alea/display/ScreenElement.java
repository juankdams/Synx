package com.ankamagames.baseImpl.graphics.alea.display;

import aYQ;
import akE;
import cYk;
import cid;
import crO;
import dLw;
import dQx;
import dSw;
import dsw;
import org.apache.log4j.Logger;

public class ScreenElement extends akE
{
  private static final Logger K;
  public static final ScreenElement.ObjectFactory lHn;
  public byte bkM;
  public short fdo;
  public int lHo;
  public int lHp;
  public int dKv;
  public int dKx;
  public cid lHq;
  public int lHr;
  public byte io;
  public int bMK;
  public short fiz;
  public int aVh;
  boolean ip;
  public long lGL;
  public float[] dMd;
  private static final float[] dcz;
  private static final float lHs = 0.5F;
  private static final float lHt = 1.0F;
  public static final int lHu = 1;
  public static final int hSh = 2;
  public static final int lHv = 4;
  private static final int[] lHw;

  private ScreenElement()
  {
  }

  public ScreenElement(byte paramByte)
  {
    this.bkM = paramByte;
    this.dMd = Ch(paramByte);
  }

  public final boolean F(aYQ paramaYQ)
  {
    this.fdo = paramaYQ.readShort();
    this.io = paramaYQ.readByte();
    this.lHr = paramaYQ.readByte();
    this.ip = paramaYQ.bnT();
    this.bkM = (paramaYQ.bnT() ? 1 : 0);
    this.bkM = ((byte)(this.bkM | (paramaYQ.bnT() ? 2 : 0)));
    this.bkM = ((byte)(this.bkM | (paramaYQ.bnT() ? 4 : 0)));
    int i = paramaYQ.readInt();
    this.lHq = dsw.BE(i);
    if (this.lHq == null) {
      K.error("Element of id " + i + " is missing");
      return false;
    }
    return true;
  }

  public final boolean bZ() {
    return this.ip;
  }

  public final boolean cjQ() {
    return this.lHq.cjQ();
  }

  public final short ddH() {
    return this.fdo;
  }

  public final int ddI() {
    return this.lHo;
  }

  public final int ddJ() {
    return this.lHp;
  }

  public final byte bY() {
    return this.io;
  }

  public final cYk ddK() {
    return new cYk(this.lHo, this.lHp, this.fdo);
  }

  public final short biy() {
    return (short)(this.fdo - this.io);
  }

  public final cid ddL() {
    return this.lHq;
  }

  public int RV() {
    return this.aVh;
  }

  public final int ddM() {
    return this.bMK;
  }

  public final short ddN() {
    return this.fiz;
  }

  public final boolean ddO() {
    return (this.bkM & 0x4) == 4;
  }

  public final void N(float[] paramArrayOfFloat) {
    if ((!bB) && ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 3))) throw new AssertionError();
    if ((this.bkM & 0x1) != 1)
    {
      float tmp44_43 = (paramArrayOfFloat[2] = 0.5F); paramArrayOfFloat[1] = tmp44_43; paramArrayOfFloat[0] = tmp44_43;
      return;
    }
    int i = Ci(this.bkM);
    paramArrayOfFloat[0] = this.dMd[(i++)];
    paramArrayOfFloat[1] = this.dMd[(i++)];
    paramArrayOfFloat[2] = this.dMd[i];
  }

  public final void O(float[] paramArrayOfFloat) {
    if ((!bB) && ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 4))) throw new AssertionError();
    N(paramArrayOfFloat);
    paramArrayOfFloat[3] = getAlpha();
  }

  public final float getAlpha() {
    return (this.bkM & 0x2) == 2 ? this.dMd[Cj(this.bkM)] : 1.0F;
  }

  public final void P(float[] paramArrayOfFloat) {
    if ((!bB) && ((this.bkM & 0x4) != 4)) throw new AssertionError("impossible sur un objet non dégradé. tester avec isGradient()");

    if ((!bB) && ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 3))) throw new AssertionError();
    if ((this.bkM & 0x1) != 1)
    {
      float tmp70_69 = (paramArrayOfFloat[2] = 0.5F); paramArrayOfFloat[1] = tmp70_69; paramArrayOfFloat[0] = tmp70_69;
      return;
    }
    int i = Ck(this.bkM);
    paramArrayOfFloat[0] = this.dMd[(i++)];
    paramArrayOfFloat[1] = this.dMd[(i++)];
    paramArrayOfFloat[2] = this.dMd[i];
  }

  public final void Q(float[] paramArrayOfFloat) {
    if ((!bB) && ((this.bkM & 0x4) != 4)) throw new AssertionError("impossible sur un objet non dégradé. tester avec isGradient()");
    if ((!bB) && ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 4))) throw new AssertionError();

    P(paramArrayOfFloat);
    paramArrayOfFloat[3] = getAlpha();
  }

  public final float ddP() {
    if ((!bB) && ((this.bkM & 0x4) != 4)) throw new AssertionError("impossible sur un objet non dégradé. tester avec isGradient()");
    return (this.bkM & 0x2) == 2 ? this.dMd[Cl(this.bkM)] : 1.0F;
  }

  public void y(float[] paramArrayOfFloat) {
    if ((!bB) && (paramArrayOfFloat == null)) throw new AssertionError();
    if ((!bB) && (paramArrayOfFloat.length < 4)) throw new AssertionError();

    N(dcz);
    paramArrayOfFloat[0] *= dcz[0];
    paramArrayOfFloat[1] *= dcz[1];
    paramArrayOfFloat[2] *= dcz[2];
    paramArrayOfFloat[3] *= getAlpha();
  }

  public final void b(dSw paramdSw) {
    if ((!bB) && (this.lHq == null)) throw new AssertionError();
    paramdSw.writeShort(this.fdo);
    paramdSw.writeByte(this.io);
    paramdSw.writeByte((byte)this.lHr);
    paramdSw.lu(this.ip);
    paramdSw.lu((this.bkM & 0x1) == 1);
    paramdSw.lu((this.bkM & 0x2) == 2);
    paramdSw.lu((this.bkM & 0x4) == 4);
    paramdSw.writeInt(this.lHq.getId());
  }

  public final void ai(int paramInt1, int paramInt2, short paramShort) {
    this.lHo = paramInt1;
    this.lHp = paramInt2;
    this.fdo = paramShort;
  }

  public final void fb(int paramInt1, int paramInt2) {
    this.dKx = paramInt1;
    this.dKv = paramInt2;
  }

  public void J(boolean paramBoolean) {
    this.ip = paramBoolean;
  }

  public final void setHeight(int paramInt) {
    this.io = ((byte)paramInt);
  }

  public final void b(cid paramcid) {
    this.lHq = paramcid;
  }

  public final void Cf(int paramInt) {
    this.lHr = paramInt;
  }

  public int ddQ() {
    return this.lHr;
  }

  public final void eA(short paramShort) {
    this.fiz = paramShort;
  }

  public void fk(int paramInt) {
    this.aVh = paramInt;
  }

  public final void Cg(int paramInt) {
    this.bMK = paramInt;
  }

  public final void C(float paramFloat1, float paramFloat2, float paramFloat3) {
    if ((this.bkM & 0x1) != 1) {
      return;
    }
    int i = Ci(this.bkM);
    this.dMd[(i++)] = paramFloat1;
    this.dMd[(i++)] = paramFloat2;
    this.dMd[i] = paramFloat3;
  }

  public final void v(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((this.bkM & 0x1) == 1) {
      int i = Ci(this.bkM);
      this.dMd[(i++)] = paramFloat1;
      this.dMd[(i++)] = paramFloat2;
      this.dMd[i] = paramFloat3;
    }
    if ((this.bkM & 0x2) == 2)
      this.dMd[Cj(this.bkM)] = paramFloat4;
  }

  public final void z(float paramFloat)
  {
    if ((this.bkM & 0x2) == 2)
      this.dMd[Cj(this.bkM)] = paramFloat;
  }

  public final void D(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((this.bkM & 0x4) != 4) {
      return;
    }

    if ((this.bkM & 0x1) != 1) {
      return;
    }

    int i = Ci(this.bkM);
    this.dMd[(i++)] = paramFloat1;
    this.dMd[(i++)] = paramFloat2;
    this.dMd[i] = paramFloat3;
  }

  public final void w(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((this.bkM & 0x4) != 4) {
      return;
    }

    if ((this.bkM & 0x1) == 1) {
      int i = Ci(this.bkM);
      this.dMd[(i++)] = paramFloat1;
      this.dMd[(i++)] = paramFloat2;
      this.dMd[i] = paramFloat3;
    }
    if ((this.bkM & 0x2) == 2)
      this.dMd[Cj(this.bkM)] = paramFloat4;
  }

  public final void du(float paramFloat)
  {
    if ((this.bkM & 0x4) != 4) {
      return;
    }

    if ((this.bkM & 0x2) == 2)
      this.dMd[Cj(this.bkM)] = paramFloat;
  }

  public void aj(int paramInt1, int paramInt2, short paramShort)
  {
    this.lHo = paramInt1;
    this.lHp = paramInt2;
    this.fdo = paramShort;
  }

  protected void gL()
  {
    this.lGL = 0L;
    this.bkM = 0;

    this.fdo = 0;
    this.lHo = (this.lHp = 0);
    this.dKv = (this.dKx = 0);
    this.lHr = 0;
    this.io = 0;
    this.bMK = 0;
    this.fiz = 0;
    this.aVh = 0;
    this.ip = false;
    this.lGL = 0L;
  }

  protected void gM()
  {
    this.dMd = null;
  }

  public static float fG(byte paramByte) {
    return paramByte / 255.0F + 0.5F;
  }

  public static void a(float[] paramArrayOfFloat, int paramInt, aYQ paramaYQ) {
    int i = 0;
    if ((paramInt & 0x1) == 1) {
      if ((!bB) && (i != Ci(paramInt))) throw new AssertionError();
      paramArrayOfFloat[(i++)] = fG(paramaYQ.readByte());
      paramArrayOfFloat[(i++)] = fG(paramaYQ.readByte());
      paramArrayOfFloat[(i++)] = fG(paramaYQ.readByte());
    }
    if ((paramInt & 0x2) == 2) {
      if ((!bB) && (i != Cj(paramInt))) throw new AssertionError();
      paramArrayOfFloat[(i++)] = (paramaYQ.readByte() / 255.0F + 0.5F);
    }
    if ((paramInt & 0x4) == 4) {
      if ((paramInt & 0x1) == 1) {
        if ((!bB) && (i != Ck(paramInt))) throw new AssertionError();
        paramArrayOfFloat[(i++)] = (paramaYQ.readByte() / 255.0F + 0.5F);
        paramArrayOfFloat[(i++)] = (paramaYQ.readByte() / 255.0F + 0.5F);
        paramArrayOfFloat[(i++)] = (paramaYQ.readByte() / 255.0F + 0.5F);
      }
      if ((paramInt & 0x2) == 2) {
        if ((!bB) && (i != Cl(paramInt))) throw new AssertionError();
        paramArrayOfFloat[(i++)] = (paramaYQ.readByte() / 255.0F + 0.5F);
      }
    }
    if ((!bB) && (i != paramArrayOfFloat.length)) throw new AssertionError(); 
  }

  public static float[] Ch(int paramInt)
  {
    int i = 0;
    i += ((paramInt & 0x1) == 1 ? 3 : 0);
    i += ((paramInt & 0x2) == 2 ? 1 : 0);
    i *= ((paramInt & 0x4) == 4 ? 2 : 1);
    return new float[i];
  }

  static int Ci(int paramInt) {
    return lHw[(paramInt & 0x0)];
  }

  static int Cj(int paramInt) {
    return lHw[(paramInt & 0x1)];
  }

  static int Ck(int paramInt) {
    int i = paramInt & 0x3;
    if ((!bB) && ((i & 0x1) != 1)) throw new AssertionError();
    return lHw[i];
  }

  static int Cl(int paramInt) {
    int i = paramInt & 0x3;
    if ((!bB) && ((i & 0x2) != 2)) throw new AssertionError();
    return lHw[(i + 4)];
  }

  public void d(dQx paramdQx) {
    paramdQx.set(this.dKx, this.dKx + this.lHq.cjF(), this.dKv - this.lHq.cjG(), this.dKv);
  }

  public void ddR() {
    this.lGL = dLw.a(this.lHo, this.lHp, this.lHr, 0);
  }

  public void ddS() {
    this.dKx = (crO.dE(this.lHo, this.lHp) - this.lHq.KU());
    this.dKv = (crO.R(this.lHo, this.lHp, this.fdo - this.io) + this.lHq.KV());
  }

  public void axl() {
    super.axl();
  }

  static
  {
    K = Logger.getLogger(ScreenElement.class);

    lHn = new ScreenElement.ObjectFactory();

    dcz = new float[4];

    lHw = new int[8];
    int i = 3;
    int j = 1;

    lHw[0] = 0;
    for (int k = 1; k < 2; k++) {
      lHw[k] = (3 + lHw[(k - 1)]);
    }
    for (k = 2; k < 4; k++) {
      lHw[k] = (1 + lHw[(k - 2)]);
    }

    for (k = 4; k < lHw.length; k++) {
      lHw[k] = lHw[(k - 4)];
      if ((k & 0x1) == 1)
        lHw[k] += 3;
    }
  }
}