import java.nio.ByteBuffer;

public class aKC
  implements cxS
{
  public int bPw = 0;
  public short bxw = 0;
  public static final int aL = 6;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.putShort(this.bxw);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPw = paramByteBuffer.getInt();
    this.bxw = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bPw = 0;
    this.bxw = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 6;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("count=").append(this.bxw).append('\n');
  }
}