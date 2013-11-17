import java.nio.ByteBuffer;

public class bgK extends aRw
{
  private int fuE;
  private int fuF;
  private int eru;

  public void pA(int paramInt)
  {
    this.fuE = paramInt;
  }

  public void pB(int paramInt) {
    this.fuF = paramInt;
  }

  public void pC(int paramInt) {
    this.eru = paramInt;
  }

  public byte[] encode() {
    byte[] arrayOfByte = new byte[12];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);

    localByteBuffer.putInt(this.fuE);
    localByteBuffer.putInt(this.fuF);
    localByteBuffer.putInt(this.eru);

    return a((byte)6, arrayOfByte);
  }

  public int getId()
  {
    return 20043;
  }
}