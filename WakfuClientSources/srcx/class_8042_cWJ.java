import java.nio.ByteBuffer;

public class cWJ extends Dy
  implements cxS
{
  public final asj hRk;
  public static final byte aK = 1;

  public cWJ()
  {
    this.hRk = new asj();
  }

  public byte N()
  {
    return 1;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.hRk.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.hRk.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hRk.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cmx localcmx = new cmx(this, null);
      boolean bool = localcmx.b(paramByteBuffer, paramInt);
      if (bool) {
        localcmx.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.hRk.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("content=...\n");
    this.hRk.a(paramStringBuilder, paramString + "  ");
  }
}