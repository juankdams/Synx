import java.nio.ByteBuffer;

public class cEn extends aRw
{
  private int ixY;
  private byte ixZ;
  private short aFe;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(7);
    localByteBuffer.putInt(this.ixY);
    localByteBuffer.put(this.ixZ);
    localByteBuffer.putShort(this.aFe);

    return a((byte)3, localByteBuffer.array());
  }

  public void xB(int paramInt) {
    this.ixY = paramInt;
  }

  public void eg(byte paramByte) {
    this.ixZ = paramByte;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }

  public int getId()
  {
    return 13105;
  }
}