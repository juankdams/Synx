import java.nio.ByteBuffer;

public class wW
  implements cxS
{
  public int boH = 0;
  public int boI = 0;
  public short boJ = 0;
  public byte boK = 0;
  public long ayt = 0L;
  public static final int aL = 19;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.boH);
    paramByteBuffer.putInt(this.boI);
    paramByteBuffer.putShort(this.boJ);
    paramByteBuffer.put(this.boK);
    paramByteBuffer.putLong(this.ayt);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    this.ayt = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.boH = 0;
    this.boI = 0;
    this.boJ = 0;
    this.boK = 0;
    this.ayt = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 19;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("positionX=").append(this.boH).append('\n');
    paramStringBuilder.append(paramString).append("positionY=").append(this.boI).append('\n');
    paramStringBuilder.append(paramString).append("positionZ=").append(this.boJ).append('\n');
    paramStringBuilder.append(paramString).append("direction=").append(this.boK).append('\n');
    paramStringBuilder.append(paramString).append("ownerId=").append(this.ayt).append('\n');
  }
}