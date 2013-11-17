import java.nio.ByteBuffer;

public class cRT
  implements cxS
{
  public int aDe = 0;
  public short aDf = 0;
  public static final int aL = 6;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aDe);
    paramByteBuffer.putShort(this.aDf);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.aDe = 0;
    this.aDf = 0;
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
    paramStringBuilder.append(paramString).append("refId=").append(this.aDe).append('\n');
    paramStringBuilder.append(paramString).append("quantity=").append(this.aDf).append('\n');
  }
}