import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cMH
  implements cxS
{
  public final ArrayList ayw;
  public int bYg;
  public int ayx;
  public final dnk bYh;
  public final bIq ayz;
  public final bwk bYi;
  public final bba bYj;

  public cMH()
  {
    this.ayw = new ArrayList(0);
    this.bYg = 0;
    this.ayx = 0;
    this.bYh = new dnk();
    this.ayz = new bIq();
    this.bYi = new bwk();
    this.bYj = new bba();
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.ayw.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.ayw.size());
    for (int i = 0; i < this.ayw.size(); i++) {
      sD localsD = (sD)this.ayw.get(i);
      bool3 = localsD.g(paramByteBuffer);
      if (!bool3)
        return false;
    }
    paramByteBuffer.putInt(this.bYg);
    paramByteBuffer.putInt(this.ayx);
    boolean bool1 = this.bYh.g(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.g(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.g(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.g(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.h(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.h(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.h(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.h(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public void clear() {
    this.ayw.clear();
    this.bYg = 0;
    this.ayx = 0;
    this.bYh.clear();
    this.ayz.clear();
    this.bYi.clear();
    this.bYj.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      Lx localLx = new Lx(this, null);
      boolean bool = localLx.b(paramByteBuffer, paramInt);
      if (bool) {
        localLx.z();
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
    for (int j = 0; j < this.ayw.size(); j++) {
      sD localsD = (sD)this.ayw.get(j);
      i += localsD.O();
    }
    i += 4;
    i += 4;
    i += this.bYh.O();
    i += this.ayz.O();
    i += this.bYi.O();
    i += this.bYj.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("rooms=");
    if (this.ayw.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.ayw.size()).append(" elements)...\n");
      for (int i = 0; i < this.ayw.size(); i++) {
        sD localsD = (sD)this.ayw.get(i);
        localsD.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("cash=").append(this.bYg).append('\n');
    paramStringBuilder.append(paramString).append("customViewModelId=").append(this.ayx).append('\n');
    paramStringBuilder.append(paramString).append("transactionLog=...\n");
    this.bYh.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("permissions=...\n");
    this.ayz.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("ecosystem=...\n");
    this.bYi.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("storageBox=...\n");
    this.bYj.a(paramStringBuilder, paramString + "  ");
  }
}