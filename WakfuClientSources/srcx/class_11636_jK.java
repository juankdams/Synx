import java.nio.ByteBuffer;

public class jK extends aMq
  implements dNj
{
  public jK(Qb paramQb)
  {
    super(paramQb);
  }

  public void e(byte[] paramArrayOfByte) {
    this.erU.clear();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.QW.BC(localByteBuffer.getInt());
    int i = localByteBuffer.getShort();
    for (int j = 0; j < i; j++)
      this.erU.fg(localByteBuffer.getInt(), localByteBuffer.getInt());
  }
}