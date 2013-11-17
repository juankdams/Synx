import java.nio.ByteBuffer;

public class Jz
  implements cxS
{
  public short bxv;
  public short bUp;
  public short bUq;
  public static final int aL = 6;

  public Jz()
  {
    this.bxv = 0;
    this.bUp = 0;
    this.bUq = 0;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.bxv);
    paramByteBuffer.putShort(this.bUp);
    paramByteBuffer.putShort(this.bUq);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bxv = paramByteBuffer.getShort();
    this.bUp = paramByteBuffer.getShort();
    this.bUq = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bxv = 0;
    this.bUp = 0;
    this.bUq = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10004) {
      axI localaxI = new axI(this, null);
      boolean bool = localaxI.b(paramByteBuffer, paramInt);
      if (bool) {
        localaxI.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 6;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bxv).append('\n');
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("wonLevel=").append(this.bUq).append('\n');
  }
}