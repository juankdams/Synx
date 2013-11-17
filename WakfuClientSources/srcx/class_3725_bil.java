import java.nio.ByteBuffer;

public class bil extends akv
  implements cxS
{
  public byte bUn = 0;

  private final cCH aW = new akd(this);
  public static final int aL = 1;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.bUn);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bUn = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.bUn = 0;
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
    paramStringBuilder.append(paramString).append("sex=").append(this.bUn).append('\n');
  }
}