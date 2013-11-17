import java.nio.ByteBuffer;

public class aHM extends dWi
{
  private boolean efV = false;
  private int efW = -1;

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);

    this.efV = (localByteBuffer.get() == 1);
    if (this.efV) {
      this.efW = localByteBuffer.getInt();
    }

    return true;
  }

  public int getId() {
    return 8012;
  }

  public boolean aTN() {
    return this.efV;
  }

  public int aTO() {
    return this.efW;
  }
}