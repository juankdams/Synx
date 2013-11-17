import java.nio.ByteBuffer;

public class ceH extends dzz
{
  private dFN dln;
  private long fAU;
  private long hzh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dln = dFN.fI(localByteBuffer.get());
    this.fAU = localByteBuffer.getLong();
    this.hzh = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15802;
  }

  public dFN chE() {
    return this.dln;
  }

  public long bvt() {
    return this.fAU;
  }

  public long chF() {
    return this.hzh;
  }
}