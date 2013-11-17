import java.nio.ByteBuffer;

public class yV
  implements cxS
{
  public final cPm btg = new cPm();

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.btg.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.btg.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.btg.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.btg.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("skill=...\n");
    this.btg.a(paramStringBuilder, paramString + "  ");
  }
}