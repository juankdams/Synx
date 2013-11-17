import java.nio.ByteBuffer;

public class aiS extends aRw
{
  private long dhp;
  private long dhq;
  private short dhr;
  private long brC;
  private short aFe = -1;
  private long dhs = 0L;

  public byte[] encode()
  {
    int i = 28;
    if ((this.dhs != 0L) && (this.aFe >= 0))
      i += 8;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.dhp);
    localByteBuffer.putLong(this.brC);
    localByteBuffer.putLong(this.dhq);
    localByteBuffer.putShort(this.dhr);
    if ((this.aFe >= 0) && (this.dhs != 0L)) {
      localByteBuffer.putShort(this.aFe);
      localByteBuffer.putLong(this.dhs);
    } else {
      localByteBuffer.putShort(this.aFe);
    }
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5231;
  }

  public void cP(long paramLong) {
    this.dhq = paramLong;
  }

  public void aC(short paramShort) {
    this.dhr = paramShort;
  }

  public void aW(long paramLong) {
    this.brC = paramLong;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }

  public void cQ(long paramLong) {
    this.dhs = paramLong;
  }

  public void cR(long paramLong) {
    this.dhp = paramLong;
  }
}