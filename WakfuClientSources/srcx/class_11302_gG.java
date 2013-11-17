import java.nio.ByteBuffer;

public class gG extends akv
  implements cxS
{
  public long aFO = 0L;
  public long aFP = 0L;
  public byte aFQ = 0;

  private final cCH aW = new Cp(this);
  public static final int aL = 17;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.aFO);
    paramByteBuffer.putLong(this.aFP);
    paramByteBuffer.put(this.aFQ);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aFO = paramByteBuffer.getLong();
    this.aFP = paramByteBuffer.getLong();
    this.aFQ = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.aFO = 0L;
    this.aFP = 0L;
    this.aFQ = 0;
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
    paramStringBuilder.append(paramString).append("jobs=").append(this.aFO).append('\n');
    paramStringBuilder.append(paramString).append("voteDate=").append(this.aFP).append('\n');
    paramStringBuilder.append(paramString).append("governmentOpinion=").append(this.aFQ).append('\n');
  }
}