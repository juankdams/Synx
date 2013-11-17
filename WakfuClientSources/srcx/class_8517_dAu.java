import java.nio.ByteBuffer;

public class dAu
  implements cxS
{
  public byte lHB = 0;
  public int crP = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.lHB);
    paramByteBuffer.putInt(this.crP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.lHB = paramByteBuffer.get();
    this.crP = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.lHB = 0;
    this.crP = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 5;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("taxId=").append(this.lHB).append('\n');
    paramStringBuilder.append(paramString).append("amount=").append(this.crP).append('\n');
  }
}