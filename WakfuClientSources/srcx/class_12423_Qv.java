import java.nio.ByteBuffer;

public class Qv
  implements cxS
{
  public final dGD cpq;
  public short cpr;
  public int cps;

  public Qv()
  {
    this.cpq = new dGD();
    this.cpr = 1;
    this.cps = 0;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.cpq.g(paramByteBuffer);
    if (!bool)
      return false;
    paramByteBuffer.putShort(this.cpr);
    paramByteBuffer.putInt(this.cps);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.cpq.h(paramByteBuffer);
    if (!bool)
      return false;
    this.cpr = paramByteBuffer.getShort();
    this.cps = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cpq.clear();
    this.cpr = 1;
    this.cps = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cjd localcjd = new cjd(this, null);
      boolean bool = localcjd.b(paramByteBuffer, paramInt);
      if (bool) {
        localcjd.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.cpq.O();
    i += 2;
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
    paramStringBuilder.append(paramString).append("item=...\n");
    this.cpq.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("packSize=").append(this.cpr).append('\n');
    paramStringBuilder.append(paramString).append("price=").append(this.cps).append('\n');
  }
}