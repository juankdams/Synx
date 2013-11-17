import java.nio.ByteBuffer;

public class alc extends aRw
{
  private byte dlR;
  private String dlS;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.dlS);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(2 + arrayOfByte.length);
    localByteBuffer.put(this.dlR);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5405;
  }

  public void bc(byte paramByte) {
    this.dlR = paramByte;
  }

  public void eK(String paramString) {
    this.dlS = paramString;
  }
}