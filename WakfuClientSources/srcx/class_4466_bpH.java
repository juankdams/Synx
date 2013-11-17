import java.nio.ByteBuffer;

public final class bpH extends dWi
{
  private bKR fJZ = new bKR();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      this.fJZ.add(localByteBuffer.getLong());
    }
    return true;
  }

  public int getId() {
    return 8016;
  }

  public bKR byQ() {
    return this.fJZ;
  }
}