import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aNv extends akv
  implements cxS
{
  public final ArrayList brr;
  private final cCH aW;

  public aNv()
  {
    this.brr = new ArrayList(0);

    this.aW = new eg(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.brr.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.brr.size());
    for (int i = 0; i < this.brr.size(); i++) {
      cKu localcKu = (cKu)this.brr.get(i);
      boolean bool = localcKu.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.brr.clear();
    this.brr.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cKu localcKu = new cKu();
      boolean bool = localcKu.h(paramByteBuffer);
      if (!bool)
        return false;
      this.brr.add(localcKu);
    }
    return true;
  }

  public void clear() {
    this.brr.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028001) {
      aPN localaPN = new aPN(this, null);
      boolean bool = localaPN.b(paramByteBuffer, paramInt);
      if (bool) {
        localaPN.z();
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
    for (int j = 0; j < this.brr.size(); j++) {
      cKu localcKu = (cKu)this.brr.get(j);
      i += localcKu.O();
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
        cKu localcKu = (cKu)this.brr.get(i);
        localcKu.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}