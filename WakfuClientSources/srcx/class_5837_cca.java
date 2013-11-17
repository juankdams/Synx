import java.nio.ByteBuffer;

public class cca
  implements cxS
{
  public short bxv = 0;
  public byte htp = 0;
  public byte htq = 0;
  public byte htr = 0;
  public byte hts = 0;
  public static final int aL = 6;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.bxv);
    paramByteBuffer.put(this.htp);
    paramByteBuffer.put(this.htq);
    paramByteBuffer.put(this.htr);
    paramByteBuffer.put(this.hts);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bxv = paramByteBuffer.getShort();
    this.htp = paramByteBuffer.get();
    this.htq = paramByteBuffer.get();
    this.htr = paramByteBuffer.get();
    this.hts = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.bxv = 0;
    this.htp = 0;
    this.htq = 0;
    this.htr = 0;
    this.hts = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 6;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bxv).append('\n');
    paramStringBuilder.append(paramString).append("step=").append(this.htp).append('\n');
    paramStringBuilder.append(paramString).append("x=").append(this.htq).append('\n');
    paramStringBuilder.append(paramString).append("y=").append(this.htr).append('\n');
    paramStringBuilder.append(paramString).append("z=").append(this.hts).append('\n');
  }
}