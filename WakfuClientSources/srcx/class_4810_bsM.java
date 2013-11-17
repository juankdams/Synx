import java.nio.ByteBuffer;

public class bsM extends dzz
{
  private long iI;
  private boolean gac;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    this.gac = (localByteBuffer.get() > 0);

    return true;
  }

  public int getId()
  {
    return 2052;
  }

  public long eq()
  {
    return this.iI;
  }

  public boolean bAU()
  {
    return this.gac;
  }
}