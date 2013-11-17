public abstract class cqq
  implements cFh
{
  public static int[] hZY;
  private boolean aYZ = true;
  private boolean hZZ = true;
  private adG dkk;
  private final Xg gyz = new Xg();
  private cdm bpU;

  public void a(cdm paramcdm)
  {
    this.bpU = paramcdm;
  }

  public void h(adG paramadG) {
    this.dkk = paramadG;
  }

  public boolean isVisible() {
    return this.hZZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.hZZ = paramBoolean;
  }

  protected void a(int paramInt, long paramLong, bSl parambSl) {
    aXt localaXt = (aXt)this.gyz.get(paramInt);
    if (localaXt == null)
      return;
    xk localxk = (xk)localaXt.get(paramLong);
    if (localxk == null) {
      return;
    }
    localxk.b(parambSl);
  }

  public boolean y(int paramInt, long paramLong) {
    aXt localaXt = (aXt)this.gyz.get(paramInt);
    return (localaXt != null) && (localaXt.N(paramLong));
  }

  public boolean wh(int paramInt) {
    aXt localaXt = (aXt)this.gyz.get(paramInt);
    return (localaXt != null) && (localaXt.size() != 0);
  }

  public void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, Object paramObject, aYY paramaYY) {
    removeAll();
    b(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramObject, paramaYY);
  }

  private void b(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, Object paramObject, aYY paramaYY) {
    aXt localaXt = (aXt)this.gyz.get(paramInt1);
    if (localaXt == null) {
      localaXt = new aXt();
      this.gyz.put(paramInt1, localaXt);
    }

    xk localxk = (xk)localaXt.get(paramLong);
    if (localxk != null) {
      a(localxk, paramInt2, paramInt3, paramInt4, false);
      localxk.setValue(paramObject);
    } else {
      localxk = a(paramInt1, this.bpU, paramObject, hZY[paramInt1], paramInt2, paramInt3, paramInt4);
      localxk.Gm();
      a(localxk, paramInt2, paramInt3, paramInt4, true);
      localaXt.c(paramLong, localxk);
    }

    localxk.a(paramaYY);
  }

  protected abstract xk a(int paramInt1, cdm paramcdm, Object paramObject, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4)
  {
    aXt localaXt = (aXt)this.gyz.get(paramInt1);
    if (localaXt == null) {
      return;
    }

    xk localxk = (xk)localaXt.get(paramLong);
    if (localxk == null) {
      return;
    }

    a(localxk, paramInt2, paramInt3, paramInt4, false);
  }

  private void a(xk paramxk, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (this.dkk == null) {
      return;
    }
    cYm localcYm = up.a(this.dkk, paramInt1, paramInt2, paramInt3);
    if (paramBoolean) {
      paramxk.setPosition(paramInt1, paramInt2, paramInt3);
      paramxk.setScreenPosition((int)localcYm.aOR, (int)localcYm.aOS);
    } else {
      paramxk.g(paramInt1, paramInt2, paramInt3);
      paramxk.L((int)localcYm.aOR, (int)localcYm.aOS);
    }
  }

  public void n(int paramInt, long paramLong) {
    aXt localaXt = (aXt)this.gyz.get(paramInt);
    if (localaXt == null) {
      return;
    }

    xk localxk = (xk)localaXt.remove(paramLong);
    if (localxk != null)
      localxk.clear();
  }

  public void wi(int paramInt)
  {
    aXt localaXt = (aXt)this.gyz.get(paramInt);
    if (localaXt == null) {
      return;
    }

    for (int i = localaXt.size() - 1; i >= 0; i--) {
      ((xk)localaXt.hc(i)).clear();
    }

    localaXt.clear();
  }

  public void removeAll() {
    int i = 0; for (int j = this.gyz.size(); i < j; i++) {
      wi(this.gyz.uM(i));
    }

    this.gyz.clear();
  }

  public void a(adG paramadG, int paramInt) {
    this.dkk = paramadG;

    boolean bool = false;

    if (this.hZZ != this.aYZ) {
      this.aYZ = this.hZZ;

      if (this.aYZ) {
        bool = true;
      } else {
        int i = 0; for (int j = this.gyz.size(); i < j; i++) {
          aXt localaXt = (aXt)this.gyz.hc(i);
          int k = 0; for (int m = localaXt.size(); k < m; k++) {
            ((xk)localaXt.hc(k)).clear();
          }
        }
      }

    }

    if (this.aYZ)
      a(paramadG, paramInt, bool);
  }

  private void a(adG paramadG, int paramInt, boolean paramBoolean)
  {
    rp localrp = paramadG.apF();
    bSl localbSl = localrp.xZ();

    int i = 0; for (int j = this.gyz.size(); i < j; i++) {
      aXt localaXt = (aXt)this.gyz.hc(i);
      for (int k = localaXt.size() - 1; k >= 0; k--) {
        xk localxk = (xk)localaXt.hc(k);
        int m = cwO.V(localxk.getX(), localxk.getY(), (short)localxk.Go());
        if (m == -32768) {
          m = (short)localxk.Go();
        }
        a(localxk, localxk.getX(), localxk.getY(), m, false);
        localxk.cz(paramInt);

        float f1 = localbSl.getWorldX() - localxk.getX();
        float f2 = localbSl.getWorldY() - localxk.getY();
        float f3 = cEl.ag(f1, f2);

        if (f3 < 4.0F) {
          removeAll();
          return;
        }
        int n = localxk.getScreenX();
        int i1 = localxk.getScreenY();

        boolean bool = localrp.B(i1, n, i1, n);
        localxk.e(bool, paramBoolean);
      }
    }
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2)
  {
  }
}