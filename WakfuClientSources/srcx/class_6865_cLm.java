import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cLm
  implements cxS
{
  public final ArrayList fbz;

  public cLm()
  {
    this.fbz = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.fbz.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.fbz.size());
    for (int i = 0; i < this.fbz.size(); i++) {
      dbF localdbF = (dbF)this.fbz.get(i);
      boolean bool = localdbF.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.fbz.clear();
    this.fbz.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dbF localdbF = new dbF();
      boolean bool = localdbF.h(paramByteBuffer);
      if (!bool)
        return false;
      this.fbz.add(localdbF);
    }
    return true;
  }

  public void clear() {
    this.fbz.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      aWo localaWo = new aWo(this, null);
      boolean bool = localaWo.b(paramByteBuffer, paramInt);
      if (bool) {
        localaWo.z();
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
    for (int j = 0; j < this.fbz.size(); j++) {
      dbF localdbF = (dbF)this.fbz.get(j);
      i += localdbF.O();
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
    paramStringBuilder.append(paramString).append("scenarii=");
    if (this.fbz.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.fbz.size()).append(" elements)...\n");
      for (int i = 0; i < this.fbz.size(); i++) {
        dbF localdbF = (dbF)this.fbz.get(i);
        localdbF.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}