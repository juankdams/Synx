import java.nio.ByteBuffer;

public class Xl extends dzz
{
  private int aNN;
  private byte bkM;
  private int cHu;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    this.bkM = localByteBuffer.get();
    this.cHu = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11208;
  }

  public int se() {
    return this.aNN;
  }

  public byte getType() {
    return this.bkM;
  }

  public int ajo() {
    return this.cHu;
  }
}