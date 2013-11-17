import java.nio.ByteBuffer;

public class auQ
  implements cxS
{
  public int bua;
  public long bub;
  public int bud;
  public long dJo;
  public static final int aL = 24;

  public auQ()
  {
    this.bua = 0;
    this.bub = 0L;
    this.bud = 0;
    this.dJo = 0L;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.bua);
    paramByteBuffer.putLong(this.bub);
    paramByteBuffer.putInt(this.bud);
    paramByteBuffer.putLong(this.dJo);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bua = paramByteBuffer.getInt();
    this.bub = paramByteBuffer.getLong();
    this.bud = paramByteBuffer.getInt();
    this.dJo = paramByteBuffer.getLong();
    return true;
  }

  public void clear() {
    this.bua = 0;
    this.bub = 0L;
    this.bud = 0;
    this.dJo = 0L;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028001) {
      dcg localdcg = new dcg(this, null);
      boolean bool = localdcg.b(paramByteBuffer, paramInt);
      if (bool) {
        localdcg.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 24;
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
    paramStringBuilder.append(paramString).append("currentLockValue=").append(this.bud).append('\n');
    paramStringBuilder.append(paramString).append("currentLockValueLastChange=").append(this.dJo).append('\n');
  }
}