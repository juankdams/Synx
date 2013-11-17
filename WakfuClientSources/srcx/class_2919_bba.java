import java.nio.ByteBuffer;

public class bba
  implements cxS
{
  public byte[] fjc = null;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.fjc != null) {
      if (this.fjc.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.fjc.length);
      paramByteBuffer.put(this.fjc);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.fjc = new byte[i];
      paramByteBuffer.get(this.fjc);
    } else {
      this.fjc = null;
    }
    return true;
  }

  public void clear() {
    this.fjc = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.fjc != null ? this.fjc.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rawStorageBox=(").append(this.fjc.length).append(" bytes)\n");
  }
}