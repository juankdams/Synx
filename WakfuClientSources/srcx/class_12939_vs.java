import java.nio.ByteBuffer;

public class vs
  implements cxS
{
  public int bjD;
  public final cSh bjE;

  public vs()
  {
    this.bjD = 0;
    this.bjE = new cSh();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.bjD);
    boolean bool = this.bjE.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bjD = paramByteBuffer.getInt();
    boolean bool = this.bjE.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.bjD = 0;
    this.bjE.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      cmM localcmM = new cmM(this, null);
      boolean bool = localcmM.b(paramByteBuffer, paramInt);
      if (bool) {
        localcmM.z();
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
    i += this.bjE.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("actionUid=").append(this.bjD).append('\n');
    paramStringBuilder.append(paramString).append("action=...\n");
    this.bjE.a(paramStringBuilder, paramString + "  ");
  }
}