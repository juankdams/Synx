import java.nio.ByteBuffer;

public class aIC extends dzz
{
  private long cRG;
  private float ehg;
  private float ehh;
  private final asj ehi = new asj();

  public long aoF() {
    return this.cRG;
  }

  public asj aUv() {
    return this.ehi;
  }

  public float aUw() {
    return this.ehg;
  }

  public float aUx() {
    return this.ehh;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cRG = localByteBuffer.getLong();
    this.ehg = localByteBuffer.getFloat();
    this.ehh = localByteBuffer.getFloat();
    this.ehi.h(localByteBuffer);
    return true;
  }

  public int getId() {
    return 10106;
  }
}