import java.nio.ByteBuffer;

public class agU
  implements cxS
{
  public final bQo daT;

  public agU()
  {
    this.daT = new bQo();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.daT.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.daT.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.daT.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10023) {
      aVl localaVl = new aVl(this, null);
      boolean bool = localaVl.b(paramByteBuffer, paramInt);
      if (bool) {
        localaVl.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.daT.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rawGems=...\n");
    this.daT.a(paramStringBuilder, paramString + "  ");
  }
}