import java.nio.ByteBuffer;

public class gZ
  implements cxS
{
  public int aGg = 0;
  public long aGh = 0L;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aGg);
    paramByteBuffer.putLong(this.aGh);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGg = paramByteBuffer.getInt();
    this.aGh = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.aGg = 0;
    this.aGh = 0L;
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
    paramStringBuilder.append(paramString).append("definitionId=").append(this.aGg).append('\n');
    paramStringBuilder.append(paramString).append("xp=").append(this.aGh).append('\n');
  }
}