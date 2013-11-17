import java.nio.ByteBuffer;

public class aJE
  implements cxS
{
  public long ejQ = 0L;
  public long ejR = 0L;
  public static final int aL = 16;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.ejQ);
    paramByteBuffer.putLong(this.ejR);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ejQ = paramByteBuffer.getLong();
    this.ejR = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.ejQ = 0L;
    this.ejR = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 16;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("lastConnectionDate=").append(this.ejQ).append('\n');
    paramStringBuilder.append(paramString).append("currentUsedQuota=").append(this.ejR).append('\n');
  }
}