import java.nio.ByteBuffer;
import java.util.ArrayList;

public class fV
  implements cxS
{
  public final ArrayList aDq;

  public fV()
  {
    this.aDq = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aDq.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aDq.size());
    for (int i = 0; i < this.aDq.size(); i++) {
      boe localboe = (boe)this.aDq.get(i);
      boolean bool = localboe.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aDq.clear();
    this.aDq.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      boe localboe = new boe();
      boolean bool = localboe.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aDq.add(localboe);
    }
    return true;
  }

  public void clear() {
    this.aDq.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.aDq.size(); j++) {
      boe localboe = (boe)this.aDq.get(j);
      i += localboe.O();
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
    paramStringBuilder.append(paramString).append("properties=");
    if (this.aDq.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aDq.size()).append(" elements)...\n");
      for (int i = 0; i < this.aDq.size(); i++) {
        boe localboe = (boe)this.aDq.get(i);
        localboe.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}