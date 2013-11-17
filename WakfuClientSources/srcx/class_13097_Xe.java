import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Xe
  implements cxS
{
  public long cxL;
  public final ArrayList aZC;

  public Xe()
  {
    this.cxL = 0L;
    this.aZC = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.cxL);
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    for (int i = 0; i < this.aZC.size(); i++) {
      bKX localbKX = (bKX)this.aZC.get(i);
      boolean bool = localbKX.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bKX localbKX = new bKX();
      boolean bool = localbKX.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aZC.add(localbKX);
    }
    return true;
  }

  public void clear() {
    this.cxL = 0L;
    this.aZC.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bzs localbzs = new bzs(this, null);
      boolean bool = localbzs.b(paramByteBuffer, paramInt);
      if (bool) {
        localbzs.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 8;
    i += 2;
    for (int j = 0; j < this.aZC.size(); j++) {
      bKX localbKX = (bKX)this.aZC.get(j);
      i += localbKX.O();
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
    paramStringBuilder.append(paramString).append("uid=").append(this.cxL).append('\n');
    paramStringBuilder.append(paramString).append("contents=");
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (int i = 0; i < this.aZC.size(); i++) {
        bKX localbKX = (bKX)this.aZC.get(i);
        localbKX.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}