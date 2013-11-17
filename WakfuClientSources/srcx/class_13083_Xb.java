import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Xb
  implements cxS
{
  public int cGX;
  public int bUm;
  public byte bUn;
  public byte cGY;
  public byte cGZ;
  public byte cHa;
  public byte cHb;
  public byte cHc;
  public byte cHd;
  public byte cHe;
  public byte cHf;
  public final dVs cHg;
  public final cZr cHh;
  public final ArrayList cHi;

  public Xb()
  {
    this.cGX = 0;
    this.bUm = 0;
    this.bUn = 0;
    this.cGY = 0;
    this.cGZ = 0;
    this.cHa = 0;
    this.cHb = 0;
    this.cHc = 0;
    this.cHd = 0;
    this.cHe = 0;
    this.cHf = 0;
    this.cHg = new dVs();
    this.cHh = new cZr();
    this.cHi = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.cGX);
    paramByteBuffer.putInt(this.bUm);
    paramByteBuffer.put(this.bUn);
    paramByteBuffer.put(this.cGY);
    paramByteBuffer.put(this.cGZ);
    paramByteBuffer.put(this.cHa);
    paramByteBuffer.put(this.cHb);
    paramByteBuffer.put(this.cHc);
    paramByteBuffer.put(this.cHd);
    paramByteBuffer.put(this.cHe);
    paramByteBuffer.put(this.cHf);
    boolean bool1 = this.cHg.g(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.cHh.g(paramByteBuffer);
    if (!bool2)
      return false;
    if (this.cHi.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.cHi.size());
    for (int i = 0; i < this.cHi.size(); i++) {
      rd localrd = (rd)this.cHi.get(i);
      boolean bool3 = localrd.g(paramByteBuffer);
      if (!bool3)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cGX = paramByteBuffer.getInt();
    this.bUm = paramByteBuffer.getInt();
    this.bUn = paramByteBuffer.get();
    this.cGY = paramByteBuffer.get();
    this.cGZ = paramByteBuffer.get();
    this.cHa = paramByteBuffer.get();
    this.cHb = paramByteBuffer.get();
    this.cHc = paramByteBuffer.get();
    this.cHd = paramByteBuffer.get();
    this.cHe = paramByteBuffer.get();
    this.cHf = paramByteBuffer.get();
    boolean bool1 = this.cHg.h(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.cHh.h(paramByteBuffer);
    if (!bool2)
      return false;
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.cHi.clear();
    this.cHi.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      rd localrd = new rd();
      boolean bool3 = localrd.h(paramByteBuffer);
      if (!bool3)
        return false;
      this.cHi.add(localrd);
    }
    return true;
  }

  public void clear() {
    this.cGX = 0;
    this.bUm = 0;
    this.bUn = 0;
    this.cGY = 0;
    this.cGZ = 0;
    this.cHa = 0;
    this.cHb = 0;
    this.cHc = 0;
    this.cHd = 0;
    this.cHe = 0;
    this.cHf = 0;
    this.cHg.clear();
    this.cHh.clear();
    this.cHi.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 4;
    i += 4;
    i++;
    i++;
    i++;
    i++;
    i++;
    i++;
    i++;
    i++;
    i++;
    i += this.cHg.O();
    i += this.cHh.O();
    i += 2;
    for (int j = 0; j < this.cHi.size(); j++) {
      rd localrd = (rd)this.cHi.get(j);
      i += localrd.O();
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
    paramStringBuilder.append(paramString).append("power=").append(this.cGX).append('\n');
    paramStringBuilder.append(paramString).append("gfxId=").append(this.bUm).append('\n');
    paramStringBuilder.append(paramString).append("sex=").append(this.bUn).append('\n');
    paramStringBuilder.append(paramString).append("haircolorindex=").append(this.cGY).append('\n');
    paramStringBuilder.append(paramString).append("haircolorfactor=").append(this.cGZ).append('\n');
    paramStringBuilder.append(paramString).append("skincolorindex=").append(this.cHa).append('\n');
    paramStringBuilder.append(paramString).append("skincolorfactor=").append(this.cHb).append('\n');
    paramStringBuilder.append(paramString).append("pupilcolorindex=").append(this.cHc).append('\n');
    paramStringBuilder.append(paramString).append("clothIndex=").append(this.cHd).append('\n');
    paramStringBuilder.append(paramString).append("faceIndex=").append(this.cHe).append('\n');
    paramStringBuilder.append(paramString).append("doubleType=").append(this.cHf).append('\n');
    paramStringBuilder.append(paramString).append("doublespells=...\n");
    this.cHg.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("doubleCharac=...\n");
    this.cHh.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("equipmentAppareances=");
    if (this.cHi.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.cHi.size()).append(" elements)...\n");
      for (int i = 0; i < this.cHi.size(); i++) {
        rd localrd = (rd)this.cHi.get(i);
        localrd.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}