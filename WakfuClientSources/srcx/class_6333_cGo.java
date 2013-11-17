import java.nio.ByteBuffer;

public class cGo
  implements cxS
{
  public final cMH izb;

  public cGo()
  {
    this.izb = new cMH();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.izb.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cFa localcFa = new cFa(this, null);
      boolean bool = localcFa.b(paramByteBuffer, paramInt);
      if (bool) {
        localcFa.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.izb.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("bag=...\n");
    this.izb.a(paramStringBuilder, paramString + "  ");
  }
}