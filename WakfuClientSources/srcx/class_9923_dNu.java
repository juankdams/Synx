import java.nio.ByteBuffer;

public class dNu extends dsQ
{
  private int bXf;
  byte[] bXg;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.bXf = localByteBuffer.getInt();

    this.bXg = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bXg);

    return true;
  }

  public int getId()
  {
    return 8124;
  }

  public int eo()
  {
    return this.bXf;
  }

  public dPD ep()
  {
    return dPD.mhy;
  }

  public int Vc() {
    return this.bXf;
  }

  public byte[] Vd()
  {
    return this.bXg;
  }
}