import java.nio.ByteBuffer;

final class bSZ
{
  private int[] dpJ = null;
  private int[] dpK = null;
  private int[] dpL = null;

  private bSZ(amX paramamX) {  } 
  public void z() { this.bti.dpJ = this.dpJ;
    this.bti.dpK = this.dpK;
    this.bti.dpL = this.dpL; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.dpJ = new int[i];
      for (j = 0; j < i; j++)
        this.dpJ[j] = paramByteBuffer.getInt();
    }
    else {
      this.dpJ = null;
    }
    int j = paramByteBuffer.getShort() & 0xFFFF;
    if (j > 0) {
      this.dpK = new int[j];
      for (int k = 0; k < j; k++)
        this.dpK[k] = paramByteBuffer.getInt();
    }
    else {
      this.dpK = null;
    }
    return true;
  }

  public void bZG() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10026000) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        bZG();
        return true;
      }
      return false;
    }

    return false;
  }
}