import java.nio.ByteBuffer;

public final class dm extends dzz
{
  private long Tj;
  private String Tk;
  private String Tl;
  private long Tm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.Tj = localByteBuffer.getLong();

    byte[] arrayOfByte1 = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(arrayOfByte1);
    this.Tk = dzp.aJ(arrayOfByte1);
    this.Tm = localByteBuffer.getLong();

    byte[] arrayOfByte2 = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(arrayOfByte2);
    this.Tl = dzp.aJ(arrayOfByte2);

    return true;
  }

  public int getId() {
    return 508;
  }

  public long hf() {
    return this.Tj;
  }

  public String hg() {
    return this.Tk;
  }

  public String getMessage() {
    return this.Tl;
  }

  public long hh() {
    return this.Tm;
  }
}