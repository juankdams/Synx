import java.nio.ByteBuffer;

public class aNz extends dzz
{
  private long iI;
  private int[] etF;

  public long eq()
  {
    return this.iI;
  }

  public int[] bek() {
    return this.etF;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    this.etF = new int[localByteBuffer.get()];
    for (int i = 0; i < this.etF.length; i++)
      this.etF[i] = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 5402;
  }
}