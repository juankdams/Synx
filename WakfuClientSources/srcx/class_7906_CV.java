import java.nio.ByteBuffer;

public class CV
  implements cxS
{
  public byte bHj = 0;
  public byte bHk = 0;
  public static final int aL = 2;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.bHj);
    paramByteBuffer.put(this.bHk);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bHj = paramByteBuffer.get();
    this.bHk = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.bHj = 0;
    this.bHk = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 2;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("groupType=").append(this.bHj).append('\n');
    paramStringBuilder.append(paramString).append("rights=").append(this.bHk).append('\n');
  }
}