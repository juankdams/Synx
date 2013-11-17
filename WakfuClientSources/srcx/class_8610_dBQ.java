import java.nio.ByteBuffer;

public class dBQ
  implements cxS
{
  public short cIh = 0;
  public final dlK lJs = new dlK();

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cIh);
    boolean bool = this.lJs.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.lJs.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cIh = 0;
    this.lJs.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += this.lJs.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("position=").append(this.cIh).append('\n');
    paramStringBuilder.append(paramString).append("shortcut=...\n");
    this.lJs.a(paramStringBuilder, paramString + "  ");
  }
}