public class SQ extends aRw
{
  private final String cuv;

  public SQ(String paramString)
  {
    this.cuv = paramString;
  }

  public byte[] encode() {
    cXr localcXr = new cXr();
    byte[] arrayOfByte = dzp.qC(this.cuv);
    localcXr.dT((short)arrayOfByte.length);
    localcXr.aD(arrayOfByte);
    return a((byte)3, localcXr.toArray());
  }

  public int getId() {
    return 14014;
  }
}