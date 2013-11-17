import java.nio.ByteBuffer;

public class dmR extends akv
  implements cxS
{
  public boolean llu = false;

  private final cCH aW = new nk(this);
  public static final int aL = 1;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.llu ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.llu = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.llu = false;
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
    paramStringBuilder.append(paramString).append("controlledByAI=").append(this.llu).append('\n');
  }
}