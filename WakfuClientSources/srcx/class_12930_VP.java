import java.nio.ByteBuffer;

public class VP
  implements cxS
{
  public final kH cAY;

  public VP()
  {
    this.cAY = new kH();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.cAY.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.cAY.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cAY.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cWe localcWe = new cWe(this, null);
      boolean bool = localcWe.b(paramByteBuffer, paramInt);
      if (bool) {
        localcWe.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.cAY.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rawRentInfo=...\n");
    this.cAY.a(paramStringBuilder, paramString + "  ");
  }
}