import java.nio.ByteBuffer;

public class Ic extends dzz
{
  private short bQD;
  private int hY;
  private int hZ;
  private short aOl;
  private byte bQE;
  private boolean bQF;
  private boolean bQG;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 15, true)) {
      return false;
    }

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bQD = localByteBuffer.getShort();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();
    this.bQE = localByteBuffer.get();
    this.bQG = (localByteBuffer.get() == 1);
    this.bQF = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId()
  {
    return 4200;
  }

  public short Rw() {
    return this.bQD;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public byte Rx() {
    return this.bQE;
  }

  public boolean Ry() {
    return this.bQF;
  }

  public boolean Rz() {
    return this.bQG;
  }
}