import java.nio.ByteBuffer;

public class bpy extends dsQ
{
  private long aXW;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 13, false)) {
      return false;
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.aXW = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 8302;
  }

  public long AD() {
    return this.aXW;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhj;
  }
}