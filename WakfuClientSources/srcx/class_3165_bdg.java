import java.nio.ByteBuffer;

public class bdg extends akv
  implements cxS
{
  public byte[] fny = null;

  private final cCH aW = new aOk(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.fny != null) {
      if (this.fny.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.fny.length);
      paramByteBuffer.put(this.fny);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.fny = new byte[i];
      paramByteBuffer.get(this.fny);
    } else {
      this.fny = null;
    }
    return true;
  }

  public void clear() {
    this.fny = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.fny != null ? this.fny.length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("serializedAchievementsContext=(").append(this.fny.length).append(" bytes)\n");
  }
}