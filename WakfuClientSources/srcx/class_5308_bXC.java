import java.nio.ByteBuffer;

public class bXC extends akv
  implements cxS
{
  public final dA hmO;
  private final cCH aW;

  public bXC()
  {
    this.hmO = new dA();

    this.aW = new bWo(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.hmO.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.hmO.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hmO.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dvM localdvM = new dvM(this, null);
      boolean bool = localdvM.b(paramByteBuffer, paramInt);
      if (bool) {
        localdvM.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.hmO.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("challenges=...\n");
    this.hmO.a(paramStringBuilder, paramString + "  ");
  }
}