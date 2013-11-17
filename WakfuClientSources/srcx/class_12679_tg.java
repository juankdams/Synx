import java.nio.ByteBuffer;

public class tg extends dzz
{
  private String bde;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.bde = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId() {
    return 14001;
  }

  public String bI() {
    return this.bde;
  }
}