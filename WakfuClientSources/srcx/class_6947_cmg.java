import java.nio.ByteBuffer;

public class cmg
  implements cxS
{
  public final csP dSK = new csP();

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.dSK.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.dSK.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.dSK.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.dSK.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("stateRunningEffects=...\n");
    this.dSK.a(paramStringBuilder, paramString + "  ");
  }
}