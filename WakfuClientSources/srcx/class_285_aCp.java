import java.nio.ByteBuffer;

public class aCp extends dNw
  implements dNj
{
  public aCp(Qb paramQb)
  {
    super(paramQb);
  }

  public void e(byte[] paramArrayOfByte) {
    this.meg.cleanup();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    adL localadL = this.meg.ajw();
    dGD localdGD = new dGD();
    this.QW.BC(localByteBuffer.getInt());
    while (localByteBuffer.hasRemaining()) {
      localdGD.clear();
      localdGD.h(localByteBuffer);
      av((gA)localadL.o(localdGD));
    }
  }

  public dno aOG() {
    return this.meg;
  }
}