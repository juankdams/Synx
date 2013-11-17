import java.nio.ByteBuffer;

public class NL
  implements cxS
{
  public int bPw = 0;
  public int min = 0;
  public int max = 0;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.putInt(this.min);
    paramByteBuffer.putInt(this.max);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPw = paramByteBuffer.getInt();
    this.min = paramByteBuffer.getInt();
    this.max = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bPw = 0;
    this.min = 0;
    this.max = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 12;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("min=").append(this.min).append('\n');
    paramStringBuilder.append(paramString).append("max=").append(this.max).append('\n');
  }
}