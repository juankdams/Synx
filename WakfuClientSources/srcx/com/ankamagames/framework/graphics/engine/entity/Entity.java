package com.ankamagames.framework.graphics.engine.entity;

import FB;
import Pb;
import Ul;
import akE;
import bNa;
import bSr;
import bkk;
import cgR;
import cjA;
import cmL;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import dsZ;
import java.util.ArrayList;

public abstract class Entity extends akE
  implements Ul
{
  private static final FB mnM = new FB();
  private static final FB mnN = new FB();

  protected static bkk mnO = null;
  public long mnP;
  public float mnQ;
  public float mnR;
  public float mnS;
  public float cat;
  public float hYO;
  public int mnT;
  public int aEf;
  public int aEh;
  public int aEg;
  public int aEi;
  public Object mnU;
  protected FB mnV;
  protected FB mnW;
  protected bkk mnX;
  protected int fDq;
  protected cgR mnY;
  private EntityGroup mnZ;
  private boolean bG;
  private BatchTransformer moa;
  public static cjA mob = null;

  public void du(byte paramByte)
  {
    this.cat = paramByte;
  }

  public boolean isVisible() {
    return this.bG;
  }

  public void setVisible(boolean paramBoolean) {
    this.bG = paramBoolean;
  }

  public final Entity dsD() {
    return this.mnZ;
  }

  public final BatchTransformer dsE() {
    return this.moa;
  }

  public void a(bSr parambSr) {
    if ((dsM()) || (!this.bG)) {
      return;
    }
    if (bpu() < 0) {
      return;
    }

    if (this.mnX != null) {
      mnO = this.mnX;
      this.mnX.pY(this.fDq);
      this.mnX.a(parambSr, this, this.mnY);
    } else {
      if (mnO != null) {
        mnO.reset();
        mnO = null;
      }
      p(parambSr);
    }
  }

  public abstract void M(float paramFloat);

  public abstract void p(bSr parambSr);

  public final Matrix44 aGp() {
    return dsE().aGp();
  }

  public FB dsF() {
    return this.mnW;
  }

  public FB dsG() {
    return this.mnV;
  }

  public final void a(FB paramFB) {
    this.mnV = paramFB;
  }

  public final void b(FB paramFB) {
    this.mnW = paramFB;
  }

  public final bkk dsH() {
    return this.mnX;
  }

  public final cgR dsI() {
    return this.mnY;
  }

  public final int bxb() {
    return this.fDq;
  }

  public void a(bkk parambkk, int paramInt, cgR paramcgR) {
    this.mnX = parambkk;
    this.fDq = paramInt;
    this.mnY = paramcgR;
  }

  public final void dsJ() {
    a(Pb.aaU().aaV(), cmL.hRG, cmL.hSk);
  }

  public final void dsK() {
    a(Pb.aaU().aaV(), cmL.hRG, cmL.hSl);
  }

  protected final boolean bvl()
  {
    return (this.mnX == null) || (this.mnX.bvl());
  }

  public void gL()
  {
    this.mnP = 0L;
    this.mnQ = 0.0F;
    this.mnR = 0.0F;
    this.mnS = 0.0F;
    this.cat = 0.0F;
    this.hYO = 0.0F;
    this.mnT = 0;

    this.aEf = 2147483647;
    this.aEh = -2147483648;
    this.aEg = 2147483647;
    this.aEi = -2147483648;

    this.mnV = mnM;
    this.mnW = mnN;

    this.fDq = cmL.hRG;

    if ((!bB) && (this.moa != null)) throw new AssertionError();
    this.moa = ((BatchTransformer)BatchTransformer.gzl.bQy());
    this.bG = true;
  }

  public void gM()
  {
    this.mnV = null;
    this.mnW = null;

    this.mnX = null;
    this.mnY = null;

    if (this.mnZ != null) {
      this.mnZ.e(this);
      this.mnZ = null;
    }

    this.moa.axl();
    this.moa = null;
  }

  protected final void b(EntityGroup paramEntityGroup)
  {
    this.mnZ = paramEntityGroup;
  }

  protected final BatchTransformer dsL() {
    return this.moa;
  }

  public ArrayList aSj() {
    return null;
  }

  public boolean a(VertexBufferPCT paramVertexBufferPCT) {
    return true;
  }

  public void a(dsZ paramdsZ)
  {
  }

  public int getMode() {
    return 7;
  }

  public boolean ahw() {
    return (this.bG) && (bpu() >= 0);
  }

  public void l(bSr parambSr) {
    throw new UnsupportedOperationException("");
  }

  public final void setColor(bNa parambNa) {
    setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
  }

  public abstract void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);

  private boolean dsM()
  {
    if (mob == null) {
      return false;
    }
    return mob.aX(this.mnU);
  }
}