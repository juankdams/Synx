import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cBY extends akv
  implements cxS
{
  public final ArrayList fcy;
  private final cCH aW;

  public cBY()
  {
    this.fcy = new ArrayList(0);

    this.aW = new dVD(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.fcy.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.fcy.size());
    for (int i = 0; i < this.fcy.size(); i++) {
      nn localnn = (nn)this.fcy.get(i);
      boolean bool = localnn.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.fcy.clear();
    this.fcy.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      nn localnn = new nn();
      boolean bool = localnn.h(paramByteBuffer);
      if (!bool)
        return false;
      this.fcy.add(localnn);
    }
    return true;
  }

  public void clear() {
    this.fcy.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      aXy localaXy = new aXy(this, null);
      boolean bool = localaXy.b(paramByteBuffer, paramInt);
      if (bool) {
        localaXy.z();
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
    for (int j = 0; j < this.fcy.size(); j++) {
      nn localnn = (nn)this.fcy.get(j);
      i += localnn.O();
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
    paramStringBuilder.append(paramString).append("views=");
    if (this.fcy.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.fcy.size()).append(" elements)...\n");
      for (int i = 0; i < this.fcy.size(); i++) {
        nn localnn = (nn)this.fcy.get(i);
        localnn.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}