import java.nio.ByteBuffer;

public class PS extends dzz
{
  private int aNN;
  private int ciq;
  private String cir;
  private int cis;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();

    this.ciq = localByteBuffer.getInt();
    int i = localByteBuffer.get();
    if (i > 0) {
      byte[] arrayOfByte = new byte[i];
      localByteBuffer.get(arrayOfByte);
      this.cir = dzp.aJ(arrayOfByte);
    }
    this.cis = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11222;
  }

  public int se()
  {
    return this.aNN;
  }

  public int abC() {
    return this.ciq;
  }

  public String abD() {
    return this.cir;
  }

  public int abE() {
    return this.cis;
  }
}