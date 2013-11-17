import java.nio.ByteBuffer;

public class aGM
  implements cxS
{
  public int edZ = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.edZ);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.edZ = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.edZ = 0;
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
    paramStringBuilder.append(paramString).append("collectId=").append(this.edZ).append('\n');
  }
}