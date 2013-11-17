import java.nio.ByteBuffer;
import java.util.ArrayList;

public class baA
  implements cxS
{
  public final ArrayList bOu;

  public baA()
  {
    this.bOu = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.bOu.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bOu.size());
    for (int i = 0; i < this.bOu.size(); i++) {
      djL localdjL = (djL)this.bOu.get(i);
      boolean bool = localdjL.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bOu.clear();
    this.bOu.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      djL localdjL = new djL();
      boolean bool = localdjL.h(paramByteBuffer);
      if (!bool)
        return false;
      this.bOu.add(localdjL);
    }
    return true;
  }

  public void clear() {
    this.bOu.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      Gf localGf = new Gf(this, null);
      boolean bool = localGf.b(paramByteBuffer, paramInt);
      if (bool) {
        localGf.z();
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
    for (int j = 0; j < this.bOu.size(); j++) {
      djL localdjL = (djL)this.bOu.get(j);
      i += localdjL.O();
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
    paramStringBuilder.append(paramString).append("taxValues=");
    if (this.bOu.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bOu.size()).append(" elements)...\n");
      for (int i = 0; i < this.bOu.size(); i++) {
        djL localdjL = (djL)this.bOu.get(i);
        localdjL.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}