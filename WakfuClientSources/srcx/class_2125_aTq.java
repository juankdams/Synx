import java.nio.ByteBuffer;

public class aTq
  implements cxS
{
  public int eQZ;
  public final cRf eRa;

  public aTq()
  {
    this.eQZ = 0;
    this.eRa = new cRf();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.eQZ);
    boolean bool = this.eRa.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.eQZ = paramByteBuffer.getInt();
    boolean bool = this.eRa.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.eQZ = 0;
    this.eRa.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      cti localcti = new cti(this, null);
      boolean bool = localcti.b(paramByteBuffer, paramInt);
      if (bool) {
        localcti.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 4;
    i += this.eRa.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("actionGroupId=").append(this.eQZ).append('\n');
    paramStringBuilder.append(paramString).append("actionGroup=...\n");
    this.eRa.a(paramStringBuilder, paramString + "  ");
  }
}