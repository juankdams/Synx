import java.nio.ByteBuffer;
import java.util.ArrayList;

public class VK
  implements cxS
{
  public final ArrayList cAQ;
  public final ArrayList cAR;
  public dRm cAS;

  public VK()
  {
    this.cAQ = new ArrayList(0);
    this.cAR = new ArrayList(0);
    this.cAS = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.cAQ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cAQ.size());
    Object localObject;
    boolean bool2;
    for (int i = 0; i < this.cAQ.size(); i++) {
      localObject = (aft)this.cAQ.get(i);
      bool2 = ((aft)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.cAR.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cAR.size());
    for (i = 0; i < this.cAR.size(); i++) {
      localObject = (dAu)this.cAR.get(i);
      bool2 = ((dAu)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.cAS != null) {
      paramByteBuffer.put((byte)1);
      boolean bool1 = this.cAS.g(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.cAQ.clear();
    this.cAQ.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aft localaft = new aft();
      boolean bool1 = localaft.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.cAQ.add(localaft);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.cAR.clear();
    this.cAR.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      dAu localdAu = new dAu();
      boolean bool3 = localdAu.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.cAR.add(localdAu);
    }
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.cAS = new dRm();
      boolean bool2 = this.cAS.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.cAS = null;
    }
    return true;
  }

  public void clear() {
    this.cAQ.clear();
    this.cAR.clear();
    this.cAS = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.cAQ.size(); j++) {
      localObject = (aft)this.cAQ.get(j);
      i += ((aft)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.cAR.size(); j++) {
      localObject = (dAu)this.cAR.get(j);
      i += ((dAu)localObject).O();
    }
    i++;
    if (this.cAS != null) {
      i += this.cAS.O();
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
    paramStringBuilder.append(paramString).append("spentCash=");
    int i;
    Object localObject;
    if (this.cAQ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cAQ.size()).append(" elements)...\n");
      for (i = 0; i < this.cAQ.size(); i++) {
        localObject = (aft)this.cAQ.get(i);
        ((aft)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("accumulatedTaxes=");
    if (this.cAR.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cAR.size()).append(" elements)...\n");
      for (i = 0; i < this.cAR.size(); i++) {
        localObject = (dAu)this.cAR.get(i);
        ((dAu)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("totalCash=");
    if (this.cAS == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.cAS.a(paramStringBuilder, paramString + "  ");
    }
  }
}