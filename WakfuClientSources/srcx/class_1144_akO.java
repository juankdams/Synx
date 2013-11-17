import java.nio.ByteBuffer;

public class akO
  implements cxS
{
  public byte[] dlA = null;

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.dlA != null) {
      if (this.dlA.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dlA.length);
      paramByteBuffer.put(this.dlA);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.dlA = new byte[i];
      paramByteBuffer.get(this.dlA);
    } else {
      this.dlA = null;
    }
    return true;
  }

  public void clear() {
    this.dlA = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.dlA != null ? this.dlA.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("serializedCharacter=(").append(this.dlA.length).append(" bytes)\n");
  }
}