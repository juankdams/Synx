import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dya
  implements cxS
{
  public int id;
  public boolean enabled;
  public final ArrayList bED;
  public chB bEE;

  public dya()
  {
    this.id = -1;
    this.enabled = true;
    this.bED = new ArrayList(0);
    this.bEE = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.id);
    paramByteBuffer.put((byte)(this.enabled ? 1 : 0));
    if (this.bED.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bED.size());
    for (int i = 0; i < this.bED.size(); i++) {
      XI localXI = (XI)this.bED.get(i);
      boolean bool2 = localXI.g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.bEE != null) {
      paramByteBuffer.put((byte)1);
      boolean bool1 = this.bEE.g(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    this.enabled = (paramByteBuffer.get() == 1);
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool2 = localXI.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.bED.add(localXI);
    }
    j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.bEE = new chB();
      boolean bool1 = this.bEE.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.bEE = null;
    }
    return true;
  }

  public void clear() {
    this.id = -1;
    this.enabled = true;
    this.bED.clear();
    this.bEE = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      Cb localCb = new Cb(this, null);
      boolean bool = localCb.b(paramByteBuffer, paramInt);
      if (bool) {
        localCb.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 4;
    i++;
    i += 2;
    for (int j = 0; j < this.bED.size(); j++) {
      XI localXI = (XI)this.bED.get(j);
      i += localXI.O();
    }
    i++;
    if (this.bEE != null) {
      i += this.bEE.O();
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
    paramStringBuilder.append(paramString).append("id=").append(this.id).append('\n');
    paramStringBuilder.append(paramString).append("enabled=").append(this.enabled).append('\n');
    paramStringBuilder.append(paramString).append("items=");
    if (this.bED.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bED.size()).append(" elements)...\n");
      for (int i = 0; i < this.bED.size(); i++) {
        XI localXI = (XI)this.bED.get(i);
        localXI.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("building=");
    if (this.bEE == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bEE.a(paramStringBuilder, paramString + "  ");
    }
  }
}