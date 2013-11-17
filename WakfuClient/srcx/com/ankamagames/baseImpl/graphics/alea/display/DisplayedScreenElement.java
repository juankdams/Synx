package com.ankamagames.baseImpl.graphics.alea.display;

import HA;
import MD;
import aVn;
import adG;
import akE;
import alt;
import bCO;
import bGT;
import bfH;
import bgL;
import cSJ;
import cYm;
import cid;
import cnQ;
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.sun.opengl.util.texture.TextureCoords;
import crO;
import cuA;
import cyQ;
import dIt;
import dKq;
import dLw;
import dTQ;
import dbL;
import dn;
import dsw;
import dvR;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import up;
import uz;

public class DisplayedScreenElement extends akE
  implements aVn, alt, bgL, dIt
{
  public static final DisplayedScreenElement.ObjectFactory fir = new DisplayedScreenElement.ObjectFactory();
  public ScreenElement fis;
  protected byte fit;
  public EntitySprite fiu;
  boolean bG = true;
  boolean fiv = false;
  public boolean fiw = false;

  private short fix = 0;
  private final float[] bRQ = new float[4];
  private float[] fiy;
  private int dco = 0;
  private int aVh = 0;
  private short fiz = 0;
  private byte dpP = 3;
  private long fiA;
  private static final float[] dcz = new float[4];

  private static final Logger K = Logger.getLogger(DisplayedScreenElement.class);

  public float getAlpha()
  {
    return this.bRQ[3];
  }

  public void c(ScreenElement paramScreenElement) {
    if (this.fis != null) {
      DL();
    }

    this.fis = paramScreenElement;
    this.fit = this.fis.lHq.bBm();
    this.fis.gQ();
    this.fiA = dbL.ac(this.fis.ddI(), this.fis.ddJ(), this.fis.ddH());

    this.dco = this.fis.ddM();
    this.fiz = this.fis.ddN();
    this.aVh = this.fis.RV();

    GH();
  }

  public void GH() {
    cid localcid = this.fis.lHq;
    int i = localcid.oc();

    float f1 = this.fis.dKv;
    float f2 = this.fis.dKx;
    uz localuz;
    int j;
    int k;
    if ((dTQ.hGy & localcid.cjO()) == 0) {
      this.bG = false;
      localuz = bfH.bsR().jP(19067);
      if ((this.bG) && (localuz != null)) {
        j = localuz.cqv().getX();
        k = localuz.cqv().getY();
        f2 = crO.dE(this.fis.lHo, this.fis.lHp) - j * 0.5F;
        f1 = crO.R(this.fis.lHo, this.fis.lHp, this.fis.fdo) + k * 0.5F;
      } else {
        j = 1;
        k = 1;
      }
    } else {
      localuz = bfH.bsR().jP(i);
      j = localcid.cjF();
      k = localcid.cjG();
    }

    if ((this.fis.lHo + this.fis.lHp) % 2 != 0) {
      f1 += (this.fis.lHp > -this.fis.lHo ? -0.5F : 0.5F);
    }

    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGLGeometrySprite.a(cnQ.hUU, cnQ.hUY);
    localGLGeometrySprite.c(f1, f2, j, k);

    atq();
    if (this.fiu != null) {
      this.fiu.axl();
    }
    this.fiu = ((EntitySprite)EntitySprite.kYR.bQy());
    c(this.fiu);
    this.fiu.a(localGLGeometrySprite);
    this.fiu.setTexture(localuz);
    this.fiu.setColor(this.bRQ[0], this.bRQ[1], this.bRQ[2], this.bRQ[3]);
    this.fiu.aEf = this.fis.dKx;
    this.fiu.aEh = (this.fis.dKx + j);
    this.fiu.aEg = (this.fis.dKv - k);
    this.fiu.aEi = this.fis.dKv;

    bF((short)bCO.sf(2147483647));
    localGLGeometrySprite.axl();
  }

  protected final void atq() {
    this.bRQ[0] = 0.5F;
    this.bRQ[1] = 0.5F;
    this.bRQ[2] = 0.5F;
    this.bRQ[3] = 1.0F;
  }

  protected final void c(Entity paramEntity) {
    paramEntity.mnU = this;
    if (this.fis.bZ()) {
      paramEntity.mnT |= 2;
    }
    paramEntity.dsJ();
    paramEntity.mnQ = this.fis.lHo;
    paramEntity.mnR = this.fis.lHp;
    paramEntity.mnS = (this.fis.fdo - this.fis.io);
    paramEntity.hYO = this.fis.io;
    int i = this.fis.lHr;
    if (this.fis.lHq.cjM()) {
      paramEntity.mnQ += 0.9F;
      paramEntity.mnR += 0.9F;
      i += dLw.mbp - 1;
    }
    paramEntity.mnP = dLw.a(this.fis.lHo, this.fis.lHp, i, dLw.mbc.asR());
  }

  public void oC(int paramInt) {
    int i = this.fis.lHo;
    int j = this.fis.lHp;
    if (paramInt < 0) {
      i--;
      j--;
      paramInt += dLw.mbp;
    }
    this.fiu.mnP = dLw.a(i, j, this.fis.lHr, paramInt);
  }

  public void bF(short paramShort) {
    this.fix = ((short)(this.fix + paramShort));
    TextureCoords localTextureCoords = this.fis.lHq.br(this.fix);
    this.fiu.cPd().i(localTextureCoords.top(), localTextureCoords.left(), localTextureCoords.bottom(), localTextureCoords.right());
  }

  public final void oD(int paramInt) {
    cid localcid = dsw.BE(paramInt);
    if (localcid == null) {
      K.error("Unable to replace element gfxId : " + paramInt + " unknown");
      return;
    }

    this.fis.dKv -= this.fis.lHq.KV();
    this.fis.dKx += this.fis.lHq.KU();

    this.fis.lHq = localcid;

    this.fis.dKv += localcid.KV();
    this.fis.dKx -= localcid.KU();

    GH();
  }

  public final void a(HA paramHA) {
    paramHA.a(this);
  }

  private boolean a(cuA paramcuA) {
    Entity localEntity = GG();
    return (localEntity != null) && (paramcuA.B(localEntity.aEi, localEntity.aEf, localEntity.aEg, localEntity.aEh));
  }

  public void a(adG paramadG, ArrayList paramArrayList, cuA paramcuA) {
    if (!this.bG) {
      return;
    }

    if (!a(paramcuA)) {
      this.fiv = true;
      return;
    }

    if (this.fiw)
      return;
    float[] arrayOfFloat;
    if (this.fiy == null) {
      arrayOfFloat = paramadG.a(this);
    } else {
      this.fiy[3] = paramadG.a(this)[3];
      this.fiy[3] *= 0.5F;
      this.fiy[0] *= this.fiy[3];
      this.fiy[1] *= this.fiy[3];
      this.fiy[2] *= this.fiy[3];
      arrayOfFloat = this.fiy;
    }
    if ((!bB) && (arrayOfFloat == null)) throw new AssertionError();

    System.arraycopy(arrayOfFloat, 0, dcz, 0, 4);

    dvR localdvR = bGT.bOB().gF(this.fiA);
    if (localdvR != null) {
      float f = localdvR.bPc;
      dcz[0] *= localdvR.bOZ * f;
      dcz[1] *= localdvR.bPa * f;
      dcz[2] *= localdvR.bPb * f;
      dcz[3] *= f;
    }

    if (arrayOfFloat[3] < 0.004F) {
      this.fiv = true;
      return;
    }

    this.dpP = cyQ.a(this.dpP, dcz);

    this.fiv = false;
    u(dcz);

    dbL.cNv().a(paramadG, this, this.bRQ[3]);

    this.fiw = true;
    paramArrayList.add(this);
  }

  public boolean M(int paramInt1, int paramInt2) {
    if ((!bB) && (!isVisible())) throw new AssertionError();

    uz localuz = this.fiu.hN();
    if (localuz == null) {
      return false;
    }

    cSJ localcSJ = localuz.wn(0);
    int i = paramInt2 - this.fiu.aEg;
    if ((i >= localcSJ.getHeight()) || (i < 0)) {
      return false;
    }

    int j = paramInt1 - this.fiu.aEf;
    if ((j >= localcSJ.getWidth()) || (j < 0)) {
      return false;
    }

    if (this.fis.lHq.cjH()) {
      j = localcSJ.getWidth() - j - 1;
    }
    return localcSJ.cIz().fj(j, i);
  }

  public final ScreenElement bpc() {
    return this.fis;
  }

  public Entity GG() {
    return this.fiu;
  }

  public final long bpd() {
    return this.fis.lGL;
  }

  public final boolean isVisible() {
    return (this.bG) && (this.dpP == 3) && (!this.fiv);
  }

  final boolean bpe()
  {
    return (this.bG) && (this.dpP == 3);
  }

  public final void setVisible(boolean paramBoolean)
  {
    this.bG = paramBoolean;
  }

  public final void m(boolean paramBoolean) {
    this.dpP = (paramBoolean ? 0 : 2);
  }

  public int RV() {
    return this.aVh;
  }

  public final int OV()
  {
    return this.dco;
  }

  public final void j(int paramInt, short paramShort) {
    throw new UnsupportedOperationException("");
  }

  public final short OW() {
    return this.fiz;
  }

  public long bpf()
  {
    return this.fiA;
  }

  public boolean bpg() {
    return this.fis.lHq.cjK();
  }

  public void a(adG paramadG, HighLightEntity paramHighLightEntity, float paramFloat, MD paramMD, int paramInt1, dn paramdn, int paramInt2)
  {
    if (paramHighLightEntity == null) {
      return;
    }

    byte b = this.fis.lHq.cjI();

    float f1 = bpg() ? 0.0F : this.fis.lHq.cjJ();
    float f2 = b == 0 ? f1 : f1 * 0.5F;

    int i = this.fis.fdo - this.fis.io;
    int j = this.fis.lHo;
    int k = this.fis.lHp;
    cYm localcYm = up.a(paramadG, j, k, f2 + i);

    paramHighLightEntity.dsE().sx(0);
    paramHighLightEntity.dsE().a(0, localcYm.aOR, localcYm.aOS);

    paramHighLightEntity.mnQ = j;
    paramHighLightEntity.mnR = k;
    paramHighLightEntity.mnS = i;
    paramHighLightEntity.hYO = 0.0F;
    b(paramHighLightEntity);

    paramdn.a(paramHighLightEntity, b, f1 * paramInt1, paramFloat, paramMD.getX() * 0.5F, paramMD.getY() * 0.5F);
  }

  public void b(HighLightEntity paramHighLightEntity) {
    Entity localEntity = GG();
    long l = localEntity != null ? localEntity.mnP : 0L;
    l += dLw.mbd.asR();
    if (l >= paramHighLightEntity.mnP)
      paramHighLightEntity.mnP = l;
  }

  public void t(float[] paramArrayOfFloat) {
    this.fiy = paramArrayOfFloat;
  }

  protected void gL()
  {
    this.dpP = 3;
    this.fiw = false;
    this.fiv = false;

    this.fix = 0;
    this.dco = 0;
    this.aVh = 0;
    this.fiz = 0;
    this.fiA = 0L;
  }

  public void gM()
  {
    this.fis.axl();
    this.fis = null;
    this.fit = 0;
    this.bG = true;
    this.fiy = null;

    if (this.fiu != null) {
      this.fiu.axl();
      this.fiu = null;
    }
  }

  private void u(float[] paramArrayOfFloat)
  {
    if (!this.fis.ddO())
    {
      v(paramArrayOfFloat);
    }
  }

  protected void v(float[] paramArrayOfFloat) {
    this.fis.y(paramArrayOfFloat);

    if (paramArrayOfFloat[0] < 0.0F)
      paramArrayOfFloat[0] = 0.0F;
    else if (paramArrayOfFloat[0] > 1.0F) {
      paramArrayOfFloat[0] = 1.0F;
    }

    if (paramArrayOfFloat[1] < 0.0F)
      paramArrayOfFloat[1] = 0.0F;
    else if (paramArrayOfFloat[1] > 1.0F) {
      paramArrayOfFloat[1] = 1.0F;
    }

    if (paramArrayOfFloat[2] < 0.0F)
      paramArrayOfFloat[2] = 0.0F;
    else if (paramArrayOfFloat[2] > 1.0F) {
      paramArrayOfFloat[2] = 1.0F;
    }

    if (paramArrayOfFloat[3] < 0.0F)
      paramArrayOfFloat[3] = 0.0F;
    else if (paramArrayOfFloat[3] > 1.0F) {
      paramArrayOfFloat[3] = 1.0F;
    }

    if ((this.bRQ[0] == paramArrayOfFloat[0]) && (this.bRQ[1] == paramArrayOfFloat[1]) && (this.bRQ[2] == paramArrayOfFloat[2]) && (this.bRQ[3] == paramArrayOfFloat[3])) {
      return;
    }

    this.bRQ[0] = paramArrayOfFloat[0];
    this.bRQ[1] = paramArrayOfFloat[1];
    this.bRQ[2] = paramArrayOfFloat[2];
    this.bRQ[3] = paramArrayOfFloat[3];

    e(paramArrayOfFloat);
  }

  protected void e(float[] paramArrayOfFloat) {
    this.fiu.setColor(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
    this.fiu.cPe();
  }

  public int fa() {
    return this.fis.lHo;
  }

  public int fb() {
    return this.fis.lHp;
  }

  public short fc() {
    return this.fis.fdo;
  }

  public void d(float[] paramArrayOfFloat) {
    if ((this.fiu != null) && (this.fis != null))
      a(this.fiu, paramArrayOfFloat);
  }

  protected static void a(EntitySprite paramEntitySprite, float[] paramArrayOfFloat)
  {
    Material localMaterial = paramEntitySprite.asf();
    float[] arrayOfFloat = localMaterial.dvD();
    if ((paramArrayOfFloat[0] == arrayOfFloat[0]) && (paramArrayOfFloat[1] == arrayOfFloat[1]) && (paramArrayOfFloat[2] == arrayOfFloat[2])) {
      return;
    }

    localMaterial.W(paramArrayOfFloat);
    paramEntitySprite.cPe();
  }

  public String toString()
  {
    return "DisplayScreenElement (" + this.fis.lHo + ", " + this.fis.lHp + ", " + this.fis.fdo + ")";
  }

  public final boolean cC(byte paramByte) {
    return (this.fit & paramByte) == this.fit;
  }
}