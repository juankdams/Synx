import java.nio.ByteBuffer;

public class coU extends dsQ
{
  private long aXW;
  private byte hXO;
  private cuB hXP;
  private byte hXQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 20, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.aXW = localByteBuffer.getLong();
    this.hXO = localByteBuffer.get();
    this.hXQ = localByteBuffer.get();
    int i = paramArrayOfByte.length - 22;
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.hXP = new cuB(arrayOfByte);
    return true;
  }

  public int getId() {
    return 4524;
  }

  public long AD()
  {
    return this.aXW;
  }

  public byte coJ() {
    return this.hXO;
  }

  public int eo() {
    return 0;
  }

  public dPD ep() {
    return dPD.mhl;
  }

  public cuB coK()
  {
    return this.hXP;
  }

  public dNZ coL()
  {
    return dNZ.Dc(this.hXQ);
  }
}