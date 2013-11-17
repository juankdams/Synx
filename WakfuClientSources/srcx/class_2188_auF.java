import java.nio.ByteBuffer;

public class auF
  implements cxS
{
  public long dHz = 0L;
  public int dHA = 0;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.dHz);
    paramByteBuffer.putInt(this.dHA);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dHz = paramByteBuffer.getLong();
    this.dHA = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.dHz = 0L;
    this.dHA = 0;
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
    paramStringBuilder.append(paramString).append("applicationDate=").append(this.dHz).append('\n');
    paramStringBuilder.append(paramString).append("climateBonusId=").append(this.dHA).append('\n');
  }
}