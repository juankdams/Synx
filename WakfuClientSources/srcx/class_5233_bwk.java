import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bwk
  implements cxS
{
  public long ggL;
  public final ArrayList ggM;

  public bwk()
  {
    this.ggL = 0L;
    this.ggM = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.ggL);
    if (this.ggM.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.ggM.size());
    for (int i = 0; i < this.ggM.size(); i++) {
      gr localgr = (gr)this.ggM.get(i);
      boolean bool = localgr.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ggL = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.ggM.clear();
    this.ggM.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      gr localgr = new gr();
      boolean bool = localgr.h(paramByteBuffer);
      if (!bool)
        return false;
      this.ggM.add(localgr);
    }
    return true;
  }

  public void clear() {
    this.ggL = 0L;
    this.ggM.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 2;
    for (int j = 0; j < this.ggM.size(); j++) {
      gr localgr = (gr)this.ggM.get(j);
      i += localgr.O();
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
    paramStringBuilder.append(paramString).append("lastUpdateTime=").append(this.ggL).append('\n');
    paramStringBuilder.append(paramString).append("resources=");
    if (this.ggM.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.ggM.size()).append(" elements)...\n");
      for (int i = 0; i < this.ggM.size(); i++) {
        gr localgr = (gr)this.ggM.get(i);
        localgr.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}