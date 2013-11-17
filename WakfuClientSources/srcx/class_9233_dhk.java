import java.nio.ByteBuffer;

public class dhk extends akv
  implements cxS
{
  public final dA lcq;
  private final cCH aW;

  public dhk()
  {
    this.lcq = new dA();

    this.aW = new aTv(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.lcq.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.lcq.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.lcq.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dsN localdsN = new dsN(this, null);
      boolean bool = localdsN.b(paramByteBuffer, paramInt);
      if (bool) {
        localdsN.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.lcq.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("scenarioManager=...\n");
    this.lcq.a(paramStringBuilder, paramString + "  ");
  }
}