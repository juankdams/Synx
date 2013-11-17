import java.nio.ByteBuffer;

public class cfL
  implements cxS
{
  public byte hAH = 0;
  public int hAI = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.hAH);
    paramByteBuffer.putInt(this.hAI);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.hAH = paramByteBuffer.get();
    this.hAI = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.hAH = 0;
    this.hAI = 0;
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
    paramStringBuilder.append(paramString).append("opinionId=").append(this.hAH).append('\n');
    paramStringBuilder.append(paramString).append("nbBallots=").append(this.hAI).append('\n');
  }
}