import java.nio.ByteBuffer;

public class aEF extends akv
  implements cxS
{
  public int eay = 0;

  private final cCH aW = new dyE(this);
  public static final int aL = 4;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.eay);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.eay = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.eay = 0;
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
    paramStringBuilder.append(paramString).append("hp=").append(this.eay).append('\n');
  }
}