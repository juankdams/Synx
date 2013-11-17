import java.nio.ByteBuffer;

public class dkE
  implements cxS
{
  public final awE lhM;

  public dkE()
  {
    this.lhM = new awE();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.lhM.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.lhM.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.lhM.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dQM localdQM = new dQM(this, null);
      boolean bool = localdQM.b(paramByteBuffer, paramInt);
      if (bool) {
        localdQM.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.lhM.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("challenge=...\n");
    this.lhM.a(paramStringBuilder, paramString + "  ");
  }
}