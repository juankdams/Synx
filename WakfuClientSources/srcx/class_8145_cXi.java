import java.nio.ByteBuffer;

public class cXi
  implements cxS
{
  public int kKy = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.kKy);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.kKy = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.kKy = 0;
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
    paramStringBuilder.append(paramString).append("skillId=").append(this.kKy).append('\n');
  }
}