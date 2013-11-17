import java.nio.ByteBuffer;

public class cXz
  implements cxS
{
  public final dCa bbJ;

  public cXz()
  {
    this.bbJ = new dCa();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.bbJ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cVG localcVG = new cVG(this, null);
      boolean bool = localcVG.b(paramByteBuffer, paramInt);
      if (bool) {
        localcVG.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.bbJ.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("room=...\n");
    this.bbJ.a(paramStringBuilder, paramString + "  ");
  }
}