import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cXW extends akv
  implements cxS
{
  public final ArrayList kLl;
  private final cCH aW;

  public cXW()
  {
    this.kLl = new ArrayList(0);

    this.aW = new tv(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.kLl.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.kLl.size());
    for (int i = 0; i < this.kLl.size(); i++) {
      bWd localbWd = (bWd)this.kLl.get(i);
      boolean bool = localbWd.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.kLl.clear();
    this.kLl.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bWd localbWd = new bWd();
      boolean bool = localbWd.h(paramByteBuffer);
      if (!bool)
        return false;
      this.kLl.add(localbWd);
    }
    return true;
  }

  public void clear() {
    this.kLl.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.kLl.size(); j++) {
      bWd localbWd = (bWd)this.kLl.get(j);
      i += localbWd.O();
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
    paramStringBuilder.append(paramString).append("landMarks=");
    if (this.kLl.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.kLl.size()).append(" elements)...\n");
      for (int i = 0; i < this.kLl.size(); i++) {
        bWd localbWd = (bWd)this.kLl.get(i);
        localbWd.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}