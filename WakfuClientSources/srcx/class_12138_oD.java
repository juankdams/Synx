import java.nio.ByteBuffer;

public final class oD extends dWi
{
  aoL aCA = new aoL();
  private boolean aTU;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j++) {
      long l = localByteBuffer.getLong();
      cYk localcYk = new cYk(localByteBuffer.getInt(), localByteBuffer.getInt(), localByteBuffer.getShort());
      this.aCA.put(l, localcYk);
    }
    this.aTU = (localByteBuffer.get() == 1);
    return false;
  }

  public boolean vX() {
    return this.aTU;
  }

  public aoL vY() {
    return this.aCA;
  }

  public int getId() {
    return 7906;
  }
}