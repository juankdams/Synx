import java.nio.ByteBuffer;

public class cPm
  implements cxS
{
  public int bPw = 0;
  public short bUp = 0;
  public long aGh = 0L;
  public static final int aL = 14;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.putShort(this.bUp);
    paramByteBuffer.putLong(this.aGh);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPw = paramByteBuffer.getInt();
    this.bUp = paramByteBuffer.getShort();
    this.aGh = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.bPw = 0;
    this.bUp = 0;
    this.aGh = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 14;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("xp=").append(this.aGh).append('\n');
  }
}