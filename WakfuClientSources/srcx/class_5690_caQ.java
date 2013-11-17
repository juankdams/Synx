import org.apache.log4j.Logger;

public abstract class caQ
{
  protected static final Logger K = Logger.getLogger(caQ.class);
  protected final ZG hrz;
  protected final cbI hrA;
  private boolean hrB = false;
  protected final float cLD;
  private int hrC = 0;
  private int hrD = 0;
  private boolean bim = false;
  private long hrE = -1L;
  private boolean hrF = false;
  private boolean hrG = false;
  private boolean eoq = false;
  private float hrH = 0.0F;
  private long hrI = 0L;

  private float gbY = -1.0F;
  private long aFb;
  private final cEi hrJ = new cEi();

  public static caQ a(ZG paramZG, cbI paramcbI, float paramFloat1, boolean paramBoolean1, boolean paramBoolean2, float paramFloat2) {
    if (paramBoolean1) {
      return new cZC(paramZG, paramcbI, paramFloat1, paramBoolean2, paramFloat2);
    }
    return new ddb(paramZG, paramcbI, paramFloat1, paramBoolean2, paramFloat2);
  }

  public caQ(ZG paramZG, cbI paramcbI, float paramFloat1, boolean paramBoolean, float paramFloat2)
  {
    this.hrz = paramZG;
    this.hrA = paramcbI;
    this.cLD = paramFloat1;
    this.hrF = false;
    this.hrG = true;
    this.eoq = paramBoolean;
    this.hrH = paramFloat2;
    this.aFb = -1L;
  }

  public void jdMethod_do(int paramInt1, int paramInt2) {
    this.hrC = (paramInt1 * 1000);
    this.hrD = (paramInt2 * 1000);
    long l = System.currentTimeMillis();
    this.hrE = (l + bCO.sf(this.hrD - this.hrC) + this.hrC);
  }

  public ZG ceQ() {
    return this.hrz;
  }

  public void a(long paramLong, cEi paramcEi, float paramFloat, boolean paramBoolean, int paramInt) {
    if (paramBoolean)
      this.bim = paramBoolean;
    else if (!this.bim) {
      return;
    }

    if (this.aFb == -1L) {
      this.aFb = paramLong;
    }

    if ((paramLong - this.aFb > this.hrz.alg()) && (!this.hrz.akR())) {
      gM(true);
      return;
    }

    if (this.gbY == -1.0F) {
      this.gbY = this.hrz.alh();
    }

    this.hrJ.m(this.hrA.OZ(), this.hrA.Pa(), this.hrA.Pb());

    if (!this.hrA.Pc()) {
      this.hrJ.m(paramcEi);
    }

    float f = this.hrJ.czR();

    if (((this.eoq) && (f > this.cLD)) || (this.hrz.ala())) {
      gM(true);
      return;
    }

    this.hrz.hx(this.hrA.ca());

    if (f <= this.cLD) {
      this.hrF = false;
    } else if (f > this.cLD) {
      if (!this.hrF) {
        this.hrF = true;

        if (this.hrz.akY()) {
          this.hrz.bJ(true);
          this.hrz.q(0.0F, this.hrH);
        }

      }
      else if (this.hrz.alp()) {
        gM(true);
      }

      if (this.hrG)
      {
        return;
      }
    }

    if (this.hrE == -1L)
    {
      if ((this.hrG) || (!this.hrz.isPlaying())) {
        try {
          if (this.hrG) {
            if (!this.hrz.akS()) {
              gM(true);
              return;
            }
            if (this.hrI > 0L) {
              this.hrz.cu(this.hrI);
            }
            this.hrz.ae(0.0F);
            this.hrz.q(this.gbY, this.hrH);
            this.hrG = false;
          }
          this.hrz.play();
        } catch (Exception localException1) {
          K.error("Exception", localException1);
        }
      }

      i(this.hrJ);

      switch (this.hrz.cs(paramLong)) {
      case 0:
      case 2:
        this.hrI = this.hrz.alm();
        break;
      case 1:
        gM(true);
        break;
      case 3:
        this.hrG = true;
      }
    }
    else if (this.hrE < paramLong)
    {
      if ((this.hrG) || (!this.hrz.isPlaying())) {
        try {
          if (this.hrG) {
            if (!this.hrz.akS()) {
              gM(true);
              return;
            }
            if (this.hrI != -1L) {
              this.hrz.cu(this.hrI);
            }
            this.hrz.ae(0.0F);
            this.hrz.q(this.gbY, this.hrH);
            this.hrG = false;
          }
          this.hrz.play();
        }
        catch (Exception localException2) {
          K.error("Exception", localException2);
        }
      }

      i(this.hrJ);

      switch (this.hrz.cs(paramLong)) {
      case 0:
      case 2:
        this.hrI = this.hrz.alm();
        break;
      case 1:
        this.hrE = (paramLong + bCO.sf(this.hrD - this.hrC) + this.hrC);
        break;
      case 3:
        this.hrG = true;
        this.hrI = this.hrz.alm();
      }
    }
  }

  public boolean ceR()
  {
    return this.hrB;
  }

  public void release() {
    this.hrB = true;
  }

  public void ac(float paramFloat) {
    this.hrz.ac(paramFloat);
  }

  public void ad(float paramFloat) {
    this.hrz.ad(paramFloat);
  }

  public void ale() {
    this.hrz.ale();
  }

  public void alf() {
    this.hrz.alf();
  }

  public void ai(float paramFloat) {
    this.hrz.ai(paramFloat);
  }

  public void ag(float paramFloat) {
    this.hrz.ag(paramFloat);
  }

  public void gL(boolean paramBoolean) {
    this.hrz.setMute(paramBoolean);
  }

  public void gM(boolean paramBoolean) {
    this.hrB = paramBoolean;
  }

  public abstract void i(cEi paramcEi);

  public String toString() {
    return this.hrz.toString();
  }
}