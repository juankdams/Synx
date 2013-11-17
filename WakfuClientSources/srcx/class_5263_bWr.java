import java.nio.ByteBuffer;

public class bWr extends akv
  implements cxS
{
  public final drq hiA;
  private final cCH aW;

  public bWr()
  {
    this.hiA = new drq();

    this.aW = new cEe(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hiA.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      dxO localdxO = new dxO(this, null);
      boolean bool = localdxO.b(paramByteBuffer, paramInt);
      if (bool) {
        localdxO.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.hiA.O();
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
    this.hiA.a(paramStringBuilder, paramString + "  ");
  }
}