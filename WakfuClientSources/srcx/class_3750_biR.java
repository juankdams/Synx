import java.nio.ByteBuffer;

public class biR extends dzz
{
  private byte bwR;
  private vL aIX;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    aHR localaHR = new aHR();
    localaHR.U(localByteBuffer);
    this.aIX = localaHR.qI();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public vL qI() {
    return this.aIX;
  }

  public int getId() {
    return 596;
  }
}