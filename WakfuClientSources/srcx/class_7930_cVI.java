import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cVI extends akv
  implements cxS
{
  public final ArrayList kIp;
  private final cCH aW;

  public cVI()
  {
    this.kIp = new ArrayList(0);

    this.aW = new aHz(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.kIp.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.kIp.size());
    for (int i = 0; i < this.kIp.size(); i++) {
      wq localwq = (wq)this.kIp.get(i);
      boolean bool = localwq.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.kIp.clear();
    this.kIp.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      wq localwq = new wq();
      boolean bool = localwq.h(paramByteBuffer);
      if (!bool)
        return false;
      this.kIp.add(localwq);
    }
    return true;
  }

  public void clear() {
    this.kIp.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.kIp.size(); j++) {
      wq localwq = (wq)this.kIp.get(j);
      i += localwq.O();
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
    paramStringBuilder.append(paramString).append("availableTitles=");
    if (this.kIp.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.kIp.size()).append(" elements)...\n");
      for (int i = 0; i < this.kIp.size(); i++) {
        wq localwq = (wq)this.kIp.get(i);
        localwq.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}