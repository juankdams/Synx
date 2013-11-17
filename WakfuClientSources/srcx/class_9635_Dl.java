import java.nio.ByteBuffer;

public class Dl extends dzz
{
  private byte bwR;
  private long bwl;
  private String bHE;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.bwl = localByteBuffer.getLong();
    int i = localByteBuffer.get();
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.bHE = dzp.aJ(arrayOfByte);
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long JP() {
    return this.bwl;
  }

  public String Mz() {
    return this.bHE;
  }

  public int getId() {
    return 588;
  }
}