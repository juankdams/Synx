import java.nio.ByteBuffer;

public class aAs
  implements cxS
{
  public int bL = 0;
  public byte dSU = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bL);
    paramByteBuffer.put(this.dSU);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bL = paramByteBuffer.getInt();
    this.dSU = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.bL = 0;
    this.dSU = 0;
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
    paramStringBuilder.append(paramString).append("nationId=").append(this.bL).append('\n');
    paramStringBuilder.append(paramString).append("alignment=").append(this.dSU).append('\n');
  }
}