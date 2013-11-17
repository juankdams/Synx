import java.nio.ByteBuffer;
import java.util.ArrayList;

public class awo extends akv
  implements cxS
{
  public final ArrayList dLB;
  private final cCH aW;

  public awo()
  {
    this.dLB = new ArrayList(0);

    this.aW = new dFO(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.dLB.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLB.size());
    for (int i = 0; i < this.dLB.size(); i++) {
      aGM localaGM = (aGM)this.dLB.get(i);
      boolean bool = localaGM.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dLB.clear();
    this.dLB.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aGM localaGM = new aGM();
      boolean bool = localaGM.h(paramByteBuffer);
      if (!bool)
        return false;
      this.dLB.add(localaGM);
    }
    return true;
  }

  public void clear() {
    this.dLB.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.dLB.size(); j++) {
      aGM localaGM = (aGM)this.dLB.get(j);
      i += localaGM.O();
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
    paramStringBuilder.append(paramString).append("unavailableActions=");
    if (this.dLB.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLB.size()).append(" elements)...\n");
      for (int i = 0; i < this.dLB.size(); i++) {
        aGM localaGM = (aGM)this.dLB.get(i);
        localaGM.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}