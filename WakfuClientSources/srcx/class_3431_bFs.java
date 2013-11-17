import java.nio.ByteBuffer;

public class bFs
  implements cxS
{
  public byte gAt;
  public int gAu;
  public int gAv;
  public static final int aL = 9;

  public bFs()
  {
    this.gAt = 0;
    this.gAu = 0;
    this.gAv = 0;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.gAt);
    paramByteBuffer.putInt(this.gAu);
    paramByteBuffer.putInt(this.gAv);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gAt = paramByteBuffer.get();
    this.gAu = paramByteBuffer.getInt();
    this.gAv = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.gAt = 0;
    this.gAu = 0;
    this.gAv = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10004) {
      bOQ localbOQ = new bOQ(this, null);
      boolean bool = localbOQ.b(paramByteBuffer, paramInt);
      if (bool) {
        localbOQ.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 9;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("aptitudeType=").append(this.gAt).append('\n');
    paramStringBuilder.append(paramString).append("availablePoints=").append(this.gAu).append('\n');
    paramStringBuilder.append(paramString).append("wonPoints=").append(this.gAv).append('\n');
  }
}