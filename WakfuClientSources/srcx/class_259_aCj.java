import java.nio.ByteBuffer;

public class aCj extends dzz
{
  private boolean dWD;
  private boolean dWE;
  private byte dWF;
  private byte dWG;

  public boolean aOy()
  {
    return this.dWD;
  }

  public boolean aOz() {
    return this.dWE;
  }

  public byte aOA() {
    return this.dWF;
  }

  public byte aOB() {
    return this.dWG;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dWD = (localByteBuffer.get() == 1);
    this.dWE = (localByteBuffer.get() == 1);
    this.dWF = localByteBuffer.get();
    this.dWG = localByteBuffer.get();

    return true;
  }

  public int getId() {
    return 10040;
  }
}