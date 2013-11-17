import java.nio.ByteBuffer;

public class bQV extends akv
  implements cxS
{
  public byte[] gZr = null;
  public int gZs = 0;
  public float gZt = 0.0F;

  private final cCH aW = new dyS(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.gZr != null) {
      if (this.gZr.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.gZr.length);
      paramByteBuffer.put(this.gZr);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.gZs);
    paramByteBuffer.putFloat(this.gZt);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.gZr = new byte[i];
      paramByteBuffer.get(this.gZr);
    } else {
      this.gZr = null;
    }
    this.gZs = paramByteBuffer.getInt();
    this.gZt = paramByteBuffer.getFloat();
    return true;
  }

  public void clear() {
    this.gZr = null;
    this.gZs = 0;
    this.gZt = 0.0F;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.gZr != null ? this.gZr.length : 0);
    i += 4;
    i += 4;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guild=(").append(this.gZr.length).append(" bytes)\n");
    paramStringBuilder.append(paramString).append("havenWorldId=").append(this.gZs).append('\n');
    paramStringBuilder.append(paramString).append("moderationBonusLearningFactor=").append(this.gZt).append('\n');
  }
}