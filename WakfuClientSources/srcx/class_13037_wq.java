import java.nio.ByteBuffer;

public class wq
  implements cxS
{
  public short bmn = -1;
  public static final int aL = 2;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.bmn);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bmn = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bmn = -1;
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
    paramStringBuilder.append(paramString).append("availableTitle=").append(this.bmn).append('\n');
  }
}