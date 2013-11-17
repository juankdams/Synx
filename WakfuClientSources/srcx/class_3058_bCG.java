import java.nio.ByteBuffer;

public class bCG extends dzz
{
  private byte gwU = -1;
  private short cJY = -1;
  private short gwV = -1;
  private int gwW = -1;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 9, true)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.gwU = localByteBuffer.get();
    this.cJY = localByteBuffer.getShort();
    this.gwV = localByteBuffer.getShort();
    this.gwW = localByteBuffer.getInt();

    return true;
  }

  public int getId()
  {
    return 100;
  }

  public short aks()
  {
    return this.cJY;
  }

  public byte bKZ() {
    return this.gwU;
  }

  public short bLa() {
    return this.gwV;
  }

  public int bLb() {
    return this.gwW;
  }
}