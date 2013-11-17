import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bxb
  implements cxS
{
  public final ArrayList ghz;
  public byte ghA;

  public bxb()
  {
    this.ghz = new ArrayList(0);
    this.ghA = 0;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.ghz.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.ghz.size());
    for (int i = 0; i < this.ghz.size(); i++) {
      bql localbql = (bql)this.ghz.get(i);
      boolean bool = localbql.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    paramByteBuffer.put(this.ghA);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ghz.clear();
    this.ghz.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bql localbql = new bql();
      boolean bool = localbql.h(paramByteBuffer);
      if (!bool)
        return false;
      this.ghz.add(localbql);
    }
    this.ghA = paramByteBuffer.get();
    return true;
  }

  public void clear() {
    this.ghz.clear();
    this.ghA = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      dqT localdqT = new dqT(this, null);
      boolean bool = localdqT.b(paramByteBuffer, paramInt);
      if (bool) {
        localdqT.z();
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
    for (int j = 0; j < this.ghz.size(); j++) {
      bql localbql = (bql)this.ghz.get(j);
      i += localbql.O();
    }
    i++;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("capturedCreatures=");
    if (this.ghz.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.ghz.size()).append(" elements)...\n");
      for (int i = 0; i < this.ghz.size(); i++) {
        bql localbql = (bql)this.ghz.get(i);
        localbql.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("currentCreatureIndex=").append(this.ghA).append('\n');
  }
}