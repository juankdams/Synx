import java.nio.ByteBuffer;

public class ddx extends dzz
{
  private boolean kWM;
  private int aVF;
  private int aNN;
  private long[] kWN;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 10)
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kWM = (localByteBuffer.get() == 1);
    this.aVF = localByteBuffer.getInt();
    this.aNN = localByteBuffer.getInt();
    this.kWN = new long[localByteBuffer.get()];
    for (int i = 0; i < this.kWN.length; i++) {
      this.kWN[i] = localByteBuffer.getLong();
    }
    return true;
  }

  public int getId() {
    return 11100;
  }

  public int wx() {
    return this.aVF;
  }

  public int se() {
    return this.aNN;
  }

  public long[] cOE() {
    return this.kWN;
  }

  public boolean cOF() {
    return this.kWM;
  }
}