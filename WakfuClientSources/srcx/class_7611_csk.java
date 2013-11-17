public final class csk extends aRw
{
  private final long iI;
  private final String icc;

  public csk(long paramLong, String paramString)
  {
    this.iI = paramLong;
    this.icc = paramString;
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.iI);
    byte[] arrayOfByte = dzp.qC(this.icc);
    localcXr.dT((short)arrayOfByte.length);
    localcXr.aD(arrayOfByte);
    return a((byte)2, localcXr.toArray());
  }

  public int getId()
  {
    return 2075;
  }
}