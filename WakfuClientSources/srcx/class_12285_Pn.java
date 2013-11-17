import org.apache.log4j.Logger;

public class Pn extends aRw
{
  protected static final Logger K = Logger.getLogger(Pn.class);
  protected static final boolean aRN = false;
  private final long chj;
  private final String chk;

  public Pn(long paramLong)
  {
    this.chj = paramLong;
    this.chk = null;
  }

  public Pn(long paramLong, String paramString) {
    this.chj = paramLong;
    this.chk = paramString;
  }

  public byte[] encode() {
    cXr localcXr = new cXr();

    localcXr.jn(this.chj);
    if (this.chk != null) {
      byte[] arrayOfByte = dzp.qC(this.chk);
      localcXr.dT((short)arrayOfByte.length);
      localcXr.aD(arrayOfByte);
    } else {
      localcXr.dT((short)0);
    }

    return a((byte)3, localcXr.toArray());
  }

  public int getId() {
    return 14000;
  }
}