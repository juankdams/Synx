import java.nio.ByteBuffer;

public class cku
  implements cxS
{
  public final btq hLC;

  public cku()
  {
    this.hLC = new btq();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hLC.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cRr localcRr = new cRr(this, null);
      boolean bool = localcRr.b(paramByteBuffer, paramInt);
      if (bool) {
        localcRr.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.hLC.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("persistantData=...\n");
    this.hLC.a(paramStringBuilder, paramString + "  ");
  }
}