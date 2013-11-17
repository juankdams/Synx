import java.nio.ByteBuffer;

public class auv extends dzz
{
  private byte dGH;
  private int dGI;
  private int dGJ;
  private cYq bkI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dGH = localByteBuffer.get();
    this.dGI = localByteBuffer.getInt();
    this.dGJ = localByteBuffer.getInt();
    this.bkI = cYq.jq(localByteBuffer.getLong());
    return true;
  }

  public int getId() {
    return 11220;
  }

  public byte aGC() {
    return this.dGH;
  }

  public int aGD() {
    return this.dGI;
  }

  public int aGE() {
    return this.dGJ;
  }

  public cYq aGF() {
    return this.bkI;
  }
}