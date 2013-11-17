import java.nio.ByteBuffer;

public class cys extends Dy
  implements cxS
{
  public final aBi imM = new aBi();
  public static final byte aK = 2;

  public byte N()
  {
    return 2;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.imM.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.imM.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.imM.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.imM.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("content=...\n");
    this.imM.a(paramStringBuilder, paramString + "  ");
  }
}