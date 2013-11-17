import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aUd
  implements cxS
{
  public final ArrayList eUI;

  public aUd()
  {
    this.eUI = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.eUI.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.eUI.size());
    for (int i = 0; i < this.eUI.size(); i++) {
      cfL localcfL = (cfL)this.eUI.get(i);
      boolean bool = localcfL.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.eUI.clear();
    this.eUI.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cfL localcfL = new cfL();
      boolean bool = localcfL.h(paramByteBuffer);
      if (!bool)
        return false;
      this.eUI.add(localcfL);
    }
    return true;
  }

  public void clear() {
    this.eUI.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.eUI.size(); j++) {
      cfL localcfL = (cfL)this.eUI.get(j);
      i += localcfL.O();
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
    paramStringBuilder.append(paramString).append("governmentOpinions=");
    if (this.eUI.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.eUI.size()).append(" elements)...\n");
      for (int i = 0; i < this.eUI.size(); i++) {
        cfL localcfL = (cfL)this.eUI.get(i);
        localcfL.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}