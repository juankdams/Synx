import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cRf
  implements cxS
{
  public final ArrayList cFZ;

  public cRf()
  {
    this.cFZ = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.cFZ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cFZ.size());
    for (int i = 0; i < this.cFZ.size(); i++) {
      vs localvs = (vs)this.cFZ.get(i);
      boolean bool = localvs.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.cFZ.clear();
    this.cFZ.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      vs localvs = new vs();
      boolean bool = localvs.h(paramByteBuffer);
      if (!bool)
        return false;
      this.cFZ.add(localvs);
    }
    return true;
  }

  public void clear() {
    this.cFZ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      We localWe = new We(this, null);
      boolean bool = localWe.b(paramByteBuffer, paramInt);
      if (bool) {
        localWe.z();
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
    for (int j = 0; j < this.cFZ.size(); j++) {
      vs localvs = (vs)this.cFZ.get(j);
      i += localvs.O();
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
    paramStringBuilder.append(paramString).append("actions=");
    if (this.cFZ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cFZ.size()).append(" elements)...\n");
      for (int i = 0; i < this.cFZ.size(); i++) {
        vs localvs = (vs)this.cFZ.get(i);
        localvs.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}