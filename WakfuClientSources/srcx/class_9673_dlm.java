import java.nio.ByteBuffer;

public class dlm extends dzz
{
  private int aGC;
  private byte[] liG;
  private byte[] liH;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aGC = localByteBuffer.getInt();

    int i = localByteBuffer.getShort() & 0xFFFF;
    this.liG = new byte[i];
    localByteBuffer.get(this.liG);

    i = localByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.liH = new byte[i];
      localByteBuffer.get(this.liH);
    }

    return true;
  }

  public int CB() {
    return this.aGC;
  }

  public byte[] cTe() {
    return this.liG;
  }

  public byte[] cTf() {
    return this.liH;
  }

  public int getId() {
    return 15320;
  }
}