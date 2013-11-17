import java.nio.ByteBuffer;

public class crr extends dzz
{
  private long cfv;
  private int dFY;
  private short aFe;
  private long htC;
  private short dhr;

  public byte[] encode()
  {
    throw new UnsupportedOperationException("On tente d'encoder un message serveur->client coté client...");
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cfv = localByteBuffer.getLong();
    this.dFY = localByteBuffer.getInt();
    this.aFe = localByteBuffer.getShort();
    this.htC = localByteBuffer.getLong();
    this.dhr = localByteBuffer.getShort();
    return true;
  }

  public int getId()
  {
    return 5210;
  }

  public long anE()
  {
    return this.cfv;
  }

  public long clk()
  {
    return this.htC;
  }

  public int aFY()
  {
    return this.dFY;
  }

  public short nP()
  {
    return this.aFe;
  }

  public short cdB()
  {
    return this.dhr;
  }
}