import java.nio.ByteBuffer;

public class aVY extends dzz
{
  private float eYl;
  private dli eYm;
  private aoL eYn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eYl = localByteBuffer.getFloat();

    int i = localByteBuffer.getInt();
    this.eYm = new dli(i);

    for (int j = 0; j < i; j++) {
      this.eYm.r(localByteBuffer.getLong(), localByteBuffer.getShort());
    }

    j = localByteBuffer.getInt();
    this.eYn = new aoL(j);
    for (int k = 0; k < j; k++) {
      this.eYn.put(localByteBuffer.getLong(), new aPm(localByteBuffer.getShort(), localByteBuffer.get(), localByteBuffer.getShort()));
    }

    return true;
  }

  public float bll() {
    return this.eYl;
  }

  public dli blm() {
    return this.eYm;
  }

  public int getId() {
    return 4184;
  }

  public aoL bln()
  {
    return this.eYn;
  }
}