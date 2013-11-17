package com.ankamagames.framework.graphics.engine.entity;

import FB;
import agH;
import ayc;
import bSr;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.util.ArrayList;
import uz;

public class Entity3D extends Entity
{
  public static final Entity3D.ObjectFactory fAs = new Entity3D.ObjectFactory();

  private final ArrayList fAt = new ArrayList(2);

  public void clear()
  {
    int i = this.fAt.size();
    for (int j = 0; j < i; j++) {
      ((agH)this.fAt.get(j)).destroy();
    }
    this.fAt.clear();
  }

  public final int bvg() {
    return this.fAt.size();
  }

  public final int a(Geometry paramGeometry) {
    this.fAt.add(new agH(paramGeometry, null, null));
    return this.fAt.size() - 1;
  }

  public final int a(Geometry paramGeometry, uz paramuz, Material paramMaterial) {
    this.fAt.add(new agH(paramGeometry, paramuz, paramMaterial));
    return this.fAt.size() - 1;
  }

  public final void b(Geometry paramGeometry) {
    int i = this.fAt.size();
    for (int j = 0; j < i; j++) {
      agH localagH = (agH)this.fAt.get(j);
      if (localagH.ase() == paramGeometry) {
        localagH.destroy();
        this.fAt.remove(localagH);
        break;
      }
    }
  }

  public final Geometry pW(int paramInt) {
    return ((agH)this.fAt.get(paramInt)).ase();
  }

  public final void a(int paramInt, uz paramuz) {
    if ((!bB) && (paramInt >= this.fAt.size())) throw new AssertionError();
    ((agH)this.fAt.get(paramInt)).setTexture(paramuz);
  }

  public final uz jP(int paramInt) {
    return ((agH)this.fAt.get(paramInt)).hN();
  }

  public final void d(Material paramMaterial) {
    int i = this.fAt.size();
    for (int j = 0; j < i; j++) {
      agH localagH = (agH)this.fAt.get(j);
      if (localagH.asf() == paramMaterial)
        localagH.asg();
    }
  }

  public final Material pX(int paramInt)
  {
    return ((agH)this.fAt.get(paramInt)).asf();
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    for (agH localagH : this.fAt) {
      Geometry localGeometry = localagH.ase();
      if (localGeometry != null)
      {
        localGeometry.setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      }
    }
  }

  public void M(float paramFloat)
  {
  }

  public void p(bSr parambSr)
  {
    if (bvg() == 0) {
      return;
    }

    parambSr.f(dsE().aGp());

    boolean bool = bvl();
    this.mnV.i(parambSr);

    int i = this.fAt.size();
    ayc localayc = (ayc)parambSr;
    for (int j = 0; j < i; j++) {
      ((agH)this.fAt.get(j)).a(localayc, bool);
    }

    this.mnW.i(parambSr);
  }

  public void gM()
  {
    super.gM();
    clear();
    this.fAt.trimToSize();
  }
}