import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bIq
  implements cxS
{
  public boolean biO;
  public final ArrayList biP;
  public final ArrayList biQ;

  public bIq()
  {
    this.biO = false;
    this.biP = new ArrayList(0);
    this.biQ = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.biO ? 1 : 0));
    if (this.biP.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.biP.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.biP.size(); i++) {
      localObject = (Kw)this.biP.get(i);
      bool = ((Kw)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.biQ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.biQ.size());
    for (i = 0; i < this.biQ.size(); i++) {
      localObject = (OC)this.biQ.get(i);
      bool = ((OC)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.biO = (paramByteBuffer.get() == 1);
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.biP.clear();
    this.biP.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      Kw localKw = new Kw();
      boolean bool1 = localKw.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.biP.add(localKw);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.biQ.clear();
    this.biQ.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      OC localOC = new OC();
      boolean bool2 = localOC.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.biQ.add(localOC);
    }
    return true;
  }

  public void clear() {
    this.biO = false;
    this.biP.clear();
    this.biQ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10014) {
      uN localuN = new uN(this, null);
      boolean bool = localuN.b(paramByteBuffer, paramInt);
      if (bool) {
        localuN.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.biP.size(); j++) {
      localObject = (Kw)this.biP.get(j);
      i += ((Kw)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.biQ.size(); j++) {
      localObject = (OC)this.biQ.get(j);
      i += ((OC)localObject).O();
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
    paramStringBuilder.append(paramString).append("dimensionalBagLocked=").append(this.biO).append('\n');
    paramStringBuilder.append(paramString).append("groupEntries=");
    int i;
    Object localObject;
    if (this.biP.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.biP.size()).append(" elements)...\n");
      for (i = 0; i < this.biP.size(); i++) {
        localObject = (Kw)this.biP.get(i);
        ((Kw)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("individualEntries=");
    if (this.biQ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.biQ.size()).append(" elements)...\n");
      for (i = 0; i < this.biQ.size(); i++) {
        localObject = (OC)this.biQ.get(i);
        ((OC)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}