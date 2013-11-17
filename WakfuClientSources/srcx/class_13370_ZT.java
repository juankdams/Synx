import java.util.ArrayList;

public class ZT
{
  private final ArrayList bFw = new ArrayList();
  private final aQI cMA;
  private int aEf;
  private int aEg;
  private int aEh;
  private int aEi;
  private int cMB;
  private int cMC;
  private float blZ;
  private dDq bQC;

  public ZT(aQI paramaQI)
  {
    this.aEf = (this.aEg = 2147483647);
    this.aEh = (this.aEi = -2147483648);
    this.cMA = paramaQI;
  }

  public aQI alC() {
    return this.cMA;
  }

  public void b(dRn paramdRn) {
    this.bFw.add(paramdRn);
  }

  public void c(dRn paramdRn) {
    this.bFw.remove(paramdRn);
  }

  public ArrayList getChildren() {
    return this.bFw;
  }

  public void C(float paramFloat) {
    this.blZ = paramFloat;
  }

  public dth aM(int paramInt1, int paramInt2) {
    for (int i = this.bFw.size() - 1; i >= 0; i--) {
      dRn localdRn = (dRn)this.bFw.get(i);
      if (localdRn.isVisible())
      {
        dth localdth = localdRn.aM(paramInt1, paramInt2);
        if (localdth != null)
          return localdth;
      }
    }
    return null;
  }

  public void alD() {
    for (int i = this.bFw.size() - 1; i >= 0; i--) {
      dRn localdRn = (dRn)this.bFw.get(i);
      if (localdRn.isVisible())
      {
        this.aEf = Math.min(this.aEf, localdRn.getMinX());
        this.aEg = Math.min(this.aEg, localdRn.getMinY());
        this.aEh = Math.max(this.aEh, localdRn.KW());
        this.aEi = Math.max(this.aEi, localdRn.KX());
      }
    }
  }

  public float[] alE() { jY localjY = new jY();
    int i = (int)(this.cMA.aqT() * 10.0F);

    int j = 0; for (int k = this.bFw.size(); j < k; j++) {
      dRn localdRn = (dRn)this.bFw.get(j);
      if (localdRn.isVisible())
      {
        for (int m = localdRn.getMinX() - 1; m < localdRn.KW() + 1; m++)
          for (int n = localdRn.getMinY() - 1; n < localdRn.KX() + 1; n++) {
            dth localdth = localdRn.aM(m, n);
            int i1 = (localdRn.aM(m, n + 1) == null) && (aM(m, n + 1) != null) ? 1 : 0;
            int i2 = (localdRn.aM(m + 1, n) == null) && (aM(m + 1, n) != null) ? 1 : 0;

            if (localdth != null) {
              if (i1 != 0) {
                localjY.add(localdth.lvB);
                localjY.add(localdth.lvC + i);
                localjY.add(localdth.lvH);
                localjY.add(localdth.lvI + i);
              }
              if (i2 != 0) {
                localjY.add(localdth.lvF);
                localjY.add(localdth.lvG + i);
                localjY.add(localdth.lvH);
                localjY.add(localdth.lvI + i);
              }
            }
          }
      }
    }
    return localjY.rI(); }

