package com.ankamagames.framework.graphics.engine.entity;

import FB;
import ayc;
import bNa;
import bSr;
import cdg;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import dHL;
import dsZ;
import javax.media.opengl.GL;
import oB;
import uz;

public final class EntitySprite extends Entity
{
  public static final EntitySprite.ObjectFactory kYR = new EntitySprite.ObjectFactory();
  public static final int TYPE = 2;
  private GeometrySprite kYS;
  private uz UI;
  private uz kYT;
  private uz kYU;
  private Material UZ;
  private boolean dav;

  public void a(GeometrySprite paramGeometrySprite)
  {
    if (paramGeometrySprite == this.kYS) {
      return;
    }
    paramGeometrySprite.gQ();
    if (this.kYS != null) {
      this.kYS.axl();
    }
    this.kYS = paramGeometrySprite;
  }

  public GeometrySprite cPd() {
    return this.kYS;
  }

  public void i(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.kYS.i(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void setTexture(uz paramuz) {
    if (paramuz != null) {
      paramuz.gQ();
    }
    if (this.UI != null) {
      this.UI.axl();
    }

    this.UI = paramuz;
  }

  public void i(uz paramuz) {
    if (paramuz != null) {
      paramuz.gQ();
    }
    if (this.kYT != null) {
      this.kYT.axl();
    }

    this.kYT = paramuz;
  }

  public void j(uz paramuz) {
    if (paramuz != null) {
      paramuz.gQ();
    }
    if (this.kYU != null) {
      this.kYU.axl();
    }

    this.kYU = paramuz;
  }

  public uz hN() {
    return this.UI;
  }

  public Material asf() {
    return this.UZ;
  }

  public void setMaterial(Material paramMaterial) {
    if ((this.UZ != null) && (this.UZ.f(paramMaterial))) {
      return;
    }

    if (paramMaterial != null) {
      paramMaterial.gQ();
    }
    if (this.UZ != null) {
      this.UZ.axl();
    }

    this.UZ = paramMaterial;
    this.dav = true;
  }

  public void cPe() {
    this.dav = true;
  }

  public void c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    this.kYS.c(paramFloat1, paramFloat2, paramInt1, paramInt2);
  }

  public void M(float paramFloat1, float paramFloat2) {
    this.kYS.M(paramFloat1, paramFloat2);
  }

  public void setSize(int paramInt1, int paramInt2) {
    this.kYS.setSize(paramInt1, paramInt2);
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.kYS.setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void a(oB paramoB, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.kYS.a(paramoB, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void a(oB paramoB, bNa parambNa) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    this.kYS.a(paramoB, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
  }

  public float bjJ() {
    return this.kYS.bjJ();
  }

  public float bjK() {
    return this.kYS.bjK();
  }

  public float bjL() {
    return this.kYS.bjL();
  }

  public float bjM() {
    return this.kYS.bjM();
  }

  public float bjN() {
    return this.kYS.bjN();
  }

  public float bjO() {
    return this.kYS.bjO();
  }

  public int getWidth() {
    return this.kYS.getWidth();
  }

  public int getHeight() {
    return this.kYS.getHeight();
  }

  public float bjH() {
    return this.kYS.bjH();
  }

  public float bjI() {
    return this.kYS.bjI();
  }

  public void M(float paramFloat)
  {
  }

  public void p(bSr parambSr)
  {
    if ((this.UI != null) && (!this.UI.gI())) {
      return;
    }

    dsZ localdsZ = dsZ.cZe();
    parambSr.f(dsE().aGp());

    if ((this.dav) && (bvl())) {
      this.dav = false;
      this.kYS.b(this.UZ);
    }

    this.mnV.i(parambSr);

    GL localGL = (GL)((ayc)parambSr).bZk();
    if (this.kYT != null) {
      localdsZ.b(localGL, 1);
      localdsZ.c(localGL, 1);
      localdsZ.a(parambSr, (cdg)this.kYT);
    }

    if (this.kYU != null) {
      localdsZ.b(localGL, 2);
      localdsZ.c(localGL, 2);
      localdsZ.a(parambSr, (cdg)this.kYU);
    }

    localdsZ.b(localGL, 0);
    localdsZ.c(localGL, 0);
    localdsZ.a(parambSr, (cdg)this.UI);
    localdsZ.x(parambSr);

    if (this.UZ != null) {
      localdsZ.a(localGL, this.UZ);
    }
    this.kYS.a(parambSr);

    this.mnW.i(parambSr);
  }

  protected void gL()
  {
    super.gL();
    if ((!bB) && (this.UZ != null)) throw new AssertionError();
    this.UZ = ((Material)Material.mwD.bQy());

    this.UZ.e(Material.mwz);
    this.dav = false;
  }

  protected void gM()
  {
    super.gM();

    if (this.UZ != null) {
      this.UZ.axl();
      this.UZ = null;
    }

    if (this.UI != null) {
      this.UI.axl();
      this.UI = null;
    }
    if (this.kYT != null) {
      this.kYT.axl();
      this.kYT = null;
    }
    if (this.kYU != null) {
      this.kYU.axl();
      this.kYU = null;
    }

    if (this.kYS != null) {
      this.kYS.axl();
      this.kYS = null;
    }
  }

  public boolean a(VertexBufferPCT paramVertexBufferPCT)
  {
    if (paramVertexBufferPCT.bSV() + this.kYS.bIl().bSV() > paramVertexBufferPCT.bSW()) {
      return false;
    }
    paramVertexBufferPCT.c(this.kYS.bIl());
    return true;
  }

  public void a(dsZ paramdsZ)
  {
    ayc localayc = dHL.lSB.dhZ();
    dsZ localdsZ = dsZ.cZe();
    localayc.f(dsE().aGp());

    if ((this.dav) && (bvl())) {
      this.dav = false;
      this.kYS.b(this.UZ);
    }

    this.mnV.i(localayc);

    GL localGL = (GL)localayc.bZk();

    if (this.kYT != null) {
      localdsZ.b(localGL, 1);
      localdsZ.c(localGL, 1);
      localdsZ.a(localayc, (cdg)this.kYT);
    }

    if (this.kYU != null) {
      localdsZ.b(localGL, 2);
      localdsZ.c(localGL, 2);
      localdsZ.a(localayc, (cdg)this.kYU);
    }

    localdsZ.b(localGL, 0);
    localdsZ.c(localGL, 0);
    localdsZ.a(localayc, (cdg)this.UI);
    localdsZ.x(localayc);

    if (this.UZ != null)
      localdsZ.a(localGL, this.UZ);
  }
}