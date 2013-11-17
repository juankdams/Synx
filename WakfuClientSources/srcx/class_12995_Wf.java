import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Wf
  implements cxS
{
  public final ArrayList cGb;

  public Wf()
  {
    this.cGb = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.cGb.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cGb.size());
    for (int i = 0; i < this.cGb.size(); i++) {
      dkE localdkE = (dkE)this.cGb.get(i);
      boolean bool = localdkE.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.cGb.clear();
    this.cGb.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dkE localdkE = new dkE();
      boolean bool = localdkE.h(paramByteBuffer);
      if (!bool)
        return false;
      this.cGb.add(localdkE);
    }
    return true;
  }

  public void clear() {
    this.cGb.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dRk localdRk = new dRk(this, null);
      boolean bool = localdRk.b(paramByteBuffer, paramInt);
      if (bool) {
        localdRk.z();
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
    for (int j = 0; j < this.cGb.size(); j++) {
      dkE localdkE = (dkE)this.cGb.get(j);
      i += localdkE.O();
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
    paramStringBuilder.append(paramString).append("challenges=");
    if (this.cGb.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cGb.size()).append(" elements)...\n");
      for (int i = 0; i < this.cGb.size(); i++) {
        dkE localdkE = (dkE)this.cGb.get(i);
        localdkE.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}