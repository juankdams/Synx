import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cZr
  implements cxS
{
  public final ArrayList kMW;

  public cZr()
  {
    this.kMW = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.kMW.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.kMW.size());
    for (int i = 0; i < this.kMW.size(); i++) {
      cpD localcpD = (cpD)this.kMW.get(i);
      boolean bool = localcpD.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.kMW.clear();
    this.kMW.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cpD localcpD = new cpD();
      boolean bool = localcpD.h(paramByteBuffer);
      if (!bool)
        return false;
      this.kMW.add(localcpD);
    }
    return true;
  }

  public void clear() {
    this.kMW.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.kMW.size(); j++) {
      cpD localcpD = (cpD)this.kMW.get(j);
      i += localcpD.O();
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
    paramStringBuilder.append(paramString).append("characteristics=");
    if (this.kMW.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.kMW.size()).append(" elements)...\n");
      for (int i = 0; i < this.kMW.size(); i++) {
        cpD localcpD = (cpD)this.kMW.get(i);
        localcpD.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}