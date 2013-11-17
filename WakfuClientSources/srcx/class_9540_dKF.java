import java.nio.ByteBuffer;

public class dKF
  implements cxS
{
  public final bxb ffF;

  public dKF()
  {
    this.ffF = new bxb();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.ffF.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.ffF.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.ffF.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      aZd localaZd = new aZd(this, null);
      boolean bool = localaZd.b(paramByteBuffer, paramInt);
      if (bool) {
        localaZd.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.ffF.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("symbiot=...\n");
    this.ffF.a(paramStringBuilder, paramString + "  ");
  }
}