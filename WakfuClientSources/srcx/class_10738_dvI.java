import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dvI
  implements cxS
{
  public final ArrayList lAW;

  public dvI()
  {
    this.lAW = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.lAW.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lAW.size());
    for (int i = 0; i < this.lAW.size(); i++) {
      auF localauF = (auF)this.lAW.get(i);
      boolean bool = localauF.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.lAW.clear();
    this.lAW.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      auF localauF = new auF();
      boolean bool = localauF.h(paramByteBuffer);
      if (!bool)
        return false;
      this.lAW.add(localauF);
    }
    return true;
  }

  public void clear() {
    this.lAW.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.lAW.size(); j++) {
      auF localauF = (auF)this.lAW.get(j);
      i += localauF.O();
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
    paramStringBuilder.append(paramString).append("modifiers=");
    if (this.lAW.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lAW.size()).append(" elements)...\n");
      for (int i = 0; i < this.lAW.size(); i++) {
        auF localauF = (auF)this.lAW.get(i);
        localauF.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}