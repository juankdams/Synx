import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dpb extends akv
  implements cxS
{
  public long lpG;
  public final ArrayList lpH;
  private final cCH aW;

  public dpb()
  {
    this.lpG = 0L;
    this.lpH = new ArrayList(0);

    this.aW = new xo(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.lpG);
    if (this.lpH.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lpH.size());
    for (int i = 0; i < this.lpH.size(); i++) {
      Mh localMh = (Mh)this.lpH.get(i);
      boolean bool = localMh.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.lpG = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.lpH.clear();
    this.lpH.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      Mh localMh = new Mh();
      boolean bool = localMh.h(paramByteBuffer);
      if (!bool)
        return false;
      this.lpH.add(localMh);
    }
    return true;
  }

  public void clear() {
    this.lpG = 0L;
    this.lpH.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 2;
    for (int j = 0; j < this.lpH.size(); j++) {
      Mh localMh = (Mh)this.lpH.get(j);
      i += localMh.O();
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
    paramStringBuilder.append(paramString).append("groupId=").append(this.lpG).append('\n');
    paramStringBuilder.append(paramString).append("members=");
    if (this.lpH.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lpH.size()).append(" elements)...\n");
      for (int i = 0; i < this.lpH.size(); i++) {
        Mh localMh = (Mh)this.lpH.get(i);
        localMh.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}