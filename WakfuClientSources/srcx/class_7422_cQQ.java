import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cQQ
  implements cxS
{
  public int aBM;
  public final ArrayList dLT;
  public final ArrayList dQi;
  public final ArrayList dQj;
  public final ArrayList dQk;
  public awg dQl;

  public cQQ()
  {
    this.aBM = 0;
    this.dLT = new ArrayList(0);
    this.dQi = new ArrayList(0);
    this.dQj = new ArrayList(0);
    this.dQk = new ArrayList(0);
    this.dQl = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aBM);
    if (this.dLT.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLT.size());
    Object localObject;
    boolean bool2;
    for (int i = 0; i < this.dLT.size(); i++) {
      localObject = (cIJ)this.dLT.get(i);
      bool2 = ((cIJ)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dQi.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dQi.size());
    for (i = 0; i < this.dQi.size(); i++) {
      localObject = (alM)this.dQi.get(i);
      bool2 = ((alM)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dQj.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dQj.size());
    for (i = 0; i < this.dQj.size(); i++) {
      localObject = (cbq)this.dQj.get(i);
      bool2 = ((cbq)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dQk.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dQk.size());
    for (i = 0; i < this.dQk.size(); i++) {
      localObject = (aTq)this.dQk.get(i);
      bool2 = ((aTq)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dQl != null) {
      paramByteBuffer.put((byte)1);
      boolean bool1 = this.dQl.g(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aBM = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dLT.clear();
    this.dLT.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cIJ localcIJ = new cIJ();
      boolean bool1 = localcIJ.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.dLT.add(localcIJ);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dQi.clear();
    this.dQi.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      alM localalM = new alM();
      boolean bool2 = localalM.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.dQi.add(localalM);
    }
    k = paramByteBuffer.getShort() & 0xFFFF;
    this.dQj.clear();
    this.dQj.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      cbq localcbq = new cbq();
      boolean bool3 = localcbq.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.dQj.add(localcbq);
    }
    m = paramByteBuffer.getShort() & 0xFFFF;
    this.dQk.clear();
    this.dQk.ensureCapacity(m);
    for (int n = 0; n < m; n++) {
      aTq localaTq = new aTq();
      boolean bool5 = localaTq.h(paramByteBuffer);
      if (!bool5)
        return false;
      this.dQk.add(localaTq);
    }
    n = paramByteBuffer.get() == 1 ? 1 : 0;
    if (n != 0) {
      this.dQl = new awg();
      boolean bool4 = this.dQl.h(paramByteBuffer);
      if (!bool4)
        return false;
    } else {
      this.dQl = null;
    }
    return true;
  }

  public void clear() {
    this.aBM = 0;
    this.dLT.clear();
    this.dQi.clear();
    this.dQj.clear();
    this.dQk.clear();
    this.dQl = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      azd localazd = new azd(this, null);
      boolean bool = localazd.b(paramByteBuffer, paramInt);
      if (bool) {
        localazd.z();
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
    Object localObject;
    for (int j = 0; j < this.dLT.size(); j++) {
      localObject = (cIJ)this.dLT.get(j);
      i += ((cIJ)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dQi.size(); j++) {
      localObject = (alM)this.dQi.get(j);
      i += ((alM)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dQj.size(); j++) {
      localObject = (cbq)this.dQj.get(j);
      i += ((cbq)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dQk.size(); j++) {
      localObject = (aTq)this.dQk.get(j);
      i += ((aTq)localObject).O();
    }
    i++;
    if (this.dQl != null) {
      i += this.dQl.O();
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
    paramStringBuilder.append(paramString).append("scenarioId=").append(this.aBM).append('\n');
    paramStringBuilder.append(paramString).append("globalVars=");
    int i;
    Object localObject;
    if (this.dLT.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLT.size()).append(" elements)...\n");
      for (i = 0; i < this.dLT.size(); i++) {
        localObject = (cIJ)this.dLT.get(i);
        ((cIJ)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("currentVarsForAddedUsers=");
    if (this.dQi.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dQi.size()).append(" elements)...\n");
      for (i = 0; i < this.dQi.size(); i++) {
        localObject = (alM)this.dQi.get(i);
        ((alM)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("activeActionGroups=");
    if (this.dQj.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dQj.size()).append(" elements)...\n");
      for (i = 0; i < this.dQj.size(); i++) {
        localObject = (cbq)this.dQj.get(i);
        ((cbq)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("executedActionGroups=");
    if (this.dQk.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dQk.size()).append(" elements)...\n");
      for (i = 0; i < this.dQk.size(); i++) {
        localObject = (aTq)this.dQk.get(i);
        ((aTq)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("startTime=");
    if (this.dQl == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.dQl.a(paramStringBuilder, paramString + "  ");
    }
  }
}