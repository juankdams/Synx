import java.nio.ByteBuffer;

public class ctO extends dzz
{
  private long cws;
  private int idV;
  private int cIL;
  private int cIM;
  private boolean coU;

  public long agz()
  {
    return this.cws;
  }

  public long crl() {
    return this.idV;
  }

  public int ajM() {
    return this.cIL;
  }

  public int ajN() {
    return this.cIM;
  }

  public boolean isLocked() {
    return this.coU;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cws = localByteBuffer.getLong();
    this.idV = localByteBuffer.getInt();
    this.cIL = localByteBuffer.getInt();
    this.cIM = localByteBuffer.getInt();
    this.coU = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId() {
    return 10060;
  }
}