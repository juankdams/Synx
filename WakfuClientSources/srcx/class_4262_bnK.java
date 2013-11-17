import java.nio.ByteBuffer;

public class bnK extends dzz
{
  private long eQx;
  private int aRQ;
  private int bOr;
  private int bOs;
  private byte fGQ;
  private byte fGR;
  private long ag;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eQx = localByteBuffer.getLong();
    this.aRQ = localByteBuffer.getInt();
    this.bOr = localByteBuffer.getInt();
    this.bOs = localByteBuffer.getInt();
    this.fGQ = localByteBuffer.get();
    this.fGR = localByteBuffer.get();
    this.ag = localByteBuffer.getLong();

    return true;
  }

  public int getId() {
    return 4116;
  }

  public long bix() {
    return this.eQx;
  }

  public int eo() {
    return this.aRQ;
  }

  public int bxE() {
    return this.bOr;
  }

  public int bxF() {
    return this.bOs;
  }

  public boolean bxG() {
    return this.fGQ == 1;
  }

  public boolean bxH() {
    return this.fGR == 1;
  }

  public long m() {
    return this.ag;
  }
}