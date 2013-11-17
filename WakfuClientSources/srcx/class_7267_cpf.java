import java.nio.ByteBuffer;

public class cpf extends dzz
{
  private long aLD;
  private long dES;
  private byte etE;
  private int ggd;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aLD = localByteBuffer.getLong();
    this.dES = localByteBuffer.getLong();
    this.etE = localByteBuffer.get();
    this.ggd = localByteBuffer.getInt();
    return true;
  }

  public long acp()
  {
    return this.aLD;
  }

  public long aFL()
  {
    return this.dES;
  }

  public byte bei()
  {
    return this.etE;
  }

  public int bDx()
  {
    return this.ggd;
  }

  public int getId()
  {
    return 6014;
  }
}