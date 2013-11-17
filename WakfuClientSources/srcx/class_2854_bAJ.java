import java.nio.ByteBuffer;

public class bAJ
  implements cxS
{
  public final gZ Ui = new gZ();

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.Ui.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.Ui.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.Ui.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.Ui.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rawXp=...\n");
    this.Ui.a(paramStringBuilder, paramString + "  ");
  }
}