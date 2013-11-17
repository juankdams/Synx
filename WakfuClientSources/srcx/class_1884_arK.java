import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class arK extends bCd
{
  protected static final Logger K = Logger.getLogger(arK.class);
  private static final boolean DEBUG = false;
  public static final int dAi = 0;
  public static final int dAj = 1;
  public static final int dAk = 0;
  public static final int dAl = 1;
  public static final int dAm = 0;
  public static final int dAn = 1;
  public static final int dAo = 2;
  private final cbQ dAp = new cbQ();

  private boolean dAq = false;
  protected final cbQ dAr = new cbQ();

  private int dAs = 0;

  private int dAt = 0;

  private int dAu = 0;
  private int dAv = 0; private int dAw = 0;
  private int dAx = 0; private int dAy = 0;
  private boolean dAz = true;

  private int dAA = 5;
  private int dAB;
  private int dAC;
  private int dAD = 0;
  protected aOv cLK;
  private long dAE;
  private long bWA;
  private long dAF;
  private long dAG;
  private long dAH;
  private long dAI;
  private int dAJ;
  private long dAK;
  private long dAL;
  private long dAM;
  private int dAN;
  private ZG dAO;
  private ZG dAP;
  private int dAQ = 0;
  private long dAR;
  private boolean dAS = false;
  private ccw dAT;

  public void a(aOv paramaOv)
  {
    this.cLK = paramaOv;
  }

  public aOv akO() {
    return this.cLK;
  }

  public int aDW() {
    return this.dAu;
  }

  public void jH(int paramInt) {
    this.dAu = paramInt;
  }

  public int aDX() {
    return this.dAv;
  }

  public void jI(int paramInt) {
    this.dAv = paramInt;
    this.dAw = Math.max(this.dAv, this.dAw);
  }

  public int aDY() {
    return this.dAw;
  }

  public void jJ(int paramInt) {
    this.dAw = paramInt;
    this.dAv = Math.min(this.dAv, this.dAw);
  }

  public int aDZ() {
    return this.dAx;
  }

  public void jK(int paramInt) {
    this.dAx = paramInt;
    this.dAy = Math.max(this.dAx, this.dAy);
  }

  public int aEa() {
    return this.dAy;
  }

  public void jL(int paramInt) {
    this.dAy = paramInt;
    this.dAx = Math.min(this.dAx, this.dAy);
  }

  public int aEb() {
    return this.dAC;
  }

  public void jM(int paramInt) {
    this.dAC = paramInt;
  }

  public int aEc() {
    return this.dAD;
  }

  public void jN(int paramInt) {
    this.dAD = paramInt;
  }

  public int aEd() {
    return this.dAt;
  }

  public void jO(int paramInt) {
    this.dAt = paramInt;
  }

  public int getInitialDelay() {
    return this.dAQ;
  }

  public void setInitialDelay(int paramInt) {
    this.dAQ = paramInt;
  }

  public void dj(long paramLong) {
    this.dAp.add(paramLong);
    this.dAq = false;
  }

  public void d(long[] paramArrayOfLong) {
    this.dAp.o(paramArrayOfLong);
    this.dAq = false;
  }

  public void a(ccw paramccw) {
    this.dAT = paramccw;
  }

  public arK aEe() {
    if (isValid()) {
      return this;
    }

    return null;
  }

  public void v(ArrayList paramArrayList) {
    if (isValid())
      paramArrayList.add(this);
  }

  public void a(ArrayList paramArrayList, rP paramrP)
  {
  }

  public void a(ArrayList paramArrayList, wK paramwK)
  {
  }

  public void dk(long paramLong)
  {
    aEn();

    this.dAE = paramLong;
    this.dAH = (this.dAG = this.dAI = this.dAJ = 0);

    if (aEk()) {
      this.dAs = 0;
    }

    if (this.dAQ != 0) {
      this.dAR = (paramLong + this.dAQ);
      this.dAF = (this.dAC >= 0 ? this.dAR + this.dAC : 0L);
      this.dAS = true;
      return;
    }
    this.dAF = (this.dAC >= 0 ? paramLong + this.dAC : 0L);

    this.dAS = true;
  }

  public void stop(long paramLong) {
    stop();
  }

  public void stop() {
    aEn();
    this.dAS = false;
  }

  public boolean dl(long paramLong) {
    this.bWA = paramLong;
    if (!this.dAS) {
      return true;
    }

    if (this.dAR != 0L) {
      if (paramLong < this.dAR) {
        return true;
      }
      this.dAR = 0L;
    }

    if ((this.dAC != -1) && (this.dAF <= this.bWA)) {
      aEn();
      this.dAS = false;

      return false;
    }
    long l;
    if (!aEk()) {
      if (this.dAO == null) {
        l = aEh();
        if (l == -1L) {
          return false;
        }
        boolean bool = false;
        switch (this.dAD) {
        case 1:
          bool = true;
          break;
        case 2:
          bool = false;
        }

        this.dAO = d(l, bool);
        if (this.dAO == null) {
          return false;
        }

        if (this.dAD == 2) {
          this.dAC = this.dAO.alg();
          this.dAF = (this.dAQ != 0 ? this.dAR + this.dAC : this.dAE + this.dAC);
        }

        if (this.dAT != null) {
          this.dAT.d(this.dAO);
        }
        this.dAJ = aEg();

        float f2 = aEl();
        if (bKQ())
        {
          this.dAO.ae(f2);
          this.dAO.ag(f2);
        }
        else {
          this.dAO.ae(0.0F);
          this.dAO.ag(f2);
          this.dAO.q(f2, bCO.J(1000, 0, this.dAO.alg()));
        }

      }

      return true;
    }

    if (aEi())
    {
      if ((paramLong >= this.dAI) && (this.dAI != -1L))
      {
        if (this.dAP != null)
        {
          a(this.dAP, aEg());
        }

        if (this.dAO != null) {
          a(this.dAO, true, this.dAJ);
        }

        l = aEh();
        if (l == -1L) {
          return false;
        }
        this.dAP = d(l, false);

        if (this.dAP != null) {
          if (this.dAT != null)
            this.dAT.d(this.dAP);
          this.dAK = paramLong;
          this.dAL = (paramLong + this.dAP.alg());
          this.dAN = aEg();
          this.dAM = Math.max(this.dAK, this.dAL - this.dAN);

          this.dAP.ae(0.0F);
          float f1 = aEl();
          this.dAP.ag(f1);
          this.dAP.q(f1, aEf());
        }

        aEo();
      }
    }
    else {
      if (this.dAI == 0L) {
        this.dAI = (paramLong + aEf());
      }

      if ((paramLong >= this.dAH) && (this.dAH != 0L)) {
        a(this.dAO, false, 0.0F);
        this.dAO = null;
      }

      if (paramLong >= this.dAI)
      {
        l = aEh();
        if (l == -1L) {
          return false;
        }
        this.dAO = d(l, false);

        if (this.dAO != null) {
          if (this.dAT != null)
            this.dAT.d(this.dAO);
          this.dAG = paramLong;
          this.dAH = (paramLong + this.dAO.alg());
          this.dAJ = aEf();
          this.dAI = (this.dAH + this.dAJ);
          this.dAO.ae(aEl());
        }
      }
    }

    return true;
  }

  private void c(ZG paramZG) {
    if (this.dAT != null)
      this.dAT.d(paramZG);
  }

  protected abstract ZG d(long paramLong, boolean paramBoolean);

  private int aEf()
  {
    return bCO.cL(this.dAv, this.dAw);
  }

  private int aEg() {
    return bCO.cL(this.dAx, this.dAy);
  }

  private long aEh() {
    if (this.dAp.size() == 0) {
      return -1L;
    }

    if (!this.dAq) {
      aEm();
      this.dAs = 0;
    }

    if (this.dAs >= this.dAr.size())
    {
      if ((this.dAt == 1) && (this.dAr.size() > 1) && (this.dAB-- <= 0))
      {
        l = this.dAr.uD(this.dAr.size() - 1);
        do {
          aEm();
        }
        while (l == this.dAr.uD(0));
      }

      this.dAs = 0;
    }

    long l = this.dAr.uD(this.dAs);

    this.dAs += 1;

    return l;
  }

  private boolean aEi() {
    return this.dAu == 0;
  }

  private boolean aEj() {
    return this.dAD == 1;
  }

  private boolean aEk() {
    return this.dAD == 0;
  }

  private float aEl() {
    float f1 = alh();
    float f2 = alj();

    if (f2 == -1.0F) {
      return f1;
    }

    f2 = Math.max(f1, f2);
    return bCO.U(f1, f2);
  }

  private void aEm()
  {
    if ((!this.dAq) || (this.dAt == 1)) {
      this.dAr.clear();
      this.dAr.o(this.dAp.cfv());
      this.dAq = true;
    }

    if (this.dAt == 1) {
      this.dAr.a(bCO.gxi);
      int i = this.dAr.size() - 1; for (int j = this.dAA; i >= j; i--) {
        this.dAr.remove(i);
      }
      this.dAB = 20;
    }
  }

  private void aEn() {
    if (this.dAO != null) {
      a(this.dAO, true, 1000.0F);
      this.dAO = null;
    }

    if (this.dAP != null) {
      a(this.dAP, true, 1000.0F);
      this.dAP = null;
    }
  }

  private void a(ZG paramZG, float paramFloat)
  {
    a(paramZG, aEi(), paramFloat);
  }

  private void a(ZG paramZG, boolean paramBoolean, float paramFloat) {
    if (paramZG == null) {
      return;
    }

    if (paramBoolean) {
      paramZG.q(0.0F, paramFloat);
      paramZG.bH(true);
    } else {
      paramZG.ald();
    }
  }

  private void aEo() {
    this.dAO = this.dAP;
    this.dAG = this.dAK;
    this.dAI = this.dAM;
    this.dAH = this.dAL;
    this.dAJ = this.dAN;

    this.dAP = null;
    this.dAK = -1L;
    this.dAM = -1L;
    this.dAL = -1L;
    this.dAN = -1;
  }

  protected void a(czg paramczg)
  {
    super.a(paramczg);

    paramczg.inV = false;

    int i = 0; for (int j = this.dAp.size(); i < j; i++) {
      paramczg.inY.add(this.dAp.get(i));
    }

    paramczg.dAC = this.dAC;
    paramczg.dAD = this.dAD;

    paramczg.dAt = this.dAt;

    paramczg.ioc = this.dAu;
    paramczg.dAv = this.dAv;
    paramczg.dAw = this.dAw;

    paramczg.ioa = cpT.f(this.cLK).bcI();
  }

  public void z(dGy paramdGy) {
    paramdGy.d(this);
  }

  public arK aEp() {
    arK localarK = aEq();
    a(localarK);
    return localarK;
  }

  protected abstract arK aEq();

  protected void a(bCd parambCd) {
    arK localarK = (arK)parambCd;

    super.a(localarK);

    localarK.d(this.dAp.cfv());

    localarK.dAt = this.dAt;

    localarK.dAu = this.dAu;
    localarK.dAv = this.dAv;
    localarK.dAw = this.dAw;
    localarK.dAx = this.dAx;
    localarK.dAy = this.dAy;
    localarK.dAz = this.dAz;

    localarK.dAA = this.dAA;

    localarK.dAC = this.dAC;

    localarK.dAD = this.dAD;

    localarK.cLK = this.cLK;

    localarK.dAQ = this.dAQ;
  }
}