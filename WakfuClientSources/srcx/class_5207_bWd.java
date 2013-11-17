import java.nio.ByteBuffer;

public class bWd
  implements cxS
{
  public byte his = 0;
  public static final int aL = 1;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.his);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.his = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.his = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 1;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("landMarkId=").append(this.his).append('\n');
  }
}