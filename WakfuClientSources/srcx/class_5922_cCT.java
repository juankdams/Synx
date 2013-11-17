public final class cCT extends aRw
{
  private long iI;
  private String ivB;
  private byte cuu;

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.iI);
    byte[] arrayOfByte = dzp.qC(this.ivB);
    localcXr.dT((short)arrayOfByte.length);
    localcXr.aD(arrayOfByte);
    localcXr.eL(this.cuu);
    return a((byte)2, localcXr.toArray());
  }

  public int getId()
  {
    return 2073;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void setLanguage(String paramString) {
    this.ivB = paramString;
  }

  public void ee(byte paramByte) {
    this.cuu = paramByte;
  }
}