  public float[] alF()
  {
    float f1 = 1.0F / this.blZ;
    float f2 = f1 / 2.0F;

    int i = (int)(this.cMA.aqT() * 10.0F);

    jY localjY = new jY();
    for (int j = this.aEf; j < this.aEh + 1; j++) {
      for (int k = this.aEg; k < this.aEi + 1; k++) {
        dth localdth1 = aM(j, k);

        if (localdth1 != null) {
          dth localdth2 = aM(j + 1, k);
          dth localdth3 = aM(j, k + 1);
          dth localdth4 = aM(j, k - 1);
          dth localdth5 = aM(j - 1, k);

          dth localdth6 = aM(j + 1, k - 1);
          dth localdth7 = aM(j + 1, k + 1);
          dth localdth8 = aM(j - 1, k - 1);
          dth localdth9 = aM(j - 1, k + 1);

          float f3 = localdth1.lvB + 2.0F * f1 + (localdth5 != null ? -f1 : 0.0F) + (localdth3 != null ? -f1 : 0.0F);
          float f4 = localdth1.lvC + i + (localdth5 != null ? f2 : 0.0F) + (localdth3 != null ? -f2 : 0.0F);
          float f5 = localdth1.lvF - 2.0F * f1 - (localdth2 != null ? -f1 : 0.0F) - (localdth4 != null ? -f1 : 0.0F);
          float f6 = localdth1.lvG + i - (localdth2 != null ? f2 : 0.0F) - (localdth4 != null ? -f2 : 0.0F);
          float f7 = localdth1.lvD + (localdth5 != null ? -f1 : 0.0F) + (localdth4 != null ? f1 : 0.0F);
          float f8 = localdth1.lvE + i - 2.0F * f2 + (localdth5 != null ? f2 : 0.0F) + (localdth4 != null ? f2 : 0.0F);
          float f9 = localdth1.lvH + (localdth2 != null ? f1 : 0.0F) + (localdth3 != null ? -f1 : 0.0F);
          float f10 = localdth1.lvI + i + 2.0F * f2 - (localdth2 != null ? f2 : 0.0F) - (localdth3 != null ? f2 : 0.0F);

          if (localdth4 == null) {
            if ((localdth6 != null) && (localdth2 != null)) {
              f5 = localdth1.lvF;
              f6 = localdth1.lvG - 2.0F * f2 + i;
            }
            if ((localdth8 != null) && (localdth5 != null)) {
              f7 = localdth1.lvD - 2.0F * f1;
              f8 = localdth1.lvE + i;
            }
          }
          if (localdth3 == null) {
            if ((localdth9 != null) && (localdth5 != null)) {
              f3 = localdth1.lvB;
              f4 = localdth1.lvC + 2.0F * f2 + i;
            }
            if ((localdth7 != null) && (localdth2 != null)) {
              f9 = localdth1.lvH + 2.0F * f1;
              f10 = localdth1.lvI + i;
            }
          }
          if (localdth5 == null) {
            if ((localdth8 != null) && (localdth4 != null)) {
              f7 = localdth1.lvD + 2.0F * f1;
              f8 = localdth1.lvE + i;
            }
            if ((localdth9 != null) && (localdth3 != null)) {
              f3 = localdth1.lvB;
              f4 = localdth1.lvC - 2.0F * f2 + i;
            }
          }
          if (localdth2 == null) {
            if ((localdth6 != null) && (localdth4 != null)) {
              f5 = localdth1.lvF;
              f6 = localdth1.lvG + 2.0F * f2 + i;
            }
            if ((localdth7 != null) && (localdth3 != null)) {
              f9 = localdth1.lvH - 2.0F * f1;
              f10 = localdth1.lvI + i;
            }
          }

          if (localdth3 == null) {
            localjY.add(f3);
            localjY.add(f4);
            localjY.add(f9);
            localjY.add(f10);
          }
          if (localdth4 == null) {
            localjY.add(f7);
            localjY.add(f8);
            localjY.add(f5);
            localjY.add(f6);
          }
          if (localdth2 == null) {
            localjY.add(f5);
            localjY.add(f6);
            localjY.add(f9);
            localjY.add(f10);
          }
          if (localdth5 == null) {
            localjY.add(f7);
            localjY.add(f8);
            localjY.add(f3);
            localjY.add(f4);
          }
        }
      }

    }

    return localjY.rI();
  }

  public bNa getColor() {
    return this.cMA.aqU();
  }

  public int getLineWidth() {
    return this.cMA.getBorderWidth();
  }

  public dDq getPixmap() {
    return this.bQC;
  }

  public void setPixmap(dDq paramdDq) {
    this.bQC = paramdDq;
  }

  public int alG() {
    return this.cMB;
  }

  public int alH() {
    return this.cMC;
  }

  public void cleanUp() {
    for (int i = this.bFw.size() - 1; i >= 0; i--) {
      dRn localdRn = (dRn)this.bFw.get(i);
      if ((localdRn != null) && (localdRn.getPixmap() != null) && (localdRn.getPixmap().hN() != null))
        localdRn.cleanUp();
    }
  }
}