import java.nio.ByteBuffer;

public class bKy extends dzz
{
  private final aoL gNu = new aoL();

  public aoL bSI() {
    return this.gNu;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort();

    for (int j = 0; j < i; j++) {
      long l = localByteBuffer.getLong();
      int k = localByteBuffer.getShort();
      byte[] arrayOfByte = new byte[k];
      localByteBuffer.get(arrayOfByte);
      this.gNu.put(l, arrayOfByte);
    }

    return true;
  }

  public int getId() {
    return 200;
  }
}