package com.ankamagames.framework.graphics.engine.text;

import MD;
import aYQ;
import bNa;
import cEh;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import dSw;
import hf;
import java.util.ArrayList;

public abstract class GeometryText extends Geometry
{
  protected hf iIg;
  protected bNa bPo;
  protected ArrayList hqr;
  protected int dQo;
  protected cEh hqO;
  protected float aZs;
  protected float aZt;
  protected float kGb;
  protected float kGc;
  protected float cas = 1.0F;

  public GeometryText()
  {
    this.hqO = new cEh(0.0F, 0.0F, 0.0F, 1.0F);
    this.bPo = new bNa(bNa.gRy);
    this.aZs = 0.0F;
    this.aZt = 0.0F;
  }

  public void b(dSw paramdSw)
  {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public void d(aYQ paramaYQ)
  {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public abstract int f(String paramString);

  public abstract int g(String paramString);

  public abstract MD oz(String paramString);

  public float getScale()
  {
    return this.cas;
  }

  public void setScale(float paramFloat) {
    this.cas = paramFloat;
  }

  public float cJb() {
    return this.kGb;
  }

  public void cS(float paramFloat) {
    this.kGb = paramFloat;
  }

  public float cJc() {
    return this.kGc;
  }

  public void cT(float paramFloat) {
    this.kGc = paramFloat;
  }

  public void a(hf paramhf) {
    this.iIg = paramhf;
  }

  public final void setColor(int paramInt) {
    this.bPo.set(paramInt);
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.bPo.k(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final bNa getColor() {
    return this.bPo;
  }

  public final void P(ArrayList paramArrayList) {
    this.hqr = paramArrayList;
  }

  public final void zc(int paramInt) {
    this.dQo = paramInt;
  }

  public final void m(cEh paramcEh) {
    this.hqO.a(paramcEh);
  }

  public final float getOffsetX() {
    return this.aZs;
  }

  public final void setOffsetX(float paramFloat) {
    this.aZs = paramFloat;
  }

  public final float getOffsetY() {
    return this.aZt;
  }

  public final void setOffsetY(float paramFloat) {
    this.aZt = paramFloat;
  }

  public final void aj(float paramFloat1, float paramFloat2) {
    this.aZs = paramFloat1;
    this.aZt = paramFloat2;
  }
}