import java.nio.ByteBuffer;

public class bKX
  implements cxS
{
  public short cIh;
  public byte type;
  public int gha;
  public long aOw;
  public long ghb;
  public final Qv ehJ;

  public bKX()
  {
    this.cIh = 0;
    this.type = 0;
    this.gha = 0;
    this.aOw = 0L;
    this.ghb = -1L;
    this.ehJ = new Qv();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cIh);
    paramByteBuffer.put(this.type);
    paramByteBuffer.putInt(this.gha);
    paramByteBuffer.putLong(this.aOw);
    paramByteBuffer.putLong(this.ghb);
    boolean bool = this.ehJ.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.cIh = 0;
    this.type = 0;
    this.gha = 0;
    this.aOw = 0L;
    this.ghb = -1L;
    this.ehJ.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bwD localbwD = new bwD(this, null);
      boolean bool = localbwD.b(paramByteBuffer, paramInt);
      if (bool) {
        localbwD.z();
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
    i++;
    i += 4;
    i += 8;
    i += 8;
    i += this.ehJ.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("position=").append(this.cIh).append('\n');
    paramStringBuilder.append(paramString).append("type=").append(this.type).append('\n');
    paramStringBuilder.append(paramString).append("featureReferenceId=").append(this.gha).append('\n');
    paramStringBuilder.append(paramString).append("duration=").append(this.aOw).append('\n');
    paramStringBuilder.append(paramString).append("startDate=").append(this.ghb).append('\n');
    paramStringBuilder.append(paramString).append("merchantItem=...\n");
    this.ehJ.a(paramStringBuilder, paramString + "  ");
  }
}