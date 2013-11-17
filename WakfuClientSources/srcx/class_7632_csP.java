import java.nio.ByteBuffer;
import java.util.ArrayList;

public class csP
  implements cxS
{
  public final ArrayList icD;

  public csP()
  {
    this.icD = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.icD.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.icD.size());
    for (int i = 0; i < this.icD.size(); i++) {
      Ut localUt = (Ut)this.icD.get(i);
      boolean bool = localUt.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.icD.clear();
    this.icD.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      Ut localUt = new Ut();
      boolean bool = localUt.h(paramByteBuffer);
      if (!bool)
        return false;
      this.icD.add(localUt);
    }
    return true;
  }

  public void clear() {
    this.icD.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.icD.size(); j++) {
      Ut localUt = (Ut)this.icD.get(j);
      i += localUt.O();
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
    paramStringBuilder.append(paramString).append("effects=");
    if (this.icD.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.icD.size()).append(" elements)...\n");
      for (int i = 0; i < this.icD.size(); i++) {
        Ut localUt = (Ut)this.icD.get(i);
        localUt.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}