import java.nio.ByteBuffer;

public class aWa
  implements cxS
{
  public int eYo = -1;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.eYo);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.eYo = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.eYo = -1;
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
    paramStringBuilder.append(paramString).append("offendedNationId=").append(this.eYo).append('\n');
  }
}