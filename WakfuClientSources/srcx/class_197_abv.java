import java.nio.ByteBuffer;

public class abv
  implements cxS
{
  public String cPW;
  public Yw cPX;

  public abv()
  {
    this.cPW = null;
    this.cPX = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.cPW != null) {
      byte[] arrayOfByte = dzp.qC(this.cPW);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    if (this.cPX != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.cPX.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.cPW = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.cPX = new Yw();
      boolean bool = this.cPX.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.cPX = null;
    }
    return true;
  }

  public void clear() {
    this.cPW = null;
    this.cPX = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.cPW != null ? dzp.qC(this.cPW).length : 0);
    i++;
    if (this.cPX != null) {
      i += this.cPX.O();
    }
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("speech=").append(this.cPW).append('\n');
    paramStringBuilder.append(paramString).append("governor=");
    if (this.cPX == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.cPX.a(paramStringBuilder, paramString + "  ");
    }
  }
}