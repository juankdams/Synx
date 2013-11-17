import java.nio.ByteBuffer;

public class cLt extends dzz
{
  private final aoL aVC = new aoL();
  private final btn iKY = new btn();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte);
    this.iKY.h(ByteBuffer.wrap(arrayOfByte));

    while (localByteBuffer.hasRemaining()) {
      long l = localByteBuffer.getLong();
      byte b = localByteBuffer.get();
      cCA localcCA = cCA.ed(b);
      localcCA.a(localByteBuffer);
      this.aVC.put(l, localcCA);
    }

    return true;
  }

  public aoL wO() {
    return this.aVC;
  }

  public btn cEH() {
    return this.iKY;
  }

  public int getId()
  {
    return 5222;
  }
}