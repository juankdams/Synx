import java.nio.ByteBuffer;

public class dKK
  implements cxS
{
  public final aof egq;

  public dKK()
  {
    this.egq = new aof();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.egq.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.egq.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.egq.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      aIc localaIc = new aIc(this, null);
      boolean bool = localaIc.b(paramByteBuffer, paramInt);
      if (bool) {
        localaIc.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.egq.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("summon=...\n");
    this.egq.a(paramStringBuilder, paramString + "  ");
  }
}