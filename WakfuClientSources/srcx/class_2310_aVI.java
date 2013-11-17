import java.nio.ByteBuffer;

public class aVI extends akv
  implements cxS
{
  public String eXO = null;
  public long eXP = 0L;

  private final cCH aW = new azT(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.eXO != null) {
      byte[] arrayOfByte = dzp.qC(this.eXO);
      if (arrayOfByte.length > 255)
        return false;
      paramByteBuffer.put((byte)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.put((byte)0);
    }
    paramByteBuffer.putLong(this.eXP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.eXO = dzp.aJ(arrayOfByte);
    this.eXP = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.eXO = null;
    this.eXP = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    i += (this.eXO != null ? dzp.qC(this.eXO).length : 0);
    i += 8;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("gameServer=").append(this.eXO).append('\n');
    paramStringBuilder.append(paramString).append("lastLog=").append(this.eXP).append('\n');
  }
}