import java.nio.ByteBuffer;

public class bMl
  implements cxS
{
  public final btn bEG;

  public bMl()
  {
    this.bEG = new btn();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.bEG.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      Cc localCc = new Cc(this, null);
      boolean bool = localCc.b(paramByteBuffer, paramInt);
      if (bool) {
        localCc.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.bEG.O();
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
    this.bEG.a(paramStringBuilder, paramString + "  ");
  }
}