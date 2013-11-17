class aRB
  implements Runnable
{
  private ccG eOx;
  private boolean eOy;
  private float eOz;
  private float eOA;
  private float eOB;
  private boolean cBd;

  public aRB(abS paramabS, ccG paramccG)
  {
    this.eOx = paramccG;
  }

  public void run() {
    float f1 = this.eOx.getOffset();
    float f2 = this.eOy ? this.eOz : -this.eOz;

    if (this.eOB != 32767.0F)
    {
      int i;
      if (this.eOy)
        i = this.eOx.getOffset() - this.eOA + f2 >= this.eOB ? 1 : 0;
      else {
        i = this.eOx.getOffset() - this.eOA + f2 <= this.eOB ? 1 : 0;
      }
      if (i != 0) {
        a(f1, f2, this.eOy);
        return;
      }
    }
    abS.a(this.eOC, this.eOx, f1 + f2);
  }

  private void a(short paramShort, boolean paramBoolean, float paramFloat) {
    this.cBd = false;

    this.eOA = (paramShort == 32767 ? -(float)(Math.random() * abS.d(this.eOC).aiP()) : (float)Math.floor(this.eOx.getOffset()));
    abS.a(this.eOC, this.eOx, this.eOA);

    if (paramShort == 32767) {
      this.eOB = paramShort;
    } else {
      short s = this.eOx.size();
      if (s - paramShort > Math.abs(this.eOA) % s) {
        if (paramBoolean)
          this.eOB = bCO.bD(paramShort - this.eOA % s);
        else {
          this.eOB = (-bCO.bD(s - paramShort - Math.abs(this.eOA % s)));
        }

      }
      else if (paramBoolean)
        this.eOB = bCO.bD(s - this.eOA % s + paramShort);
      else {
        this.eOB = (-bCO.bD(s + (s - paramShort) - Math.abs(this.eOA) % s));
      }
    }

    this.eOy = paramBoolean;
    this.eOz = paramFloat;

    dka.cSF().j(this);
    dka.cSF().a(this, 25L);
  }

  private boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean) {
      i = bCO.aB(paramFloat1);
      j = paramFloat1 + paramFloat2 >= i ? 1 : 0;
    } else {
      i = bCO.bD(paramFloat1);
      j = paramFloat1 + paramFloat2 <= i ? 1 : 0;
    }
    if (j != 0) {
      abS.a(this.eOC, this.eOx, i);
      dka.cSF().j(this);
      this.cBd = true;

      abS.e(this.eOC);

      return true;
    }
    return false;
  }

  public boolean azx() {
    return this.cBd;
  }

  public void a(boolean paramBoolean, float paramFloat) {
    a((short)32767, paramBoolean, paramFloat);
  }
}