import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aiZ
  implements cxS
{
  public byte type;
  public long bPv;
  public int dhO;
  public short bUp;
  public long aGh;
  public final ArrayList dhP;

  public aiZ()
  {
    this.type = 0;
    this.bPv = 0L;
    this.dhO = 0;
    this.bUp = 0;
    this.aGh = 0L;
    this.dhP = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(this.type);
    paramByteBuffer.putLong(this.bPv);
    paramByteBuffer.putInt(this.dhO);
    paramByteBuffer.putShort(this.bUp);
    paramByteBuffer.putLong(this.aGh);
    if (this.dhP.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.dhP.size());
    for (int i = 0; i < this.dhP.size(); i++) {
      cXi localcXi = (cXi)this.dhP.get(i);
      boolean bool = localcXi.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.type = paramByteBuffer.get();
    this.bPv = paramByteBuffer.getLong();
    this.dhO = paramByteBuffer.getInt();
    this.bUp = paramByteBuffer.getShort();
    this.aGh = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    this.dhP.clear();
    this.dhP.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cXi localcXi = new cXi();
      boolean bool = localcXi.h(paramByteBuffer);
      if (!bool)
        return false;
      this.dhP.add(localcXi);
    }
    return true;
  }

  public void clear() {
    this.type = 0;
    this.bPv = 0L;
    this.dhO = 0;
    this.bUp = 0;
    this.aGh = 0L;
    this.dhP.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    i += 8;
    i += 4;
    i += 2;
    i += 8;
    i++;
    for (int j = 0; j < this.dhP.size(); j++) {
      cXi localcXi = (cXi)this.dhP.get(j);
      i += localcXi.O();
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
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("uniqueId=").append(this.bPv).append('\n');
    paramStringBuilder.append(paramString).append("spellId=").append(this.dhO).append('\n');
    paramStringBuilder.append(paramString).append("level=").append(this.bUp).append('\n');
    paramStringBuilder.append(paramString).append("xp=").append(this.aGh).append('\n');
    paramStringBuilder.append(paramString).append("skills=");
    if (this.dhP.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dhP.size()).append(" elements)...\n");
      for (int i = 0; i < this.dhP.size(); i++) {
        cXi localcXi = (cXi)this.dhP.get(i);
        localcXi.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}