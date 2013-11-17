import java.nio.ByteBuffer;

public class css extends dzz
{
  private int baj;
  private cYk cGk;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cGk = aUG.eF(localByteBuffer.getLong());
    this.baj = localByteBuffer.getInt();
    return true;
  }

  public int yC() {
    return this.baj;
  }

  public cYk ML() {
    return this.cGk;
  }

  public int getId() {
    return 11218;
  }
}