import java.nio.ByteBuffer;

public class aTz
  implements cxS
{
  public int aGg;
  public String name;
  public int eRD;
  public int eRE;
  public int eRF;
  public int eRG;
  public byte eRH;
  public long eRI;
  public long eRJ;
  public long eRK;
  public int eRL;
  public long eRM;

  public aTz()
  {
    this.aGg = 0;
    this.name = null;
    this.eRD = 0;
    this.eRE = 0;
    this.eRF = 0;
    this.eRG = 0;
    this.eRH = 0;
    this.eRI = 0L;
    this.eRJ = 0L;
    this.eRK = 0L;
    this.eRL = 0;
    this.eRM = 0L;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aGg);
    if (this.name != null) {
      byte[] arrayOfByte = dzp.qC(this.name);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.eRD);
    paramByteBuffer.putInt(this.eRE);
    paramByteBuffer.putInt(this.eRF);
    paramByteBuffer.putInt(this.eRG);
    paramByteBuffer.put(this.eRH);
    paramByteBuffer.putLong(this.eRI);
    paramByteBuffer.putLong(this.eRJ);
    paramByteBuffer.putLong(this.eRK);
    paramByteBuffer.putInt(this.eRL);
    paramByteBuffer.putLong(this.eRM);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aGg = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    this.eRD = paramByteBuffer.getInt();
    this.eRE = paramByteBuffer.getInt();
    this.eRF = paramByteBuffer.getInt();
    this.eRG = paramByteBuffer.getInt();
    this.eRH = paramByteBuffer.get();
    this.eRI = paramByteBuffer.getLong();
    this.eRJ = paramByteBuffer.getLong();
    this.eRK = paramByteBuffer.getLong();
    this.eRL = paramByteBuffer.getInt();
    this.eRM = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.aGg = 0;
    this.name = null;
    this.eRD = 0;
    this.eRE = 0;
    this.eRF = 0;
    this.eRG = 0;
    this.eRH = 0;
    this.eRI = 0L;
    this.eRJ = 0L;
    this.eRK = 0L;
    this.eRL = 0;
    this.eRM = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 315) {
      dwG localdwG = new dwG(this, null);
      boolean bool = localdwG.b(paramByteBuffer, paramInt);
      if (bool) {
        localdwG.z();
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
    i += 2;
    i += (this.name != null ? dzp.qC(this.name).length : 0);
    i += 4;
    i += 4;
    i += 4;
    i += 4;
    i++;
    i += 8;
    i += 8;
    i += 8;
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
    paramStringBuilder.append(paramString).append("definitionId=").append(this.aGg).append('\n');
    paramStringBuilder.append(paramString).append("name=").append(this.name).append('\n');
    paramStringBuilder.append(paramString).append("colorItemRefId=").append(this.eRD).append('\n');
    paramStringBuilder.append(paramString).append("equippedRefItemId=").append(this.eRE).append('\n');
    paramStringBuilder.append(paramString).append("health=").append(this.eRF).append('\n');
    paramStringBuilder.append(paramString).append("xp=").append(this.eRG).append('\n');
    paramStringBuilder.append(paramString).append("fightCounter=").append(this.eRH).append('\n');
    paramStringBuilder.append(paramString).append("fightCounterStartDate=").append(this.eRI).append('\n');
    paramStringBuilder.append(paramString).append("lastMealDate=").append(this.eRJ).append('\n');
    paramStringBuilder.append(paramString).append("lastHungryDate=").append(this.eRK).append('\n');
    paramStringBuilder.append(paramString).append("sleepRefItemId=").append(this.eRL).append('\n');
    paramStringBuilder.append(paramString).append("sleepDate=").append(this.eRM).append('\n');
  }
}