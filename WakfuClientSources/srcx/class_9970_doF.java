import java.nio.ByteBuffer;

public class doF extends dzz
{
  private boolean bUX;
  private long lpe;
  private String lpf;
  private long lpg;
  private String lph;
  private int lpi;
  private int lpj;

  public boolean IR()
  {
    return this.bUX;
  }

  public long cVY() {
    return this.lpe;
  }

  public String cVZ() {
    return this.lpf;
  }

  public long cWa() {
    return this.lpg;
  }

  public String cWb() {
    return this.lph;
  }

  public int cWc() {
    return this.lpi;
  }

  public int cWd() {
    return this.lpj;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bUX = (localByteBuffer.get() != 0);
    if (this.bUX) {
      this.lpj = localByteBuffer.getInt();
      this.lpi = localByteBuffer.getInt();

      this.lpe = localByteBuffer.getLong();
      int i = localByteBuffer.get();
      byte[] arrayOfByte = new byte[i];
      localByteBuffer.get(arrayOfByte);
      this.lpf = dzp.aJ(arrayOfByte);

      this.lpg = localByteBuffer.getLong();
      int j = localByteBuffer.get();
      arrayOfByte = new byte[j];
      localByteBuffer.get(arrayOfByte);
      this.lph = dzp.aJ(arrayOfByte);
    }
    return true;
  }

  public int getId()
  {
    return 20008;
  }
}