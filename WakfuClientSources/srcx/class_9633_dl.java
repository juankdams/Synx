import java.nio.ByteBuffer;

public class dl extends akv
  implements cxS
{
  public final caC Ti;
  private final cCH aW;

  public dl()
  {
    this.Ti = new caC();

    this.aW = new bCM(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.Ti.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.Ti.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.Ti.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      asA localasA = new asA(this, null);
      boolean bool = localasA.b(paramByteBuffer, paramInt);
      if (bool) {
        localasA.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.Ti.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("bagContainer=...\n");
    this.Ti.a(paramStringBuilder, paramString + "  ");
  }
}