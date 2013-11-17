import java.nio.ByteBuffer;

public class qF extends akv
  implements cxS
{
  public boolean aXT = false;
  public boolean aXU = false;

  private final cCH aW = new bIt(this);
  public static final int aL = 2;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.aXT ? 1 : 0));
    paramByteBuffer.put((byte)(this.aXU ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aXT = (paramByteBuffer.get() == 1);
    this.aXU = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.aXT = false;
    this.aXU = false;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 2;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("afkState=").append(this.aXT).append('\n');
    paramStringBuilder.append(paramString).append("dndState=").append(this.aXU).append('\n');
  }
}