import java.nio.ByteBuffer;

public class dRm
  implements cxS
{
  public int bYg = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bYg);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bYg = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bYg = 0;
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
    paramStringBuilder.append(paramString).append("cash=").append(this.bYg).append('\n');
  }
}