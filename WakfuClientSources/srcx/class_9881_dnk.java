import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dnk
  implements cxS
{
  public final ArrayList lmy;
  public short lmz;
  public long lmA;
  public long lmB;

  public dnk()
  {
    this.lmy = new ArrayList(0);
    this.lmz = 0;
    this.lmA = 0L;
    this.lmB = 0L;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.lmy.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.lmy.size());
    for (int i = 0; i < this.lmy.size(); i++) {
      ayi localayi = (ayi)this.lmy.get(i);
      boolean bool = localayi.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    paramByteBuffer.putShort(this.lmz);
    paramByteBuffer.putLong(this.lmA);
    paramByteBuffer.putLong(this.lmB);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.lmy.clear();
    this.lmy.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      ayi localayi = new ayi();
      boolean bool = localayi.h(paramByteBuffer);
      if (!bool)
        return false;
      this.lmy.add(localayi);
    }
    this.lmz = paramByteBuffer.getShort();
    this.lmA = paramByteBuffer.getLong();
    this.lmB = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.lmy.clear();
    this.lmz = 0;
    this.lmA = 0L;
    this.lmB = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    for (int j = 0; j < this.lmy.size(); j++) {
      ayi localayi = (ayi)this.lmy.get(j);
      i += localayi.O();
    }
    i += 2;
    i += 8;
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
    paramStringBuilder.append(paramString).append("transactions=");
    if (this.lmy.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.lmy.size()).append(" elements)...\n");
      for (int i = 0; i < this.lmy.size(); i++) {
        ayi localayi = (ayi)this.lmy.get(i);
        localayi.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("newTransactionsCount=").append(this.lmz).append('\n');
    paramStringBuilder.append(paramString).append("newTransactionsKamas=").append(this.lmA).append('\n');
    paramStringBuilder.append(paramString).append("lastReadTransactionDate=").append(this.lmB).append('\n');
  }
}