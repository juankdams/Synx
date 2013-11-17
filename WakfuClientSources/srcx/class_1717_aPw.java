import java.nio.ByteBuffer;

public final class aPw
  implements dup
{
  private byte cXi;
  private byte eLU;

  aPw()
  {
  }

  public aPw(byte paramByte1, byte paramByte2)
  {
    this.cXi = paramByte1;
    this.eLU = paramByte2;
  }

  public byte VH() {
    return this.cXi;
  }

  public byte bgl() {
    return this.eLU;
  }

  public byte[] j() {
    return new byte[] { this.cXi, this.eLU };
  }

  public void U(ByteBuffer paramByteBuffer) {
    this.cXi = paramByteBuffer.get();
    this.eLU = paramByteBuffer.get();
  }

  public short nc() {
    return 4;
  }
}