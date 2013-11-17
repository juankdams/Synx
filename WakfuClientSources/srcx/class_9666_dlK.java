import java.nio.ByteBuffer;

public class dlK
  implements cxS
{
  public byte type = 0;
  public long lji = 0L;
  public int ljj = 0;
  public int ljk = 0;
  public static final int aL = 17;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.type);
    paramByteBuffer.putLong(this.lji);
    paramByteBuffer.putInt(this.ljj);
    paramByteBuffer.putInt(this.ljk);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.type = paramByteBuffer.get();
    this.lji = paramByteBuffer.getLong();
    this.ljj = paramByteBuffer.getInt();
    this.ljk = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.type = 0;
    this.lji = 0L;
    this.ljj = 0;
    this.ljk = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 17;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("targetUniqueId=").append(this.lji).append('\n');
    paramStringBuilder.append(paramString).append("targetReferenceId=").append(this.ljj).append('\n');
    paramStringBuilder.append(paramString).append("targetGfxId=").append(this.ljk).append('\n');
  }
}