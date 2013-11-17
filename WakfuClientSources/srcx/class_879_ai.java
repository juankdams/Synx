import java.nio.ByteBuffer;

public class ai
  implements cxS
{
  public int bL = -1;
  public int bM = -1;
  public static final int aL = 8;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bL);
    paramByteBuffer.putInt(this.bM);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bL = paramByteBuffer.getInt();
    this.bM = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bL = -1;
    this.bM = -1;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 8;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("nationId=").append(this.bL).append('\n');
    paramStringBuilder.append(paramString).append("citizenScore=").append(this.bM).append('\n');
  }
}