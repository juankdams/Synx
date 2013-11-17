import java.nio.ByteBuffer;

public class dFw extends akv
  implements cxS
{
  public int fFP = 0;

  private final cCH aW = new bUU(this);
  public static final int aL = 4;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.fFP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.fFP = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.fFP = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 4;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("accountFlags=").append(this.fFP).append('\n');
  }
}