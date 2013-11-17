import java.nio.ByteBuffer;

public class cQC extends dzz
{
  private byte cQi;
  private boolean cQj;
  private long cQk;
  private byte cQl;

  public byte cHo()
  {
    return this.cQi;
  }

  public boolean ara() {
    return this.cQj;
  }

  public long cHp() {
    return this.cQk;
  }

  public byte cHq() {
    return this.cQl;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cQk = localByteBuffer.getLong();
    this.cQl = localByteBuffer.get();
    this.cQi = localByteBuffer.get();
    this.cQj = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId() {
    return 10038;
  }
}