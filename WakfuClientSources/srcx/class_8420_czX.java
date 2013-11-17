import java.nio.ByteBuffer;

public class czX
  implements cxS
{
  public int aGg = 0;
  public int ipX = 0;
  public int eRE = 0;
  public int eRL = 0;
  public int eRF = 0;
  public static final int aL = 20;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aGg);
    paramByteBuffer.putInt(this.ipX);
    paramByteBuffer.putInt(this.eRE);
    paramByteBuffer.putInt(this.eRL);
    paramByteBuffer.putInt(this.eRF);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGg = paramByteBuffer.getInt();
    this.ipX = paramByteBuffer.getInt();
    this.eRE = paramByteBuffer.getInt();
    this.eRL = paramByteBuffer.getInt();
    this.eRF = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.aGg = 0;
    this.ipX = 0;
    this.eRE = 0;
    this.eRL = 0;
    this.eRF = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 20;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("definitionId=").append(this.aGg).append('\n');
    paramStringBuilder.append(paramString).append("colorRefItemId=").append(this.ipX).append('\n');
    paramStringBuilder.append(paramString).append("equippedRefItemId=").append(this.eRE).append('\n');
    paramStringBuilder.append(paramString).append("sleepRefItemId=").append(this.eRL).append('\n');
    paramStringBuilder.append(paramString).append("health=").append(this.eRF).append('\n');
  }
}