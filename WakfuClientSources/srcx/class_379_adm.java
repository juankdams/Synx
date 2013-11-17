import java.nio.ByteBuffer;
import java.util.ArrayList;

public class adm
  implements cxS
{
  public byte type;
  public final ArrayList aZC;

  public adm()
  {
    this.type = 0;
    this.aZC = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.type);
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    for (int i = 0; i < this.aZC.size(); i++) {
      dBQ localdBQ = (dBQ)this.aZC.get(i);
      boolean bool = localdBQ.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.type = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dBQ localdBQ = new dBQ();
      boolean bool = localdBQ.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aZC.add(localdBQ);
    }
    return true;
  }

  public void clear() {
    this.type = 0;
    this.aZC.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    i += 2;
    for (int j = 0; j < this.aZC.size(); j++) {
      dBQ localdBQ = (dBQ)this.aZC.get(j);
      i += localdBQ.O();
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
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("contents=");
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (int i = 0; i < this.aZC.size(); i++) {
        dBQ localdBQ = (dBQ)this.aZC.get(i);
        localdBQ.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}