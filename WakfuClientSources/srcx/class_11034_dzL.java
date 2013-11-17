import java.nio.ByteBuffer;

public class dzL
  implements cxS
{
  public final aTz dVA;

  public dzL()
  {
    this.dVA = new aTz();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.dVA.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.dVA.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.dVA.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10024001) {
      cYc localcYc = new cYc(this, null);
      boolean bool = localcYc.b(paramByteBuffer, paramInt);
      if (bool) {
        localcYc.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.dVA.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rawPet=...\n");
    this.dVA.a(paramStringBuilder, paramString + "  ");
  }
}