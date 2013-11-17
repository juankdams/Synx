import java.nio.ByteBuffer;

final class bOQ
{
  private byte gAt = 0;
  private int gAu = 0;
  private int gAv = 0;

  private bOQ(bFs parambFs) {  } 
  public void z() { this.gTV.gAt = this.gAt;
    this.gTV.gAu = this.gAu;
    this.gTV.gAv = this.gAv; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    this.gAt = paramByteBuffer.get();
    this.gAu = paramByteBuffer.getInt();
    return true;
  }

  public void aJk() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10004) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        aJk();
        return true;
      }
      return false;
    }

    return false;
  }
}