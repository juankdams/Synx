import java.nio.ByteBuffer;

public class bVV
  implements cxS
{
  public long cxL = 0L;
  public long hhU = 0L;
  public short hhV = 0;
  public short x = 0;
  public short y = 0;
  public int hhW = 0;
  public static final int aL = 26;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.cxL);
    paramByteBuffer.putLong(this.hhU);
    paramByteBuffer.putShort(this.hhV);
    paramByteBuffer.putShort(this.x);
    paramByteBuffer.putShort(this.y);
    paramByteBuffer.putInt(this.hhW);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.hhU = paramByteBuffer.getLong();
    this.hhV = paramByteBuffer.getShort();
    this.x = paramByteBuffer.getShort();
    this.y = paramByteBuffer.getShort();
    this.hhW = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cxL = 0L;
    this.hhU = 0L;
    this.hhV = 0;
    this.x = 0;
    this.y = 0;
    this.hhW = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 26;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("uid=").append(this.cxL).append('\n');
    paramStringBuilder.append(paramString).append("creationDate=").append(this.hhU).append('\n');
    paramStringBuilder.append(paramString).append("id=").append(this.hhV).append('\n');
    paramStringBuilder.append(paramString).append("x=").append(this.x).append('\n');
    paramStringBuilder.append(paramString).append("y=").append(this.y).append('\n');
    paramStringBuilder.append(paramString).append("equippedSkinItemId=").append(this.hhW).append('\n');
  }
}