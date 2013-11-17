import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dEe extends akv
  implements cxS
{
  public final ArrayList lMQ;
  private final cCH aW;

  public dEe()
  {
    this.lMQ = new ArrayList(0);

    this.aW = new dS(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.lMQ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lMQ.size());
    for (int i = 0; i < this.lMQ.size(); i++) {
      cwp localcwp = (cwp)this.lMQ.get(i);
      boolean bool = localcwp.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.lMQ.clear();
    this.lMQ.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cwp localcwp = new cwp();
      boolean bool = localcwp.h(paramByteBuffer);
      if (!bool)
        return false;
      this.lMQ.add(localcwp);
    }
    return true;
  }

  public void clear() {
    this.lMQ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.lMQ.size(); j++) {
      cwp localcwp = (cwp)this.lMQ.get(j);
      i += localcwp.O();
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
    paramStringBuilder.append(paramString).append("shortcutInventories=");
    if (this.lMQ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lMQ.size()).append(" elements)...\n");
      for (int i = 0; i < this.lMQ.size(); i++) {
        cwp localcwp = (cwp)this.lMQ.get(i);
        localcwp.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}