import java.nio.ByteBuffer;

public class djL
  implements cxS
{
  public final cUp htZ;

  public djL()
  {
    this.htZ = new cUp();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.htZ.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.htZ.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.htZ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      ccr localccr = new ccr(this, null);
      boolean bool = localccr.b(paramByteBuffer, paramInt);
      if (bool) {
        localccr.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.htZ.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("tax=...\n");
    this.htZ.a(paramStringBuilder, paramString + "  ");
  }
}