import java.nio.ByteBuffer;

public class dsJ
  implements cxS
{
  public byte hFV = 0;
  public long value = 0L;
  public static final int aL = 9;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.hFV);
    paramByteBuffer.putLong(this.value);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.hFV = paramByteBuffer.get();
    this.value = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.hFV = 0;
    this.value = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 9;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("varId=").append(this.hFV).append('\n');
    paramStringBuilder.append(paramString).append("value=").append(this.value).append('\n');
  }
}