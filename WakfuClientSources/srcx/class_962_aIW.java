import java.nio.ByteBuffer;

public class aIW
  implements cxS
{
  public int counter = 0;
  public static final int aL = 4;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.counter);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.counter = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.counter = 0;
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
    paramStringBuilder.append(paramString).append("counter=").append(this.counter).append('\n');
  }
}