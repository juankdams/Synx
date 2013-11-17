import java.nio.ByteBuffer;

public class alN
  implements cxS
{
  public boolean dmL;
  public boolean dmM;
  public static final int aL = 2;

  public alN()
  {
    this.dmL = false;
    this.dmM = false;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.dmL ? 1 : 0));
    paramByteBuffer.put((byte)(this.dmM ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dmL = (paramByteBuffer.get() == 1);
    this.dmM = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.dmL = false;
    this.dmM = false;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10027003) {
      aPk localaPk = new aPk(this, null);
      boolean bool = localaPk.b(paramByteBuffer, paramInt);
      if (bool) {
        localaPk.z();
        return true;
      }
      return false;
    }

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
    paramStringBuilder.append(paramString).append("newCharacter=").append(this.dmL).append('\n');
    paramStringBuilder.append(paramString).append("needsRecustom=").append(this.dmM).append('\n');
  }
}