import java.nio.ByteBuffer;

public class cGd
  implements cxS
{
  public short cIh;
  public final Qv ehJ;

  public cGd()
  {
    this.cIh = 0;
    this.ehJ = new Qv();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cIh);
    boolean bool = this.ehJ.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.ehJ.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cIh = 0;
    this.ehJ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      aIR localaIR = new aIR(this, null);
      boolean bool = localaIR.b(paramByteBuffer, paramInt);
      if (bool) {
        localaIR.z();
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
    i += this.ehJ.O();
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
    paramStringBuilder.append(paramString).append("merchantItem=...\n");
    this.ehJ.a(paramStringBuilder, paramString + "  ");
  }
}