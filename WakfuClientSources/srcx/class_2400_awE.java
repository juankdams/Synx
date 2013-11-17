import java.nio.ByteBuffer;
import java.util.ArrayList;

public class awE
  implements cxS
{
  public int aBM;
  public final ArrayList dLR;
  public final ArrayList dLS;
  public final ArrayList dLT;
  public final ArrayList dLU;
  public dCF dLV;

  public awE()
  {
    this.aBM = 0;
    this.dLR = new ArrayList(0);
    this.dLS = new ArrayList(0);
    this.dLT = new ArrayList(0);
    this.dLU = new ArrayList(0);
    this.dLV = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aBM);
    if (this.dLR.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLR.size());
    Object localObject;
    boolean bool2;
    for (int i = 0; i < this.dLR.size(); i++) {
      localObject = (doZ)this.dLR.get(i);
      bool2 = ((doZ)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dLS.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLS.size());
    for (i = 0; i < this.dLS.size(); i++) {
      localObject = (cJO)this.dLS.get(i);
      bool2 = ((cJO)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dLT.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLT.size());
    for (i = 0; i < this.dLT.size(); i++) {
      localObject = (dfO)this.dLT.get(i);
      bool2 = ((dfO)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dLU.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dLU.size());
    for (i = 0; i < this.dLU.size(); i++) {
      localObject = (chH)this.dLU.get(i);
      bool2 = ((chH)localObject).g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.dLV != null) {
      paramByteBuffer.put((byte)1);
      boolean bool1 = this.dLV.g(paramByteBuffer);
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
    this.dLR.clear();
    this.dLR.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      doZ localdoZ = new doZ();
      boolean bool1 = localdoZ.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.dLR.add(localdoZ);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dLS.clear();
    this.dLS.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cJO localcJO = new cJO();
      boolean bool2 = localcJO.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.dLS.add(localcJO);
    }
    k = paramByteBuffer.getShort() & 0xFFFF;
    this.dLT.clear();
    this.dLT.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      dfO localdfO = new dfO();
      boolean bool3 = localdfO.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.dLT.add(localdfO);
    }
    m = paramByteBuffer.getShort() & 0xFFFF;
    this.dLU.clear();
    this.dLU.ensureCapacity(m);
    for (int n = 0; n < m; n++) {
      chH localchH = new chH();
      boolean bool5 = localchH.h(paramByteBuffer);
      if (!bool5)
        return false;
      this.dLU.add(localchH);
    }
    n = paramByteBuffer.get() == 1 ? 1 : 0;
    if (n != 0) {
      this.dLV = new dCF();
      boolean bool4 = this.dLV.h(paramByteBuffer);
      if (!bool4)
        return false;
    } else {
      this.dLV = null;
    }
    return true;
  }

  public void clear() {
    this.aBM = 0;
    this.dLR.clear();
    this.dLS.clear();
    this.dLT.clear();
    this.dLU.clear();
    this.dLV = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      bQl localbQl = new bQl(this, null);
      boolean bool = localbQl.b(paramByteBuffer, paramInt);
      if (bool) {
        localbQl.z();
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
    for (int j = 0; j < this.dLR.size(); j++) {
      localObject = (doZ)this.dLR.get(j);
      i += ((doZ)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dLS.size(); j++) {
      localObject = (cJO)this.dLS.get(j);
      i += ((cJO)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dLT.size(); j++) {
      localObject = (dfO)this.dLT.get(j);
      i += ((dfO)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dLU.size(); j++) {
      localObject = (chH)this.dLU.get(j);
      i += ((chH)localObject).O();
    }
    i++;
    if (this.dLV != null) {
      i += this.dLV.O();
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
    paramStringBuilder.append(paramString).append("activeGoals=");
    int i;
    Object localObject;
    if (this.dLR.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLR.size()).append(" elements)...\n");
      for (i = 0; i < this.dLR.size(); i++) {
        localObject = (doZ)this.dLR.get(i);
        ((doZ)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("executedGoals=");
    if (this.dLS.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLS.size()).append(" elements)...\n");
      for (i = 0; i < this.dLS.size(); i++) {
        localObject = (cJO)this.dLS.get(i);
        ((cJO)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("globalVars=");
    if (this.dLT.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLT.size()).append(" elements)...\n");
      for (i = 0; i < this.dLT.size(); i++) {
        localObject = (dfO)this.dLT.get(i);
        ((dfO)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("watchedVars=");
    if (this.dLU.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dLU.size()).append(" elements)...\n");
      for (i = 0; i < this.dLU.size(); i++) {
        localObject = (chH)this.dLU.get(i);
        ((chH)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("remainingTime=");
    if (this.dLV == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.dLV.a(paramStringBuilder, paramString + "  ");
    }
  }
}