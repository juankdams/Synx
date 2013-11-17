import java.nio.ByteBuffer;

public class Ow
  implements cxS
{
  public byte cfJ = 0;
  public short value = 0;
  public static final int aL = 3;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.cfJ);
    paramByteBuffer.putShort(this.value);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cfJ = paramByteBuffer.get();
    this.value = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.cfJ = 0;
    this.value = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 3;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("characId=").append(this.cfJ).append('\n');
    paramStringBuilder.append(paramString).append("value=").append(this.value).append('\n');
  }
}