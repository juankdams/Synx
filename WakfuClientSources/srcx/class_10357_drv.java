import java.nio.ByteBuffer;

public class drv
{
  private final JB ltV;
  private final long ltW;
  private final byte bml;

  public drv(JB paramJB, long paramLong, byte paramByte)
  {
    this.ltV = paramJB;
    this.ltW = paramLong;
    this.bml = paramByte;
  }

  public int O()
  {
    return 10;
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(JB.a(this.ltV));
    paramByteBuffer.putLong(this.ltW);
    paramByteBuffer.put(this.bml);
  }

  public static drv aM(ByteBuffer paramByteBuffer) {
    JB localJB = JB.ae(paramByteBuffer.get());
    long l = paramByteBuffer.getLong();
    byte b = paramByteBuffer.get();

    return new drv(localJB, l, b);
  }

  public boolean isClosed() {
    return this.ltV != JB.bUr;
  }

  public boolean cYl() {
    return this.ltV == JB.bUt;
  }

  public long cYm() {
    return this.ltW;
  }

  public byte Fx() {
    return this.bml;
  }
}