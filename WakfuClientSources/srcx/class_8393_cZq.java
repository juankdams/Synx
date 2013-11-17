import java.nio.ByteBuffer;

public class cZq
  implements cxS
{
  public int kMV = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.kMV);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.kMV = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.kMV = 0;
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
    paramStringBuilder.append(paramString).append("dragoId=").append(this.kMV).append('\n');
  }
}