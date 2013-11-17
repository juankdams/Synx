import java.nio.ByteBuffer;

public final class boM extends dzz
{
  private int aGC;
  private boolean fIs;
  private aWQ fIt;
  private int aDH;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aGC = localByteBuffer.getInt();
    this.fIs = (localByteBuffer.get() == 1);
    this.fIt = aWQ.cv(localByteBuffer.get());
    this.aDH = localByteBuffer.getInt();

    return true;
  }

  public int CB() {
    return this.aGC;
  }

  public boolean byt() {
    return this.fIs;
  }

  public aWQ byu() {
    return this.fIt;
  }

  public int nn() {
    return this.aDH;
  }

  public int getId() {
    return 15330;
  }
}