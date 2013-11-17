import java.nio.ByteBuffer;

public class bRW extends Dy
  implements cxS
{
  public final aWJ hbQ = new aWJ();
  public static final byte aK = 3;

  public byte N()
  {
    return 3;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.hbQ.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.hbQ.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hbQ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += this.hbQ.O();
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
    this.hbQ.a(paramStringBuilder, paramString + "  ");
  }
}