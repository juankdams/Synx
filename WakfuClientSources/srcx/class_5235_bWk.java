import java.nio.ByteBuffer;

public class bWk extends dzz
{
  private final aoL gNu = new aoL();

  public aoL bSI() {
    return this.gNu;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort();

    for (int j = 0; j < i; j++) {
      long l1 = localByteBuffer.getLong();
      long l2 = localByteBuffer.getLong();
      int k = localByteBuffer.getShort();
      byte[] arrayOfByte = new byte[k];
      localByteBuffer.get(arrayOfByte);
      long l3 = localByteBuffer.getLong();
      this.gNu.put(l1, new cFc(Long.valueOf(l2), arrayOfByte, Long.valueOf(l3)));
    }

    return true;
  }

  public int getId() {
    return 204;
  }
}