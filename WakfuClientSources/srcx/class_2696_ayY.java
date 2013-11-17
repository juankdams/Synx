import java.nio.ByteBuffer;

public final class ayY
  implements dup
{
  private long dQe;
  public static final int dQf = 647;
  public static final int dQg = 646;

  ayY()
  {
  }

  public ayY(long paramLong)
  {
    this.dQe = paramLong;
  }

  public byte[] j() {
    cXr localcXr = new cXr();
    localcXr.jn(this.dQe);
    return localcXr.toArray();
  }

  public void U(ByteBuffer paramByteBuffer) {
    this.dQe = paramByteBuffer.getLong();
  }

  public short nc() {
    return 2;
  }

  public long aKX() {
    return this.dQe;
  }
}