import java.nio.ByteBuffer;

public class rd
  implements cxS
{
  public byte aYU = 0;
  public int aDe = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.aYU);
    paramByteBuffer.putInt(this.aDe);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aYU = paramByteBuffer.get();
    this.aDe = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.aYU = 0;
    this.aDe = 0;
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
    paramStringBuilder.append(paramString).append("refId=").append(this.aDe).append('\n');
  }
}