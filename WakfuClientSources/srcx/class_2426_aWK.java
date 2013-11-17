import java.nio.ByteBuffer;

public class aWK
  implements cxS
{
  public final Qv fbN;

  public aWK()
  {
    this.fbN = new Qv();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.fbN.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.fbN.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.fbN.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cww localcww = new cww(this, null);
      boolean bool = localcww.b(paramByteBuffer, paramInt);
      if (bool) {
        localcww.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.fbN.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("shelfItem=...\n");
    this.fbN.a(paramStringBuilder, paramString + "  ");
  }
}