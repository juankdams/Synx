import java.nio.ByteBuffer;

public class dlO extends akv
  implements cxS
{
  public bTN kEC;
  private final cCH aW;

  public dlO()
  {
    this.kEC = null;

    this.aW = new bRV(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.kEC != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.kEC.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.kEC = new bTN();
      boolean bool = this.kEC.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.kEC = null;
    }
    return true;
  }

  public void clear() {
    this.kEC = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      cSl localcSl = new cSl(this, null);
      boolean bool = localcSl.b(paramByteBuffer, paramInt);
      if (bool) {
        localcSl.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    if (this.kEC != null) {
      i += this.kEC.O();
    }
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("occupation=");
    if (this.kEC == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.kEC.a(paramStringBuilder, paramString + "  ");
    }
  }
}