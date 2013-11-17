import java.nio.ByteBuffer;
import java.util.ArrayList;

public class alM
  implements cxS
{
  public long bIa;
  public final ArrayList dmK;

  public alM()
  {
    this.bIa = 0L;
    this.dmK = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.bIa);
    if (this.dmK.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dmK.size());
    for (int i = 0; i < this.dmK.size(); i++) {
      dsJ localdsJ = (dsJ)this.dmK.get(i);
      boolean bool = localdsJ.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bIa = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dmK.clear();
    this.dmK.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dsJ localdsJ = new dsJ();
      boolean bool = localdsJ.h(paramByteBuffer);
      if (!bool)
        return false;
      this.dmK.add(localdsJ);
    }
    return true;
  }

  public void clear() {
    this.bIa = 0L;
    this.dmK.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 2;
    for (int j = 0; j < this.dmK.size(); j++) {
      dsJ localdsJ = (dsJ)this.dmK.get(j);
      i += localdsJ.O();
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
    paramStringBuilder.append(paramString).append("userId=").append(this.bIa).append('\n');
    paramStringBuilder.append(paramString).append("vars=");
    if (this.dmK.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dmK.size()).append(" elements)...\n");
      for (int i = 0; i < this.dmK.size(); i++) {
        dsJ localdsJ = (dsJ)this.dmK.get(i);
        localdsJ.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}