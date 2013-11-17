import java.nio.ByteBuffer;

public class bRp extends dzz
{
  private byte hba;
  private long hbb;
  private dGD hbc;

  public byte bYF()
  {
    return this.hba;
  }

  public long bYG() {
    return this.hbb;
  }

  public dGD bYH() {
    return this.hbc;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hba = localByteBuffer.get();

    if (this.hba == 0) {
      this.hbb = localByteBuffer.getLong();
      this.hbc = new dGD();
      if (!this.hbc.h(localByteBuffer)) {
        return false;
      }
    }

    return true;
  }

  public int getId() {
    return 5234;
  }
}