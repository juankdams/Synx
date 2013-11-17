import java.nio.ByteBuffer;

public class GC extends dzz
{
  private cbQ bOS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();
    this.bOS = new cbQ(i);
    for (int j = 0; j < i; j++) {
      this.bOS.add(localByteBuffer.getLong());
    }

    return true;
  }

  public int getId() {
    return 15616;
  }

  public cbQ QA() {
    return this.bOS;
  }
}