import java.nio.ByteBuffer;

public class cqY
  implements cxS
{
  public final bph cfP;

  public cqY()
  {
    this.cfP = new bph();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.cfP.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.cfP.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cfP.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      OH localOH = new OH(this, null);
      boolean bool = localOH.b(paramByteBuffer, paramInt);
      if (bool) {
        localOH.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.cfP.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("compartment=...\n");
    this.cfP.a(paramStringBuilder, paramString + "  ");
  }
}