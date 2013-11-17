import java.nio.ByteBuffer;

public class Kk extends akv
  implements cxS
{
  public short bWC = 0;

  private final cCH aW = new ciX(this);
  public static final int aL = 2;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.bWC);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bWC = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bWC = 0;
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
    paramStringBuilder.append(paramString).append("breedId=").append(this.bWC).append('\n');
  }
}