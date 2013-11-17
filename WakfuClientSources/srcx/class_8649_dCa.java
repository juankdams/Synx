import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dCa
  implements cxS
{
  public byte gdr;
  public final ArrayList gds;
  public uc gdt;

  public dCa()
  {
    this.gdr = 0;
    this.gds = new ArrayList(0);
    this.gdt = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.gdr);
    if (this.gds.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.gds.size());
    for (int i = 0; i < this.gds.size(); i++) {
      cku localcku = (cku)this.gds.get(i);
      boolean bool2 = localcku.g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    if (this.gdt == null)
      return false;
    paramByteBuffer.put(this.gdt.N());
    boolean bool1 = this.gdt.g(paramByteBuffer);
    if (!bool1)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.h(paramByteBuffer);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.z(paramByteBuffer);
    if (this.gdt == null)
      return false;
    return true;
  }

  public void clear() {
    this.gdr = 0;
    this.gds.clear();
    this.gdt = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bub localbub = new bub(this, null);
      boolean bool = localbub.b(paramByteBuffer, paramInt);
      if (bool) {
        localbub.z();
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
    for (int j = 0; j < this.gds.size(); j++) {
      cku localcku = (cku)this.gds.get(j);
      i += localcku.O();
    }
    i++;
    i += this.gdt.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("layoutPosition=").append(this.gdr).append('\n');
    paramStringBuilder.append(paramString).append("interactiveElements=");
    if (this.gds.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gds.size()).append(" elements)...\n");
      for (int i = 0; i < this.gds.size(); i++) {
        cku localcku = (cku)this.gds.get(i);
        localcku.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("roomSpecificData=<");
    if (this.gdt == null) {
      paramStringBuilder.append(">\n");
    } else {
      paramStringBuilder.append(this.gdt.getClass().getSimpleName()).append(">...\n");
      this.gdt.a(paramStringBuilder, paramString + "  ");
    }
  }
}