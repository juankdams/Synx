import java.nio.ByteBuffer;

public class drl extends aRw
{
  private String hmP;
  private String lbp;

  public byte[] encode()
  {
    byte[] arrayOfByte1 = dzp.qC(this.hmP);

    byte[] arrayOfByte2 = dzp.qC(this.lbp);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte1.length + 1 + arrayOfByte2.length);

    localByteBuffer.put((byte)arrayOfByte1.length);
    localByteBuffer.put(arrayOfByte1);
    localByteBuffer.put((byte)arrayOfByte2.length);
    localByteBuffer.put(arrayOfByte2);

    return a((byte)4, localByteBuffer.array());
  }

  public int getId()
  {
    return 3157;
  }

  public void mA(String paramString)
  {
    this.hmP = paramString;
  }

  public void pM(String paramString) {
    this.lbp = paramString;
  }
}