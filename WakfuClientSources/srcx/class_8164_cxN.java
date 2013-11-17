import java.nio.ByteBuffer;

public class cxN
  implements cxS
{
  public String ght = null;
  public int bPw = 0;
  public short aDf = 0;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.ght != null) {
      byte[] arrayOfByte = dzp.qC(this.ght);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.putShort(this.aDf);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ght = dzp.aJ(arrayOfByte);
    this.bPw = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.ght = null;
    this.bPw = 0;
    this.aDf = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.ght != null ? dzp.qC(this.ght).length : 0);
    i += 4;
    i += 2;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guid=").append(this.ght).append('\n');
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("quantity=").append(this.aDf).append('\n');
  }
}