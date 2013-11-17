import java.nio.ByteBuffer;

public class aHY extends dzz
{
  private int baj;
  private cgw egp;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.baj = localByteBuffer.getInt();
    this.egp = cgw.values()[localByteBuffer.getInt()];
    return true;
  }

  public int yC() {
    return this.baj;
  }

  public cgw aUb() {
    return this.egp;
  }

  public int getId()
  {
    return 15960;
  }
}