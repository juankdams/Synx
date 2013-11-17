import java.nio.ByteBuffer;
import java.util.ArrayList;

public class If
  implements cxS
{
  public final ArrayList bQJ;

  public If()
  {
    this.bQJ = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.bQJ.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.bQJ.size());
    for (int i = 0; i < this.bQJ.size(); i++) {
      dDK localdDK = (dDK)this.bQJ.get(i);
      boolean bool = localdDK.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bQJ.clear();
    this.bQJ.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dDK localdDK = new dDK();
      boolean bool = localdDK.h(paramByteBuffer);
      if (!bool)
        return false;
      this.bQJ.add(localdDK);
    }
    return true;
  }

  public void clear() {
    this.bQJ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.bQJ.size(); j++) {
      dDK localdDK = (dDK)this.bQJ.get(j);
      i += localdDK.O();
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
    paramStringBuilder.append(paramString).append("buildings=");
    if (this.bQJ.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.bQJ.size()).append(" elements)...\n");
      for (int i = 0; i < this.bQJ.size(); i++) {
        dDK localdDK = (dDK)this.bQJ.get(i);
        localdDK.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}