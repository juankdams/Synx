import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dA
  implements cxS
{
  public cLm aq;
  public Wf ar;
  public final ArrayList as;

  public dA()
  {
    this.aq = null;
    this.ar = null;
    this.as = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aq != null) {
      paramByteBuffer.put((byte)1);
      i = this.aq.g(paramByteBuffer);
      if (i == 0)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.ar != null) {
      paramByteBuffer.put((byte)1);
      i = this.ar.g(paramByteBuffer);
      if (i == 0)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.as.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.as.size());
    for (int i = 0; i < this.as.size(); i++) {
      eU localeU = (eU)this.as.get(i);
      boolean bool = localeU.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aq = new cLm();
      bool1 = this.aq.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.aq = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.ar = new Wf();
      boolean bool2 = this.ar.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.ar = null;
    }
    int j = paramByteBuffer.getShort() & 0xFFFF;
    this.as.clear();
    this.as.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      eU localeU = new eU();
      boolean bool3 = localeU.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.as.add(localeU);
    }
    return true;
  }

  public void clear() {
    this.aq = null;
    this.ar = null;
    this.as.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      t localt = new t(this, null);
      boolean bool = localt.b(paramByteBuffer, paramInt);
      if (bool) {
        localt.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    if (this.aq != null) {
      i += this.aq.O();
    }
    i++;
    if (this.ar != null) {
      i += this.ar.O();
    }
    i += 2;
    for (int j = 0; j < this.as.size(); j++) {
      eU localeU = (eU)this.as.get(j);
      i += localeU.O();
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
    paramStringBuilder.append(paramString).append("currentScenarii=");
    if (this.aq == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aq.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("currentChallengeInfo=");
    if (this.ar == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.ar.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("pastScenarii=");
    if (this.as.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.as.size()).append(" elements)...\n");
      for (int i = 0; i < this.as.size(); i++) {
        eU localeU = (eU)this.as.get(i);
        localeU.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}