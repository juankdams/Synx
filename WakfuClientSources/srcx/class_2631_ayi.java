import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ayi
  implements cxS
{
  public long dNQ;
  public long dNR;
  public String dNS;
  public final ArrayList dNT;
  public long dNU;

  public ayi()
  {
    this.dNQ = 0L;
    this.dNR = 0L;
    this.dNS = null;
    this.dNT = new ArrayList(0);
    this.dNU = 0L;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.dNQ);
    paramByteBuffer.putLong(this.dNR);
    if (this.dNS != null) {
      byte[] arrayOfByte = dzp.qC(this.dNS);
      if (arrayOfByte.length > 255)
        return false;
      paramByteBuffer.put((byte)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.dNT.size() > 255)
      return false;
    paramByteBuffer.put((byte)this.dNT.size());
    for (int i = 0; i < this.dNT.size(); i++) {
      fP localfP = (fP)this.dNT.get(i);
      boolean bool = localfP.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    paramByteBuffer.putLong(this.dNU);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.dNQ = paramByteBuffer.getLong();
    this.dNR = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.dNS = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.dNT.clear();
    this.dNT.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      fP localfP = new fP();
      boolean bool = localfP.h(paramByteBuffer);
      if (!bool)
        return false;
      this.dNT.add(localfP);
    }
    this.dNU = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.dNQ = 0L;
    this.dNR = 0L;
    this.dNS = null;
    this.dNT.clear();
    this.dNU = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 8;
    i++;
    i += (this.dNS != null ? dzp.qC(this.dNS).length : 0);
    i++;
    for (int j = 0; j < this.dNT.size(); j++) {
      fP localfP = (fP)this.dNT.get(j);
      i += localfP.O();
    }
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
    paramStringBuilder.append(paramString).append("transactionDate=").append(this.dNQ).append('\n');
    paramStringBuilder.append(paramString).append("buyerId=").append(this.dNR).append('\n');
    paramStringBuilder.append(paramString).append("buyerName=").append(this.dNS).append('\n');
    paramStringBuilder.append(paramString).append("soldItems=");
    if (this.dNT.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dNT.size()).append(" elements)...\n");
      for (int i = 0; i < this.dNT.size(); i++) {
        fP localfP = (fP)this.dNT.get(i);
        localfP.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("totalPrice=").append(this.dNU).append('\n');
  }
}