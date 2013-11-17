public abstract class afk extends cWG
{
  private int aw;
  private boolean cXL;
  private byte cXM;
  private short cXN;
  private int cXO;
  private long cXP;
  private double cXQ;
  private float cXR;
  private String cXS;

  public afk(dUd paramdUd)
  {
    d(paramdUd);
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    return true;
  }

  public byte[] encode()
  {
    return null;
  }

  public void d(int paramInt)
  {
    this.aw = paramInt;
  }

  public int getId()
  {
    return this.aw;
  }

  public void bc() {
  }

  public void aJ() {
  }

  public byte af() {
    return this.cXM;
  }

  public void a(byte paramByte) {
    this.cXM = paramByte;
  }

  public int getIntValue() {
    return this.cXO;
  }

  public void e(int paramInt) {
    this.cXO = paramInt;
  }

  public long ah() {
    return this.cXP;
  }

  public void c(long paramLong) {
    this.cXP = paramLong;
  }

  public short ag() {
    return this.cXN;
  }

  public void ar(short paramShort) {
    this.cXN = paramShort;
  }

  public double getDoubleValue() {
    return this.cXQ;
  }

  public void setDoubleValue(double paramDouble) {
    this.cXQ = paramDouble;
  }

  public float ai() {
    return this.cXR;
  }

  public void a(float paramFloat) {
    this.cXR = paramFloat;
  }

  public String getStringValue() {
    return this.cXS;
  }

  public void a(String paramString) {
    this.cXS = paramString;
  }

  public boolean getBooleanValue() {
    return this.cXL;
  }

  public void c(boolean paramBoolean) {
    this.cXL = paramBoolean;
  }
}