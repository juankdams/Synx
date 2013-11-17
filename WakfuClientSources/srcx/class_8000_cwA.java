import java.nio.ByteBuffer;

public class cwA
  implements cxS
{
  public byte iiP = 0;
  public int igo = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.iiP);
    paramByteBuffer.putInt(this.igo);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.iiP = paramByteBuffer.get();
    this.igo = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.iiP = 0;
    this.igo = 0;
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
    paramStringBuilder.append(paramString).append("contextId=").append(this.iiP).append('\n');
    paramStringBuilder.append(paramString).append("cashAmount=").append(this.igo).append('\n');
  }
}