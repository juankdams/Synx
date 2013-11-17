import java.nio.ByteBuffer;

public class eU
  implements cxS
{
  public int aBM = 0;
  public short aBN = 0;
  public byte status = 0;
  public static final int aL = 7;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aBM);
    paramByteBuffer.putShort(this.aBN);
    paramByteBuffer.put(this.status);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aBM = paramByteBuffer.getInt();
    this.aBN = paramByteBuffer.getShort();
    this.status = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.aBM = 0;
    this.aBN = 0;
    this.status = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 7;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("scenarioId=").append(this.aBM).append('\n');
    paramStringBuilder.append(paramString).append("executionCount=").append(this.aBN).append('\n');
    paramStringBuilder.append(paramString).append("status=").append(this.status).append('\n');
  }
}