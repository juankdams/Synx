import java.nio.ByteBuffer;

public class Fo extends akv
  implements cxS
{
  public int bto;
  public boolean btp;
  public boolean btq;
  public boolean btr;
  public boolean bts;
  public byte btt;
  public dKK btu;
  private final cCH aW;

  public Fo()
  {
    this.bto = 0;
    this.btp = false;
    this.btq = false;
    this.btr = false;
    this.bts = false;
    this.btt = -1;
    this.btu = null;

    this.aW = new Mn(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.bto);
    paramByteBuffer.put((byte)(this.btp ? 1 : 0));
    paramByteBuffer.put((byte)(this.btq ? 1 : 0));
    paramByteBuffer.put((byte)(this.btr ? 1 : 0));
    paramByteBuffer.put((byte)(this.bts ? 1 : 0));
    paramByteBuffer.put(this.btt);
    if (this.btu != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.btu.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bto = paramByteBuffer.getInt();
    this.btp = (paramByteBuffer.get() == 1);
    this.btq = (paramByteBuffer.get() == 1);
    this.btr = (paramByteBuffer.get() == 1);
    this.bts = (paramByteBuffer.get() == 1);
    this.btt = paramByteBuffer.get();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.btu = new dKK();
      boolean bool = this.btu.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.btu = null;
    }
    return true;
  }

  public void clear() {
    this.bto = 0;
    this.btp = false;
    this.btq = false;
    this.btr = false;
    this.bts = false;
    this.btt = -1;
    this.btu = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      ze localze = new ze(this, null);
      boolean bool = localze.b(paramByteBuffer, paramInt);
      if (bool) {
        localze.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 4;
    i++;
    i++;
    i++;
    i++;
    i++;
    i++;
    if (this.btu != null) {
      i += this.btu.O();
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
    paramStringBuilder.append(paramString).append("currentFightId=").append(this.bto).append('\n');
    paramStringBuilder.append(paramString).append("isKo=").append(this.btp).append('\n');
    paramStringBuilder.append(paramString).append("isDead=").append(this.btq).append('\n');
    paramStringBuilder.append(paramString).append("isSummoned=").append(this.btr).append('\n');
    paramStringBuilder.append(paramString).append("isFleeing=").append(this.bts).append('\n');
    paramStringBuilder.append(paramString).append("obstacleId=").append(this.btt).append('\n');
    paramStringBuilder.append(paramString).append("SUMMONDATA=");
    if (this.btu == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.btu.a(paramStringBuilder, paramString + "  ");
    }
  }
}