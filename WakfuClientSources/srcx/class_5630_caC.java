import java.nio.ByteBuffer;
import java.util.ArrayList;

public class caC
  implements cxS
{
  public final ArrayList daV;

  public caC()
  {
    this.daV = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.daV.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.daV.size());
    for (int i = 0; i < this.daV.size(); i++) {
      bMl localbMl = (bMl)this.daV.get(i);
      boolean bool = localbMl.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.daV.clear();
    this.daV.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bMl localbMl = new bMl();
      boolean bool = localbMl.h(paramByteBuffer);
      if (!bool)
        return false;
      this.daV.add(localbMl);
    }
    return true;
  }

  public void clear() {
    this.daV.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      agW localagW = new agW(this, null);
      boolean bool = localagW.b(paramByteBuffer, paramInt);
      if (bool) {
        localagW.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.daV.size(); j++) {
      bMl localbMl = (bMl)this.daV.get(j);
      i += localbMl.O();
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
    paramStringBuilder.append(paramString).append("bags=");
    if (this.daV.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.daV.size()).append(" elements)...\n");
      for (int i = 0; i < this.daV.size(); i++) {
        bMl localbMl = (bMl)this.daV.get(i);
        localbMl.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}