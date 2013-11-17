import java.nio.ByteBuffer;

final class Dr
{
  private long bIa = 0L;
  private String userName = null;
  private boolean bIb = false;

  private Dr(bTD parambTD) {
  }
  public void z() {
  }
  private boolean f(ByteBuffer paramByteBuffer) { this.bIa = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.userName = dzp.aJ(arrayOfByte);
    this.bIb = (paramByteBuffer.get() == 1);
    return true; }

  public void DN()
  {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 10014) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        DN();
        return true;
      }
      return false;
    }

    return false;
  }
}