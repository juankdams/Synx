import java.nio.ByteBuffer;

public class le extends akv
  implements cxS
{
  public int bL = 0;

  private final cCH aW = new aNW(this);
  public static final int aL = 4;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.bL);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bL = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bL = 0;
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
    paramStringBuilder.append(paramString).append("nationId=").append(this.bL).append('\n');
  }
}