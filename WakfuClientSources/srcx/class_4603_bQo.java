import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bQo
  implements cxS
{
  public final ArrayList gYv;

  public bQo()
  {
    this.gYv = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.gYv.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.gYv.size());
    for (int i = 0; i < this.gYv.size(); i++) {
      TG localTG = (TG)this.gYv.get(i);
      boolean bool = localTG.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gYv.clear();
    this.gYv.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      TG localTG = new TG();
      boolean bool = localTG.h(paramByteBuffer);
      if (!bool)
        return false;
      this.gYv.add(localTG);
    }
    return true;
  }

  public void clear() {
    this.gYv.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.gYv.size(); j++) {
      TG localTG = (TG)this.gYv.get(j);
      i += localTG.O();
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
    paramStringBuilder.append(paramString).append("gems=");
    if (this.gYv.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gYv.size()).append(" elements)...\n");
      for (int i = 0; i < this.gYv.size(); i++) {
        TG localTG = (TG)this.gYv.get(i);
        localTG.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}