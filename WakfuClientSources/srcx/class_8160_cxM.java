import java.nio.ByteBuffer;

public class cxM extends dzz
{
  private long aLD;
  private byte ilH;
  private long dhx;
  private long ilI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aLD = localByteBuffer.getLong();
    this.ilH = localByteBuffer.get();
    this.dhx = localByteBuffer.getLong();
    this.ilI = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 6004;
  }

  public long acp() {
    return this.aLD;
  }

  public long cuZ() {
    return this.dhx;
  }

  public byte cva() {
    return this.ilH;
  }

  public long cvb()
  {
    return this.ilI;
  }
}