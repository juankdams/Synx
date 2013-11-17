import java.nio.ByteBuffer;

public class boe
  implements cxS
{
  public byte ewr = 0;
  public byte fHn = 0;
  public static final int aL = 2;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.ewr);
    paramByteBuffer.put(this.fHn);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ewr = paramByteBuffer.get();
    this.fHn = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.ewr = 0;
    this.fHn = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 2;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("id=").append(this.ewr).append('\n');
    paramStringBuilder.append(paramString).append("count=").append(this.fHn).append('\n');
  }
}