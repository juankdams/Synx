import java.nio.ByteBuffer;

public class cWX extends dzz
{
  private byte crM;
  private int kJH;
  private byte[] kJI;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 1, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.crM = localByteBuffer.get();

    if (this.crM == 5) {
      if (!j(paramArrayOfByte.length, 5, false))
        return false;
      this.kJH = localByteBuffer.getInt();
    }

    if (cKK()) {
      if (!j(paramArrayOfByte.length, 3, false))
        return false;
      int i = localByteBuffer.getShort() & 0xFFFF;
      if (!j(paramArrayOfByte.length, i + 3, true))
        return false;
      this.kJI = new byte[i];
      localByteBuffer.get(this.kJI);
    }

    return true;
  }

  public int getId()
  {
    return 1024;
  }

  public boolean cKK()
  {
    return this.crM == 0;
  }

  public byte Kh()
  {
    return this.crM;
  }

  public byte[] cKL() {
    return this.kJI;
  }

  public int cKM() {
    return this.kJH;
  }
}