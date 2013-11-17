import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bFi
  implements cxS
{
  public final ArrayList bED;

  public bFi()
  {
    this.bED = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.bED.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bED.size());
    for (int i = 0; i < this.bED.size(); i++) {
      cRT localcRT = (cRT)this.bED.get(i);
      boolean bool = localcRT.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cRT localcRT = new cRT();
      boolean bool = localcRT.h(paramByteBuffer);
      if (!bool)
        return false;
      this.bED.add(localcRT);
    }
    return true;
  }

  public void clear() {
    this.bED.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.bED.size(); j++) {
      cRT localcRT = (cRT)this.bED.get(j);
      i += localcRT.O();
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
    paramStringBuilder.append(paramString).append("items=");
    if (this.bED.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bED.size()).append(" elements)...\n");
      for (int i = 0; i < this.bED.size(); i++) {
        cRT localcRT = (cRT)this.bED.get(i);
        localcRT.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}