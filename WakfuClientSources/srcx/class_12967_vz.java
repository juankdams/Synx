import java.nio.ByteBuffer;
import java.util.ArrayList;

public class vz extends akv
  implements cxS
{
  public final ArrayList bjP;
  public final ArrayList bjQ;
  public final ArrayList bjR;
  public final ArrayList bjS;
  public final ArrayList bjT;
  public int bjU;
  private final cCH aW;

  public vz()
  {
    this.bjP = new ArrayList(0);
    this.bjQ = new ArrayList(0);
    this.bjR = new ArrayList(0);
    this.bjS = new ArrayList(0);
    this.bjT = new ArrayList(0);
    this.bjU = -1;

    this.aW = new Kv(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.bjP.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bjP.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.bjP.size(); i++) {
      localObject = (bnO)this.bjP.get(i);
      bool = ((bnO)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.bjQ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bjQ.size());
    for (i = 0; i < this.bjQ.size(); i++) {
      localObject = (cZq)this.bjQ.get(i);
      bool = ((cZq)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.bjR.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bjR.size());
    for (i = 0; i < this.bjR.size(); i++) {
      localObject = (ciS)this.bjR.get(i);
      bool = ((ciS)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.bjS.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bjS.size());
    for (i = 0; i < this.bjS.size(); i++) {
      localObject = (aAE)this.bjS.get(i);
      bool = ((aAE)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.bjT.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bjT.size());
    for (i = 0; i < this.bjT.size(); i++) {
      localObject = (cMk)this.bjT.get(i);
      bool = ((cMk)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    paramByteBuffer.putInt(this.bjU);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bjP.clear();
    this.bjP.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bnO localbnO = new bnO();
      boolean bool1 = localbnO.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.bjP.add(localbnO);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.bjQ.clear();
    this.bjQ.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cZq localcZq = new cZq();
      boolean bool2 = localcZq.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.bjQ.add(localcZq);
    }
    k = paramByteBuffer.getShort() & 0xFFFF;
    this.bjR.clear();
    this.bjR.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ciS localciS = new ciS();
      boolean bool3 = localciS.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.bjR.add(localciS);
    }
    m = paramByteBuffer.getShort() & 0xFFFF;
    this.bjS.clear();
    this.bjS.ensureCapacity(m);
    for (int n = 0; n < m; n++) {
      aAE localaAE = new aAE();
      boolean bool4 = localaAE.h(paramByteBuffer);
      if (!bool4)
        return false;
      this.bjS.add(localaAE);
    }
    n = paramByteBuffer.getShort() & 0xFFFF;
    this.bjT.clear();
    this.bjT.ensureCapacity(n);
    for (int i1 = 0; i1 < n; i1++) {
      cMk localcMk = new cMk();
      boolean bool5 = localcMk.h(paramByteBuffer);
      if (!bool5)
        return false;
      this.bjT.add(localcMk);
    }
    this.bjU = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.bjP.clear();
    this.bjQ.clear();
    this.bjR.clear();
    this.bjS.clear();
    this.bjT.clear();
    this.bjU = -1;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.bjP.size(); j++) {
      localObject = (bnO)this.bjP.get(j);
      i += ((bnO)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.bjQ.size(); j++) {
      localObject = (cZq)this.bjQ.get(j);
      i += ((cZq)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.bjR.size(); j++) {
      localObject = (ciS)this.bjR.get(j);
      i += ((ciS)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.bjS.size(); j++) {
      localObject = (aAE)this.bjS.get(j);
      i += ((aAE)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.bjT.size(); j++) {
      localObject = (cMk)this.bjT.get(j);
      i += ((cMk)localObject).O();
    }
    i += 4;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("zaaps=");
    int i;
    Object localObject;
    if (this.bjP.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bjP.size()).append(" elements)...\n");
      for (i = 0; i < this.bjP.size(); i++) {
        localObject = (bnO)this.bjP.get(i);
        ((bnO)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("dragos=");
    if (this.bjQ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bjQ.size()).append(" elements)...\n");
      for (i = 0; i < this.bjQ.size(); i++) {
        localObject = (cZq)this.bjQ.get(i);
        ((cZq)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("boats=");
    if (this.bjR.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bjR.size()).append(" elements)...\n");
      for (i = 0; i < this.bjR.size(); i++) {
        localObject = (ciS)this.bjR.get(i);
        ((ciS)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("cannon=");
    if (this.bjS.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bjS.size()).append(" elements)...\n");
      for (i = 0; i < this.bjS.size(); i++) {
        localObject = (aAE)this.bjS.get(i);
        ((aAE)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("phoenix=");
    if (this.bjT.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bjT.size()).append(" elements)...\n");
      for (i = 0; i < this.bjT.size(); i++) {
        localObject = (cMk)this.bjT.get(i);
        ((cMk)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("selectedPhoenix=").append(this.bjU).append('\n');
  }
}