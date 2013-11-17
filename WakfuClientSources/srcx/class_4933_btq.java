import java.nio.ByteBuffer;

public class btq
  implements cxS
{
  public long gbV;
  public int boH;
  public int boI;
  public short boJ;
  public byte boK;
  public final dGD gbW;
  public Dy gbX;

  public btq()
  {
    this.gbV = 0L;
    this.boH = 0;
    this.boI = 0;
    this.boJ = 0;
    this.boK = 0;
    this.gbW = new dGD();
    this.gbX = null;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.gbV);
    paramByteBuffer.putInt(this.boH);
    paramByteBuffer.putInt(this.boI);
    paramByteBuffer.putShort(this.boJ);
    paramByteBuffer.put(this.boK);
    boolean bool1 = this.gbW.g(paramByteBuffer);
    if (!bool1)
      return false;
    if (this.gbX == null)
      return false;
    paramByteBuffer.put(this.gbX.N());
    boolean bool2 = this.gbX.g(paramByteBuffer);
    if (!bool2)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.h(paramByteBuffer);
    if (!bool)
      return false;
    this.gbX = Dy.G(paramByteBuffer);
    if (this.gbX == null)
      return false;
    return true;
  }

  public void clear() {
    this.gbV = 0L;
    this.boH = 0;
    this.boI = 0;
    this.boJ = 0;
    this.boK = 0;
    this.gbW.clear();
    this.gbX = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      cGe localcGe = new cGe(this, null);
      boolean bool = localcGe.b(paramByteBuffer, paramInt);
      if (bool) {
        localcGe.z();
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
    i += 4;
    i += 4;
    i += 2;
    i++;
    i += this.gbW.O();
    i++;
    i += this.gbX.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("templateId=").append(this.gbV).append('\n');
    paramStringBuilder.append(paramString).append("positionX=").append(this.boH).append('\n');
    paramStringBuilder.append(paramString).append("positionY=").append(this.boI).append('\n');
    paramStringBuilder.append(paramString).append("positionZ=").append(this.boJ).append('\n');
    paramStringBuilder.append(paramString).append("direction=").append(this.boK).append('\n');
    paramStringBuilder.append(paramString).append("itemForm=...\n");
    this.gbW.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("specificData=<");
    if (this.gbX == null) {
      paramStringBuilder.append(">\n");
    } else {
      paramStringBuilder.append(this.gbX.getClass().getSimpleName()).append(">...\n");
      this.gbX.a(paramStringBuilder, paramString + "  ");
    }
  }
}