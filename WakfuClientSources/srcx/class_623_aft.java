import java.nio.ByteBuffer;

public class aft
  implements cxS
{
  public byte cYp = 0;
  public int crP = 0;
  public static final int aL = 5;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.cYp);
    paramByteBuffer.putInt(this.crP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cYp = paramByteBuffer.get();
    this.crP = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cYp = 0;
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
    paramStringBuilder.append(paramString).append("itemTypeId=").append(this.cYp).append('\n');
    paramStringBuilder.append(paramString).append("amount=").append(this.crP).append('\n');
  }
}