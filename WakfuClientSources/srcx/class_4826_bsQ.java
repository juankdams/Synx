import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bsQ
  implements cxS
{
  public long ayt;
  public String ayu;
  public long ayv;
  public int ayx;
  public final ArrayList gat;
  public final ArrayList gau;

  public bsQ()
  {
    this.ayt = 0L;
    this.ayu = null;
    this.ayv = 0L;
    this.ayx = 0;
    this.gat = new ArrayList(0);
    this.gau = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.ayt);
    if (this.ayu != null) {
      byte[] arrayOfByte = dzp.qC(this.ayu);
      if (arrayOfByte.length > 255)
        return false;
      paramByteBuffer.put((byte)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.put((byte)0);
    }
    paramByteBuffer.putLong(this.ayv);
    paramByteBuffer.putInt(this.ayx);
    if (this.gat.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.gat.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.gat.size(); i++) {
      localObject = (aWK)this.gat.get(i);
      bool = ((aWK)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.gau.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.gau.size());
    for (i = 0; i < this.gau.size(); i++) {
      localObject = (ayP)this.gau.get(i);
      bool = ((ayP)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  public void clear() {
    this.ayt = 0L;
    this.ayu = null;
    this.ayv = 0L;
    this.ayx = 0;
    this.gat.clear();
    this.gau.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bBA localbBA = new bBA(this, null);
      boolean bool = localbBA.b(paramByteBuffer, paramInt);
      if (bool) {
        localbBA.z();
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
    i += (this.ayu != null ? dzp.qC(this.ayu).length : 0);
    i += 8;
    i += 4;
    i++;
    Object localObject;
    for (int j = 0; j < this.gat.size(); j++) {
      localObject = (aWK)this.gat.get(j);
      i += ((aWK)localObject).O();
    }
    i++;
    for (j = 0; j < this.gau.size(); j++) {
      localObject = (ayP)this.gau.get(j);
      i += ((ayP)localObject).O();
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
    paramStringBuilder.append(paramString).append("ownerId=").append(this.ayt).append('\n');
    paramStringBuilder.append(paramString).append("ownerName=").append(this.ayu).append('\n');
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
    paramStringBuilder.append(paramString).append("customViewModelId=").append(this.ayx).append('\n');
    paramStringBuilder.append(paramString).append("shelfItems=");
    int i;
    Object localObject;
    if (this.gat.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gat.size()).append(" elements)...\n");
      for (i = 0; i < this.gat.size(); i++) {
        localObject = (aWK)this.gat.get(i);
        ((aWK)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("merchantDisplays=");
    if (this.gau.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gau.size()).append(" elements)...\n");
      for (i = 0; i < this.gau.size(); i++) {
        localObject = (ayP)this.gau.get(i);
        ((ayP)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}