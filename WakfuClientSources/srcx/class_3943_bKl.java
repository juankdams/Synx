import java.nio.ByteBuffer;

public class bKl
  implements cxS
{
  public int bPw = 0;
  public int cps = 0;
  public static final int aL = 8;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.putInt(this.cps);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPw = paramByteBuffer.getInt();
    this.cps = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bPw = 0;
    this.cps = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 8;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("price=").append(this.cps).append('\n');
  }
}