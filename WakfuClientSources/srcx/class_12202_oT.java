import java.nio.ByteBuffer;

public class oT
  implements cxS
{
  public final aiZ aUy = new aiZ();

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.aUy.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.aUy.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.aUy.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.aUy.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("spellLevel=...\n");
    this.aUy.a(paramStringBuilder, paramString + "  ");
  }
}