public class pq
{
  private final long iI;
  private final String m_name;
  private short aVr;
  private long aVs;
  private boolean aVt;
  private boolean aVu;
  private long aVv = 0L;
  private long aVw = 0L;
  private long aVx = 0L;
  private final il aVy = new il();
  private final il aVz = new il();
  private final il aVA = new il();
  private final aoL aVB = new aoL();

  public pq(long paramLong, String paramString) {
    this.iI = paramLong;
    this.m_name = paramString;
  }

  public pq(long paramLong, byte[] paramArrayOfByte) {
    this.iI = paramLong;
    this.m_name = dzp.aJ(paramArrayOfByte);
  }

  public long eq() {
    return this.iI;
  }

  public String getName() {
    return this.m_name;
  }

  public short wB() {
    return this.aVr;
  }

  public long wC() {
    return this.aVs;
  }

  public void a(long paramLong, short paramShort) {
    this.aVs = paramLong;
    this.aVr = paramShort;
  }

  public boolean wD() {
    return this.aVt;
  }

  public il wE() {
    return this.aVz;
  }

  public il wF() {
    return this.aVA;
  }

  public il wG() {
    return this.aVy;
  }

  public long wH() {
    return this.aVv;
  }

  public void R(long paramLong) {
    this.aVv = paramLong;
  }

  public long wI() {
    return this.aVw;
  }

  public void S(long paramLong) {
    this.aVw = paramLong;
  }

  public void N(boolean paramBoolean) {
    this.aVt = paramBoolean;
  }

  public long wJ() {
    return this.aVx;
  }

  public void T(long paramLong)
  {
    this.aVx = paramLong;
  }

  public void d(int paramInt, short paramShort)
  {
    this.aVy.a(paramInt, paramShort, paramShort);
  }

  public void e(int paramInt, short paramShort) {
    this.aVz.a(paramInt, paramShort, paramShort);
  }

  public void f(int paramInt, short paramShort) {
    this.aVA.a(paramInt, paramShort, paramShort);
  }

  public void a(byte paramByte, long paramLong, short paramShort) {
    this.aVB.put(paramByte, new bgl(paramByte, paramLong, paramShort));
  }

  public aoL wK() {
    return this.aVB;
  }

  public void bZ(int paramInt) {
    this.aVv += paramInt;
  }

  public void ca(int paramInt) {
    this.aVw += paramInt;
  }

  public boolean wL() {
    return this.aVu;
  }

  public void O(boolean paramBoolean) {
    this.aVu = paramBoolean;
  }
}