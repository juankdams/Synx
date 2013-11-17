import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aKR
  implements cxS
{
  public final ArrayList VR;

  public aKR()
  {
    this.VR = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.VR.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.VR.size());
    for (int i = 0; i < this.VR.size(); i++) {
      cII localcII = (cII)this.VR.get(i);
      boolean bool = localcII.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.VR.clear();
    this.VR.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cII localcII = new cII();
      boolean bool = localcII.h(paramByteBuffer);
      if (!bool)
        return false;
      this.VR.add(localcII);
    }
    return true;
  }

  public void clear() {
    this.VR.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.VR.size(); j++) {
      cII localcII = (cII)this.VR.get(j);
      i += localcII.O();
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
    paramStringBuilder.append(paramString).append("targets=");
    if (this.VR.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.VR.size()).append(" elements)...\n");
      for (int i = 0; i < this.VR.size(); i++) {
        cII localcII = (cII)this.VR.get(i);
        localcII.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}