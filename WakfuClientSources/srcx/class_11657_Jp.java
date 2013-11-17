public class Jp extends aRw
{
  private final long bTB;

  public Jp(long paramLong)
  {
    this.bTB = paramLong;
  }

  public byte[] encode()
  {
    cXr localcXr = new cXr();
    localcXr.jn(this.bTB);
    return a((byte)3, localcXr.toArray());
  }

  public int getId()
  {
    return 15944;
  }
}