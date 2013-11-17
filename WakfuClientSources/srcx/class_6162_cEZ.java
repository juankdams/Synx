import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cEZ
  implements cxS
{
  public final ArrayList aZC;
  public final ArrayList iza;

  public cEZ()
  {
    this.aZC = new ArrayList(0);
    this.iza = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.aZC.size(); i++) {
      localObject = (bcl)this.aZC.get(i);
      bool = ((bcl)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.iza.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.iza.size());
    for (i = 0; i < this.iza.size(); i++) {
      localObject = (bFs)this.iza.get(i);
      bool = ((bFs)localObject).g(paramByteBuffer);
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
      bcl localbcl = new bcl();
      boolean bool1 = localbcl.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.aZC.add(localbcl);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.iza.clear();
    this.iza.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      bFs localbFs = new bFs();
      boolean bool2 = localbFs.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.iza.add(localbFs);
    }
    return true;
  }

  public void clear() {
    this.aZC.clear();
    this.iza.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10004) {
      dFG localdFG = new dFG(this, null);
      boolean bool = localdFG.b(paramByteBuffer, paramInt);
      if (bool) {
        localdFG.z();
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
      localObject = (bcl)this.aZC.get(j);
      i += ((bcl)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.iza.size(); j++) {
      localObject = (bFs)this.iza.get(j);
      i += ((bFs)localObject).O();
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
        localObject = (bcl)this.aZC.get(i);
        ((bcl)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("availablePointsArray=");
    if (this.iza.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.iza.size()).append(" elements)...\n");
      for (i = 0; i < this.iza.size(); i++) {
        localObject = (bFs)this.iza.get(i);
        ((bFs)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}