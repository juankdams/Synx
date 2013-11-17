import java.nio.ByteBuffer;

public class bri extends akv
  implements cxS
{
  public long fMO = 0L;
  public long aFO = 0L;
  public long aFP = 0L;
  public byte aFQ = 0;
  public boolean fMP = false;

  private final cCH aW = new ayQ(this);
  public static final int aL = 26;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.fMO);
    paramByteBuffer.putLong(this.aFO);
    paramByteBuffer.putLong(this.aFP);
    paramByteBuffer.put(this.aFQ);
    paramByteBuffer.put((byte)(this.fMP ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.fMO = paramByteBuffer.getLong();
    this.aFO = paramByteBuffer.getLong();
    this.aFP = paramByteBuffer.getLong();
    this.aFQ = paramByteBuffer.get();
    this.fMP = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.fMO = 0L;
    this.aFO = 0L;
    this.aFP = 0L;
    this.aFQ = 0;
    this.fMP = false;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 26;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rank=").append(this.fMO).append('\n');
    paramStringBuilder.append(paramString).append("jobs=").append(this.aFO).append('\n');
    paramStringBuilder.append(paramString).append("voteDate=").append(this.aFP).append('\n');
    paramStringBuilder.append(paramString).append("governmentOpinion=").append(this.aFQ).append('\n');
    paramStringBuilder.append(paramString).append("isCandidate=").append(this.fMP).append('\n');
  }
}