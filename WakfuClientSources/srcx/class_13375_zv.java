import java.nio.ByteBuffer;

final class zv
{
  private int bua = 0;
  private long bub = 0L;
  private long buc = 0L;
  private int bud = 0;
  private long bue = 0L;

  private zv(cKu paramcKu) {  } 
  public void z() { this.bug.bua = this.bua;
    this.bug.bub = this.bub;
    this.bug.buc = this.buc;
    this.bug.bud = this.bud;
    this.bug.bue = this.bue; }

  private boolean A(ByteBuffer paramByteBuffer)
  {
    this.bua = paramByteBuffer.getInt();
    this.bub = paramByteBuffer.getLong();
    this.buc = paramByteBuffer.getLong();
    return true;
  }

  public void HH() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10021)
    {
      return false;
    }if (paramInt < 10028001) {
      boolean bool = A(paramByteBuffer);
      if (bool) {
        HH();
        return true;
      }
      return false;
    }

    return false;
  }
}