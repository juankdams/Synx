import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bxl extends akv
  implements cxS
{
  public final ArrayList aHr;
  private final cCH aW;

  public bxl()
  {
    this.aHr = new ArrayList(0);

    this.aW = new aNT(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aHr.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aHr.size());
    for (int i = 0; i < this.aHr.size(); i++) {
      ZN localZN = (ZN)this.aHr.get(i);
      boolean bool = localZN.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aHr.clear();
    this.aHr.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      ZN localZN = new ZN();
      boolean bool = localZN.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aHr.add(localZN);
    }
    return true;
  }

  public void clear() {
    this.aHr.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      hM localhM = new hM(this, null);
      boolean bool = localhM.b(paramByteBuffer, paramInt);
      if (bool) {
        localhM.z();
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
    for (int j = 0; j < this.aHr.size(); j++) {
      ZN localZN = (ZN)this.aHr.get(j);
      i += localZN.O();
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
    paramStringBuilder.append(paramString).append("rawCrafts=");
    if (this.aHr.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aHr.size()).append(" elements)...\n");
      for (int i = 0; i < this.aHr.size(); i++) {
        ZN localZN = (ZN)this.aHr.get(i);
        localZN.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}