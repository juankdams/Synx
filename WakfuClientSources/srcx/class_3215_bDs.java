import java.nio.ByteBuffer;

public class bDs
  implements cxS
{
  public int gyY = 0;
  public int gyZ = 0;
  public int gza = 0;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.gyY);
    paramByteBuffer.putInt(this.gyZ);
    paramByteBuffer.putInt(this.gza);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gyY = paramByteBuffer.getInt();
    this.gyZ = paramByteBuffer.getInt();
    this.gza = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.gyY = 0;
    this.gyZ = 0;
    this.gza = 0;
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
    paramStringBuilder.append(paramString).append("nativeNationId=").append(this.gyY).append('\n');
    paramStringBuilder.append(paramString).append("currentNationId=").append(this.gyZ).append('\n');
    paramStringBuilder.append(paramString).append("territoryId=").append(this.gza).append('\n');
  }
}