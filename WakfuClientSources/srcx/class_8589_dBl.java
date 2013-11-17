import java.nio.ByteBuffer;

public class dBl extends akv
  implements cxS
{
  public long ayv = 0L;
  public long lIQ = 0L;
  public long lIR = 0L;
  public byte lIS = 0;

  private final cCH aW = new dJd(this);
  public static final int aL = 25;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.ayv);
    paramByteBuffer.putLong(this.lIQ);
    paramByteBuffer.putLong(this.lIR);
    paramByteBuffer.put(this.lIS);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayv = paramByteBuffer.getLong();
    this.lIQ = paramByteBuffer.getLong();
    this.lIR = paramByteBuffer.getLong();
    this.lIS = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.ayv = 0L;
    this.lIQ = 0L;
    this.lIR = 0L;
    this.lIS = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 25;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
    paramStringBuilder.append(paramString).append("fightXp=").append(this.lIQ).append('\n');
    paramStringBuilder.append(paramString).append("jobXP=").append(this.lIR).append('\n');
    paramStringBuilder.append(paramString).append("rank=").append(this.lIS).append('\n');
  }
}