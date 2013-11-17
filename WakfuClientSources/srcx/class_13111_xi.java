import java.nio.ByteBuffer;

public class xi extends dzz
{
  private boolean bph;
  private diO bpi;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.bph = (localByteBuffer.get() != 0);

    if (this.bph) {
      this.bpi = blK.au(localByteBuffer);
    }
    return true;
  }

  public boolean Gk() {
    return this.bph;
  }

  public diO Gl() {
    return this.bpi;
  }

  public int getId()
  {
    return 14015;
  }
}