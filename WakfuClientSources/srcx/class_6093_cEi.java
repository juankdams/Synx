public class cEi
{
  private static final float gxl = 3.141593F;
  private static final float ixE = 0.3926991F;
  private static final float ixF = 1.178097F;
  private static final float ixG = 1.963496F;
  private static final float ixH = 2.748894F;
  private static final float ixI = 0.7853982F;
  private static final float ixJ = 2.356195F;
  public float aOR;
  public float aOS;
  public float aOT;
  public static final cEi ixK = new cEi(1.0F, 0.0F, 0.0F);
  public static final cEi ixL = new cEi(0.0F, 1.0F, 0.0F);
  public static final cEi ixM = new cEi(0.0F, 0.0F, 1.0F);
  public static final cEi ixN = new cEi();

  public cEi() {
    this(0.0F, 0.0F, 0.0F);
  }

  public cEi(cEi paramcEi) {
    this(paramcEi.aOR, paramcEi.aOS, paramcEi.aOT);
  }

  public cEi(cYk paramcYk1, cYk paramcYk2) {
    this(paramcYk2.getX() - paramcYk1.getX(), paramcYk2.getY() - paramcYk1.getY(), paramcYk2.IB() - paramcYk1.IB());
  }

  public cEi(float[] paramArrayOfFloat) {
    this(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2]);
  }

  public cEi(int[] paramArrayOfInt) {
    this(paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
  }

  public cEi(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
  }

  public cEi(int paramInt1, int paramInt2, short paramShort1, int paramInt3, int paramInt4, short paramShort2) {
    this.aOR = (paramInt3 - paramInt1);
    this.aOS = (paramInt4 - paramInt2);
    this.aOT = (paramShort2 - paramShort1);
  }

  public float getX() {
    return this.aOR;
  }

  public void setX(float paramFloat) {
    this.aOR = paramFloat;
  }

  public float getY() {
    return this.aOS;
  }

  public void setY(float paramFloat) {
    this.aOS = paramFloat;
  }

  public float aCv() {
    return this.aOT;
  }

  public void aK(float paramFloat) {
    this.aOT = paramFloat;
  }

  public void m(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.aOR = paramFloat1;
    this.aOS = paramFloat2;
    this.aOT = paramFloat3;
  }

  public void j(int[] paramArrayOfInt) {
    this.aOR = paramArrayOfInt[0];
    this.aOS = paramArrayOfInt[1];
    this.aOT = paramArrayOfInt[2];
  }

  public void k(cEi paramcEi) {
    if (paramcEi == null) {
      return;
    }
    this.aOR = paramcEi.aOR;
    this.aOS = paramcEi.aOS;
    this.aOT = paramcEi.aOT;
  }

  public void l(cEi paramcEi) {
    if (paramcEi == null) {
      return;
    }
    this.aOR += paramcEi.aOR;
    this.aOS += paramcEi.aOS;
    this.aOT += paramcEi.aOT;
  }

  public void m(cEi paramcEi) {
    if (paramcEi == null) {
      return;
    }
    this.aOR -= paramcEi.aOR;
    this.aOS -= paramcEi.aOS;
    this.aOT -= paramcEi.aOT;
  }

  public void Q(double paramDouble) {
    this.aOR = ((float)(this.aOR * paramDouble));
    this.aOS = ((float)(this.aOS * paramDouble));
    this.aOT = ((float)(this.aOT * paramDouble));
  }

  public boolean y(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = cG(paramFloat1);
    boolean bool2 = cH(paramFloat2);
    boolean bool3 = cI(paramFloat3);
    return (bool1) || (bool2) || (bool3);
  }

  public boolean cG(float paramFloat)
  {
    if ((-paramFloat <= this.aOR) && (this.aOR <= paramFloat)) {
      return false;
    }
    float f1 = Math.abs(paramFloat);
    float f2 = Math.abs(this.aOR);

    this.aOT = (this.aOT * f1 / f2);
    this.aOS = (this.aOS * f1 / f2);
    this.aOR = (this.aOR > paramFloat ? paramFloat : -paramFloat);
    return true;
  }

  public boolean cH(float paramFloat)
  {
    if ((-paramFloat <= this.aOS) && (this.aOS <= paramFloat)) {
      return false;
    }
    float f1 = Math.abs(paramFloat);
    float f2 = Math.abs(this.aOS);

    this.aOT = (this.aOT * f1 / f2);
    this.aOR = (this.aOR * f1 / f2);
    this.aOS = (this.aOS > paramFloat ? paramFloat : -paramFloat);
    return true;
  }

  public boolean cI(float paramFloat)
  {
    if ((-paramFloat <= this.aOT) && (this.aOT <= paramFloat)) {
      return false;
    }
    float f1 = Math.abs(paramFloat);
    float f2 = Math.abs(this.aOT);

    this.aOS = (this.aOS * f1 / f2);
    this.aOR = (this.aOR * f1 / f2);
    this.aOT = (this.aOT > paramFloat ? paramFloat : -paramFloat);
    return true;
  }

  public cEi n(cEi paramcEi) {
    return new cEi(paramcEi.aOR + this.aOR, paramcEi.aOS + this.aOS, paramcEi.aOT + this.aOT);
  }

  public cEi o(cEi paramcEi) {
    return new cEi(this.aOR - paramcEi.aOR, this.aOS - paramcEi.aOS, this.aOT - paramcEi.aOT);
  }

  public cEi p(cEi paramcEi) {
    return new cEi(this.aOR * paramcEi.aOR + this.aOR * paramcEi.aOS + this.aOR * paramcEi.aOT, this.aOS * paramcEi.aOR + this.aOS * paramcEi.aOS + this.aOS * paramcEi.aOT, this.aOT * paramcEi.aOR + this.aOT * paramcEi.aOS + this.aOT * paramcEi.aOT);
  }

  public cEi cJ(float paramFloat)
  {
    return new cEi(paramFloat * this.aOR, paramFloat * this.aOS, paramFloat * this.aOT);
  }

  public float q(cEi paramcEi) {
    return this.aOR * paramcEi.aOR + this.aOS * paramcEi.aOS + this.aOT * paramcEi.aOT;
  }

  public float e(La paramLa) {
    return this.aOR * paramLa.getX() + this.aOS * paramLa.getY() + this.aOT * paramLa.Go();
  }

  public float r(cEi paramcEi) {
    return this.aOR * paramcEi.aOS + this.aOS * paramcEi.aOT + this.aOT * paramcEi.aOR - paramcEi.aOR * this.aOS - paramcEi.aOS * this.aOT - paramcEi.aOT * this.aOR;
  }

  public float czP() {
    return this.aOR * this.aOR + this.aOS * this.aOS + this.aOT * this.aOT;
  }

  public float czQ() {
    return (float)Math.sqrt(this.aOR * this.aOR + this.aOS * this.aOS + this.aOT * this.aOT);
  }

  public float czR() {
    return cEl.af(this.aOR, this.aOS);
  }

  public cEi czS() {
    float f = czQ();
    if (f == 0.0F)
      return new cEi(this.aOR, this.aOS, this.aOT);
    return cJ(1.0F / f);
  }

  public void czT() {
    float f = czQ();
    if (f == 0.0F) {
      return;
    }
    Q(1.0F / f);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof cEi)))
      return false;
    cEi localcEi = (cEi)paramObject;
    return (localcEi.aOR == this.aOR) && (localcEi.aOS == this.aOS) && (localcEi.aOT == this.aOT);
  }

  public String toString()
  {
    return "[" + this.aOR + " ; " + this.aOS + " ; " + this.aOT + "]";
  }

  public static CG l(float paramFloat1, float paramFloat2) {
    float f = -(float)Math.atan2(paramFloat2, paramFloat1);
    CG localCG;
    if ((f < 2.748894F) && (f >= 1.963496F))
      localCG = CG.bFL;
    else if ((f < 1.963496F) && (f >= 1.178097F))
      localCG = CG.bFM;
    else if ((f < 1.178097F) && (f >= 0.3926991F))
      localCG = CG.bFF;
    else if ((f < 0.3926991F) && (f >= -0.3926991F))
      localCG = CG.bFG;
    else if ((f < -0.3926991F) && (f >= -1.178097F))
      localCG = CG.bFH;
    else if ((f < -1.178097F) && (f >= -1.963496F))
      localCG = CG.bFI;
    else if ((f < -1.963496F) && (f >= -2.748894F))
      localCG = CG.bFJ;
    else {
      localCG = CG.bFK;
    }
    return localCG;
  }

  public CG Vx() {
    return l(this.aOR, this.aOS);
  }

  public static CG m(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F)) {
      return CG.bFP;
    }
    float f = -(float)Math.atan2(paramFloat2, paramFloat1);
    CG localCG;
    if ((f < 2.356195F) && (f >= 0.7853982F))
      localCG = CG.bFM;
    else if ((f < 0.7853982F) && (f >= -0.7853982F))
      localCG = CG.bFG;
    else if ((f < -0.7853982F) && (f >= -2.356195F))
      localCG = CG.bFI;
    else {
      localCG = CG.bFK;
    }

    return localCG;
  }

  public CG Vy() {
    return m(this.aOR, this.aOS);
  }

  public cEi czU() {
    return new cEi(-this.aOR, -this.aOS, -this.aOT);
  }

  public int hashCode()
  {
    if (!bB) throw new AssertionError("Il n'est pas prévu que ces objets comparables servent de clef dans une HashTable/HashMap.");
    return super.hashCode();
  }
}