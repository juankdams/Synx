import java.nio.ByteBuffer;

public class aof
  implements cxS
{
  public short dsE;
  public String name;
  public int dsF;
  public long dsG;
  public long dsH;
  public short dsI;
  public short dsJ;
  public byte btt;
  public bBa dsK;
  public OY dsL;
  public int direction;
  public long dsM;

  public aof()
  {
    this.dsE = 0;
    this.name = null;
    this.dsF = 0;
    this.dsG = 0L;
    this.dsH = 0L;
    this.dsI = 0;
    this.dsJ = 0;
    this.btt = 0;
    this.dsK = null;
    this.dsL = null;
    this.direction = 0;
    this.dsM = 0L;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.dsE);
    if (this.name != null) {
      byte[] arrayOfByte = dzp.qC(this.name);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.dsF);
    paramByteBuffer.putLong(this.dsG);
    paramByteBuffer.putLong(this.dsH);
    paramByteBuffer.putShort(this.dsI);
    paramByteBuffer.putShort(this.dsJ);
    paramByteBuffer.put(this.btt);
    boolean bool;
    if (this.dsK != null) {
      paramByteBuffer.put((byte)1);
      bool = this.dsK.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.dsL != null) {
      paramByteBuffer.put((byte)1);
      bool = this.dsL.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    paramByteBuffer.putInt(this.direction);
    paramByteBuffer.putLong(this.dsM);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dsE = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    this.dsF = paramByteBuffer.getInt();
    this.dsG = paramByteBuffer.getLong();
    this.dsH = paramByteBuffer.getLong();
    this.dsI = paramByteBuffer.getShort();
    this.dsJ = paramByteBuffer.getShort();
    this.btt = paramByteBuffer.get();
    int j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.dsK = new bBa();
      bool1 = this.dsK.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.dsK = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.dsL = new OY();
      boolean bool2 = this.dsL.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.dsL = null;
    }
    this.direction = paramByteBuffer.getInt();
    this.dsM = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.dsE = 0;
    this.name = null;
    this.dsF = 0;
    this.dsG = 0L;
    this.dsH = 0L;
    this.dsI = 0;
    this.dsJ = 0;
    this.btt = 0;
    this.dsK = null;
    this.dsL = null;
    this.direction = 0;
    this.dsM = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      dUb localdUb = new dUb(this, null);
      boolean bool = localdUb.b(paramByteBuffer, paramInt);
      if (bool) {
        localdUb.z();
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
    i += 2;
    i += (this.name != null ? dzp.qC(this.name).length : 0);
    i += 4;
    i += 8;
    i += 8;
    i += 2;
    i += 2;
    i++;
    i++;
    if (this.dsK != null) {
      i += this.dsK.O();
    }
    i++;
    if (this.dsL != null) {
      i += this.dsL.O();
    }
    i += 4;
    i += 8;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("typeid=").append(this.dsE).append('\n');
    paramStringBuilder.append(paramString).append("name=").append(this.name).append('\n');
    paramStringBuilder.append(paramString).append("currentHp=").append(this.dsF).append('\n');
    paramStringBuilder.append(paramString).append("summonId=").append(this.dsG).append('\n');
    paramStringBuilder.append(paramString).append("currentXP=").append(this.dsH).append('\n');
    paramStringBuilder.append(paramString).append("cappedLevel=").append(this.dsI).append('\n');
    paramStringBuilder.append(paramString).append("forcedLevel=").append(this.dsJ).append('\n');
    paramStringBuilder.append(paramString).append("obstacleId=").append(this.btt).append('\n');
    paramStringBuilder.append(paramString).append("DOUBLEINVOC=");
    if (this.dsK == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.dsK.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("IMAGEINVOC=");
    if (this.dsL == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.dsL.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("direction=").append(this.direction).append('\n');
    paramStringBuilder.append(paramString).append("summonerId=").append(this.dsM).append('\n');
  }
}