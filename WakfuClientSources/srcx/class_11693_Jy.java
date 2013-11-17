import java.nio.ByteBuffer;

public class Jy
  implements cxS
{
  public int bUm = 0;
  public byte bUn = 0;
  public final cZr bUo = new cZr();

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.bUm);
    paramByteBuffer.put(this.bUn);
    boolean bool = this.bUo.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bUm = paramByteBuffer.getInt();
    this.bUn = paramByteBuffer.get();
    boolean bool = this.bUo.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.bUm = 0;
    this.bUn = 0;
    this.bUo.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 4;
    i++;
    i += this.bUo.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("gfxId=").append(this.bUm).append('\n');
    paramStringBuilder.append(paramString).append("sex=").append(this.bUn).append('\n');
    paramStringBuilder.append(paramString).append("imageCharac=...\n");
    this.bUo.a(paramStringBuilder, paramString + "  ");
  }
}