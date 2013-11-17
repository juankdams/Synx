import java.nio.ByteBuffer;

public class dDi
  implements cxS
{
  public long lLv = 0L;
  public static final int aL = 8;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.lLv);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.lLv = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.lLv = 0L;
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
    paramStringBuilder.append(paramString).append("lawId=").append(this.lLv).append('\n');
  }
}