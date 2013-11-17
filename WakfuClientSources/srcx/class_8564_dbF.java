import java.nio.ByteBuffer;

public class dbF
  implements cxS
{
  public final cQQ kTP;

  public dbF()
  {
    this.kTP = new cQQ();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.kTP.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.kTP.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.kTP.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dFh localdFh = new dFh(this, null);
      boolean bool = localdFh.b(paramByteBuffer, paramInt);
      if (bool) {
        localdFh.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.kTP.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("scenario=...\n");
    this.kTP.a(paramStringBuilder, paramString + "  ");
  }
}