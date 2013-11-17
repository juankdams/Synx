import java.nio.ByteBuffer;

public class cPS extends akv
  implements cxS
{
  public aJE hHR;
  private final cCH aW;

  public cPS()
  {
    this.hHR = null;

    this.aW = new cTa(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.hHR != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.hHR.g(paramByteBuffer);
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
      this.hHR = new aJE();
      boolean bool = this.hHR.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.hHR = null;
    }
    return true;
  }

  public void clear() {
    this.hHR = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10026000) {
      ciG localciG = new ciG(this, null);
      boolean bool = localciG.b(paramByteBuffer, paramInt);
      if (bool) {
        localciG.z();
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
    if (this.hHR != null) {
      i += this.hHR.O();
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
    paramStringBuilder.append(paramString).append("addictionData=");
    if (this.hHR == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hHR.a(paramStringBuilder, paramString + "  ");
    }
  }
}