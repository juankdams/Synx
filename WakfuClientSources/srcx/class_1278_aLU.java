import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aLU
  implements cxS
{
  public final ArrayList eqN;
  public final ArrayList eqO;

  public aLU()
  {
    this.eqN = new ArrayList(0);
    this.eqO = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.eqN.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.eqN.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.eqN.size(); i++) {
      localObject = (aAs)this.eqN.get(i);
      bool = ((aAs)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.eqO.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.eqO.size());
    for (i = 0; i < this.eqO.size(); i++) {
      localObject = (dfL)this.eqO.get(i);
      bool = ((dfL)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.eqN.clear();
    this.eqN.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aAs localaAs = new aAs();
      boolean bool1 = localaAs.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.eqN.add(localaAs);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.eqO.clear();
    this.eqO.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      dfL localdfL = new dfL();
      boolean bool2 = localdfL.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.eqO.add(localdfL);
    }
    return true;
  }

  public void clear() {
    this.eqN.clear();
    this.eqO.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    Object localObject;
    for (int j = 0; j < this.eqN.size(); j++) {
      localObject = (aAs)this.eqN.get(j);
      i += ((aAs)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.eqO.size(); j++) {
      localObject = (dfL)this.eqO.get(j);
      i += ((dfL)localObject).O();
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
    paramStringBuilder.append(paramString).append("alignments=");
    int i;
    Object localObject;
    if (this.eqN.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.eqN.size()).append(" elements)...\n");
      for (i = 0; i < this.eqN.size(); i++) {
        localObject = (aAs)this.eqN.get(i);
        ((aAs)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("alignmentRequests=");
    if (this.eqO.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.eqO.size()).append(" elements)...\n");
      for (i = 0; i < this.eqO.size(); i++) {
        localObject = (dfL)this.eqO.get(i);
        ((dfL)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}