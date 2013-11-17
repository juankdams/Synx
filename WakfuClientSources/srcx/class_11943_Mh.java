import java.nio.ByteBuffer;

public class Mh
  implements cxS
{
  public short bWC = 0;
  public short bUp = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.bWC);
    paramByteBuffer.putShort(this.bUp);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bWC = paramByteBuffer.getShort();
    this.bUp = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bWC = 0;
    this.bUp = 0;
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
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
  }
}