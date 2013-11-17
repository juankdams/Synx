import java.nio.ByteBuffer;

public class PB extends akv
  implements cxS
{
  public final apY btw;
  private final cCH aW;

  public PB()
  {
    this.btw = new apY();

    this.aW = new axY(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.btw.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.btw.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.btw.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028001) {
      zf localzf = new zf(this, null);
      boolean bool = localzf.b(paramByteBuffer, paramInt);
      if (bool) {
        localzf.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.btw.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("locks=...\n");
    this.btw.a(paramStringBuilder, paramString + "  ");
  }
}