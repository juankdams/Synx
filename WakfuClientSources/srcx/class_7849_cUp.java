import java.nio.ByteBuffer;

public class cUp
  implements cxS
{
  public byte kGX = 0;
  public float kGY = 0.0F;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.kGX);
    paramByteBuffer.putFloat(this.kGY);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.kGX = paramByteBuffer.get();
    this.kGY = paramByteBuffer.getFloat();
    return true;
  }

  public void clear() {
    this.kGX = 0;
    this.kGY = 0.0F;
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
    paramStringBuilder.append(paramString).append("taxContext=").append(this.kGX).append('\n');
    paramStringBuilder.append(paramString).append("taxValue=").append(this.kGY).append('\n');
  }
}