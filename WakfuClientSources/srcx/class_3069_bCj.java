import java.nio.ByteBuffer;

public class bCj
  implements cxS
{
  public String crN;
  public long crO;
  public int aDe;
  public short goO;
  public final Hp goP;

  public bCj()
  {
    this.crN = null;
    this.crO = 0L;
    this.aDe = 0;
    this.goO = 0;
    this.goP = new Hp();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.crN != null) {
      byte[] arrayOfByte = dzp.qC(this.crN);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putLong(this.crO);
    paramByteBuffer.putInt(this.aDe);
    paramByteBuffer.putShort(this.goO);
    boolean bool = this.goP.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.crN = dzp.aJ(arrayOfByte);
    this.crO = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    boolean bool = this.goP.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.crN = null;
    this.crO = 0L;
    this.aDe = 0;
    this.goO = 0;
    this.goP.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10024001) {
      bAe localbAe = new bAe(this, null);
      boolean bool = localbAe.b(paramByteBuffer, paramInt);
      if (bool) {
        localbAe.z();
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
    i += (this.crN != null ? dzp.qC(this.crN).length : 0);
    i += 8;
    i += 4;
    i += 2;
    i += this.goP.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("memberName=").append(this.crN).append('\n');
    paramStringBuilder.append(paramString).append("date=").append(this.crO).append('\n');
    paramStringBuilder.append(paramString).append("refId=").append(this.aDe).append('\n');
    paramStringBuilder.append(paramString).append("qty=").append(this.goO).append('\n');
    paramStringBuilder.append(paramString).append("optionalInfo=...\n");
    this.goP.a(paramStringBuilder, paramString + "  ");
  }
}