import java.nio.ByteBuffer;

public class dMD extends akv
  implements cxS
{
  public long mcN = 0L;

  private final cCH aW = new cQu(this);
  public static final int aL = 8;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.mcN);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.mcN = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.mcN = 0L;
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
    paramStringBuilder.append(paramString).append("partyId=").append(this.mcN).append('\n');
  }
}