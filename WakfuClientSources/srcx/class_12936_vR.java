import java.nio.ByteBuffer;

public class vR extends dzz
{
  private int bkW;
  private bbO bkX;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bkW = localByteBuffer.getInt();
    this.bkX = new bbO();
    this.bkX.h(localByteBuffer);
    return true;
  }

  public int Fd() {
    return this.bkW;
  }

  public bbO Fe() {
    return this.bkX;
  }

  public int getId()
  {
    return 20080;
  }
}