import java.nio.ByteBuffer;

public class dVU
  implements cxS
{
  public byte[] mvl = null;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.mvl != null) {
      if (this.mvl.length > 255)
        return false;
      paramByteBuffer.put((byte)this.mvl.length);
      paramByteBuffer.put(this.mvl);
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    if (i > 0) {
      this.mvl = new byte[i];
      paramByteBuffer.get(this.mvl);
    } else {
      this.mvl = null;
    }
    return true;
  }

  public void clear() {
    this.mvl = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    i += (this.mvl != null ? this.mvl.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("encodedPath=(").append(this.mvl.length).append(" bytes)\n");
  }
}