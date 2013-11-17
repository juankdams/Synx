import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cZY
  implements cxS
{
  public final ArrayList kNP;
  public final ArrayList kNQ;

  public cZY()
  {
    this.kNP = new ArrayList(0);
    this.kNQ = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.kNP.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.kNP.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.kNP.size(); i++) {
      localObject = (cHt)this.kNP.get(i);
      bool = ((cHt)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.kNQ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.kNQ.size());
    for (i = 0; i < this.kNQ.size(); i++) {
      localObject = (cKE)this.kNQ.get(i);
      bool = ((cKE)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.kNP.clear();
    this.kNP.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cHt localcHt = new cHt();
      boolean bool1 = localcHt.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.kNP.add(localcHt);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.kNQ.clear();
    this.kNQ.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cKE localcKE = new cKE();
      boolean bool2 = localcKE.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.kNQ.add(localcKE);
    }
    return true;
  }

  public void clear() {
    this.kNP.clear();
    this.kNQ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.kNP.size(); j++) {
      localObject = (cHt)this.kNP.get(j);
      i += ((cHt)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.kNQ.size(); j++) {
      localObject = (cKE)this.kNQ.get(j);
      i += ((cKE)localObject).O();
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
    paramStringBuilder.append(paramString).append("protectedMonsters=");
    int i;
    Object localObject;
    if (this.kNP.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.kNP.size()).append(" elements)...\n");
      for (i = 0; i < this.kNP.size(); i++) {
        localObject = (cHt)this.kNP.get(i);
        ((cHt)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("protectedResources=");
    if (this.kNQ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.kNQ.size()).append(" elements)...\n");
      for (i = 0; i < this.kNQ.size(); i++) {
        localObject = (cKE)this.kNQ.get(i);
        ((cKE)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}