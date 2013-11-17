import java.util.HashMap;

class duj extends oe
{
  private axU bOK;
  private int lxM;
  private int kyz;
  private int lxN;
  private int kyA;
  private int lxO;
  private int lxP;
  private int lxQ;
  private int lxR;
  private int ia;
  private int ib;
  private axU lxS;
  private int lxT;
  private int lxU;
  private int lxV;
  private int lxW;
  private int lxX;
  private int lxY;
  private int lxZ;
  private int lya;
  private int lyb;
  private int lyc;
  private int lyd;
  private boolean hiH = true;

  private duj(kd paramkd, ddp paramddp) {
    setDelay(0);
    setDuration(250);
    yc(1);
    setTweenFunction(paramddp);
  }

  public void a(axU paramaxU, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    this.bOK = paramaxU;
    this.lxM = paramInt1;
    this.lxN = paramInt3;
    this.lxO = paramInt5;
    this.lxQ = paramInt7;
    this.kyz = paramInt2;
    this.kyA = paramInt4;
    this.lxP = paramInt6;
    this.lxR = paramInt8;
    this.ia = paramInt9;
    this.ib = paramInt10;

    int i = ((Integer)kd.a(this.aAW).get(this.bOK)).intValue();
    kd.a(this.aAW).put(this.bOK, Integer.valueOf(i + 1));
  }

  public void b(axU paramaxU, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    this.lxS = paramaxU;
    this.lxT = paramInt1;
    this.lxV = paramInt3;
    this.lxX = paramInt5;
    this.lxZ = paramInt7;
    this.lxU = paramInt2;
    this.lxW = paramInt4;
    this.lxY = paramInt6;
    this.lya = paramInt8;
    this.lyb = paramInt9;
    this.lyc = paramInt10;

    int i = ((Integer)kd.a(this.aAW).get(this.lxS)).intValue();
    kd.a(this.aAW).put(this.lxS, Integer.valueOf(i + 1));
  }

  public boolean ais() {
    return this.bOK != null;
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null) {
      int i = this.aAW.getAppearance().getContentWidth();
      if (this.hiH) {
        this.lyd = (kd.b(this.aAW).getX() - i);
        this.hiH = false;
      }
      int k;
      int m;
      int n;
      if (this.bmM < this.aKS / 2) {
        j = (int)this.dRn.a(this.lxM, this.lxN, this.bmM, this.aKS / 2);
        k = (int)this.dRn.a(this.kyz, this.kyA, this.bmM, this.aKS / 2);
        this.bOK.setPosition(j + i, k);
        if (this.lxS != null) {
          m = (int)this.dRn.a(this.lxT, this.lxV, this.bmM, this.aKS / 2);
          n = (int)this.dRn.a(this.lxU, this.lxW, this.bmM, this.aKS / 2);
          this.lxS.setPosition(m + i, n);
        }
      } else {
        j = (int)this.dRn.a(this.lxO, this.lxQ, this.bmM - this.aKS / 2, this.aKS / 2);
        k = (int)this.dRn.a(this.lxP, this.lxR, this.bmM - this.aKS / 2, this.aKS / 2);
        this.bOK.setPosition(j + i, k);
        if (this.lxS != null) {
          m = (int)this.dRn.a(this.lxX, this.lxZ, this.bmM - this.aKS / 2, this.aKS / 2);
          n = (int)this.dRn.a(this.lxY, this.lya, this.bmM - this.aKS / 2, this.aKS / 2);
          this.lxS.setPosition(m + i, n);
        }
      }

      int j = (int)this.dRn.a(this.lyd, this.lyd + 72, this.bmM, this.aKS);
      kd.b(this.aAW).setX(j + i);
    }
    return true;
  }

  public void nv() {
    int i = this.aAW.getAppearance().getContentWidth();
    this.bOK.setPosition(this.lxQ + i, this.lxR);
    this.bOK.setSize(this.ia, this.ib);
    kd.b(this.aAW).setX(this.lyd + i);

    int j = ((Integer)kd.a(this.aAW).get(this.bOK)).intValue();
    if (j == 1) {
      kd.a(this.aAW).remove(this.bOK);
      this.bOK.beH();
    } else {
      kd.a(this.aAW).put(this.bOK, Integer.valueOf(j - 1));
    }

    if (this.lxS != null) {
      this.lxS.setPosition(this.lxZ + i, this.lya);
      this.lxS.setSize(this.lyb, this.lyc);

      j = ((Integer)kd.a(this.aAW).get(this.lxS)).intValue();
      if (j == 1) {
        kd.a(this.aAW).remove(this.lxS);
        this.lxS.beH();
      } else {
        kd.a(this.aAW).put(this.lxS, Integer.valueOf(j - 1));
      }
    }
    super.nv();
  }
}