import java.nio.ByteBuffer;

public class bTN
  implements cxS
{
  public short hfA = 0;
  public byte[] hfB = null;

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.hfA);
    if (this.hfB != null) {
      if (this.hfB.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.hfB.length);
      paramByteBuffer.put(this.hfB);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.hfA = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.hfB = new byte[i];
      paramByteBuffer.get(this.hfB);
    } else {
      this.hfB = null;
    }
    return true;
  }

  public void clear() {
    this.hfA = 0;
    this.hfB = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += 2;
    i += (this.hfB != null ? this.hfB.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("occupationId=").append(this.hfA).append('\n');
    paramStringBuilder.append(paramString).append("occupationData=(").append(this.hfB.length).append(" bytes)\n");
  }
}