import java.nio.ByteBuffer;

public class bPH
  implements cxS
{
  public int gXT = 0;
  public long gXU = 0L;
  public static final int aL = 12;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.gXT);
    paramByteBuffer.putLong(this.gXU);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gXT = paramByteBuffer.getInt();
    this.gXU = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.gXT = 0;
    this.gXU = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 12;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("monsterCrewId=").append(this.gXT).append('\n');
    paramStringBuilder.append(paramString).append("monterId=").append(this.gXU).append('\n');
  }
}