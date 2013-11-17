import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bph
  implements cxS
{
  public int id;
  public final ArrayList bED;

  public bph()
  {
    this.id = 0;
    this.bED = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.id);
    if (this.bED.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bED.size());
    for (int i = 0; i < this.bED.size(); i++) {
      daq localdaq = (daq)this.bED.get(i);
      boolean bool = localdaq.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.h(paramByteBuffer);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  public void clear() {
    this.id = 0;
    this.bED.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      agM localagM = new agM(this, null);
      boolean bool = localagM.b(paramByteBuffer, paramInt);
      if (bool) {
        localagM.z();
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
    i += 2;
    for (int j = 0; j < this.bED.size(); j++) {
      daq localdaq = (daq)this.bED.get(j);
      i += localdaq.O();
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
    paramStringBuilder.append(paramString).append("items=");
    if (this.bED.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bED.size()).append(" elements)...\n");
      for (int i = 0; i < this.bED.size(); i++) {
        daq localdaq = (daq)this.bED.get(i);
        localdaq.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}