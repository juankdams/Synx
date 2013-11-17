import java.nio.ByteBuffer;

public class dFX extends dzz
{
  private long bwl;
  private String eQh;
  private String Th;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwl = localByteBuffer.getLong();
    byte[] arrayOfByte1 = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte1);
    this.eQh = dzp.aJ(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte2);
    this.Th = dzp.aJ(arrayOfByte2);
    return true;
  }

  public String bip() {
    return this.eQh;
  }

  public String he() {
    return this.Th;
  }

  public long JP() {
    return this.bwl;
  }

  public int getId() {
    return 580;
  }
}