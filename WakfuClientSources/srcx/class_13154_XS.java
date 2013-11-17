import java.nio.ByteBuffer;

public class XS extends uc
  implements cxS
{
  public boolean cIo = false;
  public int cIp = 0;
  public long cIq = 0L;
  public int cIr = 0;
  public long cIs = 0L;
  public static final byte aK = 0;
  public static final int aL = 25;

  public byte N()
  {
    return 0;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.cIo ? 1 : 0));
    paramByteBuffer.putInt(this.cIp);
    paramByteBuffer.putLong(this.cIq);
    paramByteBuffer.putInt(this.cIr);
    paramByteBuffer.putLong(this.cIs);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIo = (paramByteBuffer.get() == 1);
    this.cIp = paramByteBuffer.getInt();
    this.cIq = paramByteBuffer.getLong();
    this.cIr = paramByteBuffer.getInt();
    this.cIs = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.cIo = false;
    this.cIp = 0;
    this.cIq = 0L;
    this.cIr = 0;
    this.cIs = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 25;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("primaryGemLocked=").append(this.cIo).append('\n');
    paramStringBuilder.append(paramString).append("primaryGemitemRefId=").append(this.cIp).append('\n');
    paramStringBuilder.append(paramString).append("primaryGemUniqueId=").append(this.cIq).append('\n');
    paramStringBuilder.append(paramString).append("secondaryGemitemRefId=").append(this.cIr).append('\n');
    paramStringBuilder.append(paramString).append("secondaryGemUniqueId=").append(this.cIs).append('\n');
  }
}