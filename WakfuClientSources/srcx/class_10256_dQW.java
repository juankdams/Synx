import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dQW
  implements cxS
{
  public final ArrayList aZC;

  public dQW()
  {
    this.aZC = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    for (int i = 0; i < this.aZC.size(); i++) {
      aTg localaTg = (aTg)this.aZC.get(i);
      boolean bool = localaTg.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  public void clear() {
    this.aZC.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      Qw localQw = new Qw(this, null);
      boolean bool = localQw.b(paramByteBuffer, paramInt);
      if (bool) {
        localQw.z();
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
    for (int j = 0; j < this.aZC.size(); j++) {
      aTg localaTg = (aTg)this.aZC.get(j);
      i += localaTg.O();
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
    paramStringBuilder.append(paramString).append("contents=");
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (int i = 0; i < this.aZC.size(); i++) {
        aTg localaTg = (aTg)this.aZC.get(i);
        localaTg.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}