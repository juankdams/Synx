import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cvs
  implements cxS
{
  public int igo;
  public final ArrayList igp;

  public cvs()
  {
    this.igo = 0;
    this.igp = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.igo);
    if (this.igp.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.igp.size());
    for (int i = 0; i < this.igp.size(); i++) {
      cwA localcwA = (cwA)this.igp.get(i);
      boolean bool = localcwA.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.igo = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.igp.clear();
    this.igp.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cwA localcwA = new cwA();
      boolean bool = localcwA.h(paramByteBuffer);
      if (!bool)
        return false;
      this.igp.add(localcwA);
    }
    return true;
  }

  public void clear() {
    this.igo = 0;
    this.igp.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 4;
    i += 2;
    for (int j = 0; j < this.igp.size(); j++) {
      cwA localcwA = (cwA)this.igp.get(j);
      i += localcwA.O();
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
    paramStringBuilder.append(paramString).append("cashAmount=").append(this.igo).append('\n');
    paramStringBuilder.append(paramString).append("contexts=");
    if (this.igp.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.igp.size()).append(" elements)...\n");
      for (int i = 0; i < this.igp.size(); i++) {
        cwA localcwA = (cwA)this.igp.get(i);
        localcwA.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}