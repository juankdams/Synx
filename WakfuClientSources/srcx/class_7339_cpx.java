import java.nio.ByteBuffer;

public class cpx extends akv
  implements cxS
{
  public String name = null;

  private final cCH aW = new sU(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.name != null) {
      byte[] arrayOfByte = dzp.qC(this.name);
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
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    return true;
  }

  public void clear() {
    this.name = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.name != null ? dzp.qC(this.name).length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("name=").append(this.name).append('\n');
  }
}