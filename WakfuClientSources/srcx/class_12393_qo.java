import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class qo
{
  private String aXp;
  private final dFu aXq = new dFu();

  public final void load(String paramString) {
    this.aXp = paramString;
    x(xx());
  }

  private void x(ByteBuffer paramByteBuffer)
  {
    this.aXq.clear();
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      int m = paramByteBuffer.getInt();
      this.aXq.fg(k, m);
    }
  }

  public final aDR cq(int paramInt)
  {
    return a(paramInt, xx());
  }

  private final aDR a(int paramInt, ByteBuffer paramByteBuffer) {
    int i = this.aXq.get(paramInt);
    if (i > 0) {
      paramByteBuffer.position(i);
      return e(paramByteBuffer, paramInt);
    }
    return null;
  }

  public final aDR d(ByteBuffer paramByteBuffer, int paramInt)
  {
    x(paramByteBuffer);
    return a(paramInt, paramByteBuffer);
  }

  private aDR e(ByteBuffer paramByteBuffer, int paramInt)
  {
    aDR localaDR = new aDR(paramInt);
    int i = paramByteBuffer.get() & 0xFF;
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      localaDR.a(ty.BI().cU(k));
    }
    return localaDR;
  }

  private ByteBuffer xx() {
    byte[] arrayOfByte = dtb.readFile(this.aXp);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return localByteBuffer;
  }

  public final int xy() {
    return this.aXq.size();
  }
}