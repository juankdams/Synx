import java.nio.ByteBuffer;

public class dNb
  implements cxS
{
  public byte aYU = 0;
  public int bPw = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.aYU);
    paramByteBuffer.putInt(this.bPw);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aYU = paramByteBuffer.get();
    this.bPw = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.aYU = 0;
    this.bPw = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 5;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("position=").append(this.aYU).append('\n');
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
  }
}