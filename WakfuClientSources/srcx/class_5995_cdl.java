import java.nio.ByteBuffer;

public class cdl extends dzz
{
  private final cSR hwA = new cSR();

  public void bc()
  {
    super.bc();
    this.hwA.clear();
  }

  public void aJ()
  {
    super.aJ();
    this.hwA.clear();
  }

  public dmn cgk() {
    return this.hwA.yF();
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      int i = localByteBuffer.getInt();
      int j = localByteBuffer.getInt();
      byte[] arrayOfByte = new byte[j];
      localByteBuffer.get(arrayOfByte);
      this.hwA.put(i, arrayOfByte);
    }

    return true;
  }

  public int getId()
  {
    return 20000;
  }
}