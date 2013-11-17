import java.nio.ByteBuffer;

public class aqM extends akv
  implements cxS
{
  public long ayv = 0L;
  public long dyt = 0L;
  public short bUp = 0;
  public String dyu = null;

  private final cCH aW = new agx(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.ayv);
    paramByteBuffer.putLong(this.dyt);
    paramByteBuffer.putShort(this.bUp);
    if (this.dyu != null) {
      byte[] arrayOfByte = dzp.qC(this.dyu);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayv = paramByteBuffer.getLong();
    this.dyt = paramByteBuffer.getLong();
    this.bUp = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.dyu = dzp.aJ(arrayOfByte);
    return true;
  }

  public void clear() {
    this.ayv = 0L;
    this.dyt = 0L;
    this.bUp = 0;
    this.dyu = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 8;
    i += 2;
    i += 2;
    i += (this.dyu != null ? dzp.qC(this.dyu).length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
    paramStringBuilder.append(paramString).append("blazon=").append(this.dyt).append('\n');
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("guildName=").append(this.dyu).append('\n');
  }
}