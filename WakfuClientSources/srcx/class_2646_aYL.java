import java.nio.ByteBuffer;

public class aYL
  implements cxS
{
  public long bIa = 0L;
  public String userName = null;
  public byte bHk = 0;

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bIa);
    if (this.userName != null) {
      byte[] arrayOfByte = dzp.qC(this.userName);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.put(this.bHk);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bIa = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.userName = dzp.aJ(arrayOfByte);
    this.bHk = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.bIa = 0L;
    this.userName = null;
    this.bHk = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 2;
    i += (this.userName != null ? dzp.qC(this.userName).length : 0);
    i++;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("userId=").append(this.bIa).append('\n');
    paramStringBuilder.append(paramString).append("userName=").append(this.userName).append('\n');
    paramStringBuilder.append(paramString).append("rights=").append(this.bHk).append('\n');
  }
}