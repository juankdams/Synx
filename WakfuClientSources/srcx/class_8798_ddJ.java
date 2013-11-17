import java.nio.ByteBuffer;

public class ddJ extends akv
  implements cxS
{
  public final dlk kXr;
  private final cCH aW;

  public ddJ()
  {
    this.kXr = new dlk();

    this.aW = new bF(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.kXr.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.kXr.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.kXr.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      dsI localdsI = new dsI(this, null);
      boolean bool = localdsI.b(paramByteBuffer, paramInt);
      if (bool) {
        localdsI.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.kXr.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("inventoryHandler=...\n");
    this.kXr.a(paramStringBuilder, paramString + "  ");
  }
}