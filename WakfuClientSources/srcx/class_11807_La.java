public class La
{
  private int hY;
  private int hZ;
  private int bpL;

  public La()
  {
    this(0, 0, 0);
  }

  public La(La paramLa) {
    this(paramLa.hY, paramLa.hZ, paramLa.bpL);
  }

  public La(int[] paramArrayOfInt) {
    this(paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
  }

  public La(cYk paramcYk1, cYk paramcYk2) {
    this.hY = (paramcYk2.getX() - paramcYk1.getX());
    this.hZ = (paramcYk2.getY() - paramcYk1.getY());
    this.bpL = (paramcYk2.IB() - paramcYk1.IB());
  }

  public La(int paramInt1, int paramInt2, int paramInt3) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.bpL = paramInt3;
  }

  public La(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.hY = (paramInt4 - paramInt1);
    this.hZ = (paramInt5 - paramInt2);
    this.bpL = (paramInt6 - paramInt3);
  }

  public void j(int[] paramArrayOfInt) {
    this.hY = paramArrayOfInt[0];
    this.hZ = paramArrayOfInt[1];
    this.bpL = paramArrayOfInt[2];
  }

  public int getX() {
    return this.hY;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public int getY() {
    return this.hZ;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public int Go() {
    return this.bpL;
  }

  public void fH(int paramInt) {
    this.bpL = paramInt;
  }

  public La a(La paramLa) {
    return new La(paramLa.hY + this.hY, paramLa.hZ + this.hZ, paramLa.bpL + this.bpL);
  }

  public La b(La paramLa) {
    return new La(this.hY - paramLa.hY, this.hZ - paramLa.hZ, this.bpL - paramLa.bpL);
  }

  public La c(La paramLa) {
    return new La(this.hY * paramLa.hY + this.hY * paramLa.hZ + this.hY * paramLa.bpL, this.hZ * paramLa.hY + this.hZ * paramLa.hZ + this.hZ * paramLa.bpL, this.bpL * paramLa.hY + this.bpL * paramLa.hZ + this.bpL * paramLa.bpL);
  }

  public La fI(int paramInt)
  {
    return new La(paramInt * this.hY, paramInt * this.hZ, paramInt * this.bpL);
  }

  public La Q(float paramFloat) {
    return new La((int)(paramFloat * this.hY), (int)(paramFloat * this.hZ), (int)(paramFloat * this.bpL));
  }

  public float d(La paramLa) {
    return this.hY * paramLa.hZ + this.hZ * paramLa.bpL + this.bpL * paramLa.hY - paramLa.hY * this.hZ - paramLa.hZ * this.bpL - paramLa.bpL * this.hY;
  }

  public float e(La paramLa) {
    return this.hY * paramLa.hY + this.hZ * paramLa.hZ + this.bpL * paramLa.bpL;
  }

  public int Vv() {
    return this.hY * this.hY + this.hZ * this.hZ + this.bpL * this.bpL;
  }

  public int length() {
    int i = this.hY * this.hY + this.hZ * this.hZ + this.bpL * this.bpL;
    return bCO.si(i);
  }

  public La Vw() {
    int i = length();
    return fI(1 / i);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof La)))
      return false;
    La localLa = (La)paramObject;
    return (localLa.hY == this.hY) && (localLa.hZ == this.hZ) && (localLa.bpL == this.bpL);
  }

  public String toString()
  {
    return "[" + this.hY + " ; " + this.hZ + " ; " + this.bpL + "]";
  }

  public static CG l(float paramFloat1, float paramFloat2) {
    return cEi.l(paramFloat1, paramFloat2);
  }

  public CG Vx() {
    return cEi.l(this.hY, this.hZ);
  }

  public static CG m(float paramFloat1, float paramFloat2) {
    return cEi.m(paramFloat1, paramFloat2);
  }

  public CG Vy() {
    return cEi.m(this.hY, this.hZ);
  }

  public CG d(CG paramCG)
  {
    int i = this.hY + this.hZ;
    int j = this.hY - this.hZ;

    int k = paramCG.hY;
    int m = paramCG.hZ;
    if (i == 0) {
      i = k + m;
    }

    if (j == 0) {
      j = k - m;
    }

    if (i > 0) {
      if (j > 0) {
        return CG.bFG;
      }
      return CG.bFI;
    }
    if (j > 0) {
      return CG.bFM;
    }
    return CG.bFK;
  }

  public CG e(CG paramCG)
  {
    if ((this.hY == 0) && (this.hZ == 0)) {
      return CG.eu(paramCG.m_index);
    }

    return Vy();
  }

  public int hashCode()
  {
    if (!bB) throw new AssertionError("Il n'est pas prévu que ces objets comparables servent de clef dans une HashTable/HashMap.");
    return super.hashCode();
  }
}