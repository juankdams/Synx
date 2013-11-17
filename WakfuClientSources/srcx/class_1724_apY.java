import java.nio.ByteBuffer;
import java.util.ArrayList;

public class apY
  implements cxS
{
  public final ArrayList bQH;

  public apY()
  {
    this.bQH = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.bQH.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bQH.size());
    for (int i = 0; i < this.bQH.size(); i++) {
      auQ localauQ = (auQ)this.bQH.get(i);
      boolean bool = localauQ.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bQH.clear();
    this.bQH.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      auQ localauQ = new auQ();
      boolean bool = localauQ.h(paramByteBuffer);
      if (!bool)
        return false;
      this.bQH.add(localauQ);
    }
    return true;
  }

  public void clear() {
    this.bQH.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028001) {
      Ie localIe = new Ie(this, null);
      boolean bool = localIe.b(paramByteBuffer, paramInt);
      if (bool) {
        localIe.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.bQH.size(); j++) {
      auQ localauQ = (auQ)this.bQH.get(j);
      i += localauQ.O();
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
    paramStringBuilder.append(paramString).append("locks=");
    if (this.bQH.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bQH.size()).append(" elements)...\n");
      for (int i = 0; i < this.bQH.size(); i++) {
        auQ localauQ = (auQ)this.bQH.get(i);
        localauQ.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}