import java.nio.ByteBuffer;

final class dcg
{
  private int bua = 0;
  private long bub = 0L;
  private int bud = 0;
  private long dJo = 0L;

  private dcg(auQ paramauQ) {  } 
  public void z() { this.kUO.bua = this.bua;
    this.kUO.bub = this.bub;
    this.kUO.bud = this.bud;
    this.kUO.dJo = this.dJo; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    this.bua = paramByteBuffer.getInt();
    this.bub = paramByteBuffer.getLong();
    return true;
  }

  public void RA() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }if (paramInt < 10028001) {
      boolean bool = e(paramByteBuffer);
      if (bool) {
        RA();
        return true;
      }
      return false;
    }

    return false;
  }
}