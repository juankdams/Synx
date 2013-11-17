import java.nio.ByteBuffer;

public class dpP extends aRw
{
  private cuB lqG;
  private long aXW;

  public byte[] encode()
  {
    int i = this.lqG.csW();
    int j = i * 10;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(8 + j);

    localByteBuffer.putLong(this.aXW);

    for (int k = 0; k < i; k++) {
      int[] arrayOfInt = this.lqG.wR(k);

      localByteBuffer.putInt(arrayOfInt[0]);
      localByteBuffer.putInt(arrayOfInt[1]);
      localByteBuffer.putShort((short)arrayOfInt[2]);
    }

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 4503;
  }

  public void c(cuB paramcuB) {
    this.lqG = paramcuB;
  }

  public void X(long paramLong) {
    this.aXW = paramLong;
  }
}