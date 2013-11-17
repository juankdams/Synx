import java.nio.ByteBuffer;

public class Yw
  implements cxS
{
  public short cJl = 0;
  public int cJm = 0;
  public static final int aL = 6;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.cJl);
    paramByteBuffer.putInt(this.cJm);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cJl = paramByteBuffer.getShort();
    this.cJm = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cJl = 0;
    this.cJm = 0;
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
    paramStringBuilder.append(paramString).append("titleId=").append(this.cJl).append('\n');
    paramStringBuilder.append(paramString).append("nbMandate=").append(this.cJm).append('\n');
  }
}