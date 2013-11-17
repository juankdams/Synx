import java.nio.ByteBuffer;

public class Cq extends akv
  implements cxS
{
  public int x = 0;
  public int y = 0;
  public short bEW = 0;
  public short bEX = 0;

  private final cCH aW = new cVC(this);
  public static final int aL = 12;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.x);
    paramByteBuffer.putInt(this.y);
    paramByteBuffer.putShort(this.bEW);
    paramByteBuffer.putShort(this.bEX);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.x = paramByteBuffer.getInt();
    this.y = paramByteBuffer.getInt();
    this.bEW = paramByteBuffer.getShort();
    this.bEX = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.x = 0;
    this.y = 0;
    this.bEW = 0;
    this.bEX = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 12;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("x=").append(this.x).append('\n');
    paramStringBuilder.append(paramString).append("y=").append(this.y).append('\n');
    paramStringBuilder.append(paramString).append("z=").append(this.bEW).append('\n');
    paramStringBuilder.append(paramString).append("instanceId=").append(this.bEX).append('\n');
  }
}