import java.nio.ByteBuffer;

public class ayF extends dzz
{
  private int aNN;
  private int ciq;
  private String cir;
  private int cis;
  private short dpZ;
  private int dOQ;

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

    this.dpZ = localByteBuffer.getShort();
    this.dOQ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11224;
  }

  public int se()
  {
    return this.aNN;
  }

  public String abD() {
    return this.cir;
  }

  public short aKC() {
    return this.dpZ;
  }

  public int aKD() {
    return this.dOQ;
  }

  public int abE() {
    return this.cis;
  }

  public int abC() {
    return this.ciq;
  }
}