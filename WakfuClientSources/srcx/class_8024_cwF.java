import java.nio.ByteBuffer;

public class cwF extends dzz
{
  private long bXM;
  private String Th;
  private byte dJU;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dJU = localByteBuffer.get();
    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);
    this.Th = dzp.aJ(arrayOfByte);
    this.bXM = localByteBuffer.getLong();
    return true;
  }

  public String he() {
    return this.Th;
  }

  public byte aHs() {
    return this.dJU;
  }

  public long bBa() {
    return this.bXM;
  }

  public int getId() {
    return 502;
  }
}