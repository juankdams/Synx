import java.nio.ByteBuffer;

public class blt extends dIN
{
  private cjK fCt;
  private long fCu;

  protected void b(caT paramcaT)
  {
    paramcaT.a(this);
  }

  blt()
  {
  }

  public cjK bww()
  {
    return this.fCt;
  }

  public long bwx() {
    return this.fCu;
  }

  void m(cjK paramcjK) {
    this.fCt = paramcjK;
  }

  void fF(long paramLong) {
    this.fCu = paramLong;
  }

  protected int bwy()
  {
    return 16;
  }

  protected void at(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.fCt.getId());
    paramByteBuffer.putLong(this.fCu);
  }

  protected void b(ahy paramahy, ByteBuffer paramByteBuffer)
  {
    this.fCt = paramahy.cM(paramByteBuffer.getLong());
    this.fCu = paramByteBuffer.getLong();
  }

  public blt(cjK paramcjK, long paramLong) {
    this();
    this.fCt = paramcjK;
    this.fCu = paramLong;
  }

  public static blt a(cjK paramcjK, long paramLong) {
    return new blt(paramcjK, paramLong);
  }

  static blt bwz()
  {
    return new blt();
  }

  public long bwA()
  {
    return this.fCu;
  }
}