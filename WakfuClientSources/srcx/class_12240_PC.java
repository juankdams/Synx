import java.nio.ByteBuffer;

public class PC extends akv
  implements cxS
{
  public short cia = 0;
  public short cib = 0;

  private final cCH aW = new cGr(this);
  public static final int aL = 4;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cia);
    paramByteBuffer.putShort(this.cib);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cia = paramByteBuffer.getShort();
    this.cib = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.cia = 0;
    this.cib = 0;
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
    paramStringBuilder.append(paramString).append("sightRadius=").append(this.cia).append('\n');
    paramStringBuilder.append(paramString).append("aggroRadius=").append(this.cib).append('\n');
  }
}