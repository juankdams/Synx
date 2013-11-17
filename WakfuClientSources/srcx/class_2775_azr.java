import java.nio.ByteBuffer;
import java.util.ArrayList;

public class azr
  implements cxS
{
  public final ArrayList dQE;

  public azr()
  {
    this.dQE = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.dQE.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dQE.size());
    for (int i = 0; i < this.dQE.size(); i++) {
      cqY localcqY = (cqY)this.dQE.get(i);
      boolean bool = localcqY.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.h(paramByteBuffer);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  public void clear() {
    this.dQE.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      dwX localdwX = new dwX(this, null);
      boolean bool = localdwX.b(paramByteBuffer, paramInt);
      if (bool) {
        localdwX.z();
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
    for (int j = 0; j < this.dQE.size(); j++) {
      cqY localcqY = (cqY)this.dQE.get(j);
      i += localcqY.O();
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
    paramStringBuilder.append(paramString).append("compartments=");
    if (this.dQE.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dQE.size()).append(" elements)...\n");
      for (int i = 0; i < this.dQE.size(); i++) {
        cqY localcqY = (cqY)this.dQE.get(i);
        localcqY.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}