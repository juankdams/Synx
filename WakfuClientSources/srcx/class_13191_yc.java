import java.nio.ByteBuffer;
import java.util.ArrayList;

public class yc extends akv
  implements cxS
{
  public final ArrayList brr;
  private final cCH aW;

  public yc()
  {
    this.brr = new ArrayList(0);

    this.aW = new bml(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.brr.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.brr.size());
    for (int i = 0; i < this.brr.size(); i++) {
      dNb localdNb = (dNb)this.brr.get(i);
      boolean bool = localdNb.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.brr.clear();
    this.brr.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dNb localdNb = new dNb();
      boolean bool = localdNb.h(paramByteBuffer);
      if (!bool)
        return false;
      this.brr.add(localdNb);
    }
    return true;
  }

  public void clear() {
    this.brr.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    for (int j = 0; j < this.brr.size(); j++) {
      dNb localdNb = (dNb)this.brr.get(j);
      i += localdNb.O();
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
    paramStringBuilder.append(paramString).append("content=");
    if (this.brr.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.brr.size()).append(" elements)...\n");
      for (int i = 0; i < this.brr.size(); i++) {
        dNb localdNb = (dNb)this.brr.get(i);
        localdNb.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}