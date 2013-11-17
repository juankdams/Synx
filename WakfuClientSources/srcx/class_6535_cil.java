import java.nio.ByteBuffer;

public class cil
  implements cxS
{
  public int cIt;
  public int cIu;
  public int cIv;
  public static final int aL = 12;

  public cil()
  {
    this.cIt = 0;
    this.cIu = 0;
    this.cIv = 0;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.cIt);
    paramByteBuffer.putInt(this.cIu);
    paramByteBuffer.putInt(this.cIv);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIt = paramByteBuffer.getInt();
    this.cIu = paramByteBuffer.getInt();
    this.cIv = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.cIt = 0;
    this.cIu = 0;
    this.cIv = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 313) {
      XU localXU = new XU(this, null);
      boolean bool = localXU.b(paramByteBuffer, paramInt);
      if (bool) {
        localXU.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 12;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("dropTableId=").append(this.cIt).append('\n');
    paramStringBuilder.append(paramString).append("dropTableIdToBuy=").append(this.cIu).append('\n');
    paramStringBuilder.append(paramString).append("dropTableIdChaos=").append(this.cIv).append('\n');
  }
}