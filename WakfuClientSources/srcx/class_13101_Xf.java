import java.nio.ByteBuffer;

public class Xf extends akv
  implements cxS
{
  public byte type = 0;
  public long ayt = 0L;

  private final cCH aW = new cBE(this);
  public static final int aL = 9;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.type);
    paramByteBuffer.putLong(this.ayt);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.type = paramByteBuffer.get();
    this.ayt = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.type = 0;
    this.ayt = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 9;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("ownerId=").append(this.ayt).append('\n');
  }
}