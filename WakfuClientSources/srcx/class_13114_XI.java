import java.nio.ByteBuffer;

public class XI
  implements cxS
{
  public short cIh;
  public final dGD cpq;

  public XI()
  {
    this.cIh = 0;
    this.cpq = new dGD();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cIh);
    boolean bool = this.cpq.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cIh = 0;
    this.cpq.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      dnY localdnY = new dnY(this, null);
      boolean bool = localdnY.b(paramByteBuffer, paramInt);
      if (bool) {
        localdnY.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 2;
    i += this.cpq.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("position=").append(this.cIh).append('\n');
    paramStringBuilder.append(paramString).append("item=...\n");
    this.cpq.a(paramStringBuilder, paramString + "  ");
  }
}