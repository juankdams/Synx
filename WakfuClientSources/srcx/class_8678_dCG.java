import java.nio.ByteBuffer;

public class dCG extends akv
  implements cxS
{
  public long ayv = 0L;

  private final cCH aW = new bMx(this);
  public static final int aL = 8;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.ayv);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayv = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.ayv = 0L;
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
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
  }
}