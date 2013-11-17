package com.ankamagames.framework.graphics.engine.transformer;

import akE;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import dFe;
import java.util.ArrayList;

public class BatchTransformer extends akE
{
  public static final BatchTransformer.ObjectFactory gzl = new BatchTransformer.ObjectFactory();

  private static final Matrix44 gzm = (Matrix44)Matrix44.bFc.bQx();

  private final ArrayList gzn = new ArrayList(2);
  private Matrix44 gzo;
  private boolean Vm;
  private final ArrayList bFw = new ArrayList(1);
  private BatchTransformer gzp;

  public void sx(int paramInt)
  {
    sz(paramInt).Ls();
    bMH();
  }

  public void a(int paramInt, float paramFloat1, float paramFloat2) {
    dFe localdFe = sz(paramInt);
    if ((localdFe.ahn() == paramFloat1) && (localdFe.aho() == paramFloat2))
      return;
    localdFe.b(paramFloat1, paramFloat2, 0.0F);
    bMH();
  }

  public void b(int paramInt, float paramFloat1, float paramFloat2) {
    dFe localdFe = sz(paramInt);
    if ((localdFe.aGq() == paramFloat1) && (localdFe.aGr() == paramFloat2))
      return;
    localdFe.c(paramFloat1, paramFloat2, 1.0F);
    bMH();
  }

  public final void a(BatchTransformer paramBatchTransformer)
  {
    a(this.bFw.size(), paramBatchTransformer);
  }

  public final void a(int paramInt, BatchTransformer paramBatchTransformer) {
    if ((!bB) && (paramBatchTransformer == null)) throw new AssertionError("Child can't be null");
    paramBatchTransformer.gQ();
    paramBatchTransformer.c(this);
    this.bFw.add(paramInt, paramBatchTransformer);
  }

  public final void b(BatchTransformer paramBatchTransformer) {
    if ((!bB) && (paramBatchTransformer == null)) throw new AssertionError("Child can't be null");
    paramBatchTransformer.c(null);
    if (this.bFw.remove(paramBatchTransformer))
      paramBatchTransformer.axl();
  }

  public final void sy(int paramInt) {
    if ((!bB) && ((paramInt <= 0) || (paramInt >= this.bFw.size()))) throw new AssertionError("Index out of bound");
    b((BatchTransformer)this.bFw.get(paramInt));
  }

  public final void removeAllChildren() {
    int i = this.bFw.size();
    for (int j = 0; j < i; j++) {
      BatchTransformer localBatchTransformer = (BatchTransformer)this.bFw.get(j);
      localBatchTransformer.c(null);
      localBatchTransformer.axl();
    }
    this.bFw.clear();
  }

  public final void a(dFe paramdFe) {
    this.gzn.add(paramdFe);
    bMH();
  }

  public final void a(int paramInt, dFe paramdFe) {
    this.gzn.add(paramInt, paramdFe);
    bMH();
  }

  public final dFe sz(int paramInt) {
    return (dFe)this.gzn.get(paramInt);
  }

  public final void b(int paramInt, dFe paramdFe) {
    this.gzn.set(paramInt, paramdFe);
    bMH();
  }

  public final void clear() {
    this.gzp = null;
    removeAllChildren();
    this.gzn.clear();
    bMH();
  }

  public final Matrix44 aGp() {
    if (!this.Vm) {
      return this.gzo;
    }
    int i = this.gzn.size();
    if (i == 0) {
      this.gzo.Ls();
    } else if (i > 4) {
      this.gzo.a(((dFe)this.gzn.get(i - 2)).aGp(), ((dFe)this.gzn.get(i - 1)).aGp());
      for (int j = i - 3; j >= 0; j--) {
        gzm.a(this.gzo);
        this.gzo.a(((dFe)this.gzn.get(j)).aGp(), gzm);
      }
    } else {
      switch (i) {
      case 1:
        this.gzo.a(((dFe)this.gzn.get(0)).aGp());
        break;
      case 2:
        this.gzo.a(((dFe)this.gzn.get(0)).aGp(), ((dFe)this.gzn.get(1)).aGp());
        break;
      case 3:
        this.gzo.a(((dFe)this.gzn.get(0)).aGp(), ((dFe)this.gzn.get(1)).aGp(), ((dFe)this.gzn.get(2)).aGp());
        break;
      case 4:
        this.gzo.a(((dFe)this.gzn.get(0)).aGp(), ((dFe)this.gzn.get(1)).aGp(), ((dFe)this.gzn.get(2)).aGp(), ((dFe)this.gzn.get(3)).aGp());
      }

    }

    if (this.gzp != null) {
      if (this.gzo.isIdentity())
        this.gzo.a(this.gzp.aGp());
      else {
        this.gzo.c(this.gzp.aGp());
      }
    }

    ic();
    return this.gzo;
  }

  protected void gL()
  {
    if (this.gzo == null) {
      this.gzo = ((Matrix44)Matrix44.bFc.bQy());
    }
    bMH();
  }

  protected void gM()
  {
    int i = this.bFw.size();
    removeAllChildren();
    if (i > 1) {
      this.bFw.trimToSize();
    }
    int j = this.gzn.size();
    this.gzn.clear();
    if (j > 2) {
      this.gzn.trimToSize();
    }
    this.gzp = null;
    this.gzo.axl();
    this.gzo = null;
  }

  private void c(BatchTransformer paramBatchTransformer)
  {
    this.gzp = paramBatchTransformer;
    bMH();
  }

  public void bMH() {
    if (this.Vm) {
      return;
    }
    this.Vm = true;
    int i = this.bFw.size();
    for (int j = 0; j < i; j++)
      ((BatchTransformer)this.bFw.get(j)).bMH();
  }

  private void ic() {
    this.Vm = false;
    if ((!bB) && (this.gzp != null) && (this.gzp.Vm)) throw new AssertionError();
  }
}