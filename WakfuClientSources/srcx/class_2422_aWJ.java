import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aWJ
  implements cxS
{
  public final ArrayList fbM;

  public aWJ()
  {
    this.fbM = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.fbM.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.fbM.size());
    for (int i = 0; i < this.fbM.size(); i++) {
      azt localazt = (azt)this.fbM.get(i);
      boolean bool = localazt.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.fbM.clear();
    this.fbM.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      azt localazt = new azt();
      boolean bool = localazt.h(paramByteBuffer);
      if (!bool)
        return false;
      this.fbM.add(localazt);
    }
    return true;
  }

  public void clear() {
    this.fbM.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.fbM.size(); j++) {
      azt localazt = (azt)this.fbM.get(j);
      i += localazt.O();
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
    paramStringBuilder.append(paramString).append("bookRefIds=");
    if (this.fbM.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.fbM.size()).append(" elements)...\n");
      for (int i = 0; i < this.fbM.size(); i++) {
        azt localazt = (azt)this.fbM.get(i);
        localazt.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}