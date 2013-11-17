import java.nio.ByteBuffer;

public class aix extends akv
  implements cxS
{
  public short bUp = 0;
  public byte[] dfg = null;

  private final cCH aW = new cUD(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.bUp);
    if (this.dfg != null) {
      if (this.dfg.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dfg.length);
      paramByteBuffer.put(this.dfg);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bUp = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.dfg = new byte[i];
      paramByteBuffer.get(this.dfg);
    } else {
      this.dfg = null;
    }
    return true;
  }

  public void clear() {
    this.bUp = 0;
    this.dfg = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += 2;
    i += (this.dfg != null ? this.dfg.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("states=(").append(this.dfg.length).append(" bytes)\n");
  }
}