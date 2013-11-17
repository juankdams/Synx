import java.nio.ByteBuffer;

public class afs extends dzz
{
  private long cYn;
  private byte cYo;
  private boolean cQj;

  public long aqY()
  {
    return this.cYn;
  }

  public byte aqZ() {
    return this.cYo;
  }

  public boolean ara() {
    return this.cQj;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cYn = localByteBuffer.getLong();
    this.cYo = localByteBuffer.get();
    this.cQj = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId() {
    return 10036;
  }
}