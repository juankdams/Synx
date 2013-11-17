import java.nio.ByteBuffer;

public class aiC
  implements cxS
{
  public short bWC = 0;
  public short bxw = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.bWC);
    paramByteBuffer.putShort(this.bxw);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bWC = paramByteBuffer.getShort();
    this.bxw = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bWC = 0;
    this.bxw = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 4;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("breedId=").append(this.bWC).append('\n');
    paramStringBuilder.append(paramString).append("count=").append(this.bxw).append('\n');
  }
}