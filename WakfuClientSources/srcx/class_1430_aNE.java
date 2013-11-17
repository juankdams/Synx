import java.nio.ByteBuffer;

public class aNE extends akv
  implements cxS
{
  public boolean etH = false;

  private final cCH aW = new cla(this);
  public static final int aL = 1;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.etH ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.etH = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.etH = false;
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
    paramStringBuilder.append(paramString).append("show=").append(this.etH).append('\n');
  }
}