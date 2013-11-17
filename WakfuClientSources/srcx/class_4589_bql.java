import java.nio.ByteBuffer;

public class bql
  implements cxS
{
  public final adT fLp;

  public bql()
  {
    this.fLp = new adT();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.fLp.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.fLp.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.fLp.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      dys localdys = new dys(this, null);
      boolean bool = localdys.b(paramByteBuffer, paramInt);
      if (bool) {
        localdys.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.fLp.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("capturedCreature=...\n");
    this.fLp.a(paramStringBuilder, paramString + "  ");
  }
}