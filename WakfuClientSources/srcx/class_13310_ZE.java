import java.nio.ByteBuffer;

public class ZE
  implements cxS
{
  public byte[] data = null;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.data != null) {
      if (this.data.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.data.length);
      paramByteBuffer.put(this.data);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.data = new byte[i];
      paramByteBuffer.get(this.data);
    } else {
      this.data = null;
    }
    return true;
  }

  public void clear() {
    this.data = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.data != null ? this.data.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("data=(").append(this.data.length).append(" bytes)\n");
  }
}