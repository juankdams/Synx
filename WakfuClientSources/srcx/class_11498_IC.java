import java.nio.ByteBuffer;

public final class IC extends dzz
{
  private long bRD;
  private String bRE;

  public long RY()
  {
    return this.bRD;
  }

  public String RZ() {
    return this.bRE;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bRD = localByteBuffer.getLong();
    int i = localByteBuffer.getShort();
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.bRE = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 15405;
  }
}