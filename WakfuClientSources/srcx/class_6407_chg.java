import java.nio.ByteBuffer;

public class chg extends akv
  implements cxS
{
  public dKF aE;
  private final cCH aW;

  public chg()
  {
    this.aE = null;

    this.aW = new bbJ(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aE != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.aE.g(paramByteBuffer);
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
      this.aE = new dKF();
      boolean bool = this.aE.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.aE = null;
    }
    return true;
  }

  public void clear() {
    this.aE = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      y localy = new y(this, null);
      boolean bool = localy.b(paramByteBuffer, paramInt);
      if (bool) {
        localy.z();
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
    if (this.aE != null) {
      i += this.aE.O();
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
    paramStringBuilder.append(paramString).append("osaSpecific=");
    if (this.aE == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aE.a(paramStringBuilder, paramString + "  ");
    }
  }
}