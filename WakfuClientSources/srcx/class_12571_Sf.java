import java.nio.ByteBuffer;

public class Sf
  implements cxS
{
  public String crN = null;
  public long crO = 0L;
  public int crP = 0;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.crN != null) {
      byte[] arrayOfByte = dzp.qC(this.crN);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putLong(this.crO);
    paramByteBuffer.putInt(this.crP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.crP = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.crN = null;
    this.crO = 0L;
    this.crP = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.crN != null ? dzp.qC(this.crN).length : 0);
    i += 8;
    i += 4;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("memberName=").append(this.crN).append('\n');
    paramStringBuilder.append(paramString).append("date=").append(this.crO).append('\n');
    paramStringBuilder.append(paramString).append("amount=").append(this.crP).append('\n');
  }
}