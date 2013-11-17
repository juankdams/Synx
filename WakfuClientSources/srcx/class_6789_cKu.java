import java.nio.ByteBuffer;

public class cKu
  implements cxS
{
  public int bua;
  public long bub;
  public long buc;
  public int bud;
  public long bue;
  public static final int aL = 32;

  public cKu()
  {
    this.bua = 0;
    this.bub = 0L;
    this.buc = 0L;
    this.bud = 0;
    this.bue = 0L;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.bua);
    paramByteBuffer.putLong(this.bub);
    paramByteBuffer.putLong(this.buc);
    paramByteBuffer.putInt(this.bud);
    paramByteBuffer.putLong(this.bue);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bua = paramByteBuffer.getInt();
    this.bub = paramByteBuffer.getLong();
    this.buc = paramByteBuffer.getLong();
    this.bud = paramByteBuffer.getInt();
    this.bue = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.bua = 0;
    this.bub = 0L;
    this.buc = 0L;
    this.bud = 0;
    this.bue = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028001) {
      zv localzv = new zv(this, null);
      boolean bool = localzv.b(paramByteBuffer, paramInt);
      if (bool) {
        localzv.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 32;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("lockId=").append(this.bua).append('\n');
    paramStringBuilder.append(paramString).append("lockDate=").append(this.bub).append('\n');
    paramStringBuilder.append(paramString).append("unlockDate=").append(this.buc).append('\n');
    paramStringBuilder.append(paramString).append("currentLockValue=").append(this.bud).append('\n');
    paramStringBuilder.append(paramString).append("currentLockValueLastModification=").append(this.bue).append('\n');
  }
}