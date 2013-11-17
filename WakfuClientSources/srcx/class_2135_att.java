import java.nio.ByteBuffer;

public class att extends akv
  implements cxS
{
  public final cEZ dEN;
  public short dEO;
  private final cCH aW;

  public att()
  {
    this.dEN = new cEZ();
    this.dEO = 0;

    this.aW = new bUu(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool = this.dEN.g(paramByteBuffer);
    if (!bool)
      return false;
    paramByteBuffer.putShort(this.dEO);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool = this.dEN.h(paramByteBuffer);
    if (!bool)
      return false;
    this.dEO = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.dEN.clear();
    this.dEO = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10004) {
      dnf localdnf = new dnf(this, null);
      boolean bool = localdnf.b(paramByteBuffer, paramInt);
      if (bool) {
        localdnf.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.dEN.O();
    i += 2;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("aptitudeInventory=...\n");
    this.dEN.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("version=").append(this.dEO).append('\n');
  }
}