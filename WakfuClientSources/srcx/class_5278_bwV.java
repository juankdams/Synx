import java.nio.ByteBuffer;

public class bwV
  implements cxS
{
  public String ght = null;
  public int ghu = 0;
  public int ghv = 0;
  public long ghw = 0L;
  public String note = null;
  public boolean ghx = false;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte;
    if (this.ght != null) {
      arrayOfByte = dzp.qC(this.ght);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.ghu);
    paramByteBuffer.putInt(this.ghv);
    paramByteBuffer.putLong(this.ghw);
    if (this.note != null) {
      arrayOfByte = dzp.qC(this.note);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.put((byte)(this.ghx ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte1 = new byte[i];
    paramByteBuffer.get(arrayOfByte1);
    this.ght = dzp.aJ(arrayOfByte1);
    this.ghu = paramByteBuffer.getInt();
    this.ghv = paramByteBuffer.getInt();
    this.ghw = paramByteBuffer.getLong();
    int j = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte2 = new byte[j];
    paramByteBuffer.get(arrayOfByte2);
    this.note = dzp.aJ(arrayOfByte2);
    this.ghx = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.ght = null;
    this.ghu = 0;
    this.ghv = 0;
    this.ghw = 0L;
    this.note = null;
    this.ghx = false;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.ght != null ? dzp.qC(this.ght).length : 0);
    i += 4;
    i += 4;
    i += 8;
    i += 2;
    i += (this.note != null ? dzp.qC(this.note).length : 0);
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
    paramStringBuilder.append(paramString).append("guid=").append(this.ght).append('\n');
    paramStringBuilder.append(paramString).append("character=").append(this.ghu).append('\n');
    paramStringBuilder.append(paramString).append("pedestal=").append(this.ghv).append('\n');
    paramStringBuilder.append(paramString).append("acquiredOn=").append(this.ghw).append('\n');
    paramStringBuilder.append(paramString).append("note=").append(this.note).append('\n');
    paramStringBuilder.append(paramString).append("bound=").append(this.ghx).append('\n');
  }
}