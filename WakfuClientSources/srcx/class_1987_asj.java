import java.nio.ByteBuffer;
import java.util.ArrayList;

public class asj
  implements cxS
{
  public long cxL;
  public byte dBZ;
  public short dCa;
  public byte dCb;
  public final ArrayList aZC;
  public String dCc;
  public boolean dCd;

  public asj()
  {
    this.cxL = 0L;
    this.dBZ = -1;
    this.dCa = 0;
    this.dCb = 1;
    this.aZC = new ArrayList(0);
    this.dCc = null;
    this.dCd = false;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.cxL);
    paramByteBuffer.put(this.dBZ);
    paramByteBuffer.putShort(this.dCa);
    paramByteBuffer.put(this.dCb);
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    for (int i = 0; i < this.aZC.size(); i++) {
      cGd localcGd = (cGd)this.aZC.get(i);
      boolean bool = localcGd.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.dCc != null) {
      byte[] arrayOfByte = dzp.qC(this.dCc);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.put((byte)(this.dCd ? 1 : 0));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).h(paramByteBuffer);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  public void clear() {
    this.cxL = 0L;
    this.dBZ = -1;
    this.dCa = 0;
    this.dCb = 1;
    this.aZC.clear();
    this.dCc = null;
    this.dCd = false;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bHt localbHt = new bHt(this, null);
      boolean bool = localbHt.b(paramByteBuffer, paramInt);
      if (bool) {
        localbHt.z();
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
    i++;
    i += 2;
    i++;
    i += 2;
    for (int j = 0; j < this.aZC.size(); j++) {
      cGd localcGd = (cGd)this.aZC.get(j);
      i += localcGd.O();
    }
    i += 2;
    i += (this.dCc != null ? dzp.qC(this.dCc).length : 0);
    i++;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("uid=").append(this.cxL).append('\n');
    paramStringBuilder.append(paramString).append("requiredItemType=").append(this.dBZ).append('\n');
    paramStringBuilder.append(paramString).append("nSlots=").append(this.dCa).append('\n');
    paramStringBuilder.append(paramString).append("maxPackSize=").append(this.dCb).append('\n');
    paramStringBuilder.append(paramString).append("contents=");
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (int i = 0; i < this.aZC.size(); i++) {
        cGd localcGd = (cGd)this.aZC.get(i);
        localcGd.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("shortAd=").append(this.dCc).append('\n');
    paramStringBuilder.append(paramString).append("locked=").append(this.dCd).append('\n');
  }
}