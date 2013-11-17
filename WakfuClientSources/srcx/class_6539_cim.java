import java.nio.ByteBuffer;

public class cim extends aRw
{
  private bKR hHd;

  public void b(bKR parambKR)
  {
    this.hHd = parambKR;
  }

  public byte[] encode() {
    int i = this.hHd.size();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2 + 8 * i);
    localByteBuffer.putShort((short)i);
    for (bKT localbKT = this.hHd.bTc(); localbKT.hasNext(); ) {
      localByteBuffer.putLong(localbKT.bTd());
    }
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20032;
  }
}