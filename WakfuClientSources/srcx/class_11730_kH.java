import java.nio.ByteBuffer;

public class kH
  implements cxS
{
  public int type = 0;
  public long aOw = 0L;
  public long count = 0L;
  public static final int aL = 20;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.type);
    paramByteBuffer.putLong(this.aOw);
    paramByteBuffer.putLong(this.count);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.type = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.count = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.type = 0;
    this.aOw = 0L;
    this.count = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 20;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("duration=").append(this.aOw).append('\n');
    paramStringBuilder.append(paramString).append("count=").append(this.count).append('\n');
  }
}