import java.nio.ByteBuffer;
import java.util.ArrayList;

public class FU
  implements cxS
{
  public final ArrayList aZC;
  public dQK bNV;
  public final ArrayList bNW;

  public FU()
  {
    this.aZC = new ArrayList(0);
    this.bNV = null;
    this.bNW = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.aZC.size(); i++) {
      localObject = (aRR)this.aZC.get(i);
      bool = ((aRR)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.bNV != null) {
      paramByteBuffer.put((byte)1);
      j = this.bNV.g(paramByteBuffer);
      if (j == 0)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.bNW.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bNW.size());
    for (int j = 0; j < this.bNW.size(); j++) {
      localObject = (bKl)this.bNW.get(j);
      bool = ((bKl)localObject).g(paramByteBuffer);
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
      aRR localaRR = new aRR();
      m = localaRR.h(paramByteBuffer);
      if (m == 0)
        return false;
      this.aZC.add(localaRR);
    }
    j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.bNV = new dQK();
      boolean bool1 = this.bNV.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.bNV = null;
    }
    int k = paramByteBuffer.getShort() & 0xFFFF;
    this.bNW.clear();
    this.bNW.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      bKl localbKl = new bKl();
      boolean bool2 = localbKl.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.bNW.add(localbKl);
    }
    return true;
  }

  public void clear() {
    this.aZC.clear();
    this.bNV = null;
    this.bNW.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      aRh localaRh = new aRh(this, null);
      boolean bool = localaRh.b(paramByteBuffer, paramInt);
      if (bool) {
        localaRh.z();
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
    Object localObject;
    for (int j = 0; j < this.aZC.size(); j++) {
      localObject = (aRR)this.aZC.get(j);
      i += ((aRR)localObject).O();
    }
    i++;
    if (this.bNV != null) {
      i += this.bNV.O();
    }
    i += 2;
    for (j = 0; j < this.bNW.size(); j++) {
      localObject = (bKl)this.bNW.get(j);
      i += ((bKl)localObject).O();
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
    int i;
    Object localObject;
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (i = 0; i < this.aZC.size(); i++) {
        localObject = (aRR)this.aZC.get(i);
        ((aRR)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("contentsSelection=");
    if (this.bNV == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bNV.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("buyableContents=");
    if (this.bNW.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bNW.size()).append(" elements)...\n");
      for (i = 0; i < this.bNW.size(); i++) {
        localObject = (bKl)this.bNW.get(i);
        ((bKl)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}