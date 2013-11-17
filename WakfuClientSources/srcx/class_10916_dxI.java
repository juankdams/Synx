import java.nio.ByteBuffer;

public class dxI extends dsQ
{
  private apl lEA;

  public int eo()
  {
    return 8304;
  }

  public dPD ep()
  {
    return dPD.mhT;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);

    this.lEA = apl.aa(localByteBuffer);

    return true;
  }

  public int getId()
  {
    return 8304;
  }

  public apl dcB() {
    return this.lEA;
  }
}