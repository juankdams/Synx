import java.nio.ByteBuffer;

public class ayq extends dzz
{
  private cSR aRb;
  private int bkW;
  private aMY cwW;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    this.aRb = new cSR(i);
    for (int j = 0; j < i; j++) {
      this.aRb.put(localByteBuffer.getInt(), Boolean.valueOf(localByteBuffer.get() != 0));
    }
    this.bkW = localByteBuffer.getInt();
    this.cwW = new aMY();
    this.cwW.aq(localByteBuffer);
    return true;
  }

  public cSR aKz() {
    return this.aRb;
  }

  public int Fd() {
    return this.bkW;
  }

  public aMY aKA() {
    return this.cwW;
  }

  public int getId()
  {
    return 20076;
  }
}