package com.ankamagames.baseImpl.graphics.alea.display;

import Ul;
import akE;
import bSr;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.HashSet;
import xn;

public class RenderTree extends akE
  implements xn
{
  public static final RenderTree.ObjectFactory lNX = new RenderTree.ObjectFactory();

  private ArrayList lNY = new ArrayList(0);
  private ArrayList fjN = new ArrayList(0);
  private RenderTree lNZ;
  private RenderTree lOa;
  private Entity fjJ;
  private boolean lOb;
  private float lOc;
  private float lOd;
  private final ArrayList cUn = new ArrayList();

  private static int crL = 1000;
  private static final boolean DEBUG = true;

  public void clear()
  {
    this.cUn.clear();
    if (this.lNZ != null) {
      this.lNZ.axl();
      this.lNZ = null;
    }

    if (this.lOa != null) {
      this.lOa.axl();
      this.lOa = null;
    }

    this.lNY.clear();
    this.fjN.clear();
    this.fjJ = null;
  }

  public void a(Entity paramEntity, int paramInt) {
    if (this.fjJ == null) {
      this.fjJ = paramEntity;
      this.lOb = j(this.fjJ);
      this.lOc = this.fjJ.mnQ;
      this.lOd = this.fjJ.mnR;
      this.lOc = 3.4028235E+38F;
      this.lOd = 3.4028235E+38F;
      return;
    }

    if (!this.lOb) {
      if (this.lOa == null) {
        if (!j(paramEntity)) {
          this.fjN.add(paramEntity);
        } else {
          if (this.lOa == null) {
            this.lOa = ((RenderTree)lNX.bQy());
          }
          this.lOa.a(paramEntity, paramInt + 1);
        }
      }
      else this.lOa.a(paramEntity, paramInt + 1);

      return;
    }

    if (k(paramEntity)) {
      if (this.lNZ == null) {
        this.lNZ = ((RenderTree)lNX.bQy());
      }
      this.lNZ.a(paramEntity, paramInt + 1);
    } else {
      if (this.lOa == null) {
        this.lOa = ((RenderTree)lNX.bQy());
      }
      this.lOa.a(paramEntity, paramInt + 1);
    }
  }

  public final void f(ArrayList paramArrayList, int paramInt)
  {
    for (int i = 0; i < this.lNY.size(); i++) {
      paramArrayList.add(this.lNY.get(i));
    }
    if (this.lNZ != null)
      this.lNZ.f(paramArrayList, paramInt);
    if (this.fjJ != null) {
      paramArrayList.add(this.fjJ);
    }
    for (i = 0; i < this.fjN.size(); i++) {
      paramArrayList.add(this.fjN.get(i));
    }

    if (paramInt > crL) {
      return;
    }

    if (this.lOa != null)
      this.lOa.f(paramArrayList, paramInt + 1);
  }

  public void b(Entity paramEntity) {
    this.cUn.add(paramEntity);
  }

  public void a(bSr parambSr) {
    r(parambSr);

    int i = this.cUn.size();
    for (int j = 0; j < i; j++)
      parambSr.a((Ul)this.cUn.get(j));
  }

  public void a(HashSet paramHashSet)
  {
    paramHashSet.addAll(this.fjN);
    paramHashSet.addAll(this.lNY);
    paramHashSet.addAll(this.cUn);
    if (this.lNZ != null)
      this.lNZ.a(paramHashSet);
    if (this.lOa != null)
      this.lOa.a(paramHashSet);
    if (this.fjJ != null)
      paramHashSet.add(this.fjJ);
  }

  protected void gL()
  {
  }

  protected void gM()
  {
    clear();
  }

  private void r(bSr parambSr)
  {
    int i = this.lNY.size();
    for (int j = 0; j < i; j++) {
      ((Entity)this.lNY.get(j)).a(parambSr);
    }
    if (this.lNZ != null)
      this.lNZ.r(parambSr);
    if (this.fjJ != null) {
      this.fjJ.a(parambSr);
    }
    j = this.fjN.size();
    for (int k = 0; k < j; k++) {
      ((Entity)this.fjN.get(k)).a(parambSr);
    }

    if (this.lOa != null)
      this.lOa.r(parambSr);
  }

  private boolean j(Entity paramEntity) {
    return paramEntity.cat > 1.0F;
  }

  private boolean k(Entity paramEntity) {
    if (paramEntity.mnQ < this.fjJ.mnQ)
      return true;
    if (paramEntity.mnR < this.fjJ.mnR)
      return true;
    return false;
  }
}