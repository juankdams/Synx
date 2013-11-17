import java.nio.ByteBuffer;

public class bgx extends akv
  implements cxS
{
  public dVU cfK;
  private final cCH aW;

  public bgx()
  {
    this.cfK = null;

    this.aW = new bAf(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.cfK != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.cfK.g(paramByteBuffer);
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
      this.cfK = new dVU();
      boolean bool = this.cfK.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.cfK = null;
    }
    return true;
  }

  public void clear() {
    this.cfK = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      Oy localOy = new Oy(this, null);
      boolean bool = localOy.b(paramByteBuffer, paramInt);
      if (bool) {
        localOy.z();
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
    if (this.cfK != null) {
      i += this.cfK.O();
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
    paramStringBuilder.append(paramString).append("currentPath=");
    if (this.cfK == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.cfK.a(paramStringBuilder, paramString + "  ");
    }
  }
}