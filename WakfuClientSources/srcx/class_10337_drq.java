import java.nio.ByteBuffer;
import java.util.ArrayList;

public class drq
  implements cxS
{
  public long ayt;
  public String ayu;
  public long ayv;
  public final ArrayList ayw;
  public int ayx;
  public cnO ayy;
  public final bIq ayz;

  public drq()
  {
    this.ayt = 0L;
    this.ayu = null;
    this.ayv = 0L;
    this.ayw = new ArrayList(0);
    this.ayx = 0;
    this.ayy = null;
    this.ayz = new bIq();
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.ayt);
    if (this.ayu != null) {
      byte[] arrayOfByte = dzp.qC(this.ayu);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putLong(this.ayv);
    if (this.ayw.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.ayw.size());
    for (int i = 0; i < this.ayw.size(); i++) {
      cXz localcXz = (cXz)this.ayw.get(i);
      boolean bool2 = localcXz.g(paramByteBuffer);
      if (!bool2)
        return false;
    }
    paramByteBuffer.putInt(this.ayx);
    if (this.ayy != null) {
      paramByteBuffer.put((byte)1);
      bool1 = this.ayy.g(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    boolean bool1 = this.ayz.g(paramByteBuffer);
    if (!bool1)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.h(paramByteBuffer);
    if (!bool1)
      return false;
    return true;
  }

  public void clear() {
    this.ayt = 0L;
    this.ayu = null;
    this.ayv = 0L;
    this.ayw.clear();
    this.ayx = 0;
    this.ayy = null;
    this.ayz.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      em localem = new em(this, null);
      boolean bool = localem.b(paramByteBuffer, paramInt);
      if (bool) {
        localem.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 8;
    i += 2;
    i += (this.ayu != null ? dzp.qC(this.ayu).length : 0);
    i += 8;
    i++;
    for (int j = 0; j < this.ayw.size(); j++) {
      cXz localcXz = (cXz)this.ayw.get(j);
      i += localcXz.O();
    }
    i += 4;
    i++;
    if (this.ayy != null) {
      i += this.ayy.O();
    }
    i += this.ayz.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("ownerId=").append(this.ayt).append('\n');
    paramStringBuilder.append(paramString).append("ownerName=").append(this.ayu).append('\n');
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
    paramStringBuilder.append(paramString).append("rooms=");
    if (this.ayw.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.ayw.size()).append(" elements)...\n");
      for (int i = 0; i < this.ayw.size(); i++) {
        cXz localcXz = (cXz)this.ayw.get(i);
        localcXz.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("customViewModelId=").append(this.ayx).append('\n');
    paramStringBuilder.append(paramString).append("wallet=");
    if (this.ayy == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.ayy.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("permissions=...\n");
    this.ayz.a(paramStringBuilder, paramString + "  ");
  }
}