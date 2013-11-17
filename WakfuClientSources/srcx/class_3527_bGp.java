import java.nio.ByteBuffer;

public class bGp
  implements cxS
{
  public int gCE = 0;
  public int count = 0;
  public int cps = 0;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.gCE);
    paramByteBuffer.putInt(this.count);
    paramByteBuffer.putInt(this.cps);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gCE = paramByteBuffer.getInt();
    this.count = paramByteBuffer.getInt();
    this.cps = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.gCE = 0;
    this.count = 0;
    this.cps = 0;
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
    paramStringBuilder.append(paramString).append("itemId=").append(this.gCE).append('\n');
    paramStringBuilder.append(paramString).append("count=").append(this.count).append('\n');
    paramStringBuilder.append(paramString).append("price=").append(this.cps).append('\n');
  }
}