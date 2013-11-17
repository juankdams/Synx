import java.nio.ByteBuffer;

public class bnO
  implements cxS
{
  public int fGY = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.fGY);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.fGY = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.fGY = 0;
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
    paramStringBuilder.append(paramString).append("zaapId=").append(this.fGY).append('\n');
  }
}