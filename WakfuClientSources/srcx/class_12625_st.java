import java.nio.ByteBuffer;

public class st extends akv
  implements cxS
{
  public boolean bbB = false;

  private final cCH aW = new bfN(this);
  public static final int aL = 1;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.bbB ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bbB = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.bbB = false;
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
    paramStringBuilder.append(paramString).append("isPasseportActive=").append(this.bbB).append('\n');
  }
}