import java.nio.ByteBuffer;

public class nn
  implements cxS
{
  public int aRM = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aRM);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aRM = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.aRM = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 4;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("viewId=").append(this.aRM).append('\n');
  }
}