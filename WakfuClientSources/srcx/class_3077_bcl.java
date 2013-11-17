import java.nio.ByteBuffer;

public class bcl
  implements cxS
{
  public final Jz flX;

  public bcl()
  {
    this.flX = new Jz();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.flX.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.flX.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.flX.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10004) {
      btW localbtW = new btW(this, null);
      boolean bool = localbtW.b(paramByteBuffer, paramInt);
      if (bool) {
        localbtW.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.flX.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("aptitude=...\n");
    this.flX.a(paramStringBuilder, paramString + "  ");
  }
}