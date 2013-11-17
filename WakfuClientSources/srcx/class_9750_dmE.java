import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dmE extends akv
  implements cxS
{
  public int lkv;
  public int lkw;
  public short lkx;
  public short lky;
  public short lkz;
  public final ArrayList lkA;
  public final ArrayList lkB;
  public final ArrayList lkC;
  public final ArrayList lkD;
  public final ArrayList lkE;
  public final ArrayList lkF;
  private final cCH aW;

  public dmE()
  {
    this.lkv = 0;
    this.lkw = 0;
    this.lkx = 0;
    this.lky = 0;
    this.lkz = 0;
    this.lkA = new ArrayList(0);
    this.lkB = new ArrayList(0);
    this.lkC = new ArrayList(0);
    this.lkD = new ArrayList(0);
    this.lkE = new ArrayList(0);
    this.lkF = new ArrayList(0);

    this.aW = new cFv(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.lkv);
    paramByteBuffer.putInt(this.lkw);
    paramByteBuffer.putShort(this.lkx);
    paramByteBuffer.putShort(this.lky);
    paramByteBuffer.putShort(this.lkz);
    if (this.lkA.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkA.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.lkA.size(); i++) {
      localObject = (aiC)this.lkA.get(i);
      bool = ((aiC)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.lkB.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkB.size());
    for (i = 0; i < this.lkB.size(); i++) {
      localObject = (Bx)this.lkB.get(i);
      bool = ((Bx)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.lkC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkC.size());
    for (i = 0; i < this.lkC.size(); i++) {
      localObject = (aAj)this.lkC.get(i);
      bool = ((aAj)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.lkD.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkD.size());
    for (i = 0; i < this.lkD.size(); i++) {
      localObject = (cWp)this.lkD.get(i);
      bool = ((cWp)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.lkE.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkE.size());
    for (i = 0; i < this.lkE.size(); i++) {
      localObject = (aKC)this.lkE.get(i);
      bool = ((aKC)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.lkF.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lkF.size());
    for (i = 0; i < this.lkF.size(); i++) {
      localObject = (bGp)this.lkF.get(i);
      bool = ((bGp)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.lkv = paramByteBuffer.getInt();
    this.lkw = paramByteBuffer.getInt();
    this.lkx = paramByteBuffer.getShort();
    this.lky = paramByteBuffer.getShort();
    this.lkz = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.lkA.clear();
    this.lkA.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aiC localaiC = new aiC();
      boolean bool1 = localaiC.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.lkA.add(localaiC);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.lkB.clear();
    this.lkB.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      Bx localBx = new Bx();
      boolean bool2 = localBx.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.lkB.add(localBx);
    }
    k = paramByteBuffer.getShort() & 0xFFFF;
    this.lkC.clear();
    this.lkC.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      aAj localaAj = new aAj();
      boolean bool3 = localaAj.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.lkC.add(localaAj);
    }
    m = paramByteBuffer.getShort() & 0xFFFF;
    this.lkD.clear();
    this.lkD.ensureCapacity(m);
    for (int n = 0; n < m; n++) {
      cWp localcWp = new cWp();
      boolean bool4 = localcWp.h(paramByteBuffer);
      if (!bool4)
        return false;
      this.lkD.add(localcWp);
    }
    n = paramByteBuffer.getShort() & 0xFFFF;
    this.lkE.clear();
    this.lkE.ensureCapacity(n);
    for (int i1 = 0; i1 < n; i1++) {
      aKC localaKC = new aKC();
      boolean bool5 = localaKC.h(paramByteBuffer);
      if (!bool5)
        return false;
      this.lkE.add(localaKC);
    }
    i1 = paramByteBuffer.getShort() & 0xFFFF;
    this.lkF.clear();
    this.lkF.ensureCapacity(i1);
    for (int i2 = 0; i2 < i1; i2++) {
      bGp localbGp = new bGp();
      boolean bool6 = localbGp.h(paramByteBuffer);
      if (!bool6)
        return false;
      this.lkF.add(localbGp);
    }
    return true;
  }

  public void clear() {
    this.lkv = 0;
    this.lkw = 0;
    this.lkx = 0;
    this.lky = 0;
    this.lkz = 0;
    this.lkA.clear();
    this.lkB.clear();
    this.lkC.clear();
    this.lkD.clear();
    this.lkE.clear();
    this.lkF.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 4;
    i += 4;
    i += 2;
    i += 2;
    i += 2;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.lkA.size(); j++) {
      localObject = (aiC)this.lkA.get(j);
      i += ((aiC)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.lkB.size(); j++) {
      localObject = (Bx)this.lkB.get(j);
      i += ((Bx)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.lkC.size(); j++) {
      localObject = (aAj)this.lkC.get(j);
      i += ((aAj)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.lkD.size(); j++) {
      localObject = (cWp)this.lkD.get(j);
      i += ((cWp)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.lkE.size(); j++) {
      localObject = (aKC)this.lkE.get(j);
      i += ((aKC)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.lkF.size(); j++) {
      localObject = (bGp)this.lkF.get(j);
      i += ((bGp)localObject).O();
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
    paramStringBuilder.append(paramString).append("earnedKamas=").append(this.lkv).append('\n');
    paramStringBuilder.append(paramString).append("lostKamas=").append(this.lkw).append('\n');
    paramStringBuilder.append(paramString).append("achievementCounter=").append(this.lkx).append('\n');
    paramStringBuilder.append(paramString).append("fightCounter=").append(this.lky).append('\n');
    paramStringBuilder.append(paramString).append("deathCounter=").append(this.lkz).append('\n');
    paramStringBuilder.append(paramString).append("killCounters=");
    int i;
    Object localObject;
    if (this.lkA.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkA.size()).append(" elements)...\n");
      for (i = 0; i < this.lkA.size(); i++) {
        localObject = (aiC)this.lkA.get(i);
        ((aiC)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("collectCounters=");
    if (this.lkB.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkB.size()).append(" elements)...\n");
      for (i = 0; i < this.lkB.size(); i++) {
        localObject = (Bx)this.lkB.get(i);
        ((Bx)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("plantCounters=");
    if (this.lkC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkC.size()).append(" elements)...\n");
      for (i = 0; i < this.lkC.size(); i++) {
        localObject = (aAj)this.lkC.get(i);
        ((aAj)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("craftCounters=");
    if (this.lkD.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkD.size()).append(" elements)...\n");
      for (i = 0; i < this.lkD.size(); i++) {
        localObject = (cWp)this.lkD.get(i);
        ((cWp)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("dropCounters=");
    if (this.lkE.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkE.size()).append(" elements)...\n");
      for (i = 0; i < this.lkE.size(); i++) {
        localObject = (aKC)this.lkE.get(i);
        ((aKC)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("marketBuyCount=");
    if (this.lkF.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lkF.size()).append(" elements)...\n");
      for (i = 0; i < this.lkF.size(); i++) {
        localObject = (bGp)this.lkF.get(i);
        ((bGp)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}