import java.nio.ByteBuffer;

public class Ut
  implements cxS
{
  public long cxL = 0L;
  public short cxM = 0;
  public short bUp = 0;
  public int cxN = 0;
  public static final int aL = 16;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.cxL);
    paramByteBuffer.putShort(this.cxM);
    paramByteBuffer.putShort(this.bUp);
    paramByteBuffer.putInt(this.cxN);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.cxM = paramByteBuffer.getShort();
    this.bUp = paramByteBuffer.getShort();
    this.cxN = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cxL = 0L;
    this.cxM = 0;
    this.bUp = 0;
    this.cxN = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 16;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("uid=").append(this.cxL).append('\n');
    paramStringBuilder.append(paramString).append("stateBaseId=").append(this.cxM).append('\n');
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("remainingDurationInMs=").append(this.cxN).append('\n');
  }
}