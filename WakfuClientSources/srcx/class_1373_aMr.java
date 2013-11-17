import java.nio.ByteBuffer;

class aMr
  implements aVw
{
  private long aTz;
  private long erW;
  private String bsW;
  private int dFY;
  private byte erX;
  private short eeb;
  private int eec;
  private byte erY;
  private long erZ;
  private dnm esa;

  public long getId()
  {
    return this.aTz;
  }

  public long bdG() {
    return this.erW;
  }

  public String bdH() {
    return this.bsW;
  }

  public int aFY() {
    return this.dFY;
  }

  public bCe Hy() {
    return bCe.dm(this.erX);
  }

  public short bdI() {
    return this.eeb;
  }

  public void bj(short paramShort) {
    this.eeb = ((short)(this.eeb - paramShort));
  }

  public void bk(short paramShort) {
    this.eeb = ((short)(this.eeb + paramShort));
  }

  public int bdJ() {
    return this.eec;
  }

  public bAp bdK() {
    return bAp.dh(this.erY);
  }

  public long bdL() {
    return this.erZ;
  }

  public dnm bdM() {
    return this.esa;
  }

  public boolean ek(long paramLong) {
    long l1 = bdK().gpg;
    long l2 = paramLong - this.erZ;
    return l2 > l1;
  }

  public int c(aVw paramaVw) {
    return (int)(this.erZ - paramaVw.bdL());
  }

  public int d(aVw paramaVw) {
    return (int)(bdK().gpg + this.erZ - (paramaVw.bdK().gpg + paramaVw.bdL()));
  }

  public byte[] bdN() {
    byte[] arrayOfByte = dzp.qC(this.bsW);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(18 + arrayOfByte.length + 4 + 1 + 2 + 4 + 1 + 8 + 1 + this.esa.O());
    localByteBuffer.putLong(this.aTz);
    localByteBuffer.putLong(this.erW);
    localByteBuffer.putShort((short)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.putInt(this.dFY);
    localByteBuffer.put(this.erX);
    localByteBuffer.putShort(this.eeb);
    localByteBuffer.putInt(this.eec);
    localByteBuffer.put(this.erY);
    localByteBuffer.putLong(this.erZ);
    localByteBuffer.put(this.esa.xH());
    this.esa.b(localByteBuffer);
    return localByteBuffer.array();
  }

  void a(long paramLong) {
    this.aTz = paramLong;
  }

  void el(long paramLong) {
    this.erW = paramLong;
  }

  void gU(String paramString) {
    this.bsW = paramString;
  }

  void ne(int paramInt) {
    this.dFY = paramInt;
  }

  void bS(byte paramByte) {
    this.erX = paramByte;
  }

  void bl(short paramShort) {
    this.eeb = paramShort;
  }

  void nf(int paramInt) {
    this.eec = paramInt;
  }

  void bT(byte paramByte) {
    this.erY = paramByte;
  }

  void em(long paramLong) {
    this.erZ = paramLong;
  }

  void b(dnm paramdnm) {
    this.esa = paramdnm;
  }

  public String toString() {
    return "MarketEntry{m_id=" + this.aTz + ", m_sellerId=" + this.erW + ", m_sellerName='" + this.bsW + '\'' + ", m_itemRefId=" + this.dFY + ", m_packType=" + this.erX + ':' + Hy() + ", m_packNumber=" + this.eeb + ", m_packPrice=" + this.eec + ", m_duration=" + this.erY + ':' + bdK() + ", m_releaseDate=" + this.erZ + '}';
  }
}