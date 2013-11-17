import java.nio.ByteBuffer;

public class brX extends dzz
{
  private byte[] cAn;
  private byte[] cAo;
  private bpu cAp;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort();
    this.cAn = new byte[i];
    localByteBuffer.get(this.cAn);

    int j = localByteBuffer.getShort();
    this.cAo = new byte[j];
    localByteBuffer.get(this.cAo);

    this.cAp = bpu.av(localByteBuffer);
    return true;
  }

  public byte[] bAq() {
    return this.cAn;
  }

  public byte[] bAr() {
    return this.cAo;
  }

  public bpu aiJ() {
    return this.cAp;
  }

  public int getId()
  {
    return 15650;
  }
}