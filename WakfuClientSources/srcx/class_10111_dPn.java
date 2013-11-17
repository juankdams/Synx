import java.nio.ByteBuffer;

public class dPn extends dzz
{
  private long bwl;
  private long lBm;
  private String mgO;
  private byte ilH;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwl = localByteBuffer.getLong();
    this.lBm = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);
    this.mgO = dzp.aJ(arrayOfByte);
    this.ilH = localByteBuffer.get();
    return true;
  }

  public String dqy() {
    return this.mgO;
  }

  public byte cva() {
    return this.ilH;
  }

  public long JP() {
    return this.bwl;
  }

  public long dbk() {
    return this.lBm;
  }

  public int getId() {
    return 582;
  }
}