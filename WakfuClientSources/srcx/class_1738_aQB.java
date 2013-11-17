import java.nio.ByteBuffer;

public class aQB extends akv
  implements cxS
{
  public long aGh = 0L;
  public final apI eNo = new apI();
  public int eNp = 0;

  private final cCH aW = new abH(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.aGh);
    boolean bool = this.eNo.g(paramByteBuffer);
    if (!bool)
      return false;
    paramByteBuffer.putInt(this.eNp);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGh = paramByteBuffer.getLong();
    boolean bool = this.eNo.h(paramByteBuffer);
    if (!bool)
      return false;
    this.eNp = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.aGh = 0L;
    this.eNo.clear();
    this.eNp = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += this.eNo.O();
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
    paramStringBuilder.append(paramString).append("xp=").append(this.aGh).append('\n');
    paramStringBuilder.append(paramString).append("bonusPointCharacteristics=...\n");
    this.eNo.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("wakfuGauge=").append(this.eNp).append('\n');
  }
}