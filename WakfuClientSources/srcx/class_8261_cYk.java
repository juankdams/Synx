import org.apache.log4j.Logger;

public class cYk
{
  private static final Logger K = Logger.getLogger(cYk.class);
  private int hY;
  private int hZ;
  private short aOl;

  public cYk()
  {
  }

  public cYk(cYk paramcYk)
  {
    ac(paramcYk.hY, paramcYk.hZ, paramcYk.aOl);
  }

  public cYk(int[] paramArrayOfInt) {
    j(paramArrayOfInt);
  }

  public cYk(int paramInt1, int paramInt2, short paramShort) {
    ac(paramInt1, paramInt2, paramShort);
  }

  public cYk(cYk paramcYk, La paramLa) {
    ac(paramcYk.hY + paramLa.getX(), paramcYk.hZ + paramLa.getY(), (short)(paramcYk.aOl + paramLa.Go()));
  }

  public cYk(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = 0;
  }

  public cYm cLI()
  {
    return new cYm(this.hY, this.hZ);
  }

  public cYk zo(int paramInt) {
    this.hY *= paramInt;
    this.hZ *= paramInt;
    return this;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (!(paramObject instanceof cYk))) {
      return false;
    }
    cYk localcYk = (cYk)paramObject;

    return (this.hY == localcYk.hY) && (this.hZ == localcYk.hZ) && (this.aOl == localcYk.aOl);
  }

  public int hashCode()
  {
    long l = 1L;

    l = 31L * l + (this.hY & 0xFF);
    l = 31L * l + (this.hY >> 8 & 0xFF);
    l = 31L * l + (this.hY >> 16 & 0xFF);
    l = 31L * l + (this.hY >> 24 & 0xFF);

    l = 31L * l + (this.hZ & 0xFF);
    l = 31L * l + (this.hZ >> 8 & 0xFF);
    l = 31L * l + (this.hZ >> 16 & 0xFF);
    l = 31L * l + (this.hZ >> 24 & 0xFF);

    l = 31L * l + (this.aOl & 0xFF);
    l = 31L * l + (this.aOl >> 8 & 0xFF);
    l = 31L * l + (this.aOl >> 16 & 0xFF);
    l = 31L * l + (this.aOl >> 24 & 0xFF);

    return (int)(l ^ l >> 32);
  }

  public int cLJ() {
    long l = 1L;

    l = 31L * l + (this.hY & 0xFF);
    l = 31L * l + (this.hY >> 8 & 0xFF);
    l = 31L * l + (this.hY >> 16 & 0xFF);
    l = 31L * l + (this.hY >> 24 & 0xFF);

    l = 31L * l + (this.hZ & 0xFF);
    l = 31L * l + (this.hZ >> 8 & 0xFF);
    l = 31L * l + (this.hZ >> 16 & 0xFF);
    l = 31L * l + (this.hZ >> 24 & 0xFF);

    return (int)(l ^ l >> 32);
  }

  public String toString()
  {
    return "{Point3 : (" + this.hY + ", " + this.hZ + ", " + this.aOl + ") @" + Integer.toHexString(hashCode()) + "}";
  }

  public void p(int paramInt1, int paramInt2, int paramInt3)
  {
    this.hY += paramInt1;
    this.hZ += paramInt2;
    this.aOl = ((short)(this.aOl + paramInt3));
  }

  public void Y(cYk paramcYk) {
    this.hY += paramcYk.hY;
    this.hZ += paramcYk.hZ;
    this.aOl = ((short)(this.aOl + paramcYk.aOl));
  }

  public void add(int paramInt1, int paramInt2) {
    this.hY += paramInt1;
    this.hZ += paramInt2;
  }

  public boolean ae(int paramInt1, int paramInt2) {
    return (this.hY == paramInt1) && (this.hZ == paramInt2);
  }

  public boolean Z(int paramInt1, int paramInt2, int paramInt3) {
    return (this.hY == paramInt1) && (this.hZ == paramInt2) && (this.aOl == paramInt3);
  }

  public boolean bg(Object paramObject) {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    cYk localcYk = (cYk)paramObject;

    return (this.hY == localcYk.hY) && (this.hZ == localcYk.hZ);
  }

  public CG Z(cYk paramcYk)
  {
    int i = paramcYk.hY - this.hY;
    i = i > 0 ? 1 : i == 0 ? 0 : -1;
    int j = paramcYk.hZ - this.hZ;
    j = j > 0 ? 1 : j == 0 ? 0 : -1;

    return CG.T(i, j);
  }

  public CG aa(int paramInt1, int paramInt2, short paramShort) {
    int i = paramInt1 - this.hY;
    i = i > 0 ? 1 : i == 0 ? 0 : -1;
    int j = paramInt2 - this.hZ;
    j = j > 0 ? 1 : j == 0 ? 0 : -1;

    return CG.T(i, j);
  }

  public CG aa(cYk paramcYk)
  {
    int i = Math.abs(paramcYk.hY - this.hY);
    int j = Math.abs(paramcYk.hZ - this.hZ);

    CG localCG = Z(paramcYk);

    return a(i, j, localCG);
  }

  public static CG a(int paramInt1, int paramInt2, CG paramCG) {
    if (paramCG == null) {
      return null;
    }
    if (paramCG.LP()) {
      return paramCG;
    }
    switch (ug.RE[paramCG.ordinal()]) {
    case 1:
      return paramInt1 > paramInt2 ? CG.bFG : CG.bFM;
    case 2:
      return paramInt1 > paramInt2 ? CG.bFK : CG.bFI;
    case 3:
      return paramInt1 > paramInt2 ? CG.bFK : CG.bFM;
    case 4:
      return paramInt1 > paramInt2 ? CG.bFG : CG.bFI;
    }

    return null;
  }

  public CG ab(cYk paramcYk)
  {
    int i = paramcYk.hY - this.hY;
    i = i == 0 ? i : i / Math.abs(i);
    int j = paramcYk.hZ - this.hZ;
    j = j == 0 ? j : j / Math.abs(j);

    return CG.T(i, j);
  }

  public int ac(cYk paramcYk)
  {
    return Math.abs(paramcYk.hY - this.hY) + Math.abs(paramcYk.hZ - this.hZ);
  }

  public int ab(int paramInt1, int paramInt2, short paramShort) {
    return Math.abs(paramInt1 - this.hY) + Math.abs(paramInt2 - this.hZ);
  }

  public int eC(int paramInt1, int paramInt2) {
    return Math.abs(paramInt1 - this.hY) + Math.abs(paramInt2 - this.hZ);
  }

  public int X(int[] paramArrayOfInt) {
    if ((!bB) && ((paramArrayOfInt == null) || (paramArrayOfInt.length < 2))) throw new AssertionError();
    return Math.abs(paramArrayOfInt[0] - this.hY) + Math.abs(paramArrayOfInt[1] - this.hZ);
  }

  public int ad(cYk paramcYk)
  {
    int i = ac(paramcYk);
    if (i <= 1)
      return 0;
    return i - 1;
  }

  public void reset() {
    this.hY = 0;
    this.hZ = 0;
    this.aOl = 0;
  }

  public void j(int[] paramArrayOfInt) {
    if (paramArrayOfInt.length > 1) {
      this.hY = paramArrayOfInt[0];
      this.hZ = paramArrayOfInt[1];
      if (paramArrayOfInt.length > 2)
        this.aOl = ((short)paramArrayOfInt[2]);
      else
        this.aOl = 0;
    }
    else {
      throw new IllegalArgumentException("La longueur du tableau passe en parametre n'est pas adaptee : " + paramArrayOfInt.length);
    }
  }

  public void ac(int paramInt1, int paramInt2, short paramShort) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }

  public void ae(cYk paramcYk)
  {
    this.hY = paramcYk.hY;
    this.hZ = paramcYk.hZ;
    this.aOl = paramcYk.aOl;
  }

  public void k(CG paramCG) {
    this.hY += paramCG.hY;
    this.hZ += paramCG.hZ;
  }

  public void s(cEi paramcEi) {
    this.hY = ((int)(this.hY + paramcEi.getX()));
    this.hZ = ((int)(this.hZ + paramcEi.getY()));
    this.aOl = ((short)(int)(this.aOl + paramcEi.aCv()));
  }

  public void aa(int paramInt1, int paramInt2, int paramInt3) {
    this.hY -= paramInt1;
    this.hZ -= paramInt2;
    this.aOl = ((short)(this.aOl - paramInt3));
  }

  public void af(cYk paramcYk) {
    this.hY -= paramcYk.hY;
    this.hZ -= paramcYk.hZ;
    this.aOl = ((short)(this.aOl - paramcYk.aOl));
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public void dG(short paramShort) {
    this.aOl = paramShort;
  }

  public int[] toIntArray() {
    return new int[] { this.hY, this.hZ, this.aOl };
  }

  public boolean eD(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == this.hY) && (paramInt2 == this.hZ)) || ((paramInt1 == this.hY - 1) && (paramInt2 == this.hZ)) || ((paramInt1 == this.hY) && (paramInt2 == this.hZ - 1)) || ((paramInt1 == this.hY + 1) && (paramInt2 == this.hZ)) || ((paramInt1 == this.hY) && (paramInt2 == this.hZ + 1));
  }

  public boolean eE(int paramInt1, int paramInt2)
  {
    return (eD(paramInt1, paramInt2)) || ((paramInt1 == this.hY - 1) && (paramInt2 == this.hZ - 1)) || ((paramInt1 == this.hY + 1) && (paramInt2 == this.hZ + 1)) || ((paramInt1 == this.hY - 1) && (paramInt2 == this.hZ + 1)) || ((paramInt1 == this.hY + 1) && (paramInt2 == this.hZ - 1));
  }

  public boolean ag(cYk paramcYk)
  {
    if (paramcYk == null)
      return false;
    if (equals(paramcYk))
      return false;
    return (this.hY == paramcYk.hY) || (this.hZ == paramcYk.hZ);
  }

  public boolean c(cYk paramcYk1, cYk paramcYk2)
  {
    if ((paramcYk1 == null) || (paramcYk2 == null))
      return false;
    if ((equals(paramcYk1)) || (equals(paramcYk2)))
      return false;
    return ((this.hY == paramcYk1.hY) && (this.hY == paramcYk2.hY)) || ((this.hZ == paramcYk1.hZ) && (this.hZ == paramcYk2.hZ));
  }
}