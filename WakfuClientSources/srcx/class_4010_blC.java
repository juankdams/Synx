public class blC extends aRw
{
  private long iI;
  private byte aHn;
  private byte fCH;
  private byte fCI;
  private byte fCJ;
  private byte fCK;
  private byte fCL;
  private byte ctp;
  private byte ctq;
  private short fCM;
  private String m_name;

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.iI);
    localcXr.eL(this.aHn);
    localcXr.eL(this.fCH);
    localcXr.eL(this.fCI);
    localcXr.eL(this.fCJ);
    localcXr.eL(this.fCK);
    localcXr.eL(this.fCL);
    localcXr.eL(this.ctp);
    localcXr.eL(this.ctq);
    localcXr.dT(this.fCM);
    byte[] arrayOfByte = dzp.qC(this.m_name);
    localcXr.eL((byte)arrayOfByte.length);
    localcXr.aD(arrayOfByte);
    return a((byte)2, localcXr.toArray());
  }

  public int getId()
  {
    return 2053;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void cO(byte paramByte) {
    this.aHn = paramByte;
  }

  public void cP(byte paramByte) {
    this.fCH = paramByte;
  }

  public void cQ(byte paramByte) {
    this.fCI = paramByte;
  }

  public void cR(byte paramByte) {
    this.fCJ = paramByte;
  }

  public void cS(byte paramByte) {
    this.fCK = paramByte;
  }

  public void cT(byte paramByte) {
    this.fCL = paramByte;
  }

  public void cU(byte paramByte) {
    this.ctp = paramByte;
  }

  public void cV(byte paramByte) {
    this.ctq = paramByte;
  }

  public void bR(short paramShort) {
    this.fCM = paramShort;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }
}