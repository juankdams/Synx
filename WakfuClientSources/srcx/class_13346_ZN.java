import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ZN
  implements cxS
{
  public int cMk;
  public long aGh;
  public final dWa cMl;
  public final ArrayList cMm;

  public ZN()
  {
    this.cMk = 0;
    this.aGh = 0L;
    this.cMl = new dWa();
    this.cMm = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.cMk);
    paramByteBuffer.putLong(this.aGh);
    boolean bool1 = this.cMl.g(paramByteBuffer);
    if (!bool1)
      return false;
    if (this.cMm.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cMm.size());
    for (int i = 0; i < this.cMm.size(); i++) {
      ccv localccv = (ccv)this.cMm.get(i);
      boolean bool2 = localccv.g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cMk = paramByteBuffer.getInt();
    this.aGh = paramByteBuffer.getLong();
    boolean bool1 = this.cMl.h(paramByteBuffer);
    if (!bool1)
      return false;
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.cMm.clear();
    this.cMm.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      ccv localccv = new ccv();
      boolean bool2 = localccv.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.cMm.add(localccv);
    }
    return true;
  }

  public void clear() {
    this.cMk = 0;
    this.aGh = 0L;
    this.cMl.clear();
    this.cMm.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      dDg localdDg = new dDg(this, null);
      boolean bool = localdDg.b(paramByteBuffer, paramInt);
      if (bool) {
        localdDg.z();
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
    i += 8;
    i += this.cMl.O();
    i += 2;
    for (int j = 0; j < this.cMm.size(); j++) {
      ccv localccv = (ccv)this.cMm.get(j);
      i += localccv.O();
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
    paramStringBuilder.append(paramString).append("refCraftId=").append(this.cMk).append('\n');
    paramStringBuilder.append(paramString).append("xp=").append(this.aGh).append('\n');
    paramStringBuilder.append(paramString).append("craftCounter=...\n");
    this.cMl.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("rawLearnedRecipes=");
    if (this.cMm.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cMm.size()).append(" elements)...\n");
      for (int i = 0; i < this.cMm.size(); i++) {
        ccv localccv = (ccv)this.cMm.get(i);
        localccv.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}