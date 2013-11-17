import java.nio.ByteBuffer;

public class btn
  implements cxS
{
  public long bPv;
  public int bPw;
  public byte aYU;
  public short bPx;
  public final dQW bPy;

  public btn()
  {
    this.bPv = 0L;
    this.bPw = 0;
    this.aYU = 0;
    this.bPx = 0;
    this.bPy = new dQW();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.bPv);
    paramByteBuffer.putInt(this.bPw);
    paramByteBuffer.put(this.aYU);
    paramByteBuffer.putShort(this.bPx);
    boolean bool = this.bPy.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.bPv = 0L;
    this.bPw = 0;
    this.aYU = 0;
    this.bPx = 0;
    this.bPy.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      Hn localHn = new Hn(this, null);
      boolean bool = localHn.b(paramByteBuffer, paramInt);
      if (bool) {
        localHn.z();
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
    i++;
    i += 2;
    i += this.bPy.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("uniqueId=").append(this.bPv).append('\n');
    paramStringBuilder.append(paramString).append("referenceId=").append(this.bPw).append('\n');
    paramStringBuilder.append(paramString).append("position=").append(this.aYU).append('\n');
    paramStringBuilder.append(paramString).append("maximumSize=").append(this.bPx).append('\n');
    paramStringBuilder.append(paramString).append("inventory=...\n");
    this.bPy.a(paramStringBuilder, paramString + "  ");
  }
}