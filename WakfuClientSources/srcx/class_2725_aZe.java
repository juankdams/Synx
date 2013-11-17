import java.nio.ByteBuffer;

public class aZe extends aRw
{
  private long ffH;
  private byte cQl;
  private short aFe = -1;
  private long ffI;
  private long ffJ;
  private short ffK;
  private int bsY;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(33);
    localByteBuffer.putLong(this.ffH);
    localByteBuffer.put(this.cQl);
    localByteBuffer.putShort(this.aFe);
    localByteBuffer.putLong(this.ffI);
    localByteBuffer.putLong(this.ffJ);
    localByteBuffer.putShort(this.ffK);
    localByteBuffer.putInt(this.bsY);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5229;
  }

  public void eW(long paramLong) {
    this.ffH = paramLong;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }

  public void eX(long paramLong) {
    this.ffI = paramLong;
  }

  public void aH(byte paramByte) {
    this.cQl = paramByte;
  }

  public void eY(long paramLong) {
    this.ffJ = paramLong;
  }

  public void bB(short paramShort)
  {
    this.ffK = paramShort;
  }

  public void ed(int paramInt)
  {
    this.bsY = paramInt;
  }
}