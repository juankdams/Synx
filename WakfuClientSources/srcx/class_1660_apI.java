import java.nio.ByteBuffer;
import java.util.ArrayList;

public class apI
  implements cxS
{
  public short dvM;
  public final ArrayList dvN;
  public final ArrayList dvO;

  public apI()
  {
    this.dvM = 0;
    this.dvN = new ArrayList(0);
    this.dvO = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.dvM);
    if (this.dvN.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dvN.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.dvN.size(); i++) {
      localObject = (dkz)this.dvN.get(i);
      bool = ((dkz)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.dvO.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dvO.size());
    for (i = 0; i < this.dvO.size(); i++) {
      localObject = (Ow)this.dvO.get(i);
      bool = ((Ow)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dvM = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dvN.clear();
    this.dvN.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dkz localdkz = new dkz();
      boolean bool1 = localdkz.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.dvN.add(localdkz);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dvO.clear();
    this.dvO.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      Ow localOw = new Ow();
      boolean bool2 = localOw.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.dvO.add(localOw);
    }
    return true;
  }

  public void clear() {
    this.dvM = 0;
    this.dvN.clear();
    this.dvO.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.dvN.size(); j++) {
      localObject = (dkz)this.dvN.get(j);
      i += ((dkz)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dvO.size(); j++) {
      localObject = (Ow)this.dvO.get(j);
      i += ((Ow)localObject).O();
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
    paramStringBuilder.append(paramString).append("freePoints=").append(this.dvM).append('\n');
    paramStringBuilder.append(paramString).append("xpBonusPoints=");
    int i;
    Object localObject;
    if (this.dvN.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dvN.size()).append(" elements)...\n");
      for (i = 0; i < this.dvN.size(); i++) {
        localObject = (dkz)this.dvN.get(i);
        ((dkz)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("characteristicBonusPoints=");
    if (this.dvO.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dvO.size()).append(" elements)...\n");
      for (i = 0; i < this.dvO.size(); i++) {
        localObject = (Ow)this.dvO.get(i);
        ((Ow)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}