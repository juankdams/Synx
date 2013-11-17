import java.nio.ByteBuffer;

public class ctM extends aRw
{
  private String idT;
  private String hh;
  private String Tl;

  public byte[] encode()
  {
    byte[] arrayOfByte1 = dzp.qC(this.idT);
    byte[] arrayOfByte2 = dzp.qC(this.hh);
    byte[] arrayOfByte3 = dzp.qC(this.Tl);

    int i = arrayOfByte1.length;
    int j = arrayOfByte2.length;
    int k = arrayOfByte3.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + i + 4 + j + 4 + k);
    localByteBuffer.putInt(i);
    localByteBuffer.put(arrayOfByte1);
    localByteBuffer.putInt(j);
    localByteBuffer.put(arrayOfByte2);
    localByteBuffer.putInt(k);
    localByteBuffer.put(arrayOfByte3);

    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 539;
  }

  public void mi(String paramString) {
    this.idT = paramString;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public void setMessage(String paramString) {
    this.Tl = paramString;
  }
}