import java.nio.ByteBuffer;

public class bWT extends dzz
{
  private int hli;
  private int cPJ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hli = localByteBuffer.getInt();
    this.cPJ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15804;
  }

  public int cce() {
    return this.hli;
  }

  public int anL() {
    return this.cPJ;
  }
}