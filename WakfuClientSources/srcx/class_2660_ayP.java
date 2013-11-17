import java.nio.ByteBuffer;

public class ayP
  implements cxS
{
  public byte dPW = 0;
  public byte dPX = 0;
  public byte dPY = 0;
  public static final int aL = 3;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.dPW);
    paramByteBuffer.put(this.dPX);
    paramByteBuffer.put(this.dPY);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dPW = paramByteBuffer.get();
    this.dPX = paramByteBuffer.get();
    this.dPY = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.dPW = 0;
    this.dPX = 0;
    this.dPY = 0;
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
    paramStringBuilder.append(paramString).append("itemType=").append(this.dPW).append('\n');
    paramStringBuilder.append(paramString).append("contentQuantity=").append(this.dPX).append('\n');
    paramStringBuilder.append(paramString).append("contentQuality=").append(this.dPY).append('\n');
  }
}