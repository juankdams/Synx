import java.nio.ByteBuffer;

public class dNr extends dzz
{
  private final cbQ mdZ = new cbQ();

  public final cbQ dpV() {
    return this.mdZ;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort();
    this.mdZ.rH();
    this.mdZ.ensureCapacity(i);

    for (int j = 0; j < i; j++) {
      long l = localByteBuffer.getLong();
      this.mdZ.add(l);
    }

    return true;
  }

  public void bc() {
    super.bc();
    this.mdZ.clear(0);
  }

  public final int getId() {
    return 206;
  }
}