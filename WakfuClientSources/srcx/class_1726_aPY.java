import java.nio.ByteBuffer;

public class aPY extends akv
  implements cxS
{
  public final dQW eMU;
  private final cCH aW;

  public aPY()
  {
    this.eMU = new dQW();

    this.aW = new zq(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.eMU.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.eMU.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.eMU.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bKn localbKn = new bKn(this, null);
      boolean bool = localbKn.b(paramByteBuffer, paramInt);
      if (bool) {
        localbKn.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.eMU.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("equipment=...\n");
    this.eMU.a(paramStringBuilder, paramString + "  ");
  }
}