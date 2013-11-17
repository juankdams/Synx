import java.nio.ByteBuffer;

public class cpD
  implements cxS
{
  public byte cUJ = 0;
  public int current = 0;
  public int min = 0;
  public int max = 0;
  public static final int aL = 13;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.cUJ);
    paramByteBuffer.putInt(this.current);
    paramByteBuffer.putInt(this.min);
    paramByteBuffer.putInt(this.max);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cUJ = paramByteBuffer.get();
    this.current = paramByteBuffer.getInt();
    this.min = paramByteBuffer.getInt();
    this.max = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cUJ = 0;
    this.current = 0;
    this.min = 0;
    this.max = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 13;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("index=").append(this.cUJ).append('\n');
    paramStringBuilder.append(paramString).append("current=").append(this.current).append('\n');
    paramStringBuilder.append(paramString).append("min=").append(this.min).append('\n');
    paramStringBuilder.append(paramString).append("max=").append(this.max).append('\n');
  }
}