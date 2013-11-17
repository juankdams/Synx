public abstract class dig extends aym
{
  protected short TD;
  protected int hY;
  protected int hZ;
  protected short aOl;
  protected int ibV;
  protected int ldQ;
  protected int dkR;
  protected boolean ldR = false;
  protected boolean ldS = false;
  private short cZu;
  protected final aIX ldT = new aIX();

  public final bJS ldU = new cmm(this, this, 12);

  public final bJS ldV = new cmq(this, this, 12);

  public final bJS ldW = new cmk(this, this, 2);

  public final bJS ldX = new cml(this, this, 1);

  public final bJS ldY = new cmj(this, this, 1);

  private cCH[] ldZ = { this.ldX, this.ldY, this.ldW, this.ldV, this.ldU };

  public long aE(byte paramByte)
  {
    return this.ldT.bO(paramByte);
  }

  public void a(byte paramByte, long paramLong) {
    this.ldT.c(paramByte, paramLong);
  }

  public void aD(byte paramByte) {
    this.ldT.bP(paramByte);
  }

  public cCH[] tn()
  {
    cCH[] arrayOfcCH = new cCH[super.tn().length + this.ldZ.length];
    System.arraycopy(super.tn(), 0, arrayOfcCH, 0, super.tn().length);
    System.arraycopy(this.ldZ, 0, arrayOfcCH, super.tn().length, this.ldZ.length);
    return arrayOfcCH;
  }

  public byte[] cRz() {
    cCH[] arrayOfcCH1 = { this.ldX, this.ldY, this.ldW, this.ldV };
    cCH[] arrayOfcCH2 = new cCH[super.tn().length + arrayOfcCH1.length];
    System.arraycopy(super.tn(), 0, arrayOfcCH2, 0, super.tn().length);
    System.arraycopy(arrayOfcCH1, 0, arrayOfcCH2, super.tn().length, arrayOfcCH1.length);
    return a(arrayOfcCH2);
  }

  public void reset() {
    super.reset();
    this.TD = 0;
    this.hY = 0;
    this.hZ = 0;
    this.aOl = 0;
    this.ibV = 0;
    this.ldQ = 0;
    this.dkR = 0;
    this.ldS = false;
    this.ldR = false;
    this.ldT.clear();
  }

  public short nU() {
    return this.cZu;
  }

  public short Lk() {
    return this.TD;
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

  public void Y(short paramShort) {
    this.TD = paramShort;
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

  public void aQ(short paramShort) {
    this.cZu = paramShort;
  }

  public int cqE() {
    return this.ibV;
  }

  public void Ae(int paramInt) {
    this.ibV = paramInt;
  }

  public int cPY() {
    return this.ldQ;
  }

  public void Af(int paramInt) {
    this.ldQ = paramInt;
  }

  public int cRA() {
    return this.dkR;
  }

  public void Ag(int paramInt) {
    this.dkR = paramInt;
  }

  public void jq(boolean paramBoolean) {
    this.ldR = paramBoolean;
  }

  public void fz(boolean paramBoolean) {
    this.ldS = paramBoolean;
  }

  public boolean cRB() {
    return this.ldR;
  }

  public boolean isDead() {
    return this.ldS;
  }
}