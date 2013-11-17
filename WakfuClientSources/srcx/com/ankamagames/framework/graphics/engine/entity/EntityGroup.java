package com.ankamagames.framework.graphics.engine.entity;

import FB;
import bSr;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.util.ArrayList;

public class EntityGroup extends Entity
{
  private static final int ecX = 2;
  public static final EntityGroup.ObjectFactory ecY = new EntityGroup.ObjectFactory();

  protected final ArrayList ecZ = new ArrayList(2);

  public void M(float paramFloat)
  {
    int i = this.ecZ.size();
    for (int j = 0; j < i; j++)
      ((Entity)this.ecZ.get(j)).M(paramFloat);
  }

  public void a(bSr parambSr)
  {
    if (!isVisible()) {
      return;
    }

    p(parambSr);
  }

  public void p(bSr parambSr)
  {
    int i = this.ecZ.size();
    if (i == 0) {
      return;
    }
    this.mnV.i(parambSr);

    for (int j = 0; j < i; j++) {
      ((Entity)this.ecZ.get(j)).a(parambSr);
    }
    this.mnW.i(parambSr);
  }

  public void setVisible(boolean paramBoolean)
  {
    super.setVisible(paramBoolean);

    for (Entity localEntity : this.ecZ)
      localEntity.setVisible(paramBoolean);
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = this.ecZ.size();
    for (int j = 0; j < i; j++)
      ((Entity)this.ecZ.get(j)).setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final ArrayList aSj()
  {
    return this.ecZ;
  }

  public void a(int paramInt, Entity paramEntity) {
    if ((!bB) && (paramEntity == null)) throw new AssertionError("It's forbidden to add a null value as a child");
    paramEntity.b(this);
    Entity localEntity = (Entity)this.ecZ.set(paramInt, paramEntity);
    paramEntity.gQ();
    dsL().a(paramInt, paramEntity.dsE());
    if (localEntity != null) {
      dsL().b(localEntity.dsE());
      localEntity.axl();
    }
  }

  public final void d(Entity paramEntity) {
    if ((!bB) && (paramEntity == null)) throw new AssertionError("It's forbidden to add a null value as a child");
    paramEntity.b(this);
    this.ecZ.add(paramEntity);
    paramEntity.gQ();
    dsL().a(paramEntity.dsE());
  }

  public final void e(Entity paramEntity) {
    if ((!bB) && (paramEntity == null)) throw new AssertionError("null value can't be removed from childList");
    paramEntity.b(null);
    if (this.ecZ.remove(paramEntity)) {
      paramEntity.axl();
    }
    dsL().b(paramEntity.dsE());
  }

  public final void removeAllChildren() {
    for (int i = this.ecZ.size() - 1; i >= 0; i--) {
      Entity localEntity = (Entity)this.ecZ.get(i);
      localEntity.b(null);
      localEntity.axl();
    }
    this.ecZ.clear();
    dsL().removeAllChildren();
  }

  protected void gM()
  {
    removeAllChildren();
    super.gM();
  }

  public void nB() {
    this.aEf = 2147483647;
    this.aEg = 2147483647;
    this.aEh = -2147483648;
    this.aEi = -2147483648;
    for (Entity localEntity : this.ecZ) {
      if (localEntity.aEf < this.aEf) {
        this.aEf = localEntity.aEf;
      }

      if (localEntity.aEg < this.aEg) {
        this.aEg = localEntity.aEg;
      }

      if (localEntity.aEh > this.aEh) {
        this.aEh = localEntity.aEh;
      }

      if (localEntity.aEi > this.aEi)
        this.aEi = localEntity.aEi;
    }
  }
}