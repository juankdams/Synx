import java.nio.ByteBuffer;

public class aEh extends akv
  implements cxS
{
  public long id = 0L;

  private final cCH aW = new bke(this);
  public static final int aL = 8;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.id);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.id = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 8;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("id=").append(this.id).append('\n');
  }
